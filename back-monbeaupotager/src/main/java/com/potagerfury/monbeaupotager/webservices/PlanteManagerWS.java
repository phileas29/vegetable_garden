package com.potagerfury.monbeaupotager.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.potagerfury.monbeaupotager.bo.Plante;
import com.potagerfury.monbeaupotager.dal.PlanteDAO;
import com.potagerfury.monbeaupotager.dal.PotagerDAO;

@RestController
@RequestMapping("plante")
public class PlanteManagerWS extends CRUDManagerWS<Plante, PlanteDAO> {
	@Autowired
	PotagerDAO dao;
}
