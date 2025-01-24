package com.example.cse_410_buldr_backend.Repository;

import com.example.cse_410_buldr_backend.Entity.PostBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostBlockRepository extends JpaRepository<PostBlock,Long> {
    @Query(value="SELECT * FROM  post_block  WHERE   post_block.post_id=?1 ORDER BY post_block.serial",nativeQuery = true)
    List<PostBlock> searchByPost(long postID);
    @Query(value="SELECT * FROM  post_block  WHERE   post_block.post_id=?1 AND post_block.marketplace=TRUE ORDER BY post_block.serial",nativeQuery = true)
    List<PostBlock> searchByPostMarketplace(long postID);

    @Query(value="SELECT * FROM  post_block  WHERE   post_block.post_id=?1 AND post_block.social=TRUE ORDER BY post_block.serial",nativeQuery = true)
    List<PostBlock> searchByPostSocial(long postID);
}
