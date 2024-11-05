package com.insurance.service;

import com.insurance.model.Bill;

public interface BillService {
	
	public Bill findById(Integer id);
	public Bill saveBill(Bill bill);
	public Bill updateBill(Bill bill);
	public void deleteBill(Integer id);
}
