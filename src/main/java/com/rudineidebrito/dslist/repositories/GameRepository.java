package com.rudineidebrito.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rudineidebrito.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
