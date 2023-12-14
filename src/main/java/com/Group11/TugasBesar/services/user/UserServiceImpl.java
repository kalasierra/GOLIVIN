package com.Group11.TugasBesar.services.user;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.Group11.TugasBesar.models.User;
import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;
import com.Group11.TugasBesar.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;
    
  @Override
  public Response addUser(UserRequest request) {
    
    User user = new User();
    user.setUsername(request.getUsername());
    user.setPhoneNumber(request.getPhoneNumber());
    user.setEmail(request.getEmail());
    user.setPassword(request.getPassword());
    user = userRepository.save(user);

    Response response = new Response();
    response.setStatus(HttpStatus.CREATED.value());
    response.setMessage("User created successfully!");
    response.setData(user);

    return response;
  }

  @Override
  public Response getUser() {

    List<User> users = userRepository.findAll();

    Response response = new Response(HttpStatus.OK.value(), "success", users);
    return response;
  }

  @Override
  public Response getUserByUsername(String uuid) {
    
    User user = userRepository.findById(uuid).orElseThrow(() -> {
      throw new NoSuchElementException("User is not found!");
    });

    return new Response(HttpStatus.OK.value(), "success", user);
  }
}