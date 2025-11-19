package com.montadora.componentes.concreto.gamer;

import com.montadora.componentes.FonteEnergia;

public class FonteEnergiaGamer implements FonteEnergia {

    @Override
    public int getWattage() { return 1200; }

    @Override
    public boolean checkSufficientPower(int cargaTotal) { return getWattage() > cargaTotal + 100; } // 100W de margem

    @Override
    public String getBrand() { return "Corsair"; }

    @Override
    public String getEfficiencyRating() { return "80+ Platinum"; }

    @Override
    public String getModularType() { return "Full Modular"; }

    @Override
    public String getDescription() { return "Fonte de Energia Gamer (1200W 80+ Platinum)"; }
}
