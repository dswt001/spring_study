package com.dake.controller;

import com.dake.service.AnnotationTest;
import com.dake.entity.Person;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("/annotation")
public class AnnotationController {

    @Autowired
    private AnnotationTest annotationTest;

    @RequestMapping("/test")
    public void test(@RequestBody Map<String, Object> map, Model model){
        Person person = new Person();
        BeanUtils.copyProperties(map, person);
        model.addAttribute(person);
        annotationTest.annotationTest(person);
    }

}
