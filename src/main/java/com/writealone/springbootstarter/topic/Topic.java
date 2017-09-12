package com.writealone.springbootstarter.topic;

/**
 * 
 * @author  Jang
 * Sept 13, 2017
 */

public class Topic {
	
	private String TopicId;
	private String TopicName;
	private String TopicDescription;
	
	public Topic() {
		
	}
	
	public Topic(String TopicId, String TopicName, String TopicDescription) {
		super();
		this.TopicId = TopicId;
		this.TopicName = TopicName;
		this.TopicDescription = TopicDescription;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return TopicId;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String TopicId) {
		this.TopicId = TopicId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return TopicName;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String TopicName) {
		this.TopicName = TopicName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return TopicDescription;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String TopicDescription) {
		this.TopicDescription = TopicDescription;
	}
	
	
}
