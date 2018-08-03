package com.devfuner;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("kimhokyun")
public class KimhokyunProperties {
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
        return "KimhokyunProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
