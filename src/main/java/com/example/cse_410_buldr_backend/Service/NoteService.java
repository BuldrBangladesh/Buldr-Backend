package com.example.cse_410_buldr_backend.Service;



import com.example.cse_410_buldr_backend.Entity.Note;
import com.example.cse_410_buldr_backend.Entity.NoteTags;
import com.example.cse_410_buldr_backend.Repository.NoteRepository;
import com.example.cse_410_buldr_backend.Repository.NoteTagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class NoteService {
    @Autowired
    NoteRepository noteRepo;
    @Autowired
    NoteTagsRepository noteTagRepo;
    @RequestMapping(value="/notes/{userId}",method= RequestMethod.GET)
    public List<Note> getUserNotes(@PathVariable("userId") long id){
        return noteRepo.searchByNoteByUserId(id);
    }
    @RequestMapping(value="/notes-public/{userId}",method= RequestMethod.GET)
    public List<Note> getUserPublicNotes(@PathVariable("userId") long id){
        return noteRepo.searchByPublicUser(id);
    }


    @RequestMapping(value="/notes",method= RequestMethod.GET)
    public List<Note> getNote(){
        return noteRepo.searchByPublic();
    }

    @RequestMapping(value="/notes/tags",method= RequestMethod.GET)
    public List<Note> getPostsByTags(@RequestParam List<String> tags){
        List<Note> all=new ArrayList<>();
        for(String a: tags){
            String item=a.toString();
            List<Note> temp=noteRepo.searchByTags(item);
            for(Note p:temp){
                if(all.contains(p)) continue;
                all.add(p);
            }
        }
        return all;
    }

    @RequestMapping(value="/notetag/{id}",method= RequestMethod.GET)
    public NoteTags getUserNotes(@PathVariable("id") String name){
        return noteTagRepo.searchByName(name);
    }

    @RequestMapping(value="/note",method= RequestMethod.POST)
    public Note addPost(@RequestBody Note note){
        noteRepo.saveAndFlush(note);
        return note;
    }

    @RequestMapping(value="/note/{id}",method= RequestMethod.DELETE)
    public void deleteNote(@PathVariable("id") long id){
        noteRepo.deleteById(id);
    }
}
