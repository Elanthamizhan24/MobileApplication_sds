package com.MobileApplication.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.MobileApplication.Entity.MobileApplication;
import com.MobileApplication.Entity.MobileApplication;
import com.MobileApplication.Repository.MobileApplicationRepository;

@Repository
public class MobileApplicationDao {
@Autowired
MobileApplicationRepository mr;


public String postValues(@RequestBody List<MobileApplication>m) {
	 mr.saveAll(m);
	return "Posted Success";
}

public List<String> getAllName()
{
	return mr.getAllName();
}
public List<MobileApplication> getIn()
{
	return mr.getIn();
}
public List<MobileApplication> getNames(String a)
{
	return mr.getNames(a);
}
public List<MobileApplication> getFee(int a,int b)
{
	return mr.getFee(a,b);
}
public Integer getMax()
{
	return mr.getMax();
}
public List<MobileApplication> getSec()
{
	return mr.getSec();
}
public List<MobileApplication> getSecM()
{
	return mr.getSecM();
}
public Integer getSumm()
{
	return mr.getSumm();
}
public List<MobileApplication> getOrd()
{
	return mr.getOrd();
}
public List<MobileApplication>getExpection(String excp)
{
	return mr.getException(excp);
}
public List<MobileApplication>getEx(int ids){
	return mr.getEx(ids);
}
//public List<MobileApplication>getObj(List<MobileApplication>m1){
//	return mr.getObj(m1);
}

