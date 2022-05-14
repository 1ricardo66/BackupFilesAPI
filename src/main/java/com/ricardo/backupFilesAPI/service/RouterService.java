package com.ricardo.backupFilesAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardo.backupFilesAPI.domain.RouterDomain;
import com.ricardo.backupFilesAPI.repository.RouterRepository;

@Service
public class RouterService {
	
	@Autowired
	private RouterRepository routerRepository;
	
	public RouterDomain findRouterById(Long id) {
		Optional<RouterDomain> router = routerRepository.findById(id);
		
		return router.orElseThrow();
	}
	
	public List<RouterDomain> getRouterList(){
		
		return routerRepository.findAll();
	}
	
	public RouterDomain postRouter(RouterDomain router) {
		return routerRepository.save(router);
	}

}
