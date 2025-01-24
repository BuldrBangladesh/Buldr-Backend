package com.example.cse_410_buldr_backend.Repository;

import com.example.cse_410_buldr_backend.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    @Query(value="SELECT * FROM  post  WHERE   post.postid=?1",nativeQuery = true)
    Post searchByPostById(long id);
    @Query(value="SELECT * FROM  post  WHERE   ?1 = ANY(post.tags)",nativeQuery = true)
    List<Post> searchByTags(String tag);


    @Query(value="SELECT * FROM  post  WHERE   post.marketplace=TRUE",nativeQuery = true)
    List<Post> searchByMarketPlace();

    @Query(value="SELECT * FROM  post  WHERE   post.marketplace=TRUE AND post.user_id=?1",nativeQuery = true)
    List<Post> searchByMarketPlaceUser(long userID);

    @Query(value="SELECT * FROM  post  WHERE  post.social=TRUE",nativeQuery = true)
    List<Post> searchBySocial();
    @Query(value="SELECT * FROM  post  WHERE post.social=TRUE AND post.user_id=?1",nativeQuery = true)
    List<Post> searchBySocialUser(long userID);
}
