package com.example.i18n.web;

import com.example.i18n.i18n.I18nUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequiredArgsConstructor
public class Controller {

    @GetMapping
    public String welcome(Locale locale) {
        // return I18nUtil.getMessage("welcome", locale);
        return I18nUtil.getMessage("no", locale, "wow!", "wow!@");
    }
}
