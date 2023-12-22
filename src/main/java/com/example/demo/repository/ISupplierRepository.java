package com.example.demo.repository;

import com.example.demo.entities.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISupplierRepository extends CrudRepository<Supplier, Long> {
}
