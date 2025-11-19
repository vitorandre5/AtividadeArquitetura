package com.montadora.componentes.concreto.servidor;

import com.montadora.componentes.RAM;

public class RAMServidor implements RAM {

    @Override
    public String getFormFactor() { return "DDR4 ECC"; }

    @Override
    public String getVoltage() { return "1.2V"; }

    @Override
    public String getBrand() { return "Micron"; }

    @Override
    public int getCapacityGB() { return 64; }

    @Override
    public int getFrequencyMhz() { return 3200; }

    @Override
    public String getLatency() { return "CL22"; }

    @Override
    public String getDescription() { return "RAM Servidor (64GB DDR4 ECC 3200MHz)"; }
}
