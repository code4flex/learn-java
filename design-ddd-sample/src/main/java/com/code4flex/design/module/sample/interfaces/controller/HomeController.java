package com.code4flex.design.module.sample.interfaces.controller;


import com.code4flex.design.module.sample.domain.web.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * homePage controller
 *
 * @author marvin
 */
@Controller
public class HomeController {


    /**
     * sample
     * @return
     */
    @RequestMapping("/")
    @ResponseBody
    public ResponseEntity<Object> toIndex(){

        return Response.success("hello ddd!");
    }
}
