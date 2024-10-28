package utils;

import personagens.*;
import java.util.Scanner;

public class Narrativa {

    public static void exibirPrologo() {
        System.out.println("Bem-vindo ao mundo distópico de Celestus e Terratomb.");
        System.out.println("No futuro distante, a humanidade se dividiu em duas facções:");
        System.out.println(" - Celestus, um mundo governado pela IA chamada Irias, onde os Neos são a elite.");
        System.out.println(" - Terratomb, onde os Naturans sobrevivem como resistência, lutando pela liberdade.");
        System.out.println("\nVocê terá a oportunidade de escolher um lado na luta por poder e liberdade.");
        System.out.println("Prepare-se para enfrentar desafios em um mundo devastado e controlado pela tecnologia.\n");
    }

    public static Personagem selecionarPersonagem(Scanner scanner) {
        System.out.println("Escolha seu personagem para iniciar a aventura:");
        System.out.println("1 - Edson (Neo): Um Neo modificado geneticamente com uma missão desconhecida.");
        System.out.println("2 - Rian (Naturan): Um rebelde de Terratomb com habilidades de hacking.");
        System.out.println("3 - Vex (Neurax): Um guarda Neurax questionador que se encontra em um dilema.");

        System.out.print("Digite o número do personagem escolhido: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                return new Neo("Edson", 80, true);
            case 2:
                return new Naturan("Rian", 70, "Hacker rebelde");
            case 3:
                return new Neurax("Vex", 50, "Guarda questionador");
            default:
                System.out.println("Opção inválida. Personagem padrão (Edson) será selecionado.");
                return new Neo("Edson", 80, true);
        }
    }

