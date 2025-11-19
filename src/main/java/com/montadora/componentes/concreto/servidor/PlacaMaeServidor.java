package com.montadora.componentes.concreto.servidor;

import com.montadora.componentes.CPU;
import com.montadora.componentes.PlacaMae;

public class PlacaMaeServidor implements PlacaMae {

    @Override
    public String getSocketType() { return "LGA 4189"; }

    @Override
    public String getRAMFormFactor() { return "DDR4 ECC"; }

    @Override
    public boolean isCompatible(CPU cpu) { return getSocketType().equals(cpu.getSocketType()); }

    @Override
    public String getBrand() { return "Supermicro"; }

    @Override
    public String getChipsetModel() { return "Intel C621A"; }

    @Override
    public int getRAMSlots() { return 16; }

    @Override
    public boolean hasM2Support() { return false; }

    @Override
    public String getDescription() { return "Placa Mãe Servidor (Supermicro C621A, 16 Slots RAM)"; }
}
