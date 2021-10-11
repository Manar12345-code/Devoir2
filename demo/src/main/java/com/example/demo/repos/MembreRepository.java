package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Conservatoire;
import com.example.demo.entities.Membre;

public interface MembreRepository extends JpaRepository<Membre, Long> {
	 List<Membre> findByNomMembre(String nom);
	 List<Membre> findByNomMembreContains(String nom);
	 @Query("select p from Membre p where p.nomMembre like %?1 and p.telMembre > ?2")
	 List<Membre> findByNomTel(String nom, String tel);
	 @Query("select p from Membre p where p.Conservatoire = ?1")
	 List<Membre> findByConservatoire (Conservatoire Conservatoire);
	 List<Membre> findByConservatoireIdCon(Long id);
	 List<Membre> findByOrderByNomMembreAsc();
	 @Query("select p from Membre p order by p.nomMembre ASC, p.telMembre DESC")
	 List<Membre> trierMembresNomsTel ();



}

