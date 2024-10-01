package com.example.demobanco.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cartao {
    private String numeroCartao;
    private String tipo; // Crédito ou Débito
    private Conta contaAssociada;
}
