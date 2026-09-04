package com.gestion.demo.repository;

import com.gestion.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
