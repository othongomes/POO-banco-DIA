package com.example.demobanco.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transacao {
    private String tipo; // Saque, Depósito, Transferência
    private double valor;
    private LocalDateTime dataHora;
    
    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
    }

    public String toString() {
        return String.format("Tipo: %s, Valor: %.2f, Data e Hora: %s", 
            tipo, valor, dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}
