package io.github.thatyane.videogamesurvey.controller;

import io.github.thatyane.videogamesurvey.dto.GameDTO;
import io.github.thatyane.videogamesurvey.model.enums.Platform;
import io.github.thatyane.videogamesurvey.service.GameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {
        GameController.class
})
public class GameControllerTest {

    private final String BASE_URL = "/games";

    private MockMvc mockMvc;

    @Autowired
    private GameController gameController;

    @MockBean
    private GameService gameService;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders
                .standaloneSetup(gameController).build();
    }

    @Test
    public void testFindAll() throws Exception {
        GameDTO game = new GameDTO(1L, "Super Mario", Platform.NINTENDO);
        List<GameDTO> games = Arrays.asList(game);

        when(gameService.findAllDTO()).thenReturn(games);

        mockMvc.perform(get(BASE_URL))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].title", is(game.getTitle())));

        verify(gameService, times(1)).findAllDTO();
    }
}
