package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.Passengerinfo;
import com.example.response.TicketInfo;

@RestController
public class AirIndiaRestController {

	@PostMapping(value = "/bookFlightTicket", consumes = {

			"application/json", "application/xml" }, 
			
			produces = { "application/json", "application/xml"

	})
	
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody Passengerinfo pinfo) {
		// logic to book ticketinfo

		TicketInfo ticket = new TicketInfo();
		
		ticket.setName(pinfo.getFname());
		ticket.setName(pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setName(pinfo.getJourneyDate());
		ticket.setTicketstatus("Confirmed");
		ticket.setTicketprice("45000");
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public String index() {

        return "This is Air India page";
    }
}
