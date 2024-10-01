package com.example.demobanco;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demobanco.Model.Agencia;
import com.example.demobanco.Model.Cliente;
import com.example.demobanco.Model.Conta;
import com.example.demobanco.Model.ContaCorrente;
import com.example.demobanco.Model.ContaPoupanca;
import com.example.demobanco.Model.Gerente;
import com.example.demobanco.Model.Transacao;

@SpringBootApplication
public class DemobancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemobancoApplication.class, args);

		Cliente cliente1 = new Cliente();
		cliente1.setNome("João");

        Agencia agencia = new Agencia();
		agencia.setNumero(123);
		agencia.setEndereco("Rua Principal, 123");
		agencia.setGerente(new Gerente("João", "12345", null, agencia));

        Conta contaCorrente = new ContaCorrente(cliente1, agencia);
        contaCorrente.depositar(1000);
        contaCorrente.sacar(500);
        contaCorrente.imprimirExtrato();

        Conta contaPoupanca = new ContaPoupanca(cliente1, agencia);
        contaPoupanca.depositar(2000);
        contaPoupanca.imprimirExtrato();


	}

}
