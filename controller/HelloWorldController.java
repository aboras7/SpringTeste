package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloworld() {
        return "Hello world";
    }


    @GetMapping("/list")
    public String listarBSM() {
        return "Persistência\n" +
                "Mentalidade de Crescimento\n" +
                "Orientação ao Futuro\n" +
                "Responsabilidade Pessoal\n" +
                "Trabalho em Equipe\n" +
                "Comunicação\n" +
                "Orientação aos Detalhes\n" +
                "Proatividade";
    }

    @GetMapping("/objetivos")
    public String objetivosSemana() {
        return "Melhorar gestão de tempo;\n" +
                "Melhorar atenção aos detalhes;\n" +
                "Revisar conteúdos Java.";
    }
}
