package com.javaproject.musicapp.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
@Entity
public class  Genre
{		public Genre(){

		}
	public Genre(int genreid, String genrename, List<Track> g_tracks) {
	super();
	this.genreid = genreid;
	this.genrename = genrename;
	this.g_tracks = g_tracks;
}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="genre_id")
	private int genreid;

	@Column(name="genre_name")
	private String genrename;


	@OneToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},mappedBy="genre")
	@JsonIgnoreProperties("genre")
	private List<Track> g_tracks;


	@Override
	public String toString() {
		return "Genre [genreid=" + genreid + ", genrename=" + genrename + ", g_tracks=" + g_tracks + "]";
	}

	public int getGenreid() {
		return genreid;
	}

	public void setGenreid(int genreid) {
		this.genreid = genreid;
	}

	public String getGenrename() {
		return genrename;
	}

	public void setGenrename(String genrename) {
		this.genrename = genrename;
	}
	public List<Track> getg_tracks() {
		return g_tracks;
	}
	public void setg_tracks(List<Track> g_tracks) {
		this.g_tracks = g_tracks;
	}
}