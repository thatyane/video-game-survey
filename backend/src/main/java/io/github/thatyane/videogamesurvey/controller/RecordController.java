package io.github.thatyane.videogamesurvey.controller;

import io.github.thatyane.videogamesurvey.dto.RecordDTO;
import io.github.thatyane.videogamesurvey.dto.RecordInsertDTO;
import io.github.thatyane.videogamesurvey.model.Record;
import io.github.thatyane.videogamesurvey.service.RecordService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.time.Instant;

@RestController
@RequestMapping(value = "/records")
public class RecordController {

    private RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @PostMapping
    public ResponseEntity<Void> create(@Valid @RequestBody RecordInsertDTO recordInsertDTO) {
        Record recordCreated = recordService.create(recordInsertDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(recordCreated.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity<Page<RecordDTO>> findByMoments(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "0") Integer size,
            @RequestParam(value = "orderBy", defaultValue = "moment") String orderBy,
            @RequestParam(value = "sort", defaultValue = "DESC") String sort) {

        Instant min = ("".equals(minDate)) ? null : Instant.parse(minDate);
        Instant max = ("".equals(maxDate)) ? null : Instant.parse(maxDate);

        if (size == 0) {
            size = Integer.MAX_VALUE;
        }

        PageRequest pageRequest = PageRequest.of(page, size, Sort.Direction.valueOf(sort), orderBy);

        Page<RecordDTO> games = recordService.findByMoments(min, max, pageRequest);
        return ResponseEntity.ok().body(games);
    }
}
