package com.writealone.springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.writealone.springbootstarter.topic.Topic;

@Service
public class TopicService {

	private List<Topic> topicList = Arrays.asList(
			new Topic("spring-01", "spring framework", "beautifull framework"),
			new Topic("spring-03", "java framework", "beautifull backend language"),
			new Topic("spring-02", "javascript framework", "beautifull frontend language")
			);
	

	public List<Topic> getTopics() {
		return topicList;
	}

	public Topic getTopic(String id) {
		for (Topic topic : topicList) {
			if (id.equals(topic.getId())) {
				return topic;
			}
		}
		return null;
	}
}
