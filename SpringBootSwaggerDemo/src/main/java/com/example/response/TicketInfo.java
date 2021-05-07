package com.example.response;

public class TicketInfo {
	
	
	private String name;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	private String ticketprice;
	private String ticketstatus;

//	public TicketInfo() {
//		super();
//	}

//	public TicketInfo(String name, String from, String to, String flightId, String journeyDate, String ticketprice,
//			String ticketstatus) {
//		super();
//		this.name = name;
//		this.from = from;
//		this.to = to;
//		this.flightId = flightId;
//		this.journeyDate = journeyDate;
//		this.ticketprice = ticketprice;
//		this.ticketstatus = ticketstatus;
//	}
//

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(String ticketprice) {
		this.ticketprice = ticketprice;
	}

	public String getTicketstatus() {
		return ticketstatus;
	}

	public void setTicketstatus(String ticketstatus) {
		this.ticketstatus = ticketstatus;
	}

//	@Override
//	public String toString() {
//		return "TicketInfo [name=" + name + ", from=" + from + ", to=" + to + ", flightId=" + flightId
//				+ ", journeyDate=" + journeyDate + ", ticketprice=" + ticketprice + ", ticketstatus=" + ticketstatus
//				+ "]";
//	}

}
