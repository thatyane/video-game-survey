package io.github.thatyane.videogamesurvey.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.thatyane.videogamesurvey.dto.RecordInsertDTO;
import io.github.thatyane.videogamesurvey.model.Game;
import io.github.thatyane.videogamesurvey.model.Genre;
import io.github.thatyane.videogamesurvey.model.Record;
import io.github.thatyane.videogamesurvey.model.enums.Platform;
import io.github.thatyane.videogamesurvey.service.RecordService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.Instant;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {
        RecordController.class
})
public class RecordControllerTest {

    private final String BASE_URL = "/records";

    private MockMvc mockMvc;
    private ObjectMapper objectMapper;

    @Autowired
    private RecordController recordController;

    @MockBean
    private RecordService recordService;

    @BeforeEach
    public void setUp() {
        objectMapper = new ObjectMapper();
        mockMvc = MockMvcBuilders
                .standaloneSetup(recordController).build();
    }

    @Test
    public void testCreate() throws Exception {
        RecordInsertDTO dto = new RecordInsertDTO("teste@teste.com.br", "Maria Melo", 35, 1L);
        Game game = new Game(1L, "Super Mario", Platform.NINTENDO, new Genre(1L, "Teste"));
        Record record = Record.builder().email("teste@teste.com.br").name("Maria Melo")
                .age(35).game(game).moment(Instant.now()).build();

        when(recordService.create(any(RecordInsertDTO.class))).thenReturn(record);

        mockMvc.perform(post(BASE_URL)
                .content(objectMapper.writeValueAsString(dto))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(status().isCreated());

        verify(recordService, times(1)).create(any(RecordInsertDTO.class));
    }
}
