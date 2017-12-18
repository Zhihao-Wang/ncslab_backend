package com.ncslab.service;


import com.ncslab.pojo.Lab;

import java.util.List;

public interface LabService {
    List<Lab> list();
    void add(Lab lab);
    void update(Lab lab);
    void delete(Lab lab);
    Lab get(int id);
}
