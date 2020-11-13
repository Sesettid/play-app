package controllers;

import models.TwitterResultModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import service.HashtagService;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HashtagServiceTest {

      @Mock
     HashtagService twitterService;
       List<String> hashTagsTrue= Arrays.asList("#java");
       List<String> hashTagsFales= Arrays.asList("#canada");


    public List<TwitterResultModel> expected = Arrays.asList(
            new TwitterResultModel("@gurshD"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new TwitterResultModel("@ali"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new TwitterResultModel("@oracle"," the best way to prectice java", hashTagsTrue)

    );
    public List<TwitterResultModel> notExpected = Arrays.asList(
            new TwitterResultModel("@sarah"," concordia university in canada", hashTagsFales),
            new TwitterResultModel("@john"," canada accident rate", hashTagsFales)

    );

    public List<TwitterResultModel> data = Arrays.asList(
            new TwitterResultModel("@gurshD"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new TwitterResultModel("@ali"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new TwitterResultModel("@oracle"," the best way to prectice java", hashTagsTrue),
            new TwitterResultModel("@sarah"," concordia university in canada", hashTagsFales),
            new TwitterResultModel("@john"," canada accident rate", hashTagsFales)

    );


    /**
     * @author Negin
     * @throws Exception
     */
    @Test
    public void searchByHashTag() throws Exception {

        when(twitterService.searchByHashTag("java")).thenReturn(data);

        assertEquals(twitterService.searchByHashTag("java"),expected);
//        assertNotSame(twitterService.searchByHashTag("java"),notExpected);
    }




}
