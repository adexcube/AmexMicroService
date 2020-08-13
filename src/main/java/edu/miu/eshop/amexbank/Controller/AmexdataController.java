package edu.miu.eshop.amexbank.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.eshop.amexbank.domain.Amexdata;
import edu.miu.eshop.amexbank.domain.Transaction;
import edu.miu.eshop.amexbank.service.AmexdataService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("amex")
public class AmexdataController {

	@Autowired
	private AmexdataService service;
	
	
	@PostMapping("/confirm")
	public ResponseEntity<?> confirmTransaction(@RequestBody Transaction transaction) {
		Boolean confirm = service.confirmTransaction(transaction);
		return new ResponseEntity<Boolean>(confirm, HttpStatus.OK);
	
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<?> addAmex(@RequestBody Amexdata amexdata) {
		service.saveAmexdata(amexdata);
		return new ResponseEntity<String>("Data inserted successfully", HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getamex")
	public ResponseEntity<?> getAmex() {
		List<Amexdata> amexdata = service.getAmexdata();
		return new ResponseEntity<List<Amexdata>>(amexdata, HttpStatus.OK); 
	}
	
	
	@GetMapping("/getbalance")
	public ResponseEntity<?> getBalance() {
		double balance = service.getBalanceOfAccount("GROUP 3 ACCOUNT");
		return new ResponseEntity<Double>(balance, HttpStatus.OK); 
	}
	
	
	
}
