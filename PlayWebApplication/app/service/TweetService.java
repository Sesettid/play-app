package service;

import models.TwitterResultModel;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static models.TwitterResultModel.reform;

public class TweetService {


    /**
     *
     * @author Negin
     * @param keyWord
     * @return
     */
    public static List<TwitterResultModel> getTweets(String keyWord) {

        Twitter twitter = new TwitterFactory().getInstance();
        List<TwitterResultModel> result = new ArrayList<TwitterResultModel>();
        try {
            Query query = new Query(keyWord);
            result = twitter.search(query).getTweets().stream().limit(10)
                    .map(s -> reform(s)).collect(Collectors.toList());
        } catch (TwitterException error) {
            System.out.println(error.getMessage());
        }
        return result;
    }


    /**
     * @author Negin
     * @param keyWords
     * @return
     */
    public static CompletableFuture<List<TwitterResultModel>> getTweetsAsync(String keyWords) {
        return CompletableFuture.supplyAsync(() -> getTweets(keyWords));
    }
//
//
//public static ArrayList<String> getTweets(String searchKeys) {
//
//		int count=1;
//		Twitter twitter = new TwitterFactory().getInstance();
//		ArrayList<String> tweetList = new ArrayList<String>();
//		try {
//			Query query = new Query(searchKeys);
//			QueryResult result;
//			do {
//				result = twitter.search(query);
//				List<Status> tweets = result.getTweets();
//				for (Status tweet : tweets) {
//					tweetList.add(tweet.getText());
//					count++;
//					if(count > 10) {
//						break;
//					}
//					}
//
//			} while ( (query = result.nextQuery()) != null && count <= 10 );
//		} catch (TwitterException te) {
//			te.printStackTrace();
//			System.out.println("Failed to search tweets: " + te.getMessage());
//		}
//		return tweetList;
//	}


    public static class GetHomeTimeline {
        /**
         * Usage: java twitter4j.examples.timeline.GetHomeTimeline
         *
         * @param args String[]
         */
        public static void main(String[] args) {
            try {
                // gets Twitter instance with default credentials
                Twitter twitter = new TwitterFactory().getInstance();
                User user = twitter.verifyCredentials();
                List<Status> statuses = twitter.getHomeTimeline();
                System.out.println("Showing @" + user.getScreenName() + "'s home timeline.");
                for (Status status : statuses) {
                    System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
                }
            } catch (TwitterException te) {
                te.printStackTrace();
                System.out.println("Failed to get timeline: " + te.getMessage());
                System.exit(-1);
            }
        }
    }

}
