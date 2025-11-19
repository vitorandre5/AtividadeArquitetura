package com.montadora.componentes.concreto.servidor;

import com.montadora.componentes.FonteEnergia;

public class FonteEnergiaServidor implements FonteEnergia {

    @Override
    public int getWattage() { return 1600; }

    @Override
    public boolean checkSufficientPower(int cargaTotal) { return getWattage() > cargaTotal + 200; } // 200W de margem

    @Override
    public String getBrand() { return "Delta"; }

    @Override
    public String getEfficiencyRating() { return "80+ Titanium"; }

    @Override
    public String getModularType() { return "Hot-Swap"; }

    @Override
    public String getDescription() { return "Fonte de Energia Servidor (1600W 80+ Titanium Redundante)"; }
}
