package com.springboot.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long>{

}