package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController
 {
    @RequestMapping({"","/","/index"})
    public String requestMethodName(@RequestParam String param) {
        return "index";
    }
}