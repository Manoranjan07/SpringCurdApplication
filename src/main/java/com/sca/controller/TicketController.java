package com.sca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sca.entities.Ticket;
import com.sca.service.TicketService;
import com.sca.test.FileReaderService;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {
	@Autowired
	private TicketService ticketService;
	@Autowired
	private FileReaderService fileReaderService;

	@GetMapping
	public String test() {
	return	fileReaderService.init();
	}

	@PostMapping(value = "/createTicket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);

	}

	@GetMapping(value = "/getTicket/{id}")
	public Ticket getTicket(@PathVariable int id) {
		return ticketService.getTicket(id);

	}

	@PutMapping(value = "/update/{id}/{name}")
	public Ticket updateTicket(@PathVariable int id, @PathVariable String name) {
		return ticketService.updateName(id, name);

	}

	@GetMapping(value = "getAll")
	public Iterable<Ticket> getAllTickets() {
		return ticketService.getAllTickets();
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteTicket(@PathVariable int id) {
		ticketService.deleteTicket(id);
	}

}
