package com.coll.OnlineCollaboration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coll.OnlineCollaboration.model.Blog;
import com.coll.OnlineCollaboration.service.IBlogService;

@RestController
@CrossOrigin(origins="http://localhost:8080")
@RequestMapping(value="/api")
public class BlogController {

	@Autowired
	IBlogService blogService;
	
	@PostMapping("save-blog")
	public boolean saveBlog(@RequestBody Blog blog)
	{
		return blogService.addBlog(blog);
	}
	
	@GetMapping("blog-list")
	public List<Blog> allBlog()
	{
		return blogService.getAllBlogs();
	}
	
	@DeleteMapping("delete-blog/{blogId}")
	public boolean deleteBlog(@PathVariable("blogId") Blog blogId)
	{
		return blogService.deleteBlog(blogId);
	}
	
	@GetMapping("blog/{blogId}")
	public Blog blogById(@PathVariable("blogId") int blogId)
	{
		return blogService.getBlogById(blogId);
	}
	
	@PostMapping("update-blog/{blogId}")
	public boolean updateBlog(@RequestBody Blog blog,@PathVariable("blogId") int blogId)
	{
		blog.setBlogId(blogId);
		return blogService.updateBlog(blog);
	}
	
	/*
	@RequestMapping(value="login/{username}", method=RequestMethod.POST)
	public Blog validateBlog(@RequestBody Blog blog,@PathVariable("username") String username)
	{
		blog.setUsername(username);
		return blogService.
	}
	*/
}
