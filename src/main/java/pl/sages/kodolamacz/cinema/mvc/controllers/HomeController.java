package pl.sages.kodolamacz.cinema.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by acacko on 25.11.17
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String get() {
        return "home";
    }
}
