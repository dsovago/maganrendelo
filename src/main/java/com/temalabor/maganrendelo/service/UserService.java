package com.temalabor.maganrendelo.service;

import com.temalabor.maganrendelo.model.LoginData;

public interface UserService {

    public LoginData findByEmail(String email);
}
