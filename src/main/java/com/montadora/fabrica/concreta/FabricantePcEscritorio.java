package com.montadora.fabrica.concreta;

import com.montadora.componentes.*;
import com.montadora.componentes.concreto.escritorio.*;
import com.montadora.fabrica.FabricantePC;

/**
 * FABRICA CONCRETA - Responsabilidade da PESSOA 2.
 * Implementa o contrato da FabricantePC para criar SOMENTE componentes de Escritório.
 */
public class FabricantePcEscritorio implements FabricantePC {

    @Override
    public PlacaMae criarPlacaMae() {
        return new PlacaMaeEscritorio();
    }

    @Override
    public CPU criarCPU() {
        // A CPU Escritorio já existia, mas vamos garantir o import
        return new CPUEscritorio();
    }

    @Override
    public GPU criarGPU() {
        return new GPUEscritorio();
    }

    @Override
    public RAM criarRAM() {
        return new RAMEscritorio();
    }

    @Override
    public Armazenamento criarArmazenamento() {
        return new ArmazenamentoEscritorio();
    }

    @Override
    public FonteEnergia criarFonteEnergia() {
        return new FonteEnergiaEscritorio();
    }

    @Override
    public String getModeloPC() {
        return "PC para Escritório (Otimizado para Custo)";
    }
}
