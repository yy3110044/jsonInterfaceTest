package com.yy.jsonInterfaceTest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.yy.jsonInterfaceTest.po.InterfaceUrl;
import com.yy.jsonInterfaceTest.util.QueryCondition;

@Mapper
public interface InterfaceUrlMapper {
    void add(InterfaceUrl obj);
    void delete(int id);
    void update(InterfaceUrl obj);
    InterfaceUrl find(QueryCondition qc);
    InterfaceUrl findById(int id);
    List<InterfaceUrl> query(QueryCondition qc);
    int getCount(QueryCondition qc);
    
    void deleteByProjectId(int projectId);
}
