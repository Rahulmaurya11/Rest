package com.RespApi.PawanRest.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.RespApi.PawanRest.Customer.CustDetails;

@Service
public class CustServiceImpl implements Custservice {
//
//CustDetails custDetails;
	List<CustDetails> list;
	
	public CustServiceImpl() {
		
		list=new ArrayList<CustDetails>();
		list.add(new CustDetails(33, "rahul "," bholenath nagarr", "9930854589"));
		list.add(new CustDetails(34, "rohit", "prayagraj", "9819336328"));
		list.add(new CustDetails(45, "rampratap", "udidih", "8082363613"));
		list.add(new CustDetails(55, "rammu", "udidih", "8082363613"));
		
		
	}
	
	@Override
	public List<CustDetails> getAllCustDetails() {
		
		return list;
	}

// fetching cust_infromation via id 
	
	public CustDetails getCustDetails(int custid) {
		
	CustDetails c=null;
	

	for (CustDetails custDetails :list)
	{
		if (custDetails.getId()==custid) {
			c=custDetails;
			break;
		}
	}
		return c;
	}

	@Override
	public CustDetails addCustDetails(CustDetails cust) {
	
		list.add(cust);
		return cust;
	}

	@Override
	public CustDetails updateCustdetails(CustDetails cust) {

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			CustDetails custDetails = (CustDetails) iterator.next();
			
			if(custDetails.getId()==cust.getId()) {
				
				custDetails.setId(cust.getId());
				custDetails.setName(cust.getName());
				custDetails.setAddress(cust.getAddress());
				custDetails.setPhonenumber(cust.getPhonenumber());
			}
		}

		return cust;
		
	}

	@Override
	public String  deleteCustDetails(int custid) {
		CustDetails c=null;
		for (CustDetails custDetails : list) {
			if (custDetails.getId()==custid) {
				c=custDetails;
		list.remove(c);
		
			
			}
		}

		return "Deleletion completed ";

		
	}

}
	
	
	


