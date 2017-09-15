package com.writealone.springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.writealone.springbootstarter.topic.Topic;
import com.writealone.springbootstarter.topic.TopicRepository;

@Service
public class TopicService {

	Logger logger = Logger.getLogger(TopicService.class);
	
	@Autowired
	private TopicRepository topicRepo;
	
/*	private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring-01", "spring framework", "beautifull framework"),
			new Topic("spring-03", "java framework", "beautifull backend language"),
			new Topic("spring-02", "javascript framework", "beautifull frontend language")
			));
	
*/
	public List<Topic> getTopics() {
		//return topicList;
		List<Topic> topics = new ArrayList<Topic>();
		Iterable<Topic> itrbl = topicRepo.findAll();
		
		for (Topic tp : itrbl) {
			topics.add(tp);
		}
		
		return topics;
	}

	public Topic getTopic(String id) {
		/*for (Topic topic : topicList) {
			if (id.equals(topic.getId())) {
				return topic;
			}
		}
		return null;*/
		
		return topicRepo.findOne(id);
	}

	public void addTopic(Topic topic) {
		//topicList.add(topic);
		topicRepo.save(topic);
	}

	public void updateTopic(Topic topic) {
	/*	for (Topic topics : topicList) {
			if (topics.getId().equals(topic.getId())) {
				topics.setId(topic.getId());
				topics.setName(topic.getName());
				topics.setDescription(topic.getDescription());
				return;
			}
		}*/
		topicRepo.save(topic);
	}
	
	public void deleteTopic(String id) {
		/*for (Topic topics : topicList) {
			if (topics.getId().equals(id)) {
				topicList.remove(topics);
				logger.info("data removed successfully from list with id :" + id);
				return;
			}
		}*/

		topicRepo.delete(id);
	}
}
