import java.util.Scanner;
import java.util.Random;
public class jogoVelha {
    public jogoVelha(){
    }
    public void ImprimeMatriz (char[][] tabuleiro, int posicaoTeclado, int jogadorInicial,String[] jogadores, char[] caracteres, Scanner sc){
        for(int i =0; i < 3; i++){
            for(int j=0; j<3; j++){
                tabuleiro[i][j] = ' ';
            }
        }
        while(verificaFim(tabuleiro) == 0){
            if(proximoJogador(jogadorInicial) == 1){
                jogadorInicial = 1;
                System.out.println("Turno do jogador " + jogadores[1]);
            }else{
                jogadorInicial =0;
                System.out.println("Turno do jogador " + jogadores[0]);
            }
            System.out.println("Esta é a situação do tabuleiro faça seu movimento");
            System.out.println(tabuleiro[0][0] + "|" + tabuleiro[0][1] + "|" + tabuleiro [0][2]);
            System.out.println("-----");
            System.out.println(tabuleiro[1][0] + "|" + tabuleiro[1][1] + "|" + tabuleiro[1][2]);
            System.out.println("-----");
            System.out.println(tabuleiro[2][0] + "|" + tabuleiro[2][1] + "|" + tabuleiro[2][2]);
            posicaoTeclado = sc.nextInt();
            boolean movimentoValido = false;
            while(movimentoValido == false){
                while(posicaoTeclado <1 || posicaoTeclado >9){
                    System.out.println("o valor inserido é fora do range favor utilizar um valor entre 1 e 9");
                    posicaoTeclado = sc.nextInt();
                }
                switch (posicaoTeclado){
                    case 1:
                    if(tabuleiro[2][0] == ' ' && jogadorInicial ==1){
                        movimentoValido = true;
                        tabuleiro[2][0] = caracteres[1];
                    }else if(tabuleiro[2][0] == ' ' && jogadorInicial ==0){
                        movimentoValido = true;
                        tabuleiro[2][0] = caracteres[0];
                    }else{
                        movimentoValido = false;
                        System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                    }
                    break;
                    case 2:
                    if(tabuleiro[2][1] == ' ' && jogadorInicial ==1){
                        movimentoValido = true;
                        tabuleiro[2][1] = caracteres[1];
                    }else if(tabuleiro[2][1] == ' ' && jogadorInicial ==0){
                        movimentoValido = true;
                        tabuleiro[2][1] = caracteres[0];
                    }else{
                        movimentoValido = false;
                        System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                    }
                    break;
                    case 3:
                    if(tabuleiro[2][2] == ' ' && jogadorInicial ==1){
                        movimentoValido = true;
                        tabuleiro [2][2] = caracteres[1];
                    }else if(tabuleiro[2][2] == ' ' && jogadorInicial ==0){
                        movimentoValido = true;
                        tabuleiro[2][2] = caracteres[0];
                    }else{
                        movimentoValido = false;
                        System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                    }
                    break;
                    case 4:
                    if(tabuleiro[1][0] == ' ' && jogadorInicial ==1){
                        movimentoValido = true;
                        tabuleiro[1][0] = caracteres[1];
                    }else if(tabuleiro[1][0] == ' ' && jogadorInicial ==0){
                        movimentoValido = true;
                        tabuleiro[1][0] = caracteres[0];
                    }else{
                        movimentoValido = false;
                        System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                    }
                    break;
                    case 5:
                    if(tabuleiro[1][1] == ' ' && jogadorInicial ==1){
                        movimentoValido = true;
                        tabuleiro[1][1] = caracteres[1];
                    }else if(tabuleiro[1][1] == ' ' && jogadorInicial ==0){
                        movimentoValido = true;
                        tabuleiro[1][1] = caracteres[0];
                    }else{
                        movimentoValido = false;
                        System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                    }
                    break;
                    case 6:
                    if(tabuleiro[1][2] == ' ' && jogadorInicial ==1){
                        movimentoValido = true;
                        tabuleiro[1][2] = caracteres[1];
                    }else if(tabuleiro[1][2] == ' ' && jogadorInicial ==0){
                        movimentoValido = true;
                        tabuleiro[1][2] = caracteres[0];
                    }else{
                        movimentoValido = false;
                        System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                    }
                    break;
                    case 7:
                    if(tabuleiro[0][0] == ' ' && jogadorInicial ==1){
                        movimentoValido = true;
                        tabuleiro[0][0] = caracteres[1];
                    }else if(tabuleiro[0][0] == ' ' && jogadorInicial ==0){
                        movimentoValido = true;
                        tabuleiro[0][0] = caracteres[0];
                    }else{
                        movimentoValido = false;
                        System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                    }
                    break;
                    case 8:
                    if(tabuleiro[0][1] == ' ' && jogadorInicial ==1){
                        movimentoValido = true;
                        tabuleiro[0][1] = caracteres[1];
                    }else if(tabuleiro[0][1] == ' ' && jogadorInicial ==0){
                        movimentoValido = true;
                        tabuleiro[0][1] = caracteres[0];
                    }else{
                        movimentoValido = false;
                        System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                    }
                    break;
                    case 9:
                    if(tabuleiro[0][2] == ' ' && jogadorInicial ==1){
                        movimentoValido = true;
                        tabuleiro[0][2] = caracteres[1];
                    }else if(tabuleiro[0][2] == ' ' && jogadorInicial ==0){
                        movimentoValido = true;
                        tabuleiro[0][2] = caracteres[0];
                    }else{
                        movimentoValido = false;
                        System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                    }
                    break;
                    default:
                    movimentoValido = false;
                    System.out.println("O valor inserido é equivalente a uma casa ocupada favor usar outro valor");
                    posicaoTeclado = sc.nextInt();
                }
            }
        }
        if (verificaFim(tabuleiro) == 1 && jogadorInicial ==1){
            System.out.println( jogadores[1] + " ,parabéns você é o vencedor");
            escreveMenu(sc, jogadores);
            CaractereUsuario(caracteres, sc);
            proximoJogador(jogadorInicial);
            ImprimeMatriz(tabuleiro, posicaoTeclado, jogadorInicial, jogadores, caracteres, sc);
        }else if(verificaFim(tabuleiro) == 1 && jogadorInicial == 0){
            System.out.println(jogadores[0] + ", parabéns você é o vencedor");
            escreveMenu(sc, jogadores);
            CaractereUsuario(caracteres, sc);
            proximoJogador(jogadorInicial);
            ImprimeMatriz(tabuleiro, posicaoTeclado, jogadorInicial, jogadores, caracteres, sc);
        }else{
            System.out.println("O jogo deu empate");
            escreveMenu(sc, jogadores);
            CaractereUsuario(caracteres, sc);
            proximoJogador(jogadorInicial);
            ImprimeMatriz(tabuleiro, posicaoTeclado, jogadorInicial, jogadores, caracteres, sc);
        }
    }
    public int proximoJogador(int jogadorInicial){
        System.out.println(jogadorInicial + "dentro do metodo");
        if(jogadorInicial == 1){
            jogadorInicial = 0;
        }else if( jogadorInicial ==0){
            jogadorInicial =1;
        }
        return jogadorInicial;
    }
    public int verificaFim(char[][] tabuleiro){
        int ganhador = 0;
        if(tabuleiro[0][0] != ' ' && tabuleiro[0][1] != ' ' && tabuleiro[0][2] != ' '){
        if(tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2]){
            ganhador = 1;
        }
        } if(tabuleiro[1][0] != ' ' && tabuleiro[1][1] != ' ' && tabuleiro[1][2] != ' '){
            if(tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2]){
                ganhador = 1;
            }
        } if(tabuleiro[2][0] != ' ' && tabuleiro[2][1] != ' ' && tabuleiro[2][2] != ' '){
            if(tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2]){
                ganhador = 1;
            }
        } if(tabuleiro[0][0] != ' ' && tabuleiro[1][0] != ' ' && tabuleiro[2][0] != ' '){
            if(tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0]){
                ganhador = 1;
            }
        } if(tabuleiro[0][1] != ' ' && tabuleiro [1][1] != ' ' && tabuleiro[2][1] != ' '){
            if(tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro [1][1] == tabuleiro[2][1]){
                ganhador = 1;
            }
        } if(tabuleiro[0][2] != ' ' && tabuleiro[1][2] != ' ' && tabuleiro[2][2] != ' '){
            if(tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2]){
                ganhador = 1;
            }
        } if(tabuleiro[0][0] != ' ' && tabuleiro[1][1] != ' ' && tabuleiro[2][2]!= ' '){
            if(tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]){
                ganhador = 1;
            }
        } if(tabuleiro[0][2] != ' ' && tabuleiro[1][1] != ' ' && tabuleiro[2][0] != ' '){
            if(tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]){
                ganhador = 1;
            }
        } if(tabuleiro[0][0] != ' ' && tabuleiro[0][1] != ' ' && tabuleiro[0][2] != ' ' && tabuleiro[1][0] != ' ' && tabuleiro[1][1] != ' ' && tabuleiro[1][2] != ' ' && tabuleiro[2][0] != ' ' && tabuleiro[2][1] != ' ' && tabuleiro[2][2] != ' '){
            ganhador = 2;
        }
        return ganhador;
     }
    public void escreveMenu(Scanner sc,String[] jogadores){
        System.out.println("Favor inserir o nome do jogador 1");
        jogadores[0] = sc.next();
        System.out.println("Favor inserir o nome do jogador 2");
        jogadores[1] = sc.next();
        int inputInicial = 0;
        while(inputInicial < 1 || inputInicial > 3){
        System.out.println("Pressione 1 para iniciar o jogo");
        System.out.println("Pressione 2 para mudar o nome dos jogadores");
        System.out.println("Pressione 3 para sair do jogo");
        inputInicial = sc.nextInt();
        }
        if(inputInicial == 1){
        }else if(inputInicial == 2){
        escreveMenu(sc,jogadores);
        }else System.exit(0);
    }
    public void CaractereUsuario(char[] caracteres, Scanner sc){
        System.out.println("Favor inserir o caractere que irá lhe representar no jogo jogador 1 ");
        caracteres[0] = sc.next().charAt(0);
        System.out.println("Favor inserir o caractere que irá lhe representar no jogo jogador 2 ");
        caracteres[1] = sc.next().charAt(0);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    jogoVelha jl = new jogoVelha();
    char[][] tabuleiro = new char[3][3];
    char[] caracteres = new char[2];
    String[] jogadores = new String[2];
    int posicaoTeclado = 0;
    int jogadorInicial = rand.nextInt(2);
    System.out.println(jogadorInicial + " antes");
    //int jogadorInicial = 1;
    jl.escreveMenu(sc,jogadores);
    jl.CaractereUsuario(caracteres, sc);
    jl.ImprimeMatriz(tabuleiro, posicaoTeclado, jogadorInicial, jogadores, caracteres, sc);
}
}
