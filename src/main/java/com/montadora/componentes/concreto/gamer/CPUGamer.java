package com.montadora.componentes.concreto.gamer;

import com.montadora.componentes.CPU;

public class CPUGamer implements CPU {

    // A Pessoa 2 preencherá com valores reais de um processador Gamer
    
    @Override
    public String getSocketType() {
        return "LGA 1700"; // Exemplo: Intel i9
    }
    
    @Override
    public int getTDP() {
        return 125;
    }
    
    @Override
    public String getBrand() {
        return "Intel";
    }
    
    @Override
    public String getFamily() {
        return "Core i9";
    }

    @Override
    public int getGeneration() {
        return 14;
    }

    @Override
    public int getNumCores() {
        return 24;
    }

    @Override
    public String getClockSpeed() {
        return "5.8 GHz";
    }

    @Override
    public int getCacheL3SizeMB() {
        return 36;
    }

    @Override
    public String getDescription() {
        return "CPU Gamer (Intel Core i9 14ª Geração, 5.8 GHz, 24 Núcleos)";
    }

}