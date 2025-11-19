package com.montadora.componentes.concreto.escritorio;

import com.montadora.componentes.CPU;

/**
 * Implementação concreta de CPU voltada para computadores de Escritório.
 * Responsabilidade da Pessoa 2.
 */
public class CPUEscritorio implements CPU {

    @Override
    public String getSocketType() {
        return "AM4"; // Exemplo: AMD Ryzen 5
    }

    @Override
    public int getTDP() {
        return 65; // Watts típicos de CPUs de escritório
    }

    @Override
    public String getBrand() {
        return "AMD";
    }

    @Override
    public String getFamily() {
        return "Ryzen 5";
    }

    @Override
    public int getGeneration() {
        return 5; // Exemplo: 5ª geração Ryzen
    }

    @Override
    public int getNumCores() {
        return 6; // CPU de escritório geralmente entre 4 e 6 núcleos
    }

    @Override
    public String getClockSpeed() {
        return "3.9 GHz"; // Frequência base típica
    }

    @Override
    public int getCacheL3SizeMB() {
        return 16; // Cache L3 em MB
    }

    @Override
    public String getDescription() {
        return """
            CPU de Escritório: AMD Ryzen 5 5600G
            - 6 núcleos / 12 threads
            - Socket AM4
            - Clock 3.9 GHz
            - Cache L3: 16 MB
            - TDP: 65W
            Ideal para tarefas de escritório e produtividade geral.
            """;
    }
}
