package br.com.silvestredev.pokeapibff.services;

import br.com.silvestredev.pokeapibff.api.response.PokeResponseDTO;
import br.com.silvestredev.pokeapibff.clients.PokeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PokeService {

    private final PokeClient client;

    public PokeResponseDTO getPokemonByName(String nome) {
        return client.getPokemonByName(nome);
    }
}
