package com.potagerfury.monbeaupotager.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.potagerfury.monbeaupotager.bo.Carre;
import com.potagerfury.monbeaupotager.bo.Plantation;
import com.potagerfury.monbeaupotager.dal.PlantationDAO;
import com.potagerfury.monbeaupotager.dal.PotagerDAO;

@RestController
@RequestMapping("plantation")
public class PlantationManagerWS extends CRUDManagerWS<Plantation, PlantationDAO> {
	@Autowired
	PlantationDAO dao;
	
//	@GetMapping("/inCarre/{id}")
//	public List<Plantation> findAllPlantationsByCarre(Integer id) {
//		return dao.findAllPlantationsByCarre(id);
//	}
}
