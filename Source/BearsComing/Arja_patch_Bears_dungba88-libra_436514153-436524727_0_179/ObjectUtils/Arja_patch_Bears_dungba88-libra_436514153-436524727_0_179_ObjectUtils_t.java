package org.joo.libra.sql;

import org.apache.commons.beanutils.PropertyUtils;

import lombok.NonNull;

public class ObjectUtils {

    private ObjectUtils() {

    }

    public static Object getValue(final Object obj, final @NonNull String variableName)
            throws ReflectiveOperationException {
        return PropertyUtils.getNestedProperty(obj, variableName);
    }
}
