package br.com.alura.sreenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//tudo que não for Title, totalDeasons, imdbRating ele vai ignorar.
@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosSerie(@JsonAlias("Title") String title,
                         @JsonAlias("totalSeasons") Integer totalTemporada,
                         @JsonAlias("imdbRating") String avaliacao) {
}

