package com.MobileApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.MobileApplication.Entity.MobileApplication;
import com.MobileApplication.Exception.IdNotFoundException;
import com.MobileApplication.Exception.NameNotFoundException;
import com.MobileApplication.Exception.ObjectNotFoundException;
import com.MobileApplication.Dao.MobileApplicationDao;
import com.MobileApplication.Entity.MobileApplication;

@Service
public class MobileApplicationService {
@Autowired
MobileApplicationDao md;

public String postValues(@RequestBody List<MobileApplication>m) {
	return md.postValues(m);
}


public List<String> getAllName()
{
	return md.getAllName();
}
public List<MobileApplication> getIn()
{
	return md.getIn();
}
public List<MobileApplication> getNames(String a)
{
	return md.getNames(a);
}
 
public List<MobileApplication> getFee(int a,int b)
{
	return md.getFee(a,b);
}
public Integer getMax()
{
	return md.getMax();
}
public List<MobileApplication> getSec()
{
	return md.getSec();
}
public List<MobileApplication> getSecM()
{
	return md.getSecM();
}
public Integer getSumm()
{
	return md.getSumm();
}
public List<MobileApplication> getOrd()
{
	return md.getOrd();
}
//public List<MobileApplication> getThree()
//{
//	return md.getThree();
//}

public List<MobileApplication>getException(String excp)throws NameNotFoundException{
	if(md.getExpection(excp).isEmpty()) {
		throw new NameNotFoundException("The name is not found in Exception");
	}  
	else {
		return md.getExpection(excp); 
	}
	}
public List<MobileApplication>getEx(int ids)throws IdNotFoundException{
	if(md.getEx(ids).isEmpty()) {
		throw new IdNotFoundException("The Id is Not in the List");
	}else { 
		return md.getEx(ids);
	}
}
//public List<MobileApplication>getObj(List<MobileApplication>m1)throws ObjectNotFoundException{
//	if(md.getObj(m1).isEmpty()) {
//		throw new ObjectNotFoundException("The object is Not in the List");
//	}else {
//		return md.getObj(m1);
//	}
//	}
}
	
	