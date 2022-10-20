package br.com.daysesoares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.daysesoares.model.AppModel;
import br.com.daysesoares.services.AppService;

@Controller
@RequestMapping(value = "/apps")
public class AppController {

	@Autowired
	private AppService service;
	
	@PostMapping
	public ResponseEntity<AppModel> created(@RequestBody AppModel obj){
		obj = service.novoApp(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	@PutMapping
	public ResponseEntity<AppModel> update(@RequestBody AppModel obj){
		obj = service.atualizaApp(obj);
		return ResponseEntity.ok().body(obj);
	}
	
}
