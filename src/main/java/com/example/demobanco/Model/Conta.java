package com.example.demobanco.Model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected Agencia agencia;
	protected int id;
	protected double saldo;
	protected Cliente cliente;
    protected List<Transacao> historicoTransacoes = new ArrayList<>();

	public Conta(Cliente cliente, Agencia agencia) {
		this.agencia = new Agencia();
		this.id = SEQUENCIAL++;
		this.cliente = cliente;
        this.saldo = 0;
        this.agencia = agencia;
        
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
        historicoTransacoes.add(new Transacao("saque", valor));
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
        historicoTransacoes.add(new Transacao("deposito", valor));
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

    public void imprimirHistorico() {
        System.out.println("=== Histórico de Transações ===");
        for (Transacao transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }


	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia.getNumero()));
		System.out.println(String.format("Numero: %d", this.id));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Transações: %d", this.historicoTransacoes.size()));

        imprimirHistorico();
	}
}