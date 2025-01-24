package com.example.cse_410_buldr_backend.Repository;

import com.example.cse_410_buldr_backend.Entity.Note;
import com.example.cse_410_buldr_backend.Entity.NoteTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NoteTagsRepository extends JpaRepository<NoteTags,Long> {
    @Query(value="SELECT * FROM  note_tags  WHERE   note_tags.name=?1",nativeQuery = true)
    NoteTags searchByName(String name);
}
