package com.hello.topic.dao;

import java.util.List;

import com.hello.topic.vo.TopicVO;

public interface TopicDAO {

	public List<TopicVO> readAllTopics();
	
	public TopicVO readOneTopicByTopicID(int id);
	
	public int createNewTopic(TopicVO topicVO);
	
	public int updateOneTopic(TopicVO topicVO);
	
	public int deleteOneTopicById(int id);
}
