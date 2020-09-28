package com.example.i18n.i18n;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Locale;

@Component
@RequiredArgsConstructor
public class I18nUtil {

    private final MessageSource messageSource;
    private static MessageSource instance;

    @PostConstruct
    public void __register__() {
        instance = messageSource;
    }

    public static String getMessage(String code, Locale locale) {
        return instance.getMessage(code, null, locale);
    }

    public static String getMessage(String code) {
        return getMessage(code, Locale.getDefault());
    }

    public static String getMessage(String code, Locale locale, String... args) {
        return instance.getMessage(code, args, locale);
    }

    public static String getMessage(String code, String... args) {
        return getMessage(code, Locale.getDefault(), args);
    }

}
