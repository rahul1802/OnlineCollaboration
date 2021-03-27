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

import com.coll.OnlineCollaboration.model.BlogComments;
import com.coll.OnlineCollaboration.service.IBlogCommentsService;

@RestController
@CrossOrigin(origins="http://localhost:8080")
@RequestMapping(value="/api")
public class BlogCommentsController {

	@Autowired
	IBlogCommentsService blogCommentsService;
	
	@PostMapping("save-blogComments")
	public boolean saveBlogComments(@RequestBody BlogComments blogComments)
	{
		return blogCommentsService.addBlogComments(blogComments);
	}
	
	@GetMapping("blogComments-list")
	public List<BlogComments> allBlogComments()
	{
		return blogCommentsService.getAllBlogComments();
	}
	
	@DeleteMapping("delete-blogComments/{blogCommentId}")
	public boolean deleteBlogComments(@PathVariable("blogCommentId") BlogComments blogCommentId)
	{
		return blogCommentsService.deleteBlogComments(blogCommentId);
	}
	
	@GetMapping("blogComments/{blogCommentId}")
	public BlogComments blogCommentById(@PathVariable("blogCommentId") int blogCommentId)
	{
		return blogCommentsService.getBlogCommentsById(blogCommentId);
	}
	
	@PostMapping("update-blogComments/{blogCommentId}")
	public boolean updateBlogComments(@RequestBody BlogComments blogComments,@PathVariable("blogCommentId") int blogCommentId)
	{
		blogComments.setBlogCommentId(blogCommentId);
		return blogCommentsService.updateBlogComments(blogComments);
	}
}
