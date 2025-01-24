package com.example.cse_410_buldr_backend.Service;



import com.example.cse_410_buldr_backend.Entity.Tags;
import com.example.cse_410_buldr_backend.Repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class TagsService {
    @Autowired
    TagsRepository tagsRepo;

    @RequestMapping(value="/tags",method = RequestMethod.GET)
    public List<Tags> getTags(){
        List<Tags> alltags=tagsRepo.findAll();
        return alltags;
    }
    @RequestMapping(value="/tag/{name}",method = RequestMethod.GET)
    public Tags getTagColor(@PathVariable("name") String name){
        Tags tag=tagsRepo.searchByName(name);
        return tag;
    }
    @RequestMapping(value="/tag",method= RequestMethod.POST)
    public Tags addTag(@RequestBody Tags tag){
        tagsRepo.saveAndFlush(tag);
        return tag;
    }

}
