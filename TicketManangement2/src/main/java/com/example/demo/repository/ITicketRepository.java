package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Ticket;

public interface ITicketRepository extends JpaRepository<Ticket, Integer> {
//
}
