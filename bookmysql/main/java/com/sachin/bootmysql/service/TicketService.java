package com.sachin.bootmysql.service;

import com.sachin.bootmysql.model.Ticket;
import java.util.List;
import java.util.Optional;

public interface TicketService {

    String bookTicket(List<Ticket> tickets);

    List<Ticket> getTickets();

    Optional<Ticket> getTicket(Integer ticketId);
}
