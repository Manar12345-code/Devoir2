package com.example.demo.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Membre {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMembre;
	private String nomMembre;
	private String telMembre;
	private Date dateInscription;
	@ManyToOne
	private Conservatoire Conservatoire;
	public Membre() {
	super();
	}
	public Membre(String nomMembre, String telMembre, Date dateInscription) {
	super();
	this.nomMembre = nomMembre;
	this.telMembre = telMembre;
	this.dateInscription = dateInscription;
	}
	public Long getIdMembre() {
	return idMembre;
	}
	public void setIdMembre(Long idMembre) {
	this.idMembre = idMembre;
	}
	public String getNomMembre() {
	return nomMembre;
	}
	public void setNomMembre(String nomMembre) {
	this.nomMembre = nomMembre;
	}
	public String gettelMembre() {
	return telMembre;
	}
	public void settelMembre(String telMembre) {
	this.telMembre = telMembre;
	}
	public Date getDateInscription() {
	return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
	this.dateInscription = dateInscription;
	}
	@Override
	public String toString() {
	return "Membre [idMembre=" + idMembre + ", nomMembre=" +
	nomMembre + ", telMembre=" + telMembre
	+ ", dateInscription=" + dateInscription + "]";
	}
	}