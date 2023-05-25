import javax.swing.JOptionPane;

public class CompraPassagem{
    public static void main(String[] args) {
        //variavel Aux
        int qtdpassagem;
        int tipo;
        String resp;

        do{
            tipo = Integer.parseInt(JOptionPane.showInputDialog(" Bem vindo ao programa de Compra de Passagens\n 1 para Comprar \n 2 para Sair"));
            switch(tipo){
                case 1:
                //Cria o objeto
                Cliente acervo[];
                //instanciação do vetor
                 acervo = new Cliente[60];
         
                 qtdpassagem = Integer.parseInt(JOptionPane.showInputDialog(
                 "Digite a quantidade de Passagens que deseja comprar"));
         
                 while (qtdpassagem>60){
                     JOptionPane.showMessageDialog(null, "No momento só temos 60 Passagens disponíveis\n contando com 30 lugares para Onibus\n 30 lugares para Avião");
                     qtdpassagem = Integer.parseInt(JOptionPane.showInputDialog(
                 "Digite a quantidade de Passagens que deseja comprar"));
                 }
              
                 for (int i = 0; i < qtdpassagem; i++) {

                    acervo[i]= new Passagem(null, i, i, i, null, null, i, null, null, null, null, null, null, 
                    null, i, i, i, i, i, i, null, i, i, i, qtdpassagem, i);
                    
                     acervo[i].cadastraDados();
                     acervo[i].toString();
                 }
                    
                    break;
                case 2:
                System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Invalida");
                    break;

            }
            resp = JOptionPane.showInputDialog("Deseja Continuar? (S/N)");
        }while(resp.equalsIgnoreCase("s"));
    

    
        
  
}
}