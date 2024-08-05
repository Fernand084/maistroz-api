package com.maistroz.maistroz;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MaistroNotFoundException extends RuntimeException{
	public MaistroNotFoundException() {
		super("Maistro Not Found");
	}
}
