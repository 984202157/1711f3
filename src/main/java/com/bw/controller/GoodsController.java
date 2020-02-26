package com.bw.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.dao.GoodsDao;
import com.bw.entity.Condition1;
import com.bw.entity.Goods;
import com.bw.entity.Gtype;
import com.bw.entity.Pinpai;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String list(Model m,Condition1 con){
		if(con.getPageNum()==null){
			con.setPageNum(1);
		}
		PageHelper.startPage(con.getPageNum(), 3);
		List<Goods> list=service.list(con);
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		m.addAttribute("con", con);
		m.addAttribute("page", page);
		return "list";
	}
	@ResponseBody
	@RequestMapping("listt")
	public Object listt(){
		List<Gtype> list=service.listt();
		return list;
	}
	@ResponseBody
	@RequestMapping("listp")
	public Object listp(){
		List<Pinpai> list=service.listp();
		return list;
	}
	@RequestMapping("toadd")
	public String toadd(){
		return "add";
	}
	@RequestMapping("add")
	public String add(Goods goods,MultipartFile myFile,HttpServletRequest request) throws IllegalStateException, IOException{
				String realPath=request.getSession().getServletContext().getRealPath("/file/");
				String end = myFile.getOriginalFilename().substring(myFile.getOriginalFilename().lastIndexOf("."));
				String start = UUID.randomUUID().toString();
				File file =new File(realPath+"\\"+start+end);
				System.out.println(realPath+"\\"+start+end);
				myFile.transferTo(file);
				goods.setGpic(start+end);
				
				service.add(goods);
		return "redirect:list";
	}
}
