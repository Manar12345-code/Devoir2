package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.repos.MembreRepository;
import com.example.demo.entities.Conservatoire;
import com.example.demo.entities.Membre;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private MembreRepository MembreRepository;
	@Test
	public void testCreateMembre() {
		Membre prod = new Membre("PC Dell","2000",new Date());
		MembreRepository.save(prod);
		}
	@Test
	public void testFindMembre()
	{
	Membre p = MembreRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateMembre()
	{
	Membre p = MembreRepository.findById(1L).get();
	p.settelMembre("2000");
	MembreRepository.save(p);
	}
	@Test
	public void testDeleteMembre()
	{
	MembreRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousMembres()
	{
	List<Membre> prods = MembreRepository.findAll();
	for (Membre p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomMembre()
	{
	List<Membre> prods = MembreRepository.findByNomMembre("iphone X");
	for (Membre p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomMembreContains ()
	{
	List<Membre> prods=MembreRepository.findByNomMembreContains("iphone X");
	for (Membre p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByNomTel()
	{
	List<Membre> prods = MembreRepository.findByNomTel("iphone X", "2000");
	for (Membre p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByConservatoire()
	{
	Conservatoire con = new Conservatoire();
	con.setIdCon(1L);
	List<Membre> prods = MembreRepository.findByConservatoire(con);
	for (Membre p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByCategorieIdCat()
	{
	List<Membre> prods = MembreRepository.findByConservatoireIdCon(1L);
	for (Membre p : prods)
	{
	System.out.println(p);
	}
	 }
	@Test
	public void testfindByOrderByNomMembreAsc()
	{
	List<Membre> prods =
	MembreRepository.findByOrderByNomMembreAsc();
	for (Membre p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testTrierMembresNomsTel()
	{
	List<Membre> prods = MembreRepository.trierMembresNomsTel();
	for (Membre p : prods)
	{
	System.out.println(p);
	}
	}
}

