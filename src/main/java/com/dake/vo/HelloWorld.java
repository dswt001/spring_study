package com.dake.vo;

public class HelloWorld {

    private String name;
    private String age;

    public void hello() {
        System.out.println("hello: " + name);
        System.out.println("age: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName: " + name);
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        System.out.println("age: " + age);
        this.age = age;
    }

    public HelloWorld() {
        System.out.println("HelloWorld's Constructor...");
    }

    public HelloWorld(String name, String age) {
        System.out.println("Two properties's constructor");
        this.name = name;
        this.age = age;
    }
}
