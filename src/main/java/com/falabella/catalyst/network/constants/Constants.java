package com.falabella.catalyst.network.constants;
import java.nio.charset.Charset;

/****
 *  Author prakharnigam
 *  created on 21/10/20
 *****/

public interface Constants {
       /**
        *  default charset name
        *  */
    String DEFAULT_CHARSET_NAME = "UTF-8";

    /**
     * default charset is utf-8
     */
    Charset DEFAULT_CHARSET = Charset.forName(DEFAULT_CHARSET_NAME);
    /**
     * The constant OBJECT_KEY_SPRING_APPLICATION_CONTEXT
     */
    String OBJECT_KEY_SPRING_APPLICATION_CONTEXT = "springApplicationContext";
    /**
     * The constant BEAN_NAME_SPRING_APPLICATION_CONTEXT_PROVIDER
     */
    String BEAN_NAME_SPRING_APPLICATION_CONTEXT_PROVIDER = "springApplicationContextProvider";
    /**
     * The constant BEAN_NAME_FAILURE_HANDLER
     */
    String BEAN_NAME_FAILURE_HANDLER = "failureHandler";
}
