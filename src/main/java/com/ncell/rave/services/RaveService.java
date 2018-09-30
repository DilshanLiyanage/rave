package com.ncell.rave.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncell.rave.mappers.RaveMapper;
import com.ncell.rave.models.Category;
import com.ncell.rave.models.RaveSender;
import com.ncell.rave.models.Raves;

@Service
public class RaveService {
	
	@Autowired
	private RaveMapper raveMapper;

	/**
	 * 2) Get category list
	 * GET /rave/categories
	 * 
	 * @return
	 */
	public List<Category> getAllCategories() {
		return raveMapper.getAllCategories();
	}
	
	
	
	
	/**
	 * 3) Send a Rave
	 * POST /employee/{empID}/rave
	 * 
	 * @param raveSender
	 * @param empID
	 * @return
	 */
	public List<Raves> sendRave(RaveSender raveSender, Integer empID) {
		raveMapper.insertRave(raveSender, empID);
		raveMapper.insertRaveRecipients(raveSender,empID);
		raveMapper.insertRaveWitness(raveSender,empID);
		return raveMapper.getFinalInsertedRave(raveSender,empID);
	}




	public List<Raves> getRaves(String empID, String sent, String category, Integer offset, Integer limit) {
		return raveMapper.getRaves(empID, sent, category, offset, limit);
	}

}
