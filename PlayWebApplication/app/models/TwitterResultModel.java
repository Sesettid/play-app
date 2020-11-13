package models;

import twitter4j.HashtagEntity;
import twitter4j.Status;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Negin
 */
public class TwitterResultModel {


    public String twitterID;
    public String twitterName;
    public String tweetContent;
    public List<String> hashTag;


    public TwitterResultModel() {
    }

    /** @author Negin
     * @param twitterName
     * @param tweetContent
     * @param hashTag
     */
    public TwitterResultModel(String twitterName, String tweetContent, List<String> hashTag) {
        this.twitterName = twitterName;
        this.tweetContent = tweetContent;
        this.hashTag = hashTag;
    }

    public String getTwitterID() {
        return twitterID;
    }

    public void setTwitterID(String twitterID) {
        this.twitterID = twitterID;
    }

    public String getTwitterName() {
        return twitterName;
    }

    public void setTwitterName(String twitterName) {
        this.twitterName = twitterName;
    }

    public String getTweetContent() {
        return tweetContent;
    }

    public void setTweetContent(String tweetContent) {
        this.tweetContent = tweetContent;
    }

    public List<String> getHashTag() {
        return hashTag;
    }

    public void setHashTag(List<String> hashTag) {
        this.hashTag = hashTag;
    }

    public static TwitterResultModel reform(Status status) {

        TwitterResultModel twitterResultModel = new TwitterResultModel();
        twitterResultModel.setTwitterName(status.getUser().getName());
        twitterResultModel.setTweetContent(status.getText());

        List<String> hashtages = new ArrayList<>();
        HashtagEntity[] tags = status.getHashtagEntities();
        if (tags != null && tags.length > 0) {
            for (HashtagEntity tag : tags) {
                hashtages.add("#" + tag.getText());
            }
        }
        twitterResultModel.setHashTag(hashtages);

        return twitterResultModel;
    }

}