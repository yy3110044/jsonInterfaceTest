package com.yy.jsonInterfaceTest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yy.jsonInterfaceTest.po.InterfaceParam;
import com.yy.jsonInterfaceTest.po.InterfaceUrl;
import com.yy.jsonInterfaceTest.po.Project;
import com.yy.jsonInterfaceTest.service.InterfaceParamService;
import com.yy.jsonInterfaceTest.service.InterfaceUrlService;
import com.yy.jsonInterfaceTest.service.ProjectService;
import com.yy.jsonInterfaceTest.util.JsonResultMap;
import com.yy.jsonInterfaceTest.util.QueryCondition;
import com.yy.jsonInterfaceTest.util.ResponseObject;

@RestController
@RequestMapping(method=RequestMethod.POST)
public class InterfaceController {
	@Autowired
	private ProjectService ps;
	
	@Autowired
	private InterfaceUrlService ius;
	
	@Autowired
	private InterfaceParamService ips;

	//添加项目
	@RequestMapping("/addProject")
	public ResponseObject addProject(@RequestParam String name,
                                      String description,
                                      @RequestParam String prefixUrl) {
		Project pro = new Project();
		pro.setName(name);
		pro.setDescription(description);
		pro.setPrefixUrl(prefixUrl);
		ps.add(pro);
		return new ResponseObject(100, "success");
	}

	//添加接口
	@RequestMapping("/addUrl")
	public ResponseObject addUrl(@RequestParam int projectId,
                                  @RequestParam String url,
                                  @RequestParam String method,
                                  String description,
                                  HttpServletRequest req) {
		String[] paramJsonStr = req.getParameterValues("paramJsonStr[]");
		InterfaceUrl iu = new InterfaceUrl();
		iu.setProjectId(projectId);
		iu.setUrl(url);
		iu.setMethod(method);
		iu.setDescription(description);
		ius.add(iu, paramJsonStr);
		return new ResponseObject(100, "success");
	}
	
	@RequestMapping("/getProject")
	public ResponseObject getProject(@RequestParam int projectId) {
		Project pro = ps.findById(projectId);
		if(pro != null) {
			return new ResponseObject(100, "success", pro);
		} else {
			return new ResponseObject(101, "项目不存在");
		}
	}
	
	//返回所有项目
	@RequestMapping("/getAllProject")
	public ResponseObject getAllProject() {
		return new ResponseObject(100, "success", ps.query(null));
	}
	
	//返回项目下的所有接口
	@RequestMapping("/getAllUrl")
	public ResponseObject getAllUrl(@RequestParam int projectId) {
		return new ResponseObject(100, "success", ius.query(new QueryCondition().addCondition("projectId", "=", projectId)));
	}
	
	//根据urlId返回接口
	@RequestMapping("/getUrl")
	public ResponseObject getUrl(@RequestParam int urlId) {
		InterfaceUrl url = ius.findById(urlId);
		List<InterfaceParam> paramList = ips.query(new QueryCondition().addCondition("urlId", "=", urlId));
		return new ResponseObject(100, "success", new JsonResultMap().set("url", url).set("paramList", paramList));
	}
	
	@RequestMapping("/getAllParam")
	public ResponseObject getAllParam(@RequestParam int urlId) {
		return new ResponseObject(100, "success", ips.query(new QueryCondition().addCondition("urlId", "=", urlId)));
	}
	
	//删除项目
	@RequestMapping("/deleteProject")
	public ResponseObject deleteProject(@RequestParam int projectId) {
		ps.delete(projectId);
		return new ResponseObject(100, "success");
	}
	
	//删除接口
	@RequestMapping("/deleteUrl")
	public ResponseObject deleteUrl(@RequestParam int urlId) {
		ius.delete(urlId);
		return new ResponseObject(100, "success");
	}
	
	//删除参数
	@RequestMapping("/deleteParam")
	public ResponseObject deleteParam(@RequestParam int paramId) {
		ips.delete(paramId);
		return new ResponseObject(100, "success");
	}
}