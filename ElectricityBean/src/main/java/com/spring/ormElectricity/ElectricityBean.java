package com.spring.ormElectricity;

public class ElectricityBean {
	private int ConsumerId;
	private String ConsumerName;
	private int currentReading;
	private int previousReading;
	public ElectricityBean() {
		
	}
	public int getConsumerId() {
		return ConsumerId;
	}
	public void setConsumerId(int consumerId) {
		ConsumerId = consumerId;
	}
	public String getConsumerName() {
		return ConsumerName;
	}
	public void setConsumerName(String consumerName) {
		ConsumerName = consumerName;
	}
	public int getCurrentReading() {
		return currentReading;
	}
	public void setCurrentReading(int currentReading) {
		this.currentReading = currentReading;
	}
	public int getPreviousReading() {
		return previousReading;
	}
	public void setPreviousReading(int previousReading) {
		this.previousReading = previousReading;
	}
	public ElectricityBean(int consumerId, String consumerName, int currentReading, int previousReading) {
		super();
		ConsumerId = consumerId;
		ConsumerName = consumerName;
		this.currentReading = currentReading;
		this.previousReading = previousReading;
	}
	@Override
	public String toString() {
		return "ElectricityBean [ConsumerId=" + ConsumerId + ", ConsumerName=" + ConsumerName + ", currentReading="
				+ currentReading + ", previousReading=" + previousReading + "]";
	}

	
	

}
