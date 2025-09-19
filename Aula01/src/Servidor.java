import java.net.*;
import java.io.*;


public class Servidor {
    public static void main(String[] args) throws Exception {
        ServerSocket servidor = new ServerSocket(13356);
        System.out.println("Servidor aguardando 2 clientes...");


        // Conectar Cliente A
        Socket clienteA = servidor.accept();
        System.out.println("Cliente A conectado!");
        BufferedReader inA = new BufferedReader(new InputStreamReader(clienteA.getInputStream()));
        PrintWriter outA = new PrintWriter(clienteA.getOutputStream(), true);


        // Conectar Cliente B
        Socket clienteB = servidor.accept();
        System.out.println("Cliente B conectado!");
        BufferedReader inB = new BufferedReader(new InputStreamReader(clienteB.getInputStream()));
        PrintWriter outB = new PrintWriter(clienteB.getOutputStream(), true);


        // recee do servidor
        String Fefa = inA.readLine();
        String Mars = inB.readLine();


        // Comparar pedra papel tesoura


        if(Fefa.equals("Tesoura")&& Mars.equals("Pedra")){
            outB.println("Infelizmente você perdeu!");
            outA.println("Parabéns, você ganhou!");
        }


        else if (Fefa.equals("Tesoura")&& Mars.equals("Papel")){
            outA.println("Parabéns, você ganhou!");
            outB.println("Infelizmente você perdeu!");




        }
        else if (Fefa.equals("Tesoura")&& Mars.equals("Tesoura")){
            outA.println("Deu empate");
            outB.println("Deu empate");


        }


        else if (Fefa.equals("Pedra")&& Mars.equals("Tesoura")){
            outA.println("Parabéns, você ganhou!");
            outB.println("Infelizmente você perdeu!");


        }


        else if (Fefa.equals("Pedra")&& Mars.equals("Papel")){
            outB.println("Infelizmente você perdeu!");
            outA.println("Parabéns, você ganhou!");
        }



        else if (Fefa.equals("Pedra")&& Mars.equals("Pedra")){
            outA.println("Deu empate");
            outB.println("Deu empate");


        }


        else if (Fefa.equals("Papel")&& Mars.equals("Pedra")){
            outA.println("Parabéns, você ganhou!");
            outB.println("Infelizmente você perdeu!");


        }


        else if (Fefa.equals("Papel")&& Mars.equals("Tesoura")){
            outB.println("Infelizmente você perdeu!");
            outA.println("Parabéns, você ganhou!");


        }
        else if (Fefa.equals("Papel")&& Mars.equals("Papel")){
            outA.println("Deu empate");
            outB.println("Deu empate");


        }






        // Fechar conexões
        clienteA.close();
        clienteB.close();
        servidor.close();
    }
}




