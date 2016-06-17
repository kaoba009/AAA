package com.northgatecode.myblog.services;

import com.northgatecode.myblog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by qianl on 6/17/2016.
 */
@Service
public class PostService {
    private static List<Post> posts = new ArrayList<Post>();

    public PostService() {
        if (posts.size() == 0) {
            posts.add(new Post("post 1", "xxoo", new Date(), "this is post - 1 "));
            posts.add(new Post("post 2", "xxoo", new Date(), "this is post - 2 "));
            posts.add(new Post("post 3", "xxoo", new Date(), "this is post - 3 "));
            posts.add(new Post("post 4", "xxoo", new Date(), "this is post - 4 "));
        }
    }

    public List<Post> getAll() {
        return posts;
    }

    public void add(Post blog) {
        posts.add(blog);
    }

    public void delete(int index) {
        posts.remove(index);
    }
}
