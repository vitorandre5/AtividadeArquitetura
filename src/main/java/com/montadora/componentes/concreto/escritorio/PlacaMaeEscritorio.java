package com.montadora.componentes.concreto.escritorio;

import com.montadora.componentes.CPU;
import com.montadora.componentes.PlacaMae;

public class PlacaMaeEscritorio implements PlacaMae {

    @Override
    public String getSocketType() { return "LGA 1700"; }

    @Override
    public String getRAMFormFactor() { return "DDR4"; }

    @Override
    public boolean isCompatible(CPU cpu) { return getSocketType().equals(cpu.getSocketType()); }

    @Override
    public String getBrand() { return "ASUS"; }

    @Override
    public String getChipsetModel() { return "H610"; }

    @Override
    public int getRAMSlots() { return 2; }

    @Override
    public boolean hasM2Support() { return true; }

    @Override
    public String getDescription() { return "Placa Mãe Escritório (ASUS H610)"; }
}
