package com.ll.sb20231114;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    String showCalc2(Integer a, Integer b){
        return "a : " + a + " b : " + b;
    }

    @GetMapping("/calc3")
    @ResponseBody
    String showCalc3(
            @RequestParam(defaultValue = "0") int a,
            @RequestParam(defaultValue = "0") int b
    ){
        return "result : " + (a + b);
    }

    @GetMapping("/calc4")
    @ResponseBody
    String showCalc4(
            @RequestParam(defaultValue = "0") double a,
            @RequestParam(defaultValue = "0") double b
    ){
        return "result : " + (a + b);
    }

    @GetMapping("/calc5")
    @ResponseBody
    String showCalc5(
            @RequestParam(defaultValue = "0") String a,
            @RequestParam(defaultValue = "0") String b
    ){
        return a + b;
    }

    //int 타입으로 리턴하지만 브라우저에서는 String으로 취급되어 보여지게 됨
    @GetMapping("/calc6")
    @ResponseBody
    int showCalc6(
            int a, int b
    ) {
        return a + b;
    }

    //boolean 타입으로 리턴하지만 브라우저에서는 String으로 취급되어 보여지게 됨
    @GetMapping("/calc7")
    @ResponseBody
    boolean showCalc7(
            int a, int b
    ) {
        return a > b;
    }
}
