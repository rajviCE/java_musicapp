//package com.javaproject.musicapp.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.javaproject.musicapp.entity.Role;
//import com.javaproject.musicapp.repository.RoleDao;
//
//@Service
//public class RoleServiceImp implements RoleService {
//	@Autowired
//	private RoleDao Roledao;
//
//	public List<Role>getaRole()
//	{
//		return Roledao.findAll();
//	}
//	public Optional<Role> getRoleById(int Roleid)
//	{
//		return Roledao.findById(Roleid);
//	}
//	public void addRole(Role Role)
//	{
//		Roledao.save(Role);
//	}
//	public void delete(int Roleid)
//	{
//		Roledao.deleteById(Roleid);
//	}
//
//}
