 import java.util.Random;

import javax.swing.JOptionPane;

public class Passagem extends Cliente{

    //Atributos
    private String destino;
    private String localEmbarque;
    public String escolha;
    public int diaIda;
    public int mesIda;
    public int anoIda;
    public int diaVolta;
    public int mesVolta;
    public int anoVolta;
    private String onibusAviao;
    private int poltrona;
    private int horario;
    private int codEmbarque;
    private double preco;
    public double precot;

    //Construtor
    
    public Passagem(String n, int dn, int mn, int an, String cpf, String e, int nn, String c, String cp, String em,
            String t, String destino, String localEmbarque, String escolha, int diaIda, int mesIda, int anoIda,
            int diaVolta, int mesVolta, int anoVolta, String onibusAviao, int poltrona, int horario, int codEmbarque,
            double preco, double precot) {
        super(n, dn, mn, an, cpf, e, nn, c, cp, em, t);
        this.destino = destino;
        this.localEmbarque = localEmbarque;
        this.escolha = escolha;
        this.diaIda = diaIda;
        this.mesIda = mesIda;
        this.anoIda = anoIda;
        this.diaVolta = diaVolta;
        this.mesVolta = mesVolta;
        this.anoVolta = anoVolta;
        this.onibusAviao = onibusAviao;
        this.poltrona = poltrona;
        this.horario = horario;
        this.codEmbarque = codEmbarque;
        this.preco = preco;
        this.precot = precot;
    }


    //Metodos de Acessos
    
    //Leitura

    public String getLocalEmbarque() {
        return localEmbarque;
    }

