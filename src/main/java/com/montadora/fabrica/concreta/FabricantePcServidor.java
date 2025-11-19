package com.montadora.fabrica.concreta;

import com.montadora.componentes.*;
import com.montadora.componentes.concreto.servidor.*;
import com.montadora.fabrica.FabricantePC;

/**
 * FABRICA CONCRETA - Responsabilidade da PESSOA 2.
 * Implementa o contrato da FabricantePC para criar SOMENTE componentes de Servidor.
 */
public class FabricantePcServidor implements FabricantePC {

    @Override
    public PlacaMae criarPlacaMae() {
        return new PlacaMaeServidor();
    }

    @Override
    public CPU criarCPU() {
        return new CPUServidor();
    }

    @Override
    public GPU criarGPU() {
        return new GPUServidor();
    }

    @Override
    public RAM criarRAM() {
        return new RAMServidor();
    }

    @Override
    public Armazenamento criarArmazenamento() {
        return new ArmazenamentoServidor();
    }

    @Override
    public FonteEnergia criarFonteEnergia() {
        return new FonteEnergiaServidor();
    }

    @Override
    public String getModeloPC() {
        return "Servidor de Alto Desempenho (Redundante)";
    }
}
