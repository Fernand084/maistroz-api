package com.maistroz.maistroz.Repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maistroz.maistroz.Maistro;

@Repository
public interface MaistrozRepository extends MongoRepository<Maistro, ObjectId>{
	
	Optional<Maistro> findMaistroById(Integer id);
	
	List<Maistro> findByState(String state);

	List<Maistro> findByCity(String city);

	List<Maistro> findByRating(Integer rating);


}
