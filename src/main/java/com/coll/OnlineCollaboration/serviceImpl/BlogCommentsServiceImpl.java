package com.coll.OnlineCollaboration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaboration.dao.IBlogCommentsDao;
import com.coll.OnlineCollaboration.model.BlogComments;
import com.coll.OnlineCollaboration.service.IBlogCommentsService;

@Service  
@Transactional
public class BlogCommentsServiceImpl implements IBlogCommentsService {
	@Autowired
	IBlogCommentsDao Bgc;

	@Override
	public List<BlogComments> getAllBlogComments() {
		return Bgc.getAllBlogComments();
	}

	@Override
	public BlogComments getBlogCommentsById(int blogComemntId) {
		return Bgc.getBlogCommentsById(blogComemntId);
	}

	@Override
	public boolean addBlogComments(BlogComments blogComments) {
       return Bgc.addBlogComments(blogComments);		
	}

	@Override
	public boolean updateBlogComments(BlogComments blogComments) {
		 return Bgc.updateBlogComments(blogComments);	
	}

	@Override
	public boolean deleteBlogComments(BlogComments blogComments) {
		 return Bgc.deleteBlogComments(blogComments);
	}

	
}
