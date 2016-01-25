package com.myHelp.entity;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ticket {


		private Integer ticket_id; 
		private String  ticket_creator_name;
		private String  ticket_title;
		private String  ticket_problem_description;
		private Integer ticket_status;
		private java.util.Date  ticket_create_date;
		private Integer ticket_priority;
	
		
		public Ticket(){};
		  public Ticket(Integer ticket_id, String ticket_creator_name,
				String ticket_title, String ticket_problem_description,
				Integer ticket_status, Date ticket_create_date,
				Integer ticket_priority) {
			
			this.ticket_id = ticket_id;
			this.ticket_creator_name = ticket_creator_name;
			this.ticket_title = ticket_title;
			this.ticket_problem_description = ticket_problem_description;
			this.ticket_status = ticket_status;
			this.ticket_create_date = ticket_create_date;
			this.ticket_priority = ticket_priority;
		}


	     
		public Integer getTicket_id() {
			return ticket_id;
		}
		public void setTicket_id(Integer ticket_id) {
			this.ticket_id = ticket_id;
		}
		public String getTicket_creator_name() {
			return ticket_creator_name;
		}
		public void setTicket_creator_name(String ticket_creator_name) {
			this.ticket_creator_name = ticket_creator_name;
		}
		public String getTicket_title() {
			return ticket_title;
		}
		public void setTicket_title(String ticket_title) {
			this.ticket_title = ticket_title;
		}
		public String getTicket_problem_description() {
			return ticket_problem_description;
		}
		public void setTicket_problem_description(String ticket_problem_description) {
			this.ticket_problem_description = ticket_problem_description;
		}
		public Integer getTicket_status() {
			return ticket_status;
		}
		public void setTicket_status(Integer ticket_status) {
			this.ticket_status = ticket_status;
		}
		public java.util.Date getTicket_create_date() {
			return ticket_create_date;
		}
		public void setTicket_create_date(java.util.Date ticket_create_date) {
			this.ticket_create_date = ticket_create_date;
		}
		public Integer getTicket_priority() {
			return ticket_priority;
		}
		public void setTicket_priority(Integer ticket_priority) {
			this.ticket_priority = ticket_priority;
		}
		
		public  String  toString () {
			return ticket_id + "," +ticket_creator_name + "," +ticket_title+"," +ticket_problem_description +","+ ticket_status +"," + new SimpleDateFormat("yyyy-mm-dd").format(ticket_create_date)+"," +ticket_priority;
		}
}
