package com.api.pokemon.restful.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonAPI {

    @GetMapping
    public String findAll() {
        return "pokemon";
    }
}