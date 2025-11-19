package com.montadora.componentes;

/**
 * Interface que define um componente de Armazenamento (SSD/HD) abstrato.
 * Detalhes importantes para a velocidade geral do sistema e relatório.
 */
public interface Armazenamento {
    
    // --- Identificação e Tipo ---

    /**
     * Tipo de disco (ex: "SSD NVMe", "SSD SATA", "HDD"). 
     * Isso afeta a escolha da Placa Mãe (slots M.2).
     */
    String getType();

    /**
     * Fator de Forma (ex: "M.2 2280", "2.5 polegadas").
     */
    String getFormFactor();

    /**
     * Marca do fabricante (ex: "Samsung", "Western Digital").
     */
    String getBrand();
    
    // --- Detalhes de Capacidade e Desempenho ---

    /**
     * Capacidade do disco em Terabytes (ex: 1, 2, 4).
     */
    int getCapacityTB();

    /**
     * Velocidade Máxima de Leitura em MB/s (ex: 7000 MB/s para NVMe).
     */
    int getReadSpeedMBs();
    
    /**
     * Velocidade Máxima de Escrita em MB/s.
     */
    int getWriteSpeedMBs();

    // --- Detalhe para o Relatório Final ---

    /**
     * Retorna a descrição completa e formatada para o relatório final.
     */
    String getDescription();
}