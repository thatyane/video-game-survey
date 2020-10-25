package io.github.thatyane.videogamesurvey.repository;

import io.github.thatyane.videogamesurvey.dto.GameDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;


@SpringBootTest
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GameRepositoryTest {

    @Autowired
    private GameRepository gameRepository;

    @Test
    public void shouldFindAll() {
        List<GameDTO> games = gameRepository.findAllDTO();
        assertFalse(games.isEmpty());
    }
}
