package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Controller.class)
@Import(SecurityConfig.class)
public class ControllerWebMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("GET alpha")
    public void test_getAlpha() throws Exception {
        mockMvc.perform(get("/alpha"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("GET bravo")
    public void test_getBravo() throws Exception {
        mockMvc.perform(get("/bravo"))
                .andExpect(status().isOk());
    }
}
