package com.address.repository;

import java.util.Optional;

import org.aspectj.weaver.tools.Trace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.address.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	@Query(nativeQuery = true,
			value="SELECT ea.id,ea.city,ea.state FROM circuitbreaker.address ea join circuitbreaker.employee e on e.id=ea.employee_id where ea.employee_id= :employeeId")
	Optional< Address> getAddressByEmployeeId(@Param("employeeId") int empId);

}
