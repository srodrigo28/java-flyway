package com.treina.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treina.treinamento.models.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {}
