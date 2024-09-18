//package com.javaproject.musicapp.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.javaproject.musicapp.entity.Student;
//import com.javaproject.musicapp.repository.StudentRepository;
//
//
//@Service
//public class Studentimpleinter implements Studentinterface {
//	
//	@Autowired
//    private StudentRepository userRepository;
//
//	
//	@Override
//	public List<Student> getAllUsers() {
//		// TODO Auto-generated method stub
//		return userRepository.findAll();
//	}
//
//
//	@Override
//	public Optional<Student> getUserById(int rollNo) {
//		// TODO Auto-generated method stub
//		return userRepository.findById(rollNo);
//	}
//
//
//	@Override
//	public void saveUser(Student user) {
//		userRepository.save(user);
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void deleteUser(int rollNo) {
//		userRepository.deleteById(rollNo);
//		// TODO Auto-generated method stub
//		
//	}
//
//}
