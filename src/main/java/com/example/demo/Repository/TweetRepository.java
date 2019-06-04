package com.example.demo.Repository;

import com.example.demo.Model.Tweet;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import java.util.List;

public interface TweetRepository extends ElasticsearchRepository<Tweet, Long> {
    List<Tweet> findAllByText(String text);
}
