package com.java.datastructures;

public class Passenger {
	
	private String name;
	private Train trainDetails;
	private Integer noOftickets;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the trainDetails
	 */
	public Train getTrainDetails() {
		return trainDetails;
	}
	/**
	 * @param trainDetails the trainDetails to set
	 */
	public void setTrainDetails(Train trainDetails) {
		this.trainDetails = trainDetails;
	}
	/**
	 * @return the noOftickets
	 */
	public Integer getNoOftickets() {
		return noOftickets;
	}
	/**
	 * @param noOftickets the noOftickets to set
	 */
	public void setNoOftickets(Integer noOftickets) {
		this.noOftickets = noOftickets;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", trainDetails=" + trainDetails + ", noOftickets=" + noOftickets + "]";
	}
	
	

}
