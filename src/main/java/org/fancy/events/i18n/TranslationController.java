package org.fancy.events.i18n;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
public class TranslationController {

    @GetMapping("/translations")
    public Map<String,Object> getTranslations(@RequestParam(name = "lang") String language) {
        return new HashMap<String,Object>(){{
            put("en", new HashMap<String,Object>(){{
                put("select","Fabio and Daniel");
            }});
        }};
    }
}
