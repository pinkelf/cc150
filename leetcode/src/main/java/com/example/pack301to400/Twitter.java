package com.example.pack301to400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by majie on 16/6/12.
 */
public class Twitter {
    HashMap<Integer, LinkedList<Tweet>> tweets;
    HashMap<Integer, List<Integer>> follows;
    private long id;

    /**
     * Initialize your data structure here.
     */
    public Twitter() {
        id = 0;
        tweets = new HashMap<Integer, LinkedList<Tweet>>();
        follows = new HashMap<Integer, List<Integer>>();
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        if (follows.get(userId) == null) {
            List<Integer> list = new LinkedList<Integer>();
            list.add(userId);
            follows.put(userId, list);
        }
        LinkedList<Tweet> tweet = tweets.get(userId);
        if (tweet == null) {
            tweet = new LinkedList<Tweet>();
            tweets.put(userId, tweet);
        }
        tweet.add(0, new Tweet(id++, tweetId));
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> list = new LinkedList<Integer>();
        if(follows.get(userId) == null){
            return list;
        }
        PriorityQueue<Tweet> queue = new PriorityQueue<Tweet>();
        for (int i = 0; i < follows.get(userId).size(); i++) {
            List<Tweet> followeeIds = tweets.get(follows.get(userId).get(i));
            if (followeeIds == null) {
                continue;
            }
            for (int j = 0; j < Math.min(followeeIds.size(), 10); j++) {
                if (queue.size() < 10) {
                    queue.offer(followeeIds.get(j));
                } else {
                    if (queue.peek().id < followeeIds.get(j).id) {
                        queue.poll();
                        queue.offer(followeeIds.get(j));
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            list.add(0,queue.poll().tweetId);
        }

        return list;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        if(followerId == followeeId){
            return;
        }
        if (follows.get(followerId) == null) {
            List<Integer> list = new LinkedList<Integer>();
            list.add(followerId);
            follows.put(followerId, list);
        }
        if (!follows.get(followerId).contains(followeeId)) {
            follows.get(followerId).add(followeeId);
        }
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        if(followerId == followeeId){
            return;
        }
        if (follows.get(followerId) == null) {
            List<Integer> list = new LinkedList<Integer>();
            list.add(followerId);
            follows.put(followerId, list);
        }
        if (follows.get(followerId).contains(followeeId)) {
            follows.get(followerId).remove(new Integer(followeeId));
        }
    }

    public class Tweet implements Comparable<Tweet> {
        public long id;
        public int tweetId;

        public Tweet(long id, int tweetId) {
            this.id = id;
            this.tweetId = tweetId;
        }

        public int compareTo(Tweet tweet) {
            if (this.id - tweet.id > 0) {
                return 1;
            } else if (this.id == tweet.id) {
                return 0;
            } else {
                return -1;
            }
        }
    }

}
