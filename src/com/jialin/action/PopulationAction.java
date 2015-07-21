package com.jialin.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.http.HttpRequest;

import com.jialin.dao.PopulationDaoImp;
import com.jialin.entity.Population;
import com.jialin.service.IPopulationManage;
import com.jialin.service.IUserManage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PopulationAction extends ActionSupport {
	
	private Population population;
	private List<Population> list;
	private int id;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Resource
	private IPopulationManage pManager;
	
	public Population getPopulation() {
		return population;	
	}

	public void setPopulation(Population population) {
		this.population = population;
	}

	public List<Population> getList() {
		list = pManager.getPersionList();
		return list;
	}

	public void setList(List<Population> list) {
		this.list = list;
	}

	public IPopulationManage getpManager() {
		return pManager;
	}

	public void setpManager(IPopulationManage pManager) {
		this.pManager = pManager;
	}

	
	public String pList(){
		HttpServletRequest requset =  ServletActionContext.getRequest();
		List<Population> perlist = pManager.getPersionList();
		requset.setAttribute("perlist", perlist);
		
		return "success";
	}
	public String PAdd(){
		
		
		return "success";
	}
   public String pUpdate() throws IOException{

	 population=pManager.findPersionById(population.getId());
	
		return "success";
	}
   
   public String Update() throws IOException
   {
	    pManager.modifyPersion(population);
		String json = " {\"statusCode\":\"200\", \"message\":\"操作成功\", \"navTabId\":\"page1\",\"callbackType\":\"closeCurrent\"}";
		HttpServletResponse res = ServletActionContext.getResponse();
		res.setCharacterEncoding("UTF-8");  
		PrintWriter out =  res.getWriter();
		out.write(json);
		out.flush();
		out.close();
	  
	   return "success";
   }
   
	public String addPerson() throws IOException {
	    
		pManager.addPersion(population);
		
		String json = " {\"statusCode\":\"200\", \"message\":\"操作成功\", \"navTabId\":\"page1\",\"callbackType\":\"closeCurrent\"}";
		HttpServletResponse res = ServletActionContext.getResponse();
		res.setCharacterEncoding("UTF-8");  
		PrintWriter out =  res.getWriter();
		out.write(json);
		out.flush();
		out.close();
		//String sql="select * from p_population ";
		//boolean flag = true;
		
		return "success";
	}
	public String pDel() throws IOException{
		
		pManager.deletePersion(population);
		String json = " {\"statusCode\":\"200\", \"message\":\"操作成功\", \"navTabId\":\"page1\",\"callbackType\":\"none\"}";
		HttpServletResponse res = ServletActionContext.getResponse();
		res.setCharacterEncoding("UTF-8");  
		PrintWriter out =  res.getWriter();
		out.write(json);
		out.flush();
		out.close();
		return "success";
	}
	
public String pRefresh() throws IOException{
	HttpServletRequest requset =  ServletActionContext.getRequest();
	List<Population> perlist = pManager.getPersionList();
	requset.setAttribute("perlist", perlist);
	
	String json = "{\"tusCode\":\"200\", \"message\":\"操作成功\", \"navTabId\":\"navNewsLi\", \"forwardUrl\":\"\", \"callbackType\":\"closeCurrent\"}";
	HttpServletResponse res = ServletActionContext.getResponse();
	res.setCharacterEncoding("UTF-8");  
	PrintWriter out =  res.getWriter();
	out.write(json);
	out.flush();
	out.close();		
	return "success";
	}
}
