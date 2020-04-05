package com.company.sapriko;

import java.security.KeyException;
import java.util.HashMap;
import java.util.Map;

/**
 * Class describes model of ValidationSystem
 * @author – Artyom Sapriko.
 */
class ValidationSystem {

    private static Map<Class, IValidator> validators = new HashMap<>();

    static<T> void Register(Class<T> a, IValidator<T> validator)
    {
        validators.put(a, validator);
    }

    private static<T> IValidator<T> Resolve(Class <T> a)
    {
        return validators.get(a);
    }

    /**
     * This method describes logic validate
     *
     * @throws – ValidationFailedException, KeyException
     * @param value – name of value
     * @return – describe return value.
     */
    static<T> boolean validate(T value) throws ValidationFailedException, KeyException {
        IValidator<T> validator = (IValidator<T>)Resolve(value.getClass());

        if (validator == null) throw new KeyException();

        if (validator.validate(value)) return true;
        throw new ValidationFailedException();
    }
}