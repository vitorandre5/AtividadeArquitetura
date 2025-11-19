package com.montadora.componentes.concreto.gamer;

import com.montadora.componentes.GPU;

public class GPUGamer implements GPU {

    @Override
    public int getPowerConsumption() { return 450; } // TDP

    @Override
    public String getInterfaceType() { return "PCIe 4.0 x16"; }

    @Override
    public String getBrand() { return "NVIDIA"; }

    @Override
    public String getModel() { return "GeForce RTX 4090"; }

    @Override
    public int getVRAMGB() { return 24; }

    @Override
    public String getVRAMType() { return "GDDR6X"; }

    @Override
    public int getClockSpeedMhz() { return 2520; } // Boost Clock

    @Override
    public String getDescription() { return "GPU Gamer (NVIDIA RTX 4090 24GB)"; }
}
