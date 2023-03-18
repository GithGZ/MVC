package com.hy.domain;

public class Student {
    private String name;
    private String id;
    private String classes;

    public Student() {
    }

    public Student(String name, String id, String classes) {
        this.name = name;
        this.id = id;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
