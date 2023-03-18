package com.hy.service;

import com.hy.dao.StuDao;

public class StuService {
    public StuDao dao;

    public String stuService(){
        return dao.stuDao();
    }

    public void setDao(StuDao dao) {
        this.dao = dao;
    }
}
