package com.example.i18n.i18n;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

public class CustomCookieLocaleResolver extends CookieLocaleResolver {
    @Override
    protected Locale determineDefaultLocale(HttpServletRequest request) {
        if (!StringUtils.isBlank(request.getHeader(HttpHeaders.ACCEPT_LANGUAGE)))
            return Locale.forLanguageTag(request.getHeader(HttpHeaders.ACCEPT_LANGUAGE));
        if (!StringUtils.isBlank(request.getParameter("lang")))
            return Locale.forLanguageTag(request.getParameter("lang"));
        return Locale.getDefault();
    }
}
