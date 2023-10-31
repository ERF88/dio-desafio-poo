package com.github.erf88;

import com.github.erf88.domain.Iphone;

public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

}