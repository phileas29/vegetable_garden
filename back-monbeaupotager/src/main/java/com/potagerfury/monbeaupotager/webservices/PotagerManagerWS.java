package com.potagerfury.monbeaupotager.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.potagerfury.monbeaupotager.bo.Potager;
import com.potagerfury.monbeaupotager.dal.PotagerDAO;

@RestController
@RequestMapping("potager")
public class PotagerManagerWS extends CRUDManagerWS<Potager, PotagerDAO> {
	@Autowired
	PotagerDAO dao;
	
	@GetMapping("/nbCarres")
	public List<Integer> countAllCarresByPotager() {
		return dao.countAllCarresByPotager();
	}
}
