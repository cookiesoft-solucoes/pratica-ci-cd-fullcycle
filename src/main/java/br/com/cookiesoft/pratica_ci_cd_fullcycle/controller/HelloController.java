package br.com.cookiesoft.pratica_ci_cd_fullcycle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @ResponseBody    
    public String hello() {
        return "Hello Full Cycle!";
    }

}
