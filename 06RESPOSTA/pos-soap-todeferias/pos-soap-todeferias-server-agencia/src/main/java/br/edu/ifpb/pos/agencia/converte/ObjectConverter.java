/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.agencia.converte;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.persistence.Converter;

/**
 *
 * @author ajp
 */
@FacesConverter("objectConverter")
public class ObjectConverter implements Converter {

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        // Primeira linha em branco da combo caso exista, 
        // Aqui simulamos que o id desse campo em branco seja "-1"
        if (value == "") {
            return "-1";
        }
        //  Quando precisa renderizar uma combo com valor ainda não adquirido (null). 
        //  que é renderizada antes mesmo que um objeto seja selecionado.
        if (getIdByReflection(value) == null) {
            return "-1";
        }
        // Retorna o id como Long, adquirido atraves de reflexão
        return getIdByReflection(value).toString();
    }

    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value.equals("")) {
            return null;
        }
        try {
            Long id = Long.valueOf(value);
            Collection items = (Collection) component.getAttributes().get("items");
            return findById(items, id);
        } catch (Exception ex) {
            throw new ConverterException("Não foi possível aplicar conversão de item com valor [" + value + "] no componente [" + component.getId() + "]", ex);
        }
    }

    /**
     * Retorna o objeto pelo id
     */
    private Object findById(Collection collection, Long idToFind) {
        Object object = null;
        for (Object obj : collection) {
            Long id = getIdByReflection(obj);
            if (id.equals(idToFind)) {
                object = obj;
                break;
            }
        }
        return object;
    }

    private Long getIdByReflection(Object bean) {
        try {
            // Pega o Id do objeto
            Field idField = bean.getClass().getDeclaredField("id");
            idField.setAccessible(true);
            return (Long) idField.get(bean);
        } catch (Exception ex) {
            throw new ConverterException("Não foi possível obter a propriedade 'id' do item", ex);
        }
    }

    @Override
    public boolean autoApply() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
