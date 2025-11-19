package com.montadora.modelo;

import com.montadora.componentes.*;

/**
 * CLASSE MODELO - Responsabilidade da PESSOA 3.
 * Representa a configuração final do PC, agregando todos os Produtos Abstratos.
 */
public class Computador {
    // Atributos definidos pelas suas interfaces abstratas
    private PlacaMae placaMae;
    private CPU cpu;
    private GPU gpu;
    private RAM ram;
    private Armazenamento armazenamento;
    private FonteEnergia fonte;

    // Construtor vazio
    public Computador() {
    }

    // Métodos Setter (necessários para a montagem passo a passo/Builder da Pessoa 3)
    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setArmazenamento(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setFonte(FonteEnergia fonte) {
        this.fonte = fonte;
    }

    // Métodos Getter (necessários para o Builder e checagens)
    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public CPU getCpu() {
        return cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public RAM getRam() {
        return ram;
    }

    public Armazenamento getArmazenamento() {
        return armazenamento;
    }

    public FonteEnergia getFonte() {
        return fonte;
    }

    // Método para exibir o relatório final (a ser detalhado pela Pessoa 3/4)
    public String getRelatorioFinal() {
        return "Relatório de Configuração:\n" + 
           "CPU: " + (cpu != null ? cpu.getDescription() : "Não montada") + "\n" +
           "Placa Mãe: " + (placaMae != null ? placaMae.getDescription() : "Não montada") + "\n" +
           "GPU: " + (gpu != null ? gpu.getDescription() : "Não montada") + "\n" +
           "RAM: " + (ram != null ? ram.getDescription() : "Não montada") + "\n" +
           "Armazenamento: " + (armazenamento != null ? armazenamento.getDescription() : "Não montado") + "\n" +
           "Fonte de Energia: " + (fonte != null ? fonte.getDescription() : "Não montada") + "\n" +
           "\n(Relatório detalhado a ser implementado pela Pessoa 4)";
    }
}