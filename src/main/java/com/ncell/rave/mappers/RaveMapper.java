package com.ncell.rave.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncell.rave.models.Category;
import com.ncell.rave.models.RaveSender;
import com.ncell.rave.models.Raves;

@Mapper
public interface RaveMapper {
	
	
	/**
	 * 2) Get category list
	 * GET /rave/categories
	 * 
	 * @return
	 */
	List<Category> getAllCategories();
	
	
	
	
	
	/**
	 * 3) Send a Rave
	 * POST /employee/{empID}/rave
	 * 
	 * @param raveSender
	 * @param empID
	 * @return
	 */
	void insertRave(@Param("raveSender") RaveSender raveSender, @Param("empID") Integer  empID);
	void insertRaveRecipients(@Param("raveSender") RaveSender raveSender, @Param("empID") Integer empID);
	void insertRaveWitness(@Param("raveSender") RaveSender raveSender, @Param("empID") Integer empID);
	List<Raves> getFinalInsertedRave(@Param("raveSender") RaveSender raveSender, @Param("empID") Integer empID);





	List<Raves> getRaves(@Param("empID") String empID, @Param("sent") String sent, @Param("category") String category, 
			@Param("offset") Integer offset, @Param("limit") Integer limit);


}
