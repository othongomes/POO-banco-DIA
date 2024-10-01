package com.example.demobanco.Model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gerente {

    private String nome;
    private String matricula;
    private List<Cliente> clientes;
    private Agencia agencia;

    public void adicionarCliente(Cliente cliente) {
        if (clientes == null) {
            clientes = new ArrayList<>();
        }
        clientes.add(cliente);
    }

}
