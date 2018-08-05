package com.yy.jsonInterfaceTest.service.impl;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.yy.jsonInterfaceTest.mapper.InterfaceParamMapper;
import com.yy.jsonInterfaceTest.po.InterfaceParam;
import com.yy.jsonInterfaceTest.service.InterfaceParamService;
import com.yy.jsonInterfaceTest.util.QueryCondition;

@Repository("interfaceParamService")
@Transactional
public class InterfaceParamServiceImpl implements InterfaceParamService {
    @Autowired
    private InterfaceParamMapper mapper;

    @Override
    public void add(InterfaceParam obj) {
        mapper.add(obj);
    }

    @Override
    public void delete(int id) {
        mapper.delete(id);
    }

    @Override
    public void update(InterfaceParam obj) {
        mapper.update(obj);
    }

    @Override
    public InterfaceParam find(QueryCondition qc) {
        return mapper.find(qc);
    }

    @Override
    public InterfaceParam findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public List<InterfaceParam> query(QueryCondition qc) {
        return mapper.query(qc);
    }

    @Override
    public int getCount(QueryCondition qc) {
        return mapper.getCount(qc);
    }

	@Override
	public void addBatch(Collection<InterfaceParam> params) {
		mapper.addBatch(params);
	}
}
