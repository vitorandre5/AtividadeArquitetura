package com.montadora.componentes.concreto.servidor;

import com.montadora.componentes.GPU;

public class GPUServidor implements GPU {

    @Override
    public int getPowerConsumption() { return 50; }

    @Override
    public String getInterfaceType() { return "PCIe 3.0 x8"; }

    @Override
    public String getBrand() { return "Matrox"; }

    @Override
    public String getModel() { return "G200e"; }

    @Override
    public int getVRAMGB() { return 0; }

    @Override
    public String getVRAMType() { return "Integrada"; }

    @Override
    public int getClockSpeedMhz() { return 500; }

    @Override
    public String getDescription() { return "GPU Servidor (Matrox G200e - Gráficos Básicos)"; }
}
