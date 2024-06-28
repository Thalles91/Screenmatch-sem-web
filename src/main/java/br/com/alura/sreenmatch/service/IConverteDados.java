package br.com.alura.sreenmatch.service;

public interface IConverteDados {
    //declaramos o que o nosso metodo deverá fazer mas de uma forma Generica por isso utilizamos o T.
    <T> T obterDados(String json, Class<T> classe);

}
