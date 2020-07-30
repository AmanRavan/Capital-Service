package com.manipal.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.Capital;
import com.manipal.demo.repository.CapitalRepository;

@RestController
public class CapitalServiceController {
	@Autowired
	private Environment environment;
	
	@Autowired
	private CapitalRepository capitalRepository;
	
	@GetMapping("/capital-service/capitalCode/{countryCode}")
	public Capital getCapitalCode(@PathVariable String countryCode) {
		Capital capital = capitalRepository.findById(countryCode).orElse(null);	
		capital.setPort(Integer.parseInt(environment.getProperty("server.port")));
		return capital;	
	}
	
	@GetMapping("/capital-service/capital/{capitalName}")
	public Capital getCapitalName(@PathVariable String capitalName){
		Capital capital = capitalRepository.findByCapitalName(capitalName);	
		capital.setPort(Integer.parseInt(environment.getProperty("server.port")));
		return capital;
	}	

	@GetMapping("/capital-service/capitalZipCode/{capitalZipcode}")
	public Capital getCapitalZipCode(@PathVariable String capitalZipcode){
		Capital capital = capitalRepository.findByCapitalZipCode(capitalZipcode);	
		capital.setPort(Integer.parseInt(environment.getProperty("server.port")));
		return capital;
	}
	
	@GetMapping("/capital-service/all")
	public List<Capital> getAllCapitals(){
	return capitalRepository.findAll();	
	}
}
