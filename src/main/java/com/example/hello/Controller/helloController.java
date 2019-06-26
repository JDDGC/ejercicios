/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hello.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author administrador
 */
@Controller
public class helloController {
    @GetMapping({"/","hello"})
    public String hello(){
        return "hello";
    }
    
    @RequestMapping(value="/world",method=RequestMethod.GET)
    public String world(){
        return "world";
    }
}
