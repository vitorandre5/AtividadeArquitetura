package com.montadora.fabrica.concreta;

import com.montadora.componentes.Armazenamento;
import com.montadora.componentes.CPU;
import com.montadora.componentes.FonteEnergia;
import com.montadora.componentes.GPU;
import com.montadora.componentes.PlacaMae;
import com.montadora.componentes.RAM;
import com.montadora.fabrica.FabricantePC;
import com.montadora.componentes.concreto.gamer.CPUGamer;
import com.montadora.componentes.concreto.gamer.RAMGamer;
import com.montadora.componentes.concreto.gamer.GPUGamer;
import com.montadora.componentes.concreto.gamer.ArmazenamentoGamer;
import com.montadora.componentes.concreto.gamer.FonteEnergiaGamer;

/**
 * FABRICA CONCRETA - Responsabilidade da PESSOA 2.
 * Implementa o contrato da FabricantePC para criar SOMENTE componentes Gamer.
 */
public class FabricantePcGamer implements FabricantePC {

    @Override
    public PlacaMae criarPlacaMae() {
        // Como a Pessoa 1 não implementou a classe concreta de PlacaMae, vamos criar uma mock para teste.
        return new PlacaMae() {
            @Override
            public String getSocketType() { return "LGA 1700"; }
            @Override
            public String getRAMFormFactor() { return "DDR5"; }
            @Override
            public boolean isCompatible(CPU cpu) { return getSocketType().equals(cpu.getSocketType()); }
            @Override
            public String getBrand() { return "ASUS"; }
            @Override
            public String getChipsetModel() { return "Z790"; }
            @Override
            public int getRAMSlots() { return 4; }
            @Override
            public boolean hasM2Support() { return true; }
            @Override
            public String getDescription() { return "Placa Mãe Gamer (ASUS Z790)"; }
        };
    }

    @Override
    public CPU criarCPU() {
        return new CPUGamer();
    }

    @Override
    public GPU criarGPU() {
        return new GPUGamer();
    }

    @Override
    public RAM criarRAM() {
        return new RAMGamer();
    }

    @Override
    public Armazenamento criarArmazenamento() {
        return new ArmazenamentoGamer();
    }

    @Override
    public FonteEnergia criarFonteEnergia() {
        return new FonteEnergiaGamer();
    }

    @Override
    public String getModeloPC() {
        return "PC Gamer de Alto Desempenho";
    }
    // A Pessoa 2 implementará todos os métodos criar...() aqui.
}