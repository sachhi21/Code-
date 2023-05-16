package com.sachin.bootmysql.dao;

import com.sachin.bootmysql.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}