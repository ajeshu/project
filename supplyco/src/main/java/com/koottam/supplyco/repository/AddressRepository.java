package com.koottam.supplyco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koottam.supplyco.entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Long>{

}
