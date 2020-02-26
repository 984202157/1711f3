package com.bw.dao;

import java.util.List;

import com.bw.entity.Condition1;
import com.bw.entity.Goods;
import com.bw.entity.Gtype;
import com.bw.entity.Pinpai;

public interface GoodsDao {

	List<Goods> list(Condition1 con);

	List<Gtype> listt();

	List<Pinpai> listp();

	void add(Goods goods);

	

}
