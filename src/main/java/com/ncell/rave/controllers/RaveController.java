package com.ncell.rave.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncell.rave.models.Category;
import com.ncell.rave.models.RaveSender;
import com.ncell.rave.models.Raves;
import com.ncell.rave.services.RaveService;

@RestController 
@RequestMapping("/employee")
public class RaveController {
	
	@Autowired
	private RaveService raveService;

	@GetMapping
	public String index() {
		return "This is landing page";
	}
	
	/**
	 * 2) Get category list
	 * GET /rave/categories
	 * 
	 * @return
	 */
	@GetMapping(value="/rave/categories")
	public List<Category> getAllCategories(){
		return raveService.getAllCategories();
	} 
	
	
	
	
	/**
	 * 3) Send a Rave
	 * POST /employee/{empID}/rave
	 * 
	 * @param raveSender
	 * @param empID
	 * @return
	 */
	
	/**
	 * -------------------------------------------------------------
	 * parse as
	 * 	{
	 * 		"coEmployees": [1,2],
	 * 		"category": 2,
	 * 		"witness": [1,2],
	 * 		"comment": "Thank you for the support 2222222222222222"
	 * 	}
	 * --------------------------------------------------------------
	 */
	@PostMapping("/{empID}/rave")
	public List<Raves> sendRave(@RequestBody RaveSender raveSender, @PathVariable("empID") Integer empID) {
		return raveService.sendRave(raveSender,empID);
	} 
	

	

	@GetMapping("{empID}/rave")
	public List<Raves> getRaves(@PathVariable("empID") String empID, 
			@RequestParam(value="sent", required=true) String sent,
			@RequestParam(value="category", required=false) String category,
			@RequestParam(value="offset", required=true) Integer offset,
			@RequestParam(value="limit", required=true) Integer limit){
		return raveService.getRaves(empID, sent, category, offset, limit);
	}
	
	
	

}
