package com.yy.jsonInterfaceTest.service;

import java.util.Collection;
import java.util.List;
import com.yy.jsonInterfaceTest.po.InterfaceParam;
import com.yy.jsonInterfaceTest.util.QueryCondition;

public interface InterfaceParamService {
    void add(InterfaceParam obj);
    void delete(int id);
    void update(InterfaceParam obj);
    InterfaceParam find(QueryCondition qc);
    InterfaceParam findById(int id);
    List<InterfaceParam> query(QueryCondition qc);
    int getCount(QueryCondition qc);
    
    void addBatch(Collection<InterfaceParam> params);
}
