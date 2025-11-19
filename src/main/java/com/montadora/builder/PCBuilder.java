package com.montadora.builder;

import com.montadora.modelo.Computador;

/**
 * Interface PCBuilder: Define os passos para a construção de um Computador.
 * Este é o Builder Abstrato.
 * * Responsabilidade da Pessoa 3.
 */
public interface PCBuilder {
    
    // Passo 1: Configurar a fábrica a ser usada (integração com Abstract Factory)
    void configurarFabrica(String tipoPC);

    // Passo 2: Montar os componentes principais
    void montarPlacaMae();
    void montarCPU();
    void montarGPU();
    void montarRAM();
    void montarArmazenamento();
    void montarFonteEnergia();

    // Passo Final: Obter o produto construído
    Computador getComputador();
}
