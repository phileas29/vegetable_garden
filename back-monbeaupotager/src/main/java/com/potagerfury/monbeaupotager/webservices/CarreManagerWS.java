package com.potagerfury.monbeaupotager.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.potagerfury.monbeaupotager.bo.Carre;
import com.potagerfury.monbeaupotager.dal.CarreDAO;
import com.potagerfury.monbeaupotager.dal.PotagerDAO;

@RestController
@RequestMapping("carre")
public class CarreManagerWS extends CRUDManagerWS<Carre, CarreDAO> {
	@Autowired
	CarreDAO dao;
	
//	dao.
}
