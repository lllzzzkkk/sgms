package cn.lzk.sgms.controller;

import cn.lzk.sgms.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Login")
public class LoginController {

    @PostMapping("/teacher")
    public String Login(Teacher teacher){
        System.out.println("sssssssssss");
        return "index";
    }
}
