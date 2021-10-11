package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Conservatoire {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCon;
private String nomCon;
private String descriptionCon;
@JsonIgnore
@OneToMany(mappedBy = "Conservatoire")
private List<Membre> Membres;
public Conservatoire() {}
public Conservatoire(String nomCon, String descriptionCon, List<Membre> Membres)
{
super();
this.nomCon = nomCon;
this.descriptionCon = descriptionCon;
this.Membres = Membres;
}
public Long getIdCon() {
return idCon;
}
public void setIdCon(Long idCon) {
this.idCon = idCon;
}
public String getNomCon() {
return nomCon;
}
public void setNomCon(String nomCon) {
this.nomCon = nomCon;
}
public String getDescriptionCon() {
return descriptionCon;
}
public void setDescriptionCon(String descriptionCon) {
this.descriptionCon = descriptionCon;
}
public List<Membre> getMembres() {
return Membres;
}
public void setMembres(List<Membre> Membres) {
this.Membres = Membres;
}
}
