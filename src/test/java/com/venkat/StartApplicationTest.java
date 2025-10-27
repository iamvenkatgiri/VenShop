package com.venkat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class StartApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void rootReturnsIndexWithProducts() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.containsString("VenShop")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Wireless Headphones")))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Travel Water Bottle")));
    }
}

