package br.com.alura.biblioteca.MODEL;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosRequisição(@JsonAlias("results") List<DadosLivro> results) {
}
