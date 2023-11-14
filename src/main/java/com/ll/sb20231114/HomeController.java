package com.ll.sb20231114;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    String showMain(){
        return "Hello";
    }

    @GetMapping("/about")
    @ResponseBody
    String showAbout(){
        return "개발자 커뮤니티";
    }

    @GetMapping("/calc")
    @ResponseBody
    String showCalc(int a, int b){
        return "result : " + (a + b);
    }

    @GetMapping("/calc2")
    @ResponseBody
    String showCalc(Integer a, Integer b){
        return "a : " + a + " b : " + b;
    }
}
