package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Conservatoire;
import com.example.demo.entities.Membre;
import com.example.demo.repos.*;

public class MembreServiceImpl implements MembreService {
	@Autowired
	MembreRepository MembreRepository;
	@Override
	public Membre saveMembre(Membre p) {
	return MembreRepository.save(p);
	
	}
	@Override
	public Membre updateMembre(Membre p) {
	return MembreRepository.save(p);
	}
	@Override
	public void deleteMembre(Membre p) {
	MembreRepository.delete(p);
	}
	 @Override
	public void deleteMembreById(Long id) {
	MembreRepository.deleteById(id);
	}
	@Override
	public Membre getMembre(Long id) {
	return MembreRepository.findById(id).get();
	}
	@Override
	public List<Membre> getAllMembres() {
	return MembreRepository.findAll();
	}
	@Override
	public List<Membre> findByNomMembre(String nom) {
	return MembreRepository.findByNomMembre(nom);
	}
	@Override
	public List<Membre> findByNomMembreContains(String nom) {
	return MembreRepository.findByNomMembreContains(nom);
	}
	@Override
	public List<Membre> findByNomtel(String nom, String tel) {
	return MembreRepository.findByNomTel(nom, tel);
	}
	@Override
	public List<Membre> findByConservatoire(Conservatoire Conservatoire) {
	return MembreRepository.findByConservatoire(Conservatoire);
	}
	@Override
	public List<Membre> findByConservatoireIdCon(Long id) {
	return MembreRepository.findByConservatoireIdCon(id);
	}
	@Override
	public List<Membre> findByOrderByNomMembreAsc() {
	return MembreRepository.findByOrderByNomMembreAsc();
	}
	@Override
	public List<Membre> trierMembresNomstel() {
	return MembreRepository.trierMembresNomsTel();
	}
	}
