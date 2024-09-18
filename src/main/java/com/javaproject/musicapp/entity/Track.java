package com.javaproject.musicapp.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
public class Track
{


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int trackid;

	@Column(name="track_name")
	private String trackname;

	@Column(name="description")
	private String desc;

	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	@JsonIgnoreProperties("tracks")
	private Singer singer;

	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	@JsonIgnoreProperties("g_tracks")
	private Genre genre;

	@Column(name="path")
	private String filepath;

	public Track(){

	}

	public Track(int trackid, String trackname, String desc, Singer singer, Genre genre,String filepath) {
		super();
		this.trackid = trackid;
		this.trackname = trackname;
		this.desc = desc;
		this.singer = singer;
		this.genre = genre;
		this.filepath = filepath;
	}


	public String getFilepath() {
		return filepath;
	}


	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public int gettrackid() {
		return trackid;
	}


	public void settrackid(int trackid) {
		this.trackid = trackid;
	}




	public String gettrackname() {
		return trackname;
	}




	public void settrackname(String trackname) {
		this.trackname = trackname;
	}
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Singer getSinger() {
		return singer;
	}


	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Track [trackid=" + trackid + ", trackname=" + trackname +", filepath="+filepath+ ", desc=" + desc + ", singer=" + singer
				+ ", genre=" + genre + "]";
	}
}