package com.devfuner;

/**
 * 스프링부트 자동설정 테스트 객체
 */
public class Kimhokyun {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Kimhokyun{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
