package com.sca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sca.entities.Ticket;
import com.sca.repository.TicketRepository;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepository;

	public Ticket createTicket(Ticket ticket) {
		return ticketRepository.save(ticket);

	}

	public Ticket getTicket(int id) {
		return ticketRepository.findOne(id);
	}

	public Ticket updateName(int id, String name) {
		Ticket ticket = ticketRepository.findOne(id);
		ticket.setName(name);
		return ticketRepository.save(ticket);
	}

	public Iterable<Ticket> getAllTickets() {
		return ticketRepository.findAll();
	}

	public void deleteTicket(int id) {
		ticketRepository.delete(id);

	}

}
