package com.falabella.catalyst.network.util;

/****
 *  Author prakharnigam
 *  created on 21/10/20
 *****/
public class ReflectionUtil {
    /**
     * The constant MAX_NEST_DEPTH.
     */
    public static final int MAX_NEST_DEPTH = 20;

    /**
     * Gets class by name.
     *
     * @param className the class name
     * @return the class by name
     * @throws ClassNotFoundException the class not found exception
     */
    public static Class<?> getClassByName(String className) throws ClassNotFoundException {
        return Class.forName(className, true, Thread.currentThread().getContextClassLoader());
    }

}
