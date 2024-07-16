package br.com.alura.biblioteca.SERVICE;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
