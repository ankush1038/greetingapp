package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.UserInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")

public class HelloController {
    @RequestMapping(value = {"", "/","/home"})
    public String sayHello(){
        return "Hello From BridgeLabz!!!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET) //old method
   // @GetMapping new method instead of requestmapping
    public String sayHello(@RequestParam (value= "name") String name){
        return "Hello"+name+"!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+name+ "!";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody UserInfo user){
        return "Hello "+user.getFirstname()+" "+ user.getlastname()+"!";
    }
    @PostMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstname, @RequestParam(value = "lastName")String lastname){
        return "Hello "+firstname+" "+lastname+"!";
    }

}
