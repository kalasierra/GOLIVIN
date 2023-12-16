package com.Group11.TugasBesar.services.user;

import java.util.List;
import java.util.NoSuchElementException;

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
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PencariKostRepository pencariKostRepository;
    
  @Override
  public Response addUser(UserRequest request) {

    // System.out.println(request.getUsername());     // Debugging perposes
    // System.out.println(request.getEmail());        // Debugging perposes
    // System.out.println(request.getPassword());     // Debugging perposes
    // System.out.println(request.getPhoneNumber());  // Debugging perposes
    
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