package io.github.thatyane.videogamesurvey.controller;

import io.github.thatyane.videogamesurvey.dto.GameDTO;
import io.github.thatyane.videogamesurvey.model.enums.Platform;
import io.github.thatyane.videogamesurvey.service.GameService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GameControllerTest {

    private final String BASE_URL = "/games";
    private static final String NOME_GAME_1 = "Super Mario";
    private static final String NOME_GAME_2 = "FIFA 20";

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GameService gameService;

    @Test
    public void shouldFindAll() throws Exception {
        BDDMockito.given(gameService.findAllDTO()).willReturn(getGamesDTO());

        mockMvc.perform(get(BASE_URL).contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].title", is(NOME_GAME_1)))
                .andExpect(jsonPath("$[1].title", is(NOME_GAME_2)));
    }

    public List<GameDTO> getGamesDTO() {
        GameDTO game1 = new GameDTO(1L, NOME_GAME_1, Platform.NINTENDO);
        GameDTO game2 = new GameDTO(1L, NOME_GAME_2, Platform.PLAYSTATION);
        return List.of(game1, game2);
    }
}
