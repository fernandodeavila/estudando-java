import java.util.Scanner;

public class EstudoEstruturas {
    public static void main(String[] args) {
        //Scanner - permite a leitura de dados do teclado
        Scanner entrada = new Scanner (System.in);
        String nome = entrada.nextLine();


        System.out.println(nome);

        System.out.println("Digite seu nome");

        System.out.println("Digite sua altura:");
        double altura = entrada.nextDouble(); // next se refere ao resultado scaneado pelo entrada
        System.out.println("-----------------");
        System.out.println("Digite blaba");
        int total = entrada.nextInt();
        int i=0;
        while(i<total){
            System.out.println("Btata");
            i++;
        }
        





    }
}
