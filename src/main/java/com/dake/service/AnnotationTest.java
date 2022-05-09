package com.dake.service;

import com.dake.entity.Person;
import org.springframework.stereotype.Service;

@Service
public class AnnotationTest {

    public void annotationTest(Person person){

        System.out.println(person);

    }

}
