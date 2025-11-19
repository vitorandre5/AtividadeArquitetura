package com.montadora.componentes;

/**
 * Interface que define uma Fonte de Energia (PSU) abstrata.
 * O método checkSufficientPower é CRÍTICO para a lógica de montagem.
 */
public interface FonteEnergia {
    
    // --- Regras de Negócio CRÍTICAS ---

    /**
     * Potência Máxima Fornecida em Watts (ex: 750, 1000). 
     * Essencial para a checagem de sobrecarga.
     */
    int getWattage();

    /**
     * Verifica se a fonte tem potência suficiente para a carga combinada de CPU e GPU.
     * A implementação (Pessoa 2) deve comparar getWattage() com a carga total.
     * @param cargaTotal A soma de TDP da CPU e Consumo da GPU.
     * @return true se a Wattage for suficiente, false caso contrário.
     */
    boolean checkSufficientPower(int cargaTotal);

    // --- Detalhes de Identificação e Eficiência ---

    /**
     * Marca do fabricante (ex: "Corsair", "Seasonic").
     */
    String getBrand();
    
    /**
     * Classificação de eficiência (ex: "80 PLUS Gold", "80 PLUS Bronze").
     */
    String getEfficiencyRating();
    
    /**
     * Modularidade do cabo (ex: "Full Modular", "Semi Modular").
     */
    String getModularType();

    // --- Detalhe para o Relatório Final ---

    /**
     * Retorna a descrição completa e formatada para o relatório final.
     */
    String getDescription();
}