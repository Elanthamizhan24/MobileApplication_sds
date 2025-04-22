package com.MobileApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MobileApplication.Entity.MobileApplication;
import com.MobileApplication.Exception.IdNotFoundException;
import com.MobileApplication.Exception.NameNotFoundException;
import com.MobileApplication.Entity.MobileApplication;
import com.MobileApplication.Service.MobileApplicationService;

@RestController
public class MobileApplicationController {
@Autowired
MobileApplicationService mp;
 

@PostMapping(value="/postValues")
public String postValues(@RequestBody List<MobileApplication>m) {
	return mp.postValues(m);
}

@GetMapping (value="/getallNames")
public List<String> getAllName()
{
	 return mp.getAllName();
}
@GetMapping (value="/getBet")
public List<MobileApplication> getIn()
{
	 return mp.getIn();
}
@GetMapping (value="/getNames/{a}")
public List<MobileApplication> getNames(@PathVariable String a)
{
	 return mp.getNames(a);
}
@GetMapping(value="/getFee/{a}/{b}")
public List<MobileApplication> getFee(@PathVariable int a,@PathVariable int b)
{
	 return mp.getFee(a,b);
}

@GetMapping(value="/getMax")
public Integer getMax()
{
	return mp.getMax();
}
@GetMapping(value="/getSec")
public List<MobileApplication> getSec()
{
	return mp.getSec();
}
@GetMapping(value="/getSecM")
public List<MobileApplication> getSecM()
{
	return mp.getSecM();
}
@GetMapping(value="/getSumm")
public Integer getSumm()
{
	return mp.getSumm();
}
@GetMapping(value="/getOrd")
public List<MobileApplication> getOrd()
{
	return mp.getOrd();
}
//@GetMapping(value="/getThree")
//public List<MobileApplication> getThree()
//{
//	return mp.getThree();
//}

@GetMapping(value="/getException/{excp}")
public List<MobileApplication>getException(@PathVariable String excp)throws NameNotFoundException{
	return mp.getException(excp);
}

@GetMapping(value="/getExs/{ids}")
public List<MobileApplication>getEx(@PathVariable int ids)throws IdNotFoundException{
	return mp.getExs(ids);
}

//@GetMapping(value="/getObj/{ob}")
//public List<MobileApplication>getObj(@RequestBody List<MobileApplication>m1){
//	return mp.getObj(ob);
}
