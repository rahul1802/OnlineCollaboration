package com.coll.OnlineCollaboration.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaboration.dao.IBlogCommentsDao;
import com.coll.OnlineCollaboration.model.BlogComments;


@Repository("BlogComments")
@Transactional
public class BlogCommentsDaoImpl implements IBlogCommentsDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<BlogComments> getAllBlogComments() {
		return sessionFactory.getCurrentSession().createQuery("From BlogComments",BlogComments.class).getResultList();
	}

	@Override
	public BlogComments getBlogCommentsById(int blogComemntId) {
		return sessionFactory.getCurrentSession().get(BlogComments.class,Integer.valueOf(blogComemntId));
	}

	@Override
	public boolean addBlogComments(BlogComments blogComments) {
		try
		{
			sessionFactory.getCurrentSession().save(blogComments);
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateBlogComments(BlogComments blogComments) {
		try
		{
			sessionFactory.getCurrentSession().update(blogComments);
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteBlogComments(BlogComments blogComments) {
		try
		{
			sessionFactory.getCurrentSession().delete(blogComments.getBlogCommentId());
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

}
