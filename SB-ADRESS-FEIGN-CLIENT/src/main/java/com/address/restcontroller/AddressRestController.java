package com.address.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.address.response.AddressResponse;
import com.address.service.AddressService;

@RestController
public class AddressRestController {
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int employeeId){
		AddressResponse adsressResponse = this.addressService.findAdressByEmployeeId(employeeId);
		return new ResponseEntity<AddressResponse>(adsressResponse,HttpStatus.OK);
	}

}
