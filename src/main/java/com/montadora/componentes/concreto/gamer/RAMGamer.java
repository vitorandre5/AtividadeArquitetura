package com.montadora.componentes.concreto.gamer;

import com.montadora.componentes.RAM;

public class RAMGamer implements RAM {

    @Override
    public String getFormFactor() { return "DDR5"; }

    @Override
    public String getVoltage() { return "1.35V"; }

    @Override
    public String getBrand() { return "Corsair"; }

    @Override
    public int getCapacityGB() { return 32; }

    @Override
    public int getFrequencyMhz() { return 6000; }

    @Override
    public String getLatency() { return "CL30"; }

    @Override
    public String getDescription() { return "RAM Gamer (32GB DDR5 6000MHz CL30)"; }
}
