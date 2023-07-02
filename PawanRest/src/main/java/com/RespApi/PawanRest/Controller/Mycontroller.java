package com.RespApi.PawanRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RespApi.PawanRest.Customer.CustDetails;
import com.RespApi.PawanRest.Service.Custservice;

@RestController
public class Mycontroller {
	
	@Autowired
	Custservice custservice;
	
@GetMapping("/custdetails")	
public List<CustDetails> getCustDetails(){
	return this.custservice.getAllCustDetails();
	
}

@GetMapping("/custdetails/{custid}")
public CustDetails getCustDetails(@PathVariable int custid){
	
return	 this.custservice.getCustDetails( custid);

}

@PostMapping("/custdetails")
public CustDetails addCustDetails (@RequestBody CustDetails cust)
{
	
	return  this.custservice.addCustDetails(cust);
	  
	}



@PutMapping("/custdetails")
public CustDetails updaCustDetails(@RequestBody CustDetails  cust) {
	{
		
	return this.custservice.updateCustdetails(cust);
		}
	}

@DeleteMapping("/custdetails/{custid}")
public String  deleCustDetails(@PathVariable int custid) {
	
		
	return	this.custservice.deleteCustDetails(custid);
		
	
	
}
}
