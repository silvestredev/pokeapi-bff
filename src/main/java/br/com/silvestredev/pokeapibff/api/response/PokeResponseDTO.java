package br.com.silvestredev.pokeapibff.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PokeResponseDTO {

    private Integer id;
    private String name;
    private Integer base_experience;
    private Integer height;

}
