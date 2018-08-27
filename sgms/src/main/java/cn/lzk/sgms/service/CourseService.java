package cn.lzk.sgms.service;

import cn.lzk.sgms.dao.CourseMapper;
import cn.lzk.sgms.model.Course;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CourseService {

    @Resource
    private CourseMapper courseMapper;

    public Course getCourse(Integer id) {
        return courseMapper.getCourse(id);
    }
}
