package service;

import models.TwitterResultModel;
import twitter4j.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.util.stream.Collectors.toList;

public class HashtagService {

    public static CompletableFuture<List<TwitterResultModel>> getHashtagAsync(String keyWords) {

        return CompletableFuture.supplyAsync(() -> {
            try {
                return searchByHashTag(keyWords);

            } catch (TwitterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }

    public static List<TwitterResultModel> searchByHashTag(String hashTag) throws TwitterException {

        Twitter twitter = new TwitterFactory().getInstance();
        QueryResult result = twitter.search(new Query("#"+hashTag));


        List<TwitterResultModel> tweetList = result.getTweets().stream()
                .limit(10)
                .sorted()
                .map(h -> new TwitterResultModel(h.getUser().getName(), h.getText(),
                        Arrays.stream(h.getHashtagEntities()).map(HashtagEntity::getText).collect(toList())))
                .collect(toList());

        return tweetList;
    }






}
