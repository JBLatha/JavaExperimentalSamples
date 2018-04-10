package com.java.datastructures;

import java.util.Iterator;
import java.util.PriorityQueue;

import org.springframework.core.PriorityOrdered;

public class QueueSample {

	private Passenger passenger;
	PriorityQueue<Passenger> po = new PriorityQueue<>();
	
	public static void main(String[] args) {
		
		QueueSample qs = new  QueueSample();
		
		Passenger pass = new Passenger();
		pass.setName("latha");
		pass.setNoOftickets(2);
		
		Train train = new Train();
		train.setTrainName("venkatadri");
		train.setAvailableSeats(10);
		pass.setTrainDetails(train);
		
		Passenger pass1 = new Passenger();
		pass1.setName("deepak");
		pass1.setNoOftickets(5);
		
		Train train1 = new Train();
		train1.setTrainName("venkatadri");
		train1.setAvailableSeats(10);
		pass1.setTrainDetails(train1);
		
		qs.bookTicket(pass);
		qs.bookTicket(pass1);
		
	
		
	}
	
	private void bookTicket(Passenger passenger){
		
		po.add(passenger);
		
		try{
			
			Integer ticketCount = 0;
			Iterator iterator = po.iterator();

			while(iterator.hasNext()){
				Passenger pass = (Passenger)iterator.next();
				ticketCount = ticketCount + pass.getNoOftickets();
			}
			System.out.println(ticketCount);
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	private String removeTicket(Passenger passenger){
		String status = null;
		try{
			if(po.size() < 0){
				status = "Queue is empty";
			}else{
				po.remove(passenger);
				status =  "successfully removed";
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	return status;	
	}

}
