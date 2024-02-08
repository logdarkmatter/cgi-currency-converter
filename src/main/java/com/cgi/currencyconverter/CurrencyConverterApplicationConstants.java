package com.cgi.currencyconverter;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CurrencyConverterApplicationConstants {

    /** Root package for the application. Used for Spring annotation configuration, etc. */
    public static final String APPLICATION_ROOT_PACKAGE = "com.cgi.currencyconverter";

    /** Location of BeanConfig class */
    public static final String ANNOTATION_CONFIG_PACKAGE = "com.cgi.currencyconverter.config";

    /** Location of Loggable Dispatcher */
    public static final String LOGGING_DISPATCHER_PACKAGE = "com.cgi.currencyconverter.web.servlet";

    /** Location of Spring-Data JPA repositories */
    public static final String DAO_PACKAGE = "com.cgi.currencyconverter.repository";

    /** Location of JPA entities */
    public static final String JPA_ENTITIES_PACKAGE = "com.cgi.currencyconverter.domain";

    /** Regex for acceptable logins */
    public static final String LOGIN_REGEX = "^[_.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String ANONYMOUS_USER = "anonymoususer";
    public static final String DEFAULT_LANGUAGE = "pt-pt";
    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";

}
