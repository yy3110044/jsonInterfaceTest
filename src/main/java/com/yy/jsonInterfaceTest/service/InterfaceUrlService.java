package com.yy.jsonInterfaceTest.service;

import java.util.List;
import com.yy.jsonInterfaceTest.po.InterfaceUrl;
import com.yy.jsonInterfaceTest.util.QueryCondition;

public interface InterfaceUrlService {
    void add(InterfaceUrl obj);
    void delete(int id);
    void update(InterfaceUrl obj);
    InterfaceUrl find(QueryCondition qc);
    InterfaceUrl findById(int id);
    List<InterfaceUrl> query(QueryCondition qc);
    int getCount(QueryCondition qc);
    
    void add(InterfaceUrl obj, String[] paramJsonStr);
}
