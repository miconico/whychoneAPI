package com.whychone.engine.feeds;

import com.whychone.model.feeds.FeedTopicModel;

public interface FeedProcessor {
	public FeedTopicModel getFeedTopics(String user);
}
