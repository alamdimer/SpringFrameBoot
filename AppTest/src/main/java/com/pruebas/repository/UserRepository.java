package com.pruebas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebas.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
/*
 * CRUD repository nos implementa "Guardar, Encontrar por ID, Encontrar todos los usuarios, Borrar, Actualizar, Contar
 */
	//findBy Sirve para filtrar que busque por .. ejemplo findByEmail, findByUsername
	//public Set<User> findByUsername(String username); 
		}
