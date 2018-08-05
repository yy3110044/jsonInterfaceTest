package com.yy.jsonInterfaceTest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.yy.jsonInterfaceTest.po.Project;
import com.yy.jsonInterfaceTest.util.QueryCondition;

@Mapper
public interface ProjectMapper {
    void add(Project obj);
    void delete(int id);
    void update(Project obj);
    Project find(QueryCondition qc);
    Project findById(int id);
    List<Project> query(QueryCondition qc);
    int getCount(QueryCondition qc);
}
