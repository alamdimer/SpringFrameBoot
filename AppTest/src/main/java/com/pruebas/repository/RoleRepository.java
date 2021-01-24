package com.pruebas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebas.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {

}
