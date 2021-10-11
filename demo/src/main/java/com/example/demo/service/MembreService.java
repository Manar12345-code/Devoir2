package com.example.demo.service;
import java.util.List;

import com.example.demo.entities.Conservatoire;
import com.example.demo.entities.Membre;

public interface MembreService {
Membre saveMembre(Membre p);
Membre updateMembre(Membre p);
void deleteMembre(Membre p);
 void deleteMembreById(Long id);
Membre getMembre(Long id);
List<Membre> getAllMembres();
List<Membre> findByNomMembre(String nom);
List<Membre> findByNomMembreContains(String nom);
List<Membre> findByNomtel (String nom, String tel);
List<Membre> findByConservatoire (Conservatoire Conservatoire);
List<Membre> findByConservatoireIdCon(Long id);
List<Membre> findByOrderByNomMembreAsc();
List<Membre> trierMembresNomstel();
}