package com.example.cse_410_buldr_backend.Service;

import com.example.cse_410_buldr_backend.Entity.Post;
import com.example.cse_410_buldr_backend.Entity.PostBlock;
import com.example.cse_410_buldr_backend.Repository.PostBlockRepository;
import com.example.cse_410_buldr_backend.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class PostService {
    @Autowired
    PostRepository postRepo;

    @Autowired
    PostBlockRepository postBlockRepo;
    @RequestMapping(value="/posts",method= RequestMethod.GET)
    public List<Post> getPostsAll(){
        return postRepo.findAll();
    }
    @RequestMapping(value="/posts/{tag}",method= RequestMethod.GET)
    public List<Post> getPosts(@PathVariable("tag") String tag){
        return postRepo.searchByTags(tag);
    }
    @RequestMapping(value="/posts/tags",method= RequestMethod.GET)
    public List<Post> getPostsByTags(@RequestParam List<String> tags){
        List<Post> all=new ArrayList<>();
        for(String a: tags){
            String item=a.toString();
            List<Post> temp=postRepo.searchByTags(item);
            for(Post p:temp){
                if(all.contains(p)) continue;
                all.add(p);
            }
        }
        return all;
    }
    //    @RequestMapping(value="/posts/tags",method= RequestMethod.GET)
//    public List<Post> getPostsByTags(@RequestParam TagsList tags){
//        List<Post> all=new ArrayList<>();
//        for(String a: tags.tags){
//            String item=a.toString();
//            List<Post> temp=postRepo.searchByTags(item);
//            for(Post p:temp){
//                if(all.contains(p)) continue;
//                all.add(p);
//            }
//        }
//        return all;
//    }
    @RequestMapping(value="/posts/marketplace",method= RequestMethod.GET)
    public List<Post> getMarketPosts(){
        return postRepo.searchByMarketPlace();
    }
    @RequestMapping(value="/post/marketplace/{userId}",method= RequestMethod.GET)
    public List<Post> getMarketPostsID(@PathVariable("userId") long id){
        return postRepo.searchByMarketPlaceUser(id);
    }
    @RequestMapping(value="/post/social/{userId}",method= RequestMethod.GET)
    public List<Post> getSocialPostsID(@PathVariable("userId") long id){
        return postRepo.searchBySocialUser(id);
    }
    @RequestMapping(value="/posts/social",method= RequestMethod.GET)
    public List<Post> getSocialPosts(){
        return postRepo.searchBySocial();
    }
    @RequestMapping(value="/post/{postId}",method= RequestMethod.GET)
    public Post getPost(@PathVariable("postId") long id){
        return postRepo.searchByPostById(id);
    }@RequestMapping(value="/postblocks/{postId}",method= RequestMethod.GET)
    public List<PostBlock> getPostBlocks(@PathVariable("postId") long id){
        return postBlockRepo.searchByPost(id);
    }
    @RequestMapping(value="/postblocks/marketplace/{postId}",method= RequestMethod.GET)
    public List<PostBlock> getPostMarket(@PathVariable("postId") long id){
        return postBlockRepo.searchByPostMarketplace(id);
    }@RequestMapping(value="/postblocks/social/{postId}",method= RequestMethod.GET)
    public List<PostBlock> getPostSocial(@PathVariable("postId") long id){
        return postBlockRepo.searchByPostSocial(id);
    }

    @RequestMapping(value="/post",method= RequestMethod.POST)
    public Post addPost(@RequestBody Post post){
        postRepo.saveAndFlush(post);
        return post;
    }
    @RequestMapping(value="/postblocks/{postId}",method= RequestMethod.POST)
    public boolean uploadPbs(@PathVariable("postId") long id,@RequestBody List<PostBlock> pb){
        for (PostBlock a:pb) {
            postBlockRepo.saveAndFlush(a);
        }
        return true;
    }
    @RequestMapping(value="/postblock/{postId}",method= RequestMethod.POST)
    public PostBlock uploadPb(@PathVariable("postId") long id,@RequestBody PostBlock pb){
        postBlockRepo.saveAndFlush(pb);
        return pb;
    }
    @RequestMapping(value="/post/{id}",method= RequestMethod.DELETE)
    public void deletePost(@PathVariable("id") long id){
        postRepo.deleteById(id);
    }
}
