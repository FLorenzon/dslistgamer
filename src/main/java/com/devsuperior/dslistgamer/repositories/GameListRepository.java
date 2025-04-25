package com.devsuperior.dslistgamer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistgamer.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
