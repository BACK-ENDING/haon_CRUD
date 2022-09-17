package com.example.springstudy.controller;

import com.example.springstudy.entity.Account;
import com.example.springstudy.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class AccountController {
    private final AccountService accountService;
    @GetMapping("/all")
    public List<Account> findAll() {
        return accountService.findAll();
    }
}
