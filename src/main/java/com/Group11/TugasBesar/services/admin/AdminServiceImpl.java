package com.Group11.TugasBesar.services.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.Group11.TugasBesar.models.Admin;
import com.Group11.TugasBesar.models.User;
import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.repositories.AdminRepository;
import com.Group11.TugasBesar.repositories.UserRepository;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
	private UserRepository userRepository;

    @Autowired
    private AdminRepository adminRepository;

    public Response addAdmin(UserRequest request) {
		User user = new User();
		Admin admin = new Admin();
		admin = adminRepository.save(admin);

		user.setUsername(request.getUsername());
		user.setPhoneNumber(request.getPhoneNumber());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		user.setAdmin(admin);
		user = userRepository.save(user);

		Response response = new Response();
		response.setStatus(HttpStatus.CREATED.value());
		response.setMessage("User created successfully!");
		response.setData(user);

		return response;
	}

  	public Response getAdmin() {
		List<Admin> admins = adminRepository.findAll();

		Response response = new Response();
		response.setStatus(HttpStatus.CREATED.value());
		response.setMessage("User created successfully!");
		response.setData(admins);

		return response;
	}
}
