package com.javaproject.musicapp.entity;
import jakarta.persistence.*;
import java.time.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Singer {



		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="sing_id")
		private int Singerid;

		@Column(name="Singer_name")
		private String Singername;

		@OneToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},mappedBy="singer")
		@JsonIgnoreProperties("singer")
		private List<Track> tracks;

		@Column(name="s_track_name")
		private String strackname;

		@Column(name="track_time")
		private LocalTime tracktime;



		public Singer(){

		}





		public Singer(int singerid, String singername, List<Track> tracks, String strackname, LocalTime tracktime) {
			super();
			Singerid = singerid;
			Singername = singername;
			this.tracks = tracks;
			this.strackname = strackname;
			this.tracktime = tracktime;
		}





		public LocalTime getTracktime() {
			return tracktime;
		}

		public void setTracktime(LocalTime tracktime) {
			this.tracktime = tracktime;
		}

		public int getSingerid() {
			return Singerid;
		}

		public void setSingerid(int Singerid) {
			this.Singerid = Singerid;
		}

		public String getSingername() {
			return Singername;
		}

		public void setSingername(String Singername) {
			this.Singername = Singername;
		}


		public List<Track> gettracks() {
			return tracks;
		}


		public void settracks(List<Track> tracks) {
			this.tracks = tracks;
		}


		public String getStrackname() {
			return strackname;
		}

		public void setStrackname(String strackname) {
			this.strackname = strackname;
		}


		@Override
		public String toString() {
			return "Singer [Singerid=" + Singerid + ", Singername=" + Singername + ", tracks=" + tracks + ", strackname="
					+ strackname + ", tracktime=" + tracktime + "]";
		}
}
