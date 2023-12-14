package com.Group11.TugasBesar.services.user;

import com.Group11.TugasBesar.payloads.requests.UserRequest;
import com.Group11.TugasBesar.payloads.responses.Response;

public interface UserService {
  Response addUser(UserRequest request);

  Response getUser();

  Response getUserByUsername(String uuid);
}
