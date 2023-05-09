package com.rudineidebrito.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rudineidebrito.dslist.dto.GameMinDTO;
import com.rudineidebrito.dslist.entities.Game;
import com.rudineidebrito.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(e -> new GameMinDTO(e)).toList();
	}
}
