package com.montadora.componentes;

/**
 * Interface que define uma Placa Mãe abstrata (Motherboard).
 * Contém detalhes críticos para a compatibilidade e a configuração final.
 */
public interface PlacaMae {
    
    // --- Compatibilidade e Regras de Negócio CRÍTICAS ---

    /**
     * Define o tipo de encaixe da CPU que a placa suporta (ex: "LGA 1700", "AM4").
     * Deve ser igual ao getSocketType() da CPU para compatibilidade.
     */
    String getSocketType(); 

    /**
     * Tipo de memória RAM suportada (ex: "DDR4", "DDR5"). CRÍTICO para a RAM.
     */
    String getRAMFormFactor();

    /**
     * Lógica-chave para o Abstract Factory: verifica se a CPU é fisicamente compatível.
     * A implementação (Pessoa 2) deve comparar this.getSocketType() com cpu.getSocketType().
     * @param cpu O objeto CPU abstrato a ser verificado.
     * @return true se compatível, false caso contrário.
     */
    boolean isCompatible(CPU cpu);

    // --- Detalhes de Identificação e Capacidade ---

    /**
     * Marca do fabricante (ex: "ASUS", "Gigabyte").
     */
    String getBrand();
    
    /**
     * Chipset da placa (ex: "Z790", "B650").
     */
    String getChipsetModel();
    
    /**
     * Quantidade de slots para módulos de memória RAM.
     */
    int getRAMSlots();
    
    /**
     * Suporte a M.2 NVMe.
     */
    boolean hasM2Support();

    // --- Detalhe para o Relatório Final ---

    /**
     * Retorna a descrição completa e formatada para o relatório final.
     */
    String getDescription();
}