package com.hy.action;

import com.hy.service.StuService;

public class StuAction {
    public StuService service;
    public void stuAction(){
        String name = service.stuService();
        System.out.println(name);
    }

    public void setService(StuService service) {
        this.service = service;
    }
}
