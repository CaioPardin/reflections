package br.com.cpardin;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class Main {


    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Alice");
        cliente.setEmail("alice@example.com");

        // Acessando as colunas da tabela
        Tabela tabela = Cliente.class.getAnnotation(Tabela.class);
        String[] colunas = tabela.colunas();
        System.out.println("Colunas da tabela de clientes:");
        for (String coluna : colunas) {
            System.out.println(coluna);
        }

        // Usando reflection para obter os campos da classe Cliente
        Field[] campos = Cliente.class.getDeclaredFields();
        System.out.println("\nCampos da classe Cliente:");
        for (Field campo : campos) {
            System.out.println(campo.getName());
        }

    }
}
