package com.spring.stackroute.domain;

public class Actor {
public String name;
public int age;
public String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void display()
    {
        System.out.println("name is  : "+name);
        System.out.println("age is  : "+age);
        System.out.println("gender is  : "+gender);

    }

}
