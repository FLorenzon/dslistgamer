package com.devsuperior.dslistgamer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslistgamer.entities.GameList;
import com.devsuperior.dslistgamer.projections.GameMinProjection;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
