package br.edu.ifpr.pgua.eic.tads.controllers;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class CadastroController {
    

    public Handler get = (Context ctx)->{
        ctx.render("cadastro.html");
    };

    public Handler post = (Context ctx)->{
        String nome = ctx.formParam("nome");
        String cpf = ctx.formParam("cpf");

        ctx.html("<h1>Nome:"+nome.toUpperCase()+" CPF:"+cpf+"</h1>");
    };



}
