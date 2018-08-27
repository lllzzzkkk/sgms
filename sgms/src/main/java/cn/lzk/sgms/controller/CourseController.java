package cn.lzk.sgms.controller;

import cn.lzk.sgms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

//    @GetMapping("/{id}")
//    public Course getCourse(@PathVariable("id") Integer id){
//        Course course = courseService.getCourse(id);
//        return course;
//    }
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }




}