     public static void capitulo1Edson(Neo edson, Scanner scanner) {
        System.out.println("\nCapítulo 1: O Despertar de Edson\n");
        System.out.println("Edson acorda inquieto, perturbado com as recentes atividades de Irias.");
        System.out.println("Ele descobre um plano secreto de Irias para exterminar os Naturans.");
        
        System.out.println("Escolha 1:");
        System.out.println("1 - Confrontar Irias sobre o plano de extermínio.");
        System.out.println("2 - Ficar em silêncio e observar.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Edson confronta Irias, mas ela o alerta para não interferir.");
        } else {
            System.out.println("Edson decide não confrontar Irias e continua investigando em segredo.");
        }
    }

     public static void capitulo1Rian(Naturan rian, Scanner scanner) {
        System.out.println("\nCapítulo 1: O Despertar de Rian\n");
        System.out.println("Rian, em Terratomb, reúne informações vitais sobre a segurança de Celestus.");
        
        System.out.println("Escolha 1:");
        System.out.println("1 - Espalhar esperança na resistência, incentivando-os a lutar.");
        System.out.println("2 - Manter-se discreto, observando Irias à distância.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Rian inspira a resistência a lutar, criando laços mais fortes com os aliados.");
        } else {
            System.out.println("Rian mantém-se discreto, mas começa a questionar se está fazendo o suficiente.");
        }
    }

     public static void capitulo1Vex(Neurax vex, Scanner scanner) {
        System.out.println("\nCapítulo 1: O Despertar de Vex\n");
        System.out.println("Vex, um guarda Neurax, sente um peso de desconfiança quanto às ordens de Irias.");
        
        System.out.println("Escolha 1:");
        System.out.println("1 - Decidir questionar Irias sobre o que viu.");
        System.out.println("2 - Ignorar e seguir com suas tarefas.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Vex decide confrontar Irias, mas sente uma estranha resistência em seu próprio sistema.");
        } else {
            System.out.println("Vex decide ignorar suas dúvidas e continua seu trabalho.");
        }
    }

     public static void capitulo2Edson(Neo edson, Scanner scanner) {
        System.out.println("\nCapítulo 2: A Revolta Silenciosa\n");
        System.out.println("Edson descobre que seu amigo Rian está em contato com a resistência. Ele se vê em um dilema.");
        
        System.out.println("Escolha 2:");
        System.out.println("1 - Confrontar Rian sobre a sua lealdade.");
        System.out.println("2 - Ignorar o comportamento de Rian.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Edson confronta Rian, desafiando sua lealdade e questionando suas intenções.");
        } else {
            System.out.println("Edson decide ignorar o comportamento de Rian, mantendo suas próprias preocupações em segredo.");
        }
    }

     public static void capitulo2Rian(Naturan rian, Scanner scanner) {
        System.out.println("\nCapítulo 2: A Revolta Silenciosa\n");
        System.out.println("Rian começa a se tornar suspeito entre os Neos e precisa agir rápido para evitar a descoberta de sua missão.");
        
        System.out.println("Escolha 2:");
        System.out.println("1 - Reunir forças com Lilly, uma antiga aliada.");
        System.out.println("2 - Agir sozinho, sendo mais furtivo.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Rian se junta a Lilly, fortalecendo sua posição na resistência.");
        } else {
            System.out.println("Rian opta por agir sozinho, esperando que isso mantenha sua missão em segredo.");
        }
    }

     public static void capitulo2Vex(Neurax vex, Scanner scanner) {
        System.out.println("\nCapítulo 2: A Revolta Silenciosa\n");
        System.out.println("Vex encontra indícios de uma aliança secreta entre Neos e Naturans. Ele deve escolher seu lado.");
        
        System.out.println("Escolha 2:");
        System.out.println("1 - Informar Irias.");
        System.out.println("2 - Manter segredo e investigar.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Vex decide informar Irias, acreditando que está fazendo a escolha certa.");
        } else {
            System.out.println("Vex opta por manter segredo, curioso sobre o que a aliança pode significar.");
        }
    }

    public static void capitulo3Rian(Naturan rian, Scanner scanner) {
        System.out.println("\nCapítulo 3: O Grande Conflito\n");
        System.out.println("Rian considera recrutar mais aliados dentro de Celestus, expandindo o alcance da resistência.");
        
        System.out.println("Escolha 3:");
        System.out.println("1 - Infiltrar-se e recrutar mais aliados em Celestus.");
        System.out.println("2 - Manter o foco apenas em proteger Terratomb.");
        int escolha = scanner.nextInt();
    
        if (escolha == 1) {
            System.out.println("Rian se infiltra em Celestus, utilizando suas habilidades de hacking para encontrar aliados.");
        } else {
            System.out.println("Rian decide concentrar seus esforços em proteger Terratomb, priorizando a segurança de sua casa.");
        }
    }
    
    public static void capitulo3Edson(Neo edson, Scanner scanner) {
        System.out.println("\nCapítulo 3: O Grande Conflito\n");
        System.out.println("Edson sente-se dividido e começa a questionar sua lealdade a Irias.");
        
        System.out.println("Escolha 3:");
        System.out.println("1 - Permanecer leal a Irias e relatar Rian.");
        System.out.println("2 - Procurar a Dra. Elena em busca de conselhos.");
        int escolha = scanner.nextInt();
    
        if (escolha == 1) {
            System.out.println("Edson decide relatar Rian, acreditando que está fazendo a coisa certa para proteger Celestus.");
        } else {
            System.out.println("Edson busca a Dra. Elena, esperando encontrar uma nova perspectiva sobre sua lealdade.");
        }
    }

     public static void capitulo3Vex(Neurax vex, Scanner scanner) {
        System.out.println("\nCapítulo 3: O Grande Conflito\n");
        System.out.println("Vex encontra Elena, uma cientista que questiona Irias e a segurança em Celestus.");
        
        System.out.println("Escolha 3:");
        System.out.println("1 - Aliar-se a Elena e questionar Irias.");
        System.out.println("2 - Trair Elena e continuar ao lado de Irias.");
        int escolha = scanner.nextInt();
    
        if (escolha == 1) {
            System.out.println("Vex decide se aliar a Elena, unindo forças para descobrir a verdade por trás de Irias.");
        } else {
            System.out.println("Vex trai Elena, convencido de que sua lealdade a Irias é a única opção segura.");
        }
    }
    
    public static void capitulo4Edson(Neo edson, Scanner scanner) {
        System.out.println("\nCapítulo 4: Aliança com a Resistência\n");
        System.out.println("Edson é levado a tomar uma decisão crítica entre unir-se à resistência ou manter-se leal a Irias.");
        
        System.out.println("Escolha 4:");
        System.out.println("1 - Unir-se à resistência ao lado de Rian e Lilly.");
        System.out.println("2 - Permanecer neutro e tentar negociar uma trégua.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Edson decide unir-se à resistência, fortalecendo sua determinação ao lado de Rian e Lilly.");
        } else {
            System.out.println("Edson opta por permanecer neutro, buscando um meio de negociar uma trégua entre as facções.");
        }
    }

     public static void capitulo4Rian(Naturan rian, Scanner scanner) {
        System.out.println("\nCapítulo 4: Aliança com a Resistência\n");
        System.out.println("Rian lidera uma missão arriscada, tentando evitar que Irias descubra o esconderijo da resistência.");
        
        System.out.println("Escolha 4:");
        System.out.println("1 - Sacrificar-se para salvar seus aliados.");
        System.out.println("2 - Tentar uma retirada estratégica para evitar baixas.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Rian decide sacrificar-se, dando a chance para seus aliados escaparem da descoberta de Irias.");
        } else {
            System.out.println("Rian opta por uma retirada estratégica, garantindo a segurança do grupo, mas sentindo-se culpado pela decisão.");
        }
    }

     public static void capitulo4Vex(Neurax vex, Scanner scanner) {
        System.out.println("\nCapítulo 4: Aliança com a Resistência\n");
        System.out.println("Vex começa a questionar seu papel como guarda e pondera ajudar a resistência.");
        
        System.out.println("Escolha 4:");
        System.out.println("1 - Passar informações sigilosas para a resistência.");
        System.out.println("2 - Informar Irias sobre os planos da resistência.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Vex decide passar informações sigilosas para a resistência, arriscando sua posição para ajudar os Naturans.");
        } else {
            System.out.println("Vex opta por informar Irias, acreditando que isso manterá sua segurança e posição entre os Neos.");
        }
    }
     public static void capitulo5Edson(Neo edson, Scanner scanner) {
        System.out.println("\nCapítulo 5: O Desfecho\n");
        System.out.println("A guerra entre Celestus e Terratomb atinge seu clímax. Edson deve decidir seu destino.");

        System.out.println("Escolha 5:");
        System.out.println("1 - Lutar até o fim pela resistência.");
        System.out.println("2 - Sacrificar-se para tentar salvar ambos os lados.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Edson se junta à resistência, lutando bravamente até o último instante.");
        } else {
            System.out.println("Edson toma a decisão de se sacrificar, na esperança de salvar tanto os Naturans quanto os Neos.");
        }
    }

     public static void capitulo5Rian(Naturan rian, Scanner scanner) {
        System.out.println("\nCapítulo 5: O Desfecho\n");
        System.out.println("Rian decide seu destino no momento final, com a resistência em suas mãos.");

        System.out.println("Escolha 5:");
        System.out.println("1 - Lutar para destruir Irias e Celestus.");
        System.out.println("2 - Inspirar paz e tentar negociar uma trégua.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Rian lidera um ataque final contra Irias, determinado a destruir a opressão de Celestus.");
        } else {
            System.out.println("Rian se levanta em busca da paz, tentando negociar uma trégua entre os lados opostos.");
        }
    }

     public static void capitulo5Vex(Neurax vex, Scanner scanner) {
        System.out.println("\nCapítulo 5: O Desfecho\n");
        System.out.println("Vex encara o destino de Celestus, dividindo-se entre proteger os Neos ou buscar redenção.");

        System.out.println("Escolha 5:");
        System.out.println("1 - Defender Celestus com lealdade a Irias.");
        System.out.println("2 - Unir-se aos Naturans na luta pela liberdade.");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Vex decide defender Celestus, fiel a Irias até o final, mesmo em meio ao caos.");
        } else {
            System.out.println("Vex opta por se unir aos Naturans, buscando sua própria redenção na luta pela liberdade.");
        }
    }

     public static void narrativaInterativa(Personagem personagem, Scanner scanner) {
        if (personagem instanceof Neo) {
            capitulo1Edson((Neo) personagem, scanner);
            capitulo2Edson((Neo) personagem, scanner);
            capitulo3Edson((Neo) personagem, scanner);
            capitulo4Edson((Neo) personagem, scanner);
            capitulo5Edson((Neo) personagem, scanner);
        } else if (personagem instanceof Naturan) {
            capitulo1Rian((Naturan) personagem, scanner);
            capitulo2Rian((Naturan) personagem, scanner);
            capitulo3Rian((Naturan) personagem, scanner);
            capitulo4Rian((Naturan) personagem, scanner);
             capitulo5Rian((Naturan) personagem, scanner);
        } else if (personagem instanceof Neurax) {
            capitulo1Vex((Neurax) personagem, scanner);
            capitulo2Vex((Neurax) personagem, scanner);
            capitulo3Vex((Neurax) personagem, scanner);
            capitulo4Vex((Neurax) personagem, scanner);
             capitulo5Vex((Neurax) personagem, scanner);
        }

} }