package com.meritamerica.assignment6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment6.models.CDAccount;

public interface CDAccountRepo extends JpaRepository<CDAccount, Integer> {

}