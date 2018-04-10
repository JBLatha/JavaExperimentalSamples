package com.java.datastructures;

import java.util.Date;

public class Train {
	
	private String trainName;
	private String startingFrom;
	private String reachingTo;
	private Date departureTime;
	private Date arraivalTime;
	private Integer availableSeats;
	/**
	 * @return the trainName
	 */
	public String getTrainName() {
		return trainName;
	}
	/**
	 * @param trainName the trainName to set
	 */
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	/**
	 * @return the startingFrom
	 */
	public String getStartingFrom() {
		return startingFrom;
	}
	/**
	 * @param startingFrom the startingFrom to set
	 */
	public void setStartingFrom(String startingFrom) {
		this.startingFrom = startingFrom;
	}
	/**
	 * @return the reachingTo
	 */
	public String getReachingTo() {
		return reachingTo;
	}
	/**
	 * @param reachingTo the reachingTo to set
	 */
	public void setReachingTo(String reachingTo) {
		this.reachingTo = reachingTo;
	}
	/**
	 * @return the departureTime
	 */
	public Date getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the arraivalTime
	 */
	public Date getArraivalTime() {
		return arraivalTime;
	}
	/**
	 * @param arraivalTime the arraivalTime to set
	 */
	public void setArraivalTime(Date arraivalTime) {
		this.arraivalTime = arraivalTime;
	}
	/**
	 * @return the availableSeats
	 */
	public Integer getAvailableSeats() {
		return availableSeats;
	}
	/**
	 * @param availableSeats the availableSeats to set
	 */
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Train [trainName=" + trainName + ", startingFrom=" + startingFrom + ", reachingTo=" + reachingTo
				+ ", departureTime=" + departureTime + ", arraivalTime=" + arraivalTime + ", availableSeats="
				+ availableSeats + "]";
	}
	
	

}
