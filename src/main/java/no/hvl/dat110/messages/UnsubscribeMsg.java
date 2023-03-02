package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 
	
	private String user;
	private String topic;

    public UnsubscribeMsg(String user, String topic) {
    	this.user = user;
    	this.topic = topic;
    }
    
    public String getUser() {
    	return user;
    }
    
    public String getTopic() {
    	return topic;
    }
    
    public void setUser(String user) {
    	this.user = user;
    }
    
    public void setTopic(String topic) {
    	this.topic = topic;
    }
    
    public String toString() {
		return "bruker " + user + " og emne " + topic;
    	
    }

	// TODO:
	// Implement object variables - a topic is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	
}
