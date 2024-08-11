package com.maistroz.maistroz;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Maistro")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Maistro {
	
	@Id
	private ObjectId objId;
	@NotEmpty
	private Integer id;
	@NotEmpty
	private String name;
	private String phone;
	@NotEmpty
	private String e_mail;
	private String state;
	private String city;
	private Integer rating;
	private List<String> category = new ArrayList<String>();
}
