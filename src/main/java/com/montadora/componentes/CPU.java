package com.montadora.componentes;

/**
 * Interface que define um Processador (CPU) abstrato.
 * Define o contrato para todos os processadores do sistema.
 */
public interface CPU {
    
    // --- Compatibilidade e Regras de Negócio ---
    
    /**
     * Define o encaixe físico (ex: "LGA 1700"). CRÍTICO para PlacaMae.isCompatible().
     */
    String getSocketType(); 

    /**
     * Potência Térmica Máxima (TDP) em Watts. Essencial para o cálculo da Fonte de Energia.
     */
    int getTDP(); 
    
    // --- Detalhes de Identificação ---

    /**
     * Marca do fabricante (ex: "Intel", "AMD").
     */
    String getBrand();
    
    /**
     * Família/Série do processador (ex: "Core i9", "Ryzen 7").
     */
    String getFamily();

    /**
     * Geração/Arquitetura do processador.
     */
    int getGeneration();

    // --- Detalhes de Desempenho e Relatório ---

    /**
     * Número de núcleos físicos.
     */
    int getNumCores();

    /**
     * Velocidade máxima de operação em Boost (ex: "5.8 GHz").
     */
    String getClockSpeed();
    
    /**
     * Tamanho da memória Cache L3.
     */
    int getCacheL3SizeMB();

    /**
     * Retorna a descrição completa para o relatório final.
     */
    String getDescription();
}