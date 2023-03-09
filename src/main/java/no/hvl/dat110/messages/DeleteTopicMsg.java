package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to create topic on the broker
	
	private String topic;

    public DeleteTopicMsg(String topic) {
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
