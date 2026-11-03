package com.examaple.ms_banque.repositories;

import com.examaple.ms_banque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}