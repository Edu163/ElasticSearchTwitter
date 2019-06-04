package com.example.demo.Controller;

import com.example.demo.Model.Tweet;
import com.example.demo.Repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TweetController {
    @Autowired
    private TweetRepository tweetRepository;

    /*@PostMapping("/saveTweet")
    public int saveTweetList(@RequestBody List<Tweet> tweets){
        tweetRepository.saveAll(tweets);
        return tweets.size();
    }*/

    @PostMapping("/saveTweets")
    public int saveTweetAlone(@RequestBody Tweet tweet){
        tweetRepository.save(tweet);
        return 1;
    }

    @GetMapping("/findAll")
    public Iterable<Tweet> findAllTweets() {
        return tweetRepository.findAll();
    }


    @GetMapping("/findByText/{text}")
    public List<Tweet> findByText(@PathVariable String text) {
        return tweetRepository.findAllByText(text);
    }
}
