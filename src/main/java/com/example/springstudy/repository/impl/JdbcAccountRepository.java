package com.example.springstudy.repository.impl;

import com.example.springstudy.entity.Account;
import com.example.springstudy.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class JdbcAccountRepository implements AccountRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return 0;
    }

    @Override
    public long save(Account account) {
        return 0;
    }

    @Override
    public int update(Account account) {
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Account> findAll() {
        return jdbcTemplate.query("select * from accounts",
                (rs, rowNum) -> new Account(
                        rs.getLong("id"),
                        rs.getString("email")
                )
        );
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public Account findByEmail(String email) {
        return null;
    }
}
