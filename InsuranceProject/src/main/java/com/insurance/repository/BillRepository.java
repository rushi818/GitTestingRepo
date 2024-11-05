package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Serializable>{

	@Query(value = "select * from bill where bill_Id = ?1",nativeQuery = true)
	public Bill findById(Integer id);
	
}
