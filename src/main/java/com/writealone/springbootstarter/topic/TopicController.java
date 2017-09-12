package com.writealone.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author  Jang Sept 13, 2017
 *
 */

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		
		List<Topic> topicList = new ArrayList<Topic>();
		Topic t1 = new Topic("spring-01", "spring framework", "beautifull framework");
		Topic t2 = new Topic("spring-03", "java framework", "beautifull backend language");
		Topic t3 = new Topic("spring-02", "javascript framework", "beautifull frontend language");

		topicList.add(t1);
		topicList.add(t2);
		topicList.add(t3);
		
		return topicList;
	}
}
