package com.example.springstudy.service;

import com.example.springstudy.entity.Account;
import com.example.springstudy.repository.impl.JdbcAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final JdbcAccountRepository jdbcAccountRepository;
    public List<Account> findAll() {
        return jdbcAccountRepository.findAll();
    }
}
