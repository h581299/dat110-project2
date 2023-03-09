package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 
	
	private String topic;

    public SubscribeMsg(String topic) {
    	this.topic = topic;
    }
    
    public String getTopic() {
    	return topic;
    }
    
    public void setTopic(String topic) {
    	this.topic = topic;
    }
    
    public String toString() {
		return "emne " + topic;
    	
    }

	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
		
}
