package com.potagerfury.monbeaupotager.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.potagerfury.monbeaupotager.bo.Carre;
import com.potagerfury.monbeaupotager.bo.Potager;

public interface PotagerDAO extends CrudRepository<Potager, Integer> {
	@Query("select count(c) from Potager p left join Carre c on c.potager=p group by p")
	List<Integer> countAllCarresByPotager();
}
