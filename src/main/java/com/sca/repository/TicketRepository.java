package com.sca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sca.entities.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
