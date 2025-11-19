package com.montadora.componentes.concreto.servidor;

import com.montadora.componentes.CPU;

public class CPUServidor implements CPU {

    @Override
    public String getSocketType() { return "LGA 4189"; }

    @Override
    public int getTDP() { return 270; }

    @Override
    public String getBrand() { return "Intel"; }

    @Override
    public String getFamily() { return "Xeon Platinum"; }

    @Override
    public int getGeneration() { return 3; }

    @Override
    public int getNumCores() { return 32; }

    @Override
    public String getClockSpeed() { return "3.0 GHz"; }

    @Override
    public int getCacheL3SizeMB() { return 48; }

    @Override
    public String getDescription() { return "CPU Servidor (Intel Xeon Platinum, 32 Núcleos)"; }
}
