import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carrin = new Carro();
        carrin.setModelo("gol bolinha");
        carrin.setPlaca(04554);
        carrin.setAno(2014);
        carrin.setVelocidade(30.0);
        carrin.setQntCombustivel(540.0);
        carrin.setMaxCombustivel(600.0);
        
        int flag = -1;
        while(flag == -1){
        
            System.out.println("Escolha sua opção:\n1-Acelerar\n2-Frear\n3-Abastecer\n4-Imprimir\n0-Sair\n>");
            
            int op = scanner.nextInt();
    
            switch(op){
                
                case 0:
                flag = 1;
                case 1:
                carrin.Acelerar(carrin.getVelocidade(), carrin.getQntCombustivel());
                break;
                case 2:
                carrin.Freiar(carrin.getVelocidade());
                break;
                case 3:
                System.out.println("Quanto deseja abastecer?");
                Double abastecer = scanner.nextDouble();
                carrin.abastece(carrin.getQntCombustivel(), carrin.getMaxCombustivel(), abastecer);
                break;
                case 4:
                System.out.println(carrin.toString());
                default:
                break;
            }
        }
        scanner.close();
    }
}
