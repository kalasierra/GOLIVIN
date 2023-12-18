package com.Group11.TugasBesar.services.pencariKost;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.Group11.TugasBesar.models.PencariKost;
import com.Group11.TugasBesar.models.User;
import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.repositories.PencariKostRepository;
import com.Group11.TugasBesar.repositories.UserRepository;

@Service
public class PencariKostServiceImpl implements PencariKostService{
    @Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PencariKostRepository pencariKostRepository;

	public Response addPencariKost(UserRequest request) {
		User user = new User();
		PencariKost pencariKost = new PencariKost();
		pencariKost = pencariKostRepository.save(pencariKost);

		user.setUsername(request.getUsername());
		user.setPhoneNumber(request.getPhoneNumber());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user.setPencariKost(pencariKost);
		user = userRepository.save(user);

		Response response = new Response();
		response.setStatus(HttpStatus.CREATED.value());
		response.setMessage("User created successfully!");
		response.setData(user);

		return response;
	}

  	public Response getPencariKost() {
		List<PencariKost> pencariKosts = pencariKostRepository.findAll();

		Response response = new Response();
		response.setStatus(HttpStatus.CREATED.value());
		response.setMessage("User created successfully!");
		response.setData(pencariKosts);
		return response;
	}
}
