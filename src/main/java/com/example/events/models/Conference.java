package com.example.events.models;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Conference {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int conferenceid;
	@Column(name="conferencename")
	private String conferencename;
	@Column(name="cstartdate")
	private String cstartdate;
	@Column(name="cenddate")
	private String cenddate;
	@Column(name="roomno")
	private String roomno;
	
	@Override
	public String toString() {
		return "Conference [conferenceid=" + conferenceid + ", conferencename=" + conferencename + ", cstartdate="
				+ cstartdate + ", cenddate=" + cenddate + ", roomno=" + roomno + "]";
	}
	
	
	
	

}
