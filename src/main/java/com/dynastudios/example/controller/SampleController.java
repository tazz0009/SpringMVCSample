package com.dynastudios.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Patrick Trautmann
 * <p/>
 * Contact: patrick.trautmann@gmail.com
 * Date: 17.12.12
 * Time: 21:25
 */
@Controller
public class SampleController {

    @RequestMapping("/hello")
    public @ResponseBody String simple() {
        return "Hello world!";
    }

}
