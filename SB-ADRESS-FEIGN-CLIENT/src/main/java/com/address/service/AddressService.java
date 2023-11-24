package com.address.service;

import com.address.response.AddressResponse;

public interface AddressService {
	
	public AddressResponse findAdressByEmployeeId(int id);

}
