package com.hamp.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hamp.app.models.entity.Cliente;



public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
