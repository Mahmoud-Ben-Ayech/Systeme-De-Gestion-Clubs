package com.gestionClubs.service;

import org.springframework.stereotype.Repository;

@Repository
public interface AdminService {
  public int loginValidation(String email,String password);
}
