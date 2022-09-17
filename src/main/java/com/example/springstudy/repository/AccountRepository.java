package com.example.springstudy.repository;


import com.example.springstudy.entity.Account;

import java.util.List;

public interface AccountRepository {

    int count();

    long save(Account account);

    int update(Account account);

    int deleteById(Long id);

    void deleteAll();

    List<Account> findAll();

    Account findById(Long id);

    Account findByEmail(String email);
}