    public String getOnibusAviao() {
        return onibusAviao;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public int getHorario() {
        return horario;
    }

    public int getCodEmbarque() {
        return codEmbarque;
    }
    
    public double getPreco() {
        return preco;
    }

    public String getDestino() {
        return destino;
    }

    //gravação
    public void setLocalEmbarque(String localEmbarque) {
        this.localEmbarque = localEmbarque;
    }



    public void setOnibusAviao(String onibusAviao) {
        this.onibusAviao = onibusAviao;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public void setCodEmbarque(int codEmbarque) {
        this.codEmbarque = codEmbarque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    //Métodos
    
    //Cadastro
    public void cadastraDados(){
        super.cadastraDados();
        JOptionPane.showMessageDialog(null, "\t\t\t\t Compre sua Passagem ");
        localEmbarque= JOptionPane.showInputDialog( "Digite o local de Origem");
        destino = JOptionPane.showInputDialog( "Digite o destino");
        verificaOA();
        verificaIdaEV();
        verificaPol();
        verificaH();
        
        
    }
    
    //Verifica Onibus ou Avião
    public boolean verificaOA(){
        
        //variavel aux
        char verificaOA;

        verificaOA=JOptionPane.showInputDialog( "Digite a letra\n (O) para Ônibus \n (A) para Avião").toUpperCase().charAt(0);
            while( verificaOA!= 'O' && verificaOA != 'A'){
                JOptionPane.showMessageDialog(null,"OPÇÃO INCORRETA!!!");
                verificaOA=JOptionPane.showInputDialog( "Digite a letra\n (O) para Ônibus \n (A) para Avião").toUpperCase().charAt(0);
            }

        if (verificaOA =='O'){
            onibusAviao ="Ônibus";
            precot = 150;
            JOptionPane.showMessageDialog(null, "Você escolheu Ônibus");
            return true;
        }
        else {
            onibusAviao ="Avião";
            precot = 500;
            JOptionPane.showMessageDialog(null, "Você escolheu Avião");
            return false;
        }
    }

    //verifica se é somente ida ou se é ida e volta
    public boolean verificaIdaEV(){
        char verifica;

        verifica=JOptionPane.showInputDialog( null,"Digite\n 1 para somente ida \n 2 para ida e volta").charAt(0);
            while( verifica!= '1' && verifica != '2'){
                JOptionPane.showMessageDialog(null,"VALOR INCORRETO!!!");
                verifica=JOptionPane.showInputDialog( "Digite\n 1 para somente ida \n 2 para ida e volta").charAt(0);
            }
            if (verifica =='1'){
                escolha = "Somente Ida";
                JOptionPane.showMessageDialog(null,"Você escolheu "+escolha);
                verificaDMAI();
                preco = 2;
                return true;
            }
            else{
                escolha = "Ida e Volta";
                JOptionPane.showMessageDialog(null,"Você escolheu "+escolha);
                verificaDMAI();
                verificaDMAV();
                preco = 4;
                return false;
            }
    }

    //verifica Dia Mês e Ano da Ida
    public void verificaDMAI(){
        
        //verificão dia de ida
        diaIda= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite apenas o dia de Ida"));
            while(diaIda>31 || diaIda<0){
                JOptionPane.showMessageDialog(null,"Você digitou o dia incorreto");
                diaIda= Integer.parseInt(JOptionPane.showInputDialog( "Digite apenas o dia de Ida "));
            }

        //verificão mes de ida
        mesIda= Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero do mês de Ida"));
            while(mesIda>12 || mesIda<0){
                JOptionPane.showMessageDialog(null,"Você digitou o mês incorreto");
                mesIda= Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero do mês de Ida"));
            }

        //verificão ano de ida
        anoIda= Integer.parseInt(JOptionPane.showInputDialog( "Digite o ano de Ida"));
            while(anoIda<2022){
                JOptionPane.showMessageDialog(null,"Você digitou o ano incorreto ");
                anoIda= Integer.parseInt(JOptionPane.showInputDialog( "Digite o Ano de Ida"));
            }

        
    }

     //verifica Dia Mês e Ano da Volta
    public void verificaDMAV(){
        //verificão dia de volta
        diaVolta= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite apenas o dia de Volta"));
            while(diaVolta>31 || diaVolta<0){
                JOptionPane.showMessageDialog(null,"Você digitou o dia incorreto");
                diaVolta= Integer.parseInt(JOptionPane.showInputDialog( "Digite apenas dia o de Volta "));
            }

        //verificão mes de volta
        mesVolta= Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero do mês de Volta"));
            while(mesVolta>12 || mesIda<0){
                JOptionPane.showMessageDialog(null,"Você digitou o mês incorreto");
                mesVolta= Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero do mês de Volta"));
            }

        //verificão ano de volta
        anoVolta= Integer.parseInt(JOptionPane.showInputDialog( "Digite o ano de Volta"));
            while(anoVolta<2022){
                JOptionPane.showMessageDialog(null,"Você digitou o ano incorreto");
                anoVolta= Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero do mês de Volta"));
            }

    }


    

    //verifica poltrona
    public void verificaPol(){

        JOptionPane.showMessageDialog(null, "Lembrando que há 30 poltronas disponiveis\n \t\t As de numero impares são na janela");
        poltrona = Integer.parseInt(JOptionPane.showInputDialog( "Digite a poltrona desejada"));
        while( poltrona > 30 ){
            JOptionPane.showMessageDialog(null,"Poltrona incorreta!!!");
            JOptionPane.showMessageDialog(null, "Lembrando que há 30 poltronas disponiveis\n \t\t As de numero impares são na janela");
            poltrona = Integer.parseInt(JOptionPane.showInputDialog( "Digite a poltrona desejada"));
            
        }

    }

    //verifica Hora
    public void verificaH(){

        horario = Integer.parseInt(JOptionPane.showInputDialog("Digite o horario \n Apenas horarios inteiros"));
        while( horario > 23){
            JOptionPane.showMessageDialog(null,"Horario incorreto!!!");
            JOptionPane.showMessageDialog(null, "Lembrando Apenas horarios inteiros");
            horario = Integer.parseInt(JOptionPane.showInputDialog( "Digite o horario"));
            
        }

    }

    //calcula o preço da passagem
    public double precoP(){
        preco= preco*precot;
        return preco;
    }
    
     //para gerar o código de embarque
    public int geradorCod(){
       
                Random aleatorio = new Random();
                int valor = aleatorio.nextInt(10000);
            
                codEmbarque = valor;

                return codEmbarque;
         
    }
    
    //Mostra os dados
    public String toString(){

        String aux = " ";
        if(aux == " "){
        super.toString();
        JOptionPane.showMessageDialog(null, "\t\t\t ** Passagem **\n" +"\nLocal de Origem: "+ localEmbarque+ "\nDestino: "+ destino +"\nTipo de Transporte: "
        +onibusAviao+ "\nEscolhido: "+ escolha + "\nData de ida: " + diaIda + "/" + mesIda + "/"+ anoIda +"\nData de Volta: " + diaVolta + "/" + mesVolta + "/"+ anoVolta 
        +"\nPoltrona: "+ poltrona + "\nHorario: "+ horario + " horas"+ "\nPreço: "+ preco+ "\nCodigo Passagem: "+geradorCod());
        }
        return aux;

    }


}