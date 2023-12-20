package com.Group11.TugasBesar.services.user;

import com.Group11.TugasBesar.payloads.requests.LoginRequest;
import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;

public interface UserService {
  Response addUser(UserRequest request);

  Response addPencariKost(UserRequest request);

  Response addPemilikKost(UserRequest request);

  Response addAdmin(UserRequest request);

  Response getUser();

  Response getUserByUsername(String username);

  Response getUserByEmail(String email);

  Response login(LoginRequest loginRequest);
}
