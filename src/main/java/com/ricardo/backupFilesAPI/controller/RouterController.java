package com.ricardo.backupFilesAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.backupFilesAPI.domain.RouterDomain;
import com.ricardo.backupFilesAPI.service.RouterService;

@RestController
public class RouterController {
	
	@Autowired
	RouterService routerService;
	
	@RequestMapping(value="/router/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findByID(@PathVariable Long id){
		RouterDomain router = routerService.findRouterById(id);
		return ResponseEntity.ok().body(router);
	}
	
	@RequestMapping(value="/routers", method=RequestMethod.GET)
	public ResponseEntity<?> findList(){
		List<RouterDomain> router = routerService.getRouterList();
		return ResponseEntity.ok().body(router);
	}
	
	@RequestMapping(value="/router", method=RequestMethod.POST)
	public ResponseEntity<?> postRouter(@RequestBody RouterDomain router){
		RouterDomain routerReturn = routerService.postRouter(router);
		return ResponseEntity.ok().body(routerReturn);
	}
}
