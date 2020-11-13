package controllers;

import models.TwitterResultModel;
import play.mvc.Results;
import scala.jdk.javaapi.CollectionConverters;
import service.HashtagService;
import service.TweetService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import play.mvc.Controller;
import play.mvc.Result;
import service.WordsFrequencyService;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class HomeController extends Controller {


    private WordsFrequencyService wordsFrequencyService;
    private TweetService tweetService;
    private HashtagService hashtagService;

    public HomeController() {
        tweetService = new TweetService();
        hashtagService= new HashtagService();
        wordsFrequencyService =new WordsFrequencyService();
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public CompletionStage<Result> tweetSearch(String keyWords) throws Exception {

        CompletableFuture<List<TwitterResultModel>> futureTweetList = tweetService.getTweetsAsync(keyWords);

//         CompletionStage<Result> futureResult = futureTweetList.thenApplyAsync( pi -> ok(views.html.tweet.render(pi)));
        return futureTweetList.thenApplyAsync( result-> ok(views.html.tweet.render(result)));
    }


    /**
     * this method is to redirect user for the result of a specific hashtag selected
     * @author Negin
     * @param keyWords
     * @return
     * @throws Exception
     */
    public CompletionStage<Result> hashtag(String keyWords) throws Exception {

        CompletionStage<List<TwitterResultModel>> futureHashtagList = hashtagService.getHashtagAsync("#"+keyWords);

        return futureHashtagList.thenApplyAsync( pi -> ok(views.html.hashtagResults.render(pi)));
    }


    /**
     * @param keyWords search term got through url parameter
     * @return each unique word frequency in descending order
     */
//    public CompletionStage<Result> frequency(String keyWords) {
//        return  CompletableFuture.supplyAsync(()-> Results.ok(views.html.frequency.render(keyWords, CollectionConverters.asScala(wordsFrequencyService.countFrequency(keyWords).iterator()).toSeq())));
//    }

        public Result results() {
        return ok(views.html.results.render());
    }

    public Result profiles() {
        return ok(views.html.profile.render());
    }

    public Result index() {
        return ok(views.html.index.render());
    }
}
