package com.montadora.builder;

import com.montadora.fabrica.FabricantePC;
import com.montadora.fabrica.concreta.FabricantePcGamer;
import com.montadora.fabrica.concreta.FabricantePcEscritorio; // Fábrica concreta adicionada
import com.montadora.fabrica.concreta.FabricantePcServidor; // Fábrica concreta adicionada
import com.montadora.modelo.Computador;

/**
 * Classe ComputadorBuilder: Implementação concreta do PCBuilder.
 * É responsável por criar o objeto Computador e usar a Abstract Factory
 * para obter os componentes.
 * * Responsabilidade da Pessoa 3.
 */
public class ComputadorBuilder implements PCBuilder {
    
    private Computador computador;
    private FabricantePC fabrica;

    public ComputadorBuilder() {
        this.computador = new Computador();
    }

    @Override
    public void configurarFabrica(String tipoPC) {
        // A Pessoa 3 precisa de uma forma de mapear o tipoPC para a Fábrica Concreta.
        // Como a Pessoa 2 ainda não implementou todas, usaremos FabricantePcGamer como exemplo
        // e faremos um mapeamento simples.
        
        // **NOTA:** Em um cenário real, a Pessoa 3 usaria Reflection ou um Factory Method
        // para instanciar a fábrica correta sem depender de 'if/else' ou 'switch'.
        // Por enquanto, vamos simular com o que temos.
        
        if ("Gamer".equalsIgnoreCase(tipoPC)) {
            this.fabrica = new FabricantePcGamer();
        } else if ("Escritório".equalsIgnoreCase(tipoPC)) {
            this.fabrica = new FabricantePcEscritorio();
        } else if ("Servidor".equalsIgnoreCase(tipoPC)) {
            this.fabrica = new FabricantePcServidor();
        }
        // Adicionar mais fábricas aqui (ex: Servidor)
        else {
            // Se a fábrica não for encontrada, usa a Gamer como fallback para teste
            System.err.println("AVISO: Fábrica para '" + tipoPC + "' não encontrada. Usando FabricantePcGamer como padrão.");
            this.fabrica = new FabricantePcGamer();
        }
    }

    @Override
    public void montarPlacaMae() {
        if (fabrica != null) {
            computador.setPlacaMae(fabrica.criarPlacaMae());
            System.out.println("-> Placa Mãe montada: " + computador.getPlacaMae().getDescription());
        }
    }

    @Override
    public void montarCPU() {
        if (fabrica != null) {
            computador.setCpu(fabrica.criarCPU());
            System.out.println("-> CPU montada: " + computador.getCpu().getDescription());
        }
    }

    @Override
    public void montarGPU() {
        if (fabrica != null) {
            // A interface FabricantePC tem criarGPU(), mas a Pessoa 1 não implementou o Produto Abstrato GPU.
            // Vamos assumir que a Pessoa 1/2 irá implementar o Produto Abstrato GPU e a Fábrica Concreta.
            // Por enquanto, vamos comentar para evitar erro de compilação, mas o código final deve incluir:
            computador.setGpu(fabrica.criarGPU());
            System.out.println("-> GPU montada: " + computador.getGpu().getDescription());
        }
    }

    @Override
    public void montarRAM() {
        if (fabrica != null) {
            computador.setRam(fabrica.criarRAM());
            System.out.println("-> RAM montada: " + computador.getRam().getDescription());
        }
    }

    @Override
    public void montarArmazenamento() {
        if (fabrica != null) {
            computador.setArmazenamento(fabrica.criarArmazenamento());
            System.out.println("-> Armazenamento montado: " + computador.getArmazenamento().getDescription());
        }
    }

    @Override
    public void montarFonteEnergia() {
        if (fabrica != null) {
            computador.setFonte(fabrica.criarFonteEnergia());
            System.out.println("-> Fonte de Energia montada: " + computador.getFonte().getDescription());
        }
    }

    @Override
    public Computador getComputador() {
        return this.computador;
    }
}
