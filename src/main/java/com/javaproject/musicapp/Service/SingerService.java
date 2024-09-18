package com.javaproject.musicapp.Service;

import java.util.List;
import java.util.Optional;

//import com.javaproject.musicapp.entity.Role;
import com.javaproject.musicapp.entity.Singer;

public interface SingerService
{

	List<Singer>getSinger();
	Optional<Singer> getSingerById(int Singerid);
	 void addSinger(Singer Singer);
	 void delete(int Singerid);
}