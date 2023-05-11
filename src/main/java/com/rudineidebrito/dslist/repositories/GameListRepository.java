package com.rudineidebrito.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rudineidebrito.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
