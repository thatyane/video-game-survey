package io.github.thatyane.videogamesurvey.service;

import io.github.thatyane.videogamesurvey.dto.RecordDTO;
import io.github.thatyane.videogamesurvey.dto.RecordInsertDTO;
import io.github.thatyane.videogamesurvey.model.Game;
import io.github.thatyane.videogamesurvey.model.Record;
import io.github.thatyane.videogamesurvey.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {

    private RecordRepository recordRepository;
    private GameService gameService;

    @Autowired
    public RecordService(RecordRepository recordRepository, GameService gameService) {
        this.recordRepository = recordRepository;
        this.gameService = gameService;
    }

    public Record create(RecordInsertDTO dto) {
        Game game = gameService.findById(dto.getGameId());
        return recordRepository.save(dto.toEntity(game));
    }

    @Transactional(readOnly = true)
    public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
        return recordRepository.findByMoments(minDate, maxDate, pageRequest).map(record -> new RecordDTO(record));
    }
}
