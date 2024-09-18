//package com.javaproject.musicapp.Controller;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.javaproject.musicapp.Service.RoleServiceImp;
//import com.javaproject.musicapp.entity.Role;
//
//
//
//
//
//@RestController
//@RequestMapping("/api/Roles")
//public class RoleController
//{
//	@Autowired
//	private RoleServiceImp Roleservice;
//
//	@GetMapping
//	public List<Role>getaRole()
//	{
//		return Roleservice.getaRole();
//	}
//
//	@GetMapping("/{id}")
//		public Role getRoleById(@PathVariable int id)
//	{
//		return Roleservice. getRoleById(id)
//				.orElseThrow(()->new
//				NoSuchElementException("Candidate not found with "
//				+ "id"+id));
//	}
//
//	@PostMapping
//	public Role addRole(@RequestBody Role Role)
//	 {
//		Roleservice.addRole(Role);
//
//		return Role;
//	 }
//
//
//	@PutMapping("/{id}")
//	public Role updateRole(@PathVariable int id,
//			@RequestBody Role updatedRole )
//	{
//		Role rol=Roleservice. getRoleById(id)
//				.orElseThrow(()->new
//				NoSuchElementException("Candidate not found with "
//				+ "id"+id));
//
//		//rol.setPassword(updatedRole.getPassword());
//		rol.setRolename(updatedRole.getRolename());
//		Roleservice.addRole(rol);
//
//		return rol;
//
//	}
//
//
//	@DeleteMapping("/{id}")
//	public  void delete(@PathVariable int id)
//	{
//		Roleservice.delete(id);
//	}
//
//
//
//}
