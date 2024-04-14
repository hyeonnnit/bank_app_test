package com.example.bank.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query("SELECT ac FROM Account ac JOIN FETCH ac.user u WHERE ac.number = :number")
    Optional<Account> findByNumber(@Param("number") Integer number);

    @Query("SELECT ac FROM Account ac JOIN FETCH ac.user u WHERE ac.user.id = :userId")
    List<Account> findByUserId(@Param("userId") Integer userId);
}
