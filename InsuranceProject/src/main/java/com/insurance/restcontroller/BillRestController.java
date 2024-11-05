package com.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Bill;
import com.insurance.service.BillService;

@RestController
public class BillRestController {

	@Autowired
	private BillService billService;

	@GetMapping("/getBill/{id}")
	public Bill getBill(@PathVariable ("id") Integer id) {
		Bill get_Bill = billService.findById(id);
		return get_Bill;
	}

	@PostMapping("/saveBill")
	public Bill saveBill(@RequestBody Bill bill) {
		Bill save_Bill = billService.saveBill(bill);
		return save_Bill;
	}

	@PutMapping("/updateBill")
	public Bill updateBill(@RequestBody Bill bill) {
		Bill update_Bill = billService.saveBill(bill);
		return update_Bill;
	}

	@DeleteMapping("/deleteBill/{id}")
	public String deleteBill(@PathVariable ("id")	Integer id) {
		System.out.println("");
		billService.deleteBill(id);
		return "Deleted data successfully...";
	}
}
