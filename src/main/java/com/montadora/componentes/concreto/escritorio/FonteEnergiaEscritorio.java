package com.montadora.componentes.concreto.escritorio;

import com.montadora.componentes.FonteEnergia;

public class FonteEnergiaEscritorio implements FonteEnergia {

    @Override
    public int getWattage() { return 450; }

    @Override
    public boolean checkSufficientPower(int cargaTotal) { return getWattage() > cargaTotal + 50; } // 50W de margem

    @Override
    public String getBrand() { return "Cooler Master"; }

    @Override
    public String getEfficiencyRating() { return "80+ Bronze"; }

    @Override
    public String getModularType() { return "Não Modular"; }

    @Override
    public String getDescription() { return "Fonte de Energia Escritório (450W 80+ Bronze)"; }
}
