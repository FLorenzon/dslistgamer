package com.devsuperior.dslistgamer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistgamer.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
