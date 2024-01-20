package br.com.silvestredev.pokeapibff.api;

import br.com.silvestredev.pokeapibff.api.response.PokeResponseDTO;
import br.com.silvestredev.pokeapibff.services.PokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pokeapibff")
@RequiredArgsConstructor
public class PokeController {

    private final PokeService pokeService;

    @GetMapping("/{nome}")
    public ResponseEntity<PokeResponseDTO> getPokemonByName(@PathVariable String nome) {
        return ResponseEntity.ok(pokeService.getPokemonByName(nome));
    }

}
