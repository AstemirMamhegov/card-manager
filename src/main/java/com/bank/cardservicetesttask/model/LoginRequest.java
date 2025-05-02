package com.bank.cardservicetesttask.model;

import lombok.Data;

@Data // или добавь вручную геттеры
public class LoginRequest {
    private String username;
    private String password;
}



