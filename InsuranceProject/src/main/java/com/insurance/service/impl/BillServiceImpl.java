package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.exceptions.BillNotFoundException;
import com.insurance.model.Bill;
import com.insurance.repository.BillRepository;
import com.insurance.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository billRepository;

	@Override
	public Bill findById(Integer id) {
		Bill get = billRepository.findById(id);
		if (get == null) {
			throw new BillNotFoundException("Bill is not present inside the database..");
		}

		return get;
	}

	@Override
	public Bill saveBill(Bill bill) {
		Bill save = billRepository.save(bill);
		return save;
	}

	@Override
	public Bill updateBill(Bill bill) {
		Bill update = billRepository.save(bill);

		return update;
	}

	@Override
	public void deleteBill(Integer id) {
		billRepository.deleteById(id);
	}

}
