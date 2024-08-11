package com.maistroz.maistroz.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.maistroz.maistroz.Maistro;
import com.maistroz.maistroz.Repository.MaistrozRepository;


@Service
public class MaistrozService {
	
	private static final Logger logger = LoggerFactory.getLogger(MaistrozService.class);
	private final MaistrozRepository maistrozRepo;
	
	public MaistrozService(MaistrozRepository repo) {
		this.maistrozRepo = repo;
	}

	public List<Maistro> allMaistroz() {
		 List<Maistro> maistros = maistrozRepo.findAll();
	        //logger.info("Retrieved {} maistroz", maistros.size());
	        return maistros;
	}
	
	public Optional<Maistro> findMaistroById(Integer id){
		return maistrozRepo.findMaistroById(id);
	}

	public void registerMaistro(Maistro maistro) {
		maistrozRepo.insert(maistro);
	}
	
	public void deleteMaistro(Integer id) {
		Optional<Maistro> maistro = maistrozRepo.findMaistroById(id);
		maistrozRepo.delete(maistro.get());
	}

	public void updateMaistro(Maistro maistro, Integer id) {
		Optional<Maistro> existingMaistro = maistrozRepo.findMaistroById(id);
		if(existingMaistro.isPresent()) {
			maistrozRepo.delete(existingMaistro.get());
		}
		maistrozRepo.save(maistro);
	}
	
	public List<Maistro> findByState(String state) {
	    return maistrozRepo.findByState(state);
	}

	public List<Maistro> findByCity(String city) {
	    return maistrozRepo.findByCity(city);
	}

	public List<Maistro> findByRating(Integer rating) {
	    return maistrozRepo.findByRating(rating);
	}


	
}
