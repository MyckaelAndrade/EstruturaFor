package estruturafor;

/**
 * @since 15/11/2023
 * @author myckazs
 */
public class EstruturaFor {

    public static void main(String[] args) {
        //Imprimir codigo de 1 a 100
        System.out.println("Estrutura padrão for: \n");
        int i = 1;
        System.out.println(i);
        for (int c = 10; c <= 100; c += 10) { //Variavel de controle
            System.out.println(c);
        }

        System.out.println("\n======================\n");

        System.out.println("Laço for de forma aninhada: \n");
        //Laço aninhado
        for (int c = 1; c <= 3; c++) { // Imprimir o 0, 3x
            for (int a = 0; a <= 0; a++) {
                System.out.println(a);
            }
        }
    }

}
