package com.RespApi.PawanRest.Service;

import java.util.List;

import com.RespApi.PawanRest.Customer.CustDetails;

public interface Custservice  {
	
public List<CustDetails> getAllCustDetails();
public  CustDetails getCustDetails(int custid);
public CustDetails addCustDetails(CustDetails cust);
public CustDetails updateCustdetails(CustDetails cust);
public String  deleteCustDetails(int custDetails);

	

}
