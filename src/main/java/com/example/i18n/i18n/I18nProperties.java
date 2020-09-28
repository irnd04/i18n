package com.example.i18n.i18n;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "i18n")
@Getter
@Setter
public class I18nProperties {
    private String paramName = "lang";
}
