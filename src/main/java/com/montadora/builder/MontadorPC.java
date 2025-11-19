package com.montadora.builder;

import com.montadora.modelo.Computador;

/**
 * Classe MontadorPC (Director): Orquestra o processo de construção.
 * O cliente (Pessoa 3) interage com o Director, que usa o Builder.
 * * Responsabilidade da Pessoa 3.
 */
public class MontadorPC {
    
    private PCBuilder builder;

    public MontadorPC(PCBuilder builder) {
        this.builder = builder;
    }

    /**
     * Método principal para construir o PC completo.
     * @param tipoPC O tipo de PC a ser montado (ex: "Gamer", "Escritorio").
     * @return O objeto Computador montado.
     */
    public Computador construirPC(String tipoPC) {
        System.out.println("\n--- Iniciando Montagem do PC " + tipoPC + " ---");
        
        // 1. Configura a fábrica (Abstract Factory)
        builder.configurarFabrica(tipoPC);
        
        // 2. Monta os componentes em ordem
        builder.montarPlacaMae();
        builder.montarCPU();
        builder.montarGPU();
        builder.montarRAM();
        builder.montarArmazenamento();
        builder.montarFonteEnergia();
        
        System.out.println("--- Montagem Concluída ---");
        
        // 3. Retorna o produto final
        return builder.getComputador();
    }
}
