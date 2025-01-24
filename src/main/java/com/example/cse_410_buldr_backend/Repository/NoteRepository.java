package com.example.cse_410_buldr_backend.Repository;

import com.example.cse_410_buldr_backend.Entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note,Long> {
    @Query(value="SELECT * FROM  note  WHERE   note.user_id=?1",nativeQuery = true)
    List<Note> searchByNoteByUserId(long id);
    @Query(value="SELECT * FROM  note  WHERE   ?1 = ANY(note.tags)",nativeQuery = true)
    List<Note> searchByTags(String tag);


    @Query(value="SELECT * FROM  note  WHERE   note.private=FALSE",nativeQuery = true)
    List<Note> searchByPublic();

    @Query(value="SELECT * FROM  note  WHERE   note.private=TRUE AND note.user_id=?1",nativeQuery = true)
    List<Note> searchByPublicUser(long userID);
}
