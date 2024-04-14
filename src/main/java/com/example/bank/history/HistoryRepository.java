package com.example.bank.history;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Integer> {

    @Query("""
            SELECT h 
            FROM History h 
            JOIN FETCH h.sender s 
            JOIN FETCH h.receiver 
            WHERE h.sender.number =:number 
            OR h.receiver.number = :number
            """)
    List<History> findBySenderOrReceiver(@Param("number") int number);
}
