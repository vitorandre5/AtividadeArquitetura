package com.montadora.util;

/**
 * SINGLETON - Padrão Criacional Opcional (Responsabilidade da PESSOA 4).
 * Garante que apenas uma instância desta classe exista para gerenciar recursos globais.
 */
public class SingletonConfiguracao {
    
    // A única instância permitida
    private static SingletonConfiguracao instance;
    private int proximoNumeroDeSerie = 1000; 

    // O construtor é privado para impedir instanciação externa
    private SingletonConfiguracao() {
        // Inicialização de recursos globais
    }
    
    // Método estático para obter a única instância (Thread-safe simples)
    public static synchronized SingletonConfiguracao getInstance() {
        if (instance == null) {
            instance = new SingletonConfiguracao();
        }
        return instance;
    }
    
    // Exemplo de um método global gerenciado
    public int gerarNovoNumeroDeSerie() {
        return proximoNumeroDeSerie++;
    }

    public String getStatus() {
        return "Singleton Ativo. Próximo Serial: " + proximoNumeroDeSerie;
    }
}