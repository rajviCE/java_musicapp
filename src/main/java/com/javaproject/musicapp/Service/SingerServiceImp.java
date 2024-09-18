package com.javaproject.musicapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaproject.musicapp.entity.Singer;
import com.javaproject.musicapp.repository.SingerDao;

@Service
public class SingerServiceImp implements SingerService {
	@Autowired
	private SingerDao Singerdao;

	public List<Singer>getSinger()
	{
		return Singerdao.findAll();
	}
	public Optional<Singer> getSingerById(int Singerid)
	{
		return Singerdao.findById(Singerid);
	}
	public void addSinger(Singer Singer)
	{
		Singerdao.save(Singer);
	}
	public void delete(int Singerid)
	{
		Singerdao.deleteById(Singerid);
	}


}
