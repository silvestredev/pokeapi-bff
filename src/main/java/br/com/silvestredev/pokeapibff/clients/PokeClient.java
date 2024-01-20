package br.com.silvestredev.pokeapibff.clients;

import br.com.silvestredev.pokeapibff.api.response.PokeResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "pokemon", url = "${pokeapi.url}")
public interface PokeClient {

    @GetMapping("/{nome}")
    PokeResponseDTO getPokemonByName(@PathVariable String nome);
}
