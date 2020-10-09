package io.github.thatyane.videogamesurvey.controller;

import io.github.thatyane.videogamesurvey.dto.GameDTO;
import io.github.thatyane.videogamesurvey.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll() {
        List<GameDTO> games = gameService.findAllDTO();
        return ResponseEntity.ok().body(games);
    }
}
