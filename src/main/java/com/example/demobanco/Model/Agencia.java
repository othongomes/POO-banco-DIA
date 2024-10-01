package com.example.demobanco.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agencia {
    
    private int numero;
    private String endereco;
    private Gerente gerente;
}