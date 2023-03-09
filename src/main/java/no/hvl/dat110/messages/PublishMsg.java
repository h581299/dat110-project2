package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 
	
	private String topic;
	private String message;

	public PublishMsg(String topic, String message) {
		this.topic = topic;
		this.message = message;
	}

	// TODO:
	// Implement object variables - a topic and a message is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
    
    public String getTopic() {
    	return topic;
    }
    
    public String getMessage() {
    	return message;
    }
    
    public void setTopic(String topic) {
    	this.topic = topic;
    }
    
    public void setMessage(String message) {
    	this.message = message;
    }
    
    public String toString() {
		return "emne " + topic + " med melding: " + message;
    	
    }}
