package com.example.cse_410_buldr_backend.Repository;

import com.example.cse_410_buldr_backend.Entity.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TagsRepository extends JpaRepository<Tags,Long> {
    @Query(value="SELECT * FROM  tags  WHERE   tags.name=?1",nativeQuery = true)
    Tags searchByName(String name);
}
