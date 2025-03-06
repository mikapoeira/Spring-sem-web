package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("Title")String Titulo,
                         @JsonAlias("totalSeasons")String TotalTemporadas,
                         @JsonAlias("imdbRating")String avaliacao
                         ) {
}
