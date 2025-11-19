package com.montadora.componentes.concreto.servidor;

import com.montadora.componentes.Armazenamento;

public class ArmazenamentoServidor implements Armazenamento {

    @Override
    public String getType() { return "SAS HDD"; }

    @Override
    public String getFormFactor() { return "3.5 polegadas"; }

    @Override
    public String getBrand() { return "Seagate"; }

    @Override
    public int getCapacityTB() { return 10; }

    @Override
    public int getReadSpeedMBs() { return 250; }

    @Override
    public int getWriteSpeedMBs() { return 200; }

    @Override
    public String getDescription() { return "Armazenamento Servidor (10TB SAS HDD)"; }
}
