package com.employee.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.employee.response.AddressResponse;

@FeignClient(name="address-service",url="http://localhost:1010",path = "/address-service")
public interface AddessFeignClient {
	
	 @GetMapping("/address/{id}")
	 public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("id") int id);

}
