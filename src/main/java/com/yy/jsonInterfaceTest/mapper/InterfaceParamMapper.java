package com.yy.jsonInterfaceTest.mapper;

import java.util.Collection;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.yy.jsonInterfaceTest.po.InterfaceParam;
import com.yy.jsonInterfaceTest.util.QueryCondition;

@Mapper
public interface InterfaceParamMapper {
    void add(InterfaceParam obj);
    void delete(int id);
    void update(InterfaceParam obj);
    InterfaceParam find(QueryCondition qc);
    InterfaceParam findById(int id);
    List<InterfaceParam> query(QueryCondition qc);
    int getCount(QueryCondition qc);
    
    void addBatch(@Param("params") Collection<InterfaceParam> params);
    void deleteByUrlId(int urlId);
}
