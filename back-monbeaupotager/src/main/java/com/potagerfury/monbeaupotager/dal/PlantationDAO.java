package com.potagerfury.monbeaupotager.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.potagerfury.monbeaupotager.bo.Carre;
import com.potagerfury.monbeaupotager.bo.Plantation;
import com.potagerfury.monbeaupotager.bo.Plante;
import com.potagerfury.monbeaupotager.bo.Potager;

public interface PlantationDAO extends CrudRepository<Plantation, Integer> {
	List<Plantation> findByCarre(Carre c);
	
	@Query("select p from Plantation p join Carre c on c=p.carre where c=:carre")
	List<Plantation> findAllPlantationsByCarre(@Param("carre") Carre c);
}
