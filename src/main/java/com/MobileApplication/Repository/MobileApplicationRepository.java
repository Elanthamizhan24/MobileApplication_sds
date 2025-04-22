package com.MobileApplication.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.MobileApplication.Entity.MobileApplication;


public interface MobileApplicationRepository  extends JpaRepository<MobileApplication,Integer>{
	@Query(value="select appname from mobileapplication;",nativeQuery=true)
	public List<String> getAllName();
 
	@Query(value="select * from  mobileapplication where users Between 2000000 and 3500000 ;",nativeQuery=true)
	public List<MobileApplication> getIn();

	@Query(value="select * from mobileapplication where appname=?;",nativeQuery=true)
	public List<MobileApplication> getNames(String a); 

	@Query(value="select * from mobileapplication where users >=? && users<=?;", nativeQuery=true)
	public List<MobileApplication> getFee(int a,int b);
	
	@Query(value=" select  max(users) from mobileapplication where users not in (select max(users) from mobileapplication);",nativeQuery=true)
	public Integer getMax();
	
	@Query(value="select * from mobileapplication where users=(select min(users) from mobileapplication where users not in (select min(users) from mobileapplication));",nativeQuery=true)
    public List<MobileApplication> getSec();
	
	@Query(value="select * from mobileapplication where users=(select max(users) from mobileapplication where users not in (select max(users) from mobileapplication));",nativeQuery=true)
	public List<MobileApplication> getSecM();
	
	@Query(value="select sum(users) from mobileapplication;",nativeQuery=true) 
	public Integer getSumm(); 
	
	@Query(value="select * from mobileapplication order by users desc;",nativeQuery=true)
	public List<MobileApplication> getOrd();
	
	@Query(value="select * from mobileapplication limit 3;",nativeQuery=true)
	public List<MobileApplication> getThree();
	
	@Query(value="select * from mobileapplication where name=?;",nativeQuery=true)
	public List<MobileApplication>getException(@Param("excp") String excp);
	
	@Query(value="select * from mobileapplication where id=?;",nativeQuery=true)
	public List<MobileApplication>getEx(@Param("ids")int ids);
	
	@Query(value="select * from mobileapplication where id=?;",nativeQuery=true)
	public List<MobileApplication>getObj(@Param("m1")int id);
}
