package com.montadora.componentes.concreto.escritorio;

import com.montadora.componentes.RAM;

public class RAMEscritorio implements RAM {

    @Override
    public String getFormFactor() { return "DDR4"; }

    @Override
    public String getVoltage() { return "1.2V"; }

    @Override
    public String getBrand() { return "Kingston"; }

    @Override
    public int getCapacityGB() { return 8; }

    @Override
    public int getFrequencyMhz() { return 3200; }

    @Override
    public String getLatency() { return "CL22"; }

    @Override
    public String getDescription() { return "RAM Escritório (8GB DDR4 3200MHz CL22)"; }
}
