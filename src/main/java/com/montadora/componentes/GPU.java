package com.montadora.componentes;

/**
 * Interface que define uma Placa de Vídeo (GPU) abstrata.
 * Detalhes são cruciais para o cálculo de consumo total de energia.
 */
public interface GPU {
    
    // --- Compatibilidade e Regras de Negócio ---

    /**
     * Consumo de energia em Watts sob carga máxima. 
     * CRÍTICO para a Pessoa 3 calcular a carga total do sistema.
     */
    int getPowerConsumption();

    /**
     * Tipo de interface de encaixe (ex: "PCIe 4.0 x16").
     */
    String getInterfaceType();
    
    // --- Detalhes de Marca e Modelo ---

    /**
     * Marca do fabricante (ex: "NVIDIA", "AMD").
     */
    String getBrand();
    
    /**
     * Modelo da placa (ex: "GeForce RTX 4070", "Radeon RX 7800 XT").
     */
    String getModel();

    // --- Detalhes de Desempenho e Memória ---

    /**
     * Memória de Vídeo (VRAM) em GB.
     */
    int getVRAMGB(); 

    /**
     * Tipo de memória de vídeo (ex: "GDDR6X").
     */
    String getVRAMType();

    /**
     * Frequência base/boost em MHz.
     */
    int getClockSpeedMhz();

    // --- Detalhe para o Relatório Final ---

    /**
     * Retorna a descrição completa e formatada para o relatório final.
     */
    String getDescription();
}