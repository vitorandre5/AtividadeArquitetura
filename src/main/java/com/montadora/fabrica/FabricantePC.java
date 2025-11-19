package com.montadora.fabrica;

import com.montadora.componentes.*;

/**
 * Interface FabricantePC: Representa a Fábrica Abstrata no padrão Abstract Factory.
 * Esta interface define o contrato para a criação de TODOS os produtos abstratos
 * (componentes) de uma família específica (Gamer, Escritório, Servidor, etc.).
 * O código cliente (Pessoa 3) usará APENAS esta interface, garantindo o baixo acoplamento.
 * * Responsabilidade da Pessoa 1.
 */
public interface FabricantePC {
    
    /**
     * Define o método para criar uma Placa Mãe compatível com esta família de PCs.
     * @return Uma instância do Produto Abstrato PlacaMae.
     */
    PlacaMae criarPlacaMae();
    
    /**
     * Define o método para criar uma CPU compatível com esta Placa Mãe e família.
     * @return Uma instância do Produto Abstrato CPU.
     */
    CPU criarCPU();
    
    /**
     * Define o método para criar uma GPU compatível em termos de potência e uso.
     * @return Uma instância do Produto Abstrato GPU.
     */
    GPU criarGPU();
    
    /**
     * Define o método para criar módulos de RAM compatíveis (DDR4 ou DDR5, na frequência correta).
     * @return Uma instância do Produto Abstrato RAM.
     */
    RAM criarRAM();
    
    /**
     * Define o método para criar um dispositivo de Armazenamento adequado ao perfil (ex: NVMe para Gamer).
     * @return Uma instância do Produto Abstrato Armazenamento.
     */
    Armazenamento criarArmazenamento();
    
    /**
     * Define o método para criar a Fonte de Energia com potência adequada para todos os componentes.
     * @return Uma instância do Produto Abstrato FonteEnergia.
     */
    FonteEnergia criarFonteEnergia();

    /**
     * Método auxiliar para identificação: retorna o nome do modelo/família de PC que esta fábrica cria 
     * (ex: "PC Gamer de Alto Desempenho"). Útil para o menu (Pessoa 3).
     * @return O nome da família de PC.
     */
    String getModeloPC();
}