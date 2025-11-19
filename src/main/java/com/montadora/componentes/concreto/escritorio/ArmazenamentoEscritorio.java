package com.montadora.componentes.concreto.escritorio;

import com.montadora.componentes.Armazenamento;

public class ArmazenamentoEscritorio implements Armazenamento {

    @Override
    public String getType() { return "SATA SSD"; }

    @Override
    public String getFormFactor() { return "2.5 polegadas"; }

    @Override
    public String getBrand() { return "Kingston"; }

    @Override
    public int getCapacityTB() { return 1; }

    @Override
    public int getReadSpeedMBs() { return 550; }

    @Override
    public int getWriteSpeedMBs() { return 500; }

    @Override
    public String getDescription() { return "Armazenamento Escritório (1TB SATA SSD)"; }
}
