package com.Group11.TugasBesar.services.pemilikKost;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.Group11.TugasBesar.models.PemilikKost;
import com.Group11.TugasBesar.models.User;
import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.repositories.PemilikKostRepository;
import com.Group11.TugasBesar.repositories.UserRepository;

@Service
public class PemilikKostServiceImpl implements PemilikKostService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PemilikKostRepository pemilikKostRepository;

	public Response addPemilikKost(UserRequest request) {
		User user = new User();
		PemilikKost pemilikKost = new PemilikKost();
		pemilikKost = pemilikKostRepository.save(pemilikKost);

		user.setUsername(request.getUsername());
		user.setPhoneNumber(request.getPhoneNumber());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user.setPemilikKost(pemilikKost);
		user = userRepository.save(user);

		Response response = new Response();
		response.setStatus(HttpStatus.CREATED.value());
		response.setMessage("User created successfully!");
		response.setData(user);

		return response;
	}

  	public Response getPemilikKost() {
		List<PemilikKost> pemilikKosts = pemilikKostRepository.findAll();

		Response response = new Response();
		response.setStatus(HttpStatus.CREATED.value());
		response.setMessage("User created successfully!");
		response.setData(pemilikKosts);
		return response;
	}

  	// public Response getPemilikKostByName(String name) {
	// 	PemilikKost pemilikKost = pemilikKostRepository.findByName(name).orElseThrow(() -> {
	// 		throw new NoSuchElementException("User is not found!");
	// 		});

	// 	Response response = new Response();
	// 	response.setStatus(HttpStatus.CREATED.value());
	// 	response.setMessage("User created successfully!");
	// 	response.setData(pemilikKost);
	// 	return response;
	// }
}