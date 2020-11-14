package io.github.thatyane.videogamesurvey.service;

import io.github.thatyane.videogamesurvey.dto.GameDTO;
import io.github.thatyane.videogamesurvey.dto.GameInsertDto;
import io.github.thatyane.videogamesurvey.exception.ObjectNotFoundException;
import io.github.thatyane.videogamesurvey.model.Game;
import io.github.thatyane.videogamesurvey.model.Genre;
import io.github.thatyane.videogamesurvey.repository.GameRepository;
import io.github.thatyane.videogamesurvey.repository.GenreRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private GameRepository gameRepository;
    private GenreRepository genreRepository;

    public GameService(GameRepository gameRepository, GenreRepository genreRepository) {
        this.gameRepository = gameRepository;
        this.genreRepository = genreRepository;
    }

    @Transactional(readOnly = true)
    public List<GameDTO> findAllDTO() {
        return gameRepository.findAllDTO();
    }

    @Transactional(readOnly = true)
    public Game findById(Long id) throws ObjectNotFoundException {
        return gameRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Jogo não encontrado! Id: " + id));
    }

    public Game create(GameInsertDto dto) {
        Genre genre = genreRepository.findById(dto.getGenreId())
                .orElseThrow(() -> new ObjectNotFoundException("Gênero não encontrado! Id: " + dto.getGenreId()));
        return gameRepository.save(dto.toEntity(genre));
    }
}
