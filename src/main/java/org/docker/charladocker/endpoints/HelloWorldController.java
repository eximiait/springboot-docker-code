package org.docker.charladocker.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value = "/")
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("Hola mundo!");
	}

}
