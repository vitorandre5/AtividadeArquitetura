package com.montadora.cliente;

import com.montadora.fabrica.FabricantePC;
import com.montadora.modelo.Computador;
import com.montadora.builder.ComputadorBuilder;
import com.montadora.builder.MontadorPC;
import java.util.Scanner;
// Normalmente, importaria-se uma Fábrica Concreta da Pessoa 2, ex:
// import com.montadora.fabrica.concreta.FabricantePcGamer;

/**
 * CLIENTE (Pessoa 3) - Contém o método main() e a lógica de interação.
 * O código cliente deve usar APENAS a interface FabricantePC.
 */
public class AplicacaoMontadora {
    
    // Método que simula a montagem usando a Fábrica Abstrata
    // Método original (mantido para referência, mas não usado no menu)
    public static void montarPC(FabricantePC fabrica) {
        System.out.println("\n--- Montando PC: " + fabrica.getModeloPC() + " ---");
        
        // 1. Cria o produto final (Computador)
        Computador novoPC = new Computador();
        
        // 2. Utiliza a fábrica para criar componentes compatíveis
        novoPC.setPlacaMae(fabrica.criarPlacaMae());
        novoPC.setCpu(fabrica.criarCPU());
        // ... continua criando e configurando o resto ...
        
        // A Pessoa 3 adicionaria a lógica de checagem (compatibilidade, energia) e o menu aqui.
        // Como estamos usando o Builder/Director, esta função será substituída.
        // Deixamos aqui apenas para referência do Abstract Factory.
        
        System.out.println("Status: Componentes criados via Abstract Factory.");
        // A Pessoa 3 adicionaria a lógica de checagem (compatibilidade, energia) e o menu aqui.
    }
    
    public static void main(String[] args) {
        // Acentuação no console é um problema comum em Java.
        // O problema é resolvido ao executar com -Dfile.encoding=UTF-8,
        // mas vamos garantir que o código não tenha caracteres problemáticos
        // que possam ter sido introduzidos.
        // A correção principal será feita nas instruções de execução.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==============================================");
        System.out.println("  Iniciando Simulação da Montadora de PCs");
        System.out.println("  (Simulação de Montagem)");
        System.out.println("==============================================");
        
        // Tipos de PC disponíveis (baseado nas fábricas que a Pessoa 2 deve implementar)
        String[] tiposPC = {"Gamer", "Escritório", "Servidor"};
        
        System.out.println("\nEscolha o tipo de computador que deseja montar:");
        for (int i = 0; i < tiposPC.length; i++) {
            System.out.println((i + 1) + ". " + tiposPC[i]);
        }
        System.out.print("Digite o número correspondente: ");
        
        int escolha = -1;
        try {
            escolha = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("\nErro: Entrada inválida. Por favor, digite um número.");
            scanner.close();
            return;
        }
        
        if (escolha < 1 || escolha > tiposPC.length) {
            System.out.println("\nErro: Opção inválida.");
            scanner.close();
            return;
        }
        
        String tipoEscolhido = tiposPC[escolha - 1];
        
        // 1. Cria o Builder Concreto
        ComputadorBuilder builder = new ComputadorBuilder();
        
        // 2. Cria o Director (MontadorPC) com o Builder
        MontadorPC montador = new MontadorPC(builder);
        
        // 3. O Director orquestra a construção, usando o Builder que, por sua vez,
        //    usa a Abstract Factory (FabricantePC) para criar os componentes.
        Computador pcMontado = montador.construirPC(tipoEscolhido);
        
        // 4. Exibe o resultado final
        System.out.println("\n==============================================");
        System.out.println("  Configuração Final do " + tipoEscolhido);
        System.out.println("==============================================");
        System.out.println(pcMontado.getRelatorioFinal());
        
        scanner.close();
        System.out.println("==============================================");
        System.out.println("  Iniciando Simulação da Montadora de PCs");
        System.out.println("==============================================");
        
        // Simulação de uso: a Pessoa 3 instanciaria as classes da Pessoa 2
        // Exemplo:
        // FabricantePC fabricaGamer = new FabricantePcGamer();
        // montarPC(fabricaGamer);
        
        // O código do menu interativo foi movido para o início do main()
        // System.out.println("\n(O Cliente está pronto. Falta a implementação completa da Pessoa 2)");
    }
}