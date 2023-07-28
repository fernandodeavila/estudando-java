import java.util.Scanner;

public class AtividadeJava1 {
    public static void main(String[] args){
        //Validar campo
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu email:");
            String email = scanner.nextLine();
            System.out.println("Digite sua senha:");
            String senha = scanner.nextLine();

            if(!(email.contains("@soulcode.com") && senha.length()>8)){
                System.out.println("Email ou senha invalidos");
            }else {
                System.out.println("Login feito com sucesso");
            }

        //Definir vetores

            int[] vetor1 = {1,2,3,4,5};
            int[] vetor2 = {1,2,3,4,5};

            int[] vetor3 = new int[5];

            for(int i = 0; i< vetor3.length; i++ ){
                vetor3[i] = vetor1[i] + vetor2[i];
                System.out.println(vetor3[i]);

            }





    }
}
