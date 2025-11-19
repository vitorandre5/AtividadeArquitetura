package com.montadora.componentes.concreto.escritorio;

import com.montadora.componentes.GPU;

public class GPUEscritorio implements GPU {

    @Override
    public int getPowerConsumption() { return 15; } // TDP

    @Override
    public String getInterfaceType() { return "Integrada"; }

    @Override
    public String getBrand() { return "Intel"; }

    @Override
    public String getModel() { return "Integrated Graphics"; }

    @Override
    public int getVRAMGB() { return 0; }

    @Override
    public String getVRAMType() { return "Compartilhada"; }

    @Override
    public int getClockSpeedMhz() { return 1500; }

    @Override
    public String getDescription() { return "GPU Escritório (Gráficos Integrados)"; }
}
