package com.yy.jsonInterfaceTest.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yy.jsonInterfaceTest.mapper.InterfaceParamMapper;
import com.yy.jsonInterfaceTest.mapper.InterfaceUrlMapper;
import com.yy.jsonInterfaceTest.po.InterfaceParam;
import com.yy.jsonInterfaceTest.po.InterfaceUrl;
import com.yy.jsonInterfaceTest.service.InterfaceUrlService;
import com.yy.jsonInterfaceTest.util.QueryCondition;
import com.yy.jsonInterfaceTest.util.Util;

@Repository("interfaceUrlService")
@Transactional
public class InterfaceUrlServiceImpl implements InterfaceUrlService {
    @Autowired
    private InterfaceUrlMapper mapper;
    
    @Autowired
    private InterfaceParamMapper ipm;

    @Override
    public void add(InterfaceUrl obj) {
        mapper.add(obj);
    }

    @Override
    public void delete(int id) {
        mapper.delete(id);
        ipm.deleteByUrlId(id);
    }

    @Override
    public void update(InterfaceUrl obj) {
        mapper.update(obj);
    }

    @Override
    public InterfaceUrl find(QueryCondition qc) {
        return mapper.find(qc);
    }

    @Override
    public InterfaceUrl findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public List<InterfaceUrl> query(QueryCondition qc) {
        return mapper.query(qc);
    }

    @Override
    public int getCount(QueryCondition qc) {
        return mapper.getCount(qc);
    }

	@Override
	public void add(InterfaceUrl obj, String[] paramJsonStr) {
		mapper.add(obj);
		if(paramJsonStr != null && paramJsonStr.length > 0) {
			int paramLength = paramJsonStr.length;
			List<InterfaceParam> params = new ArrayList<InterfaceParam>();
			for(int i=0; i<paramLength; i++) {
				InterfaceParam ip = Util.jsonToObject(paramJsonStr[i], InterfaceParam.class);
				ip.setUrlId(obj.getId());
				params.add(ip);
			}
			ipm.addBatch(params);
		}
	}
}
