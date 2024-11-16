package com.Mobile;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MobileRepository extends JpaRepository<Declare, Integer> {

	@Query(value = "select * from phone_details", nativeQuery = true)
	public List<Declare> getAll1();

//	@Query(value ="select id,brand from phone",nativeQuery=true)
//	public Map<Integer,String> getAll2();

	@Query(value = ("select * from phone_details where color like %? "), nativeQuery = true)
	public Declare getStart(String a);
	
	
	@Query(value = "select * from phone_details where price > ? and price < ?", nativeQuery = true)
	public List<Declare> getPrice(int a, int b);


      @Query("select a from Declare a")
      public List<Declare>getAl();
      
     
     @Query(value ="select a from Declare a where a.price > :x")
     public List<Declare> getFind(@Param("x") int age);

	
     @Query(value=("select * from phone_details where price like ?% "),nativeQuery=true)
     public Declare getOne(int a);

     @Query(value=("select * from phone_details where brand = ? "),nativeQuery=true)
     public Declare getbrand(String  a);

	@Query(value=("select * from phone_details where color like ?% "),nativeQuery=true)
  public Declare getcolor(char a);
	

}

