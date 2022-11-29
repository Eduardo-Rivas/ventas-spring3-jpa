package com.eduweb.ventas.resources;

import org.springframework.web.bind.annotation.RestController;
import com.eduweb.ventas.entities.User1;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//-Método para evaluar todos los Users--// 
	@GetMapping
	public ResponseEntity<User1> findAll(){
		User1 usuario = new User1(7L, "Eduardo Rivas", "edumeru46@gmailcom", "(43)-83248381404", "eduycran17171");
		return ResponseEntity.ok().body(usuario);
	}

}
