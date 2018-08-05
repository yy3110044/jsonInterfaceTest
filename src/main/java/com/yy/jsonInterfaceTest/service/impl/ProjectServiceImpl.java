package com.yy.jsonInterfaceTest.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yy.jsonInterfaceTest.mapper.InterfaceParamMapper;
import com.yy.jsonInterfaceTest.mapper.InterfaceUrlMapper;
import com.yy.jsonInterfaceTest.mapper.ProjectMapper;
import com.yy.jsonInterfaceTest.po.InterfaceUrl;
import com.yy.jsonInterfaceTest.po.Project;
import com.yy.jsonInterfaceTest.service.ProjectService;
import com.yy.jsonInterfaceTest.util.QueryCondition;

@Repository("projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper mapper;
    
    @Autowired
    private InterfaceUrlMapper ium;
    
    @Autowired
    private InterfaceParamMapper ipm;

    @Override
    public void add(Project obj) {
        mapper.add(obj);
    }

    @Override
    public void delete(int id) {
        mapper.delete(id);
        List<InterfaceUrl> iuList = ium.query(new QueryCondition().addCondition("projectId", "=", id));
        ium.deleteByProjectId(id);
        
        for(InterfaceUrl iu : iuList) {
        	ipm.deleteByUrlId(iu.getId());
        }
    }

    @Override
    public void update(Project obj) {
        mapper.update(obj);
    }

    @Override
    public Project find(QueryCondition qc) {
        return mapper.find(qc);
    }

    @Override
    public Project findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public List<Project> query(QueryCondition qc) {
        return mapper.query(qc);
    }

    @Override
    public int getCount(QueryCondition qc) {
        return mapper.getCount(qc);
    }
}
