package com.montadora.componentes.concreto.gamer;

import com.montadora.componentes.Armazenamento;

public class ArmazenamentoGamer implements Armazenamento {

    @Override
    public String getType() { return "NVMe SSD"; }

    @Override
    public String getFormFactor() { return "M.2 2280"; }

    @Override
    public String getBrand() { return "Samsung"; }

    @Override
    public int getCapacityTB() { return 2; }

    @Override
    public int getReadSpeedMBs() { return 7000; }

    @Override
    public int getWriteSpeedMBs() { return 5100; }

    @Override
    public String getDescription() { return "Armazenamento Gamer (2TB NVMe SSD)"; }
}
