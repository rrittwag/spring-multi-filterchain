package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    @DisplayName("GET alpha")
    public void test_getAlpha() throws Exception {
        webTestClient.get()
                .uri("/alpha")
                .exchange()
                .expectStatus()
                .is2xxSuccessful();
    }

    @Test
    @DisplayName("GET bravo")
    public void test_getBravo() throws Exception {
        webTestClient.get()
                .uri("/bravo")
                .exchange()
                .expectStatus()
                .is2xxSuccessful();
    }
}
