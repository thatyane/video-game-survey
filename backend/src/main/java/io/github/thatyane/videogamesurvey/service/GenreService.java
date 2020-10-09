package io.github.thatyane.videogamesurvey.service;

import io.github.thatyane.videogamesurvey.exception.ObjectNotFoundException;
import io.github.thatyane.videogamesurvey.model.Genre;
import io.github.thatyane.videogamesurvey.repository.GenreRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GenreService {

    private GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Transactional(readOnly = true)
    public Genre findById(Long id) throws ObjectNotFoundException {
        return genreRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Gênero não encontrado! Id: " + id));
    }
}
