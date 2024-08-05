package com.maistroz.maistroz;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/api/maistroz")
public class MaistrozController {
	
	private final MaistrozService maistrozService;
	
	
	public MaistrozController(MaistrozService service) {
		this.maistrozService = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Maistro>> getAllMaistroz(){
		List<Maistro> maistroz = maistrozService.allMaistroz();
        return new ResponseEntity<>(maistroz, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Maistro>> findMaistro(@PathVariable Integer id){
		Optional<Maistro> maistro = maistrozService.findMaistroById(id);
		if(maistro.isEmpty()){
			throw new MaistroNotFoundException();
		}
		return new ResponseEntity<Optional<Maistro>>(maistro, HttpStatus.OK);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("")
	public void register(@RequestBody Maistro maistro) {
		
		maistrozService.registerMaistro(maistro);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PutMapping("/{id}")
	public void update(@RequestBody Maistro maistro, @PathVariable Integer id) {
		maistrozService.updateMaistro(maistro, id);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		maistrozService.deleteMaistro(id);
	}
	
	@GetMapping("/state/{state}")
	public ResponseEntity<List<Maistro>> getMaistrosByState(@PathVariable String state) {
		List<Maistro> maistroByState = maistrozService.findByState(state);
		if(maistroByState.isEmpty()) {
			throw new MaistroNotFoundException();
		}
	    return new ResponseEntity<>(maistroByState, HttpStatus.OK);
	}

	@GetMapping("/city/{city}")
	public ResponseEntity<List<Maistro>> getMaistrosByCity(@PathVariable String city) {
		List<Maistro> maistroBycity = maistrozService.findByCity(city);
		if(maistroBycity.isEmpty()) {
			throw new MaistroNotFoundException();
		}
	    return new ResponseEntity<>(maistroBycity, HttpStatus.OK);
	}

	@GetMapping("/rating/{rating}")
	public ResponseEntity<List<Maistro>> getMaistrosByRating(@PathVariable Integer rating) {
		List<Maistro> maistroByRating = maistrozService.findByRating(rating);
		if(maistroByRating.isEmpty()){
			throw new MaistroNotFoundException();
		}
	    return new ResponseEntity<>(maistroByRating, HttpStatus.OK);
	}

	
}
