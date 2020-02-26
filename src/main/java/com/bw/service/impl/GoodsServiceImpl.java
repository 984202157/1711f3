package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.GoodsDao;
import com.bw.entity.Condition1;
import com.bw.entity.Goods;
import com.bw.entity.Gtype;
import com.bw.entity.Pinpai;
import com.bw.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao dao;

	@Override
	public List<Goods> list(Condition1 con) {
		// TODO Auto-generated method stub
		return dao.list(con);
	}

	@Override
	public List<Gtype> listt() {
		// TODO Auto-generated method stub
		return dao.listt();
	}

	@Override
	public List<Pinpai> listp() {
		// TODO Auto-generated method stub
		return dao.listp();
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		dao.add(goods);
	}

	
	
}
