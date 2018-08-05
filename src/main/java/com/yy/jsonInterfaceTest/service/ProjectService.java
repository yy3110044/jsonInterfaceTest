package com.yy.jsonInterfaceTest.service;

import java.util.List;
import com.yy.jsonInterfaceTest.po.Project;
import com.yy.jsonInterfaceTest.util.QueryCondition;

public interface ProjectService {
    void add(Project obj);
    void delete(int id);
    void update(Project obj);
    Project find(QueryCondition qc);
    Project findById(int id);
    List<Project> query(QueryCondition qc);
    int getCount(QueryCondition qc);
}
