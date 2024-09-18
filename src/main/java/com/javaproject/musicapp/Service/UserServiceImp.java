package com.javaproject.musicapp.Service;

import java.util.List;
import java.util.Optional;

//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//import com.javaproject.musicapp.CustomUserDetails;
//import com.javaproject.musicapp.CustomUserDetails;
import com.javaproject.musicapp.entity.User;
import com.javaproject.musicapp.repository.UserDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.Query;

@Service
public class UserServiceImp implements UserService {
////	@Autowired
////	private UserDao Userdao;
//	
//	
//	
////	@Autowired
////	private UserDao userRepository;
////	
//	
////	@Autowired
////	private UserDao Userdao;
//	
////	@Override
////	public User loadUserByUsername(String username) throws UsernameNotFoundException
////	{
////		User user=UserDao.findByUsername(username);
////		if(user==null)
////		{
////			throw new UsernameNotFoundException("user not found");
////		}
////		return new CustomUserDetails(user);
////	}
//
//	private EntityManager entityManager;
//	
//	@Autowired
//	public UserServiceImp(EntityManager theEntityManager) {
//		entityManager = theEntityManager;
//	}
//	
//	public List<User>getaUser()
//	{
//		TypedQuery<User> theQuery = entityManager.createQuery("from User", User.class);
//		List<User> users = theQuery.getResultList();
//		return users;
//	}
//	public User getUserById(int Userid)
//	{
//				User user= entityManager.find(User.class, Userid);
//				
//				if(user==null)
//				{
//					System.out.println("User not found:"+Userid);
//				}
//				return user;
//	}
//	public void addUser(User user)
//	{
//		System.out.println("Before setting:-"+user.getUserid());
//		
//		// save or update the employee
//		User dbUser = entityManager.merge(user);
//				
//		// update with id from db ... so we can get generated id for save/insert
//		// theEmployee.setId(dbEmployee.getId());
//		
//		 System.out.println("After setting:-"+user.getUserid());
//	}
////	public void delete(int Userid)
////	{
////		Query theQuery = entityManager.createQuery("delete from user where id=:id");
////
////		theQuery.setParameter("id", Userid);
////
////		theQuery.executeUpdate();
////	}
	

	
	@Autowired
	private UserDao Userdao;
	public List<User>getaUser()
	{
		return Userdao.findAll();
	}
	public Optional<User> getUserById(int Userid)
	{
		return Userdao.findById(Userid);
	}
	public void addUser(User user)
	{
		Userdao.save(user);
	}
	public void delete(int Userid)
	{
		Userdao.deleteById(Userid);
	}

}
