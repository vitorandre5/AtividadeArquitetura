package com.montadora.componentes;

/**
 * Interface que define um módulo de Memória (RAM) abstrato.
 * Detalhes são cruciais para a checagem de compatibilidade com a Placa Mãe.
 */
public interface RAM {
    
    // --- Compatibilidade e Regras de Negócio CRÍTICAS ---

    /**
     * Define o tipo físico da memória (ex: "DDR4", "DDR5"). 
     * CRÍTICO: Deve ser igual ao getRAMFormFactor() da PlacaMae.
     */
    String getFormFactor(); 

    /**
     * Define a voltagem de operação (ex: "1.2V", "1.35V").
     */
    String getVoltage();

    // --- Detalhes de Identificação e Capacidade ---

    /**
     * Marca do fabricante (ex: "Corsair", "Kingston").
     */
    String getBrand();
    
    /**
     * Capacidade do módulo em Gigabytes (ex: 16, 32).
     */
    int getCapacityGB();

    /**
     * Frequência de operação em MHz (ex: 3200, 6000).
     */
    int getFrequencyMhz();
    
    /**
     * Latência do módulo (ex: "CL30").
     */
    String getLatency();

    // --- Detalhe para o Relatório Final ---

    /**
     * Retorna a descrição completa e formatada para o relatório final.
     */
    String getDescription();
}