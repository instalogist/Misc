package com.springjpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.springjpa.model.Costemer;

public interface CostemerRepository extends CrudRepository<Costemer ,Long>
{
    List<Costemer> findByLastName(String lastName);
}