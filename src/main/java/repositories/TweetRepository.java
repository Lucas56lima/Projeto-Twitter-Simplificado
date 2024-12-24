package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet,Long>{
    
}
