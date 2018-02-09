package com.vl;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
@RequestMapping("/topics")
	public List<Topic> allTopics(){
		return Arrays.asList(
				new Topic(123,"spring","spring framework integrations"),
				new Topic(124,"hibernate","hibernate integartion")
				);
		//return new Topic(123,"spring","spring framework integrations");
	}
}
