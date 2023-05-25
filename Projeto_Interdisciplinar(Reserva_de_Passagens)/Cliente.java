import javax.swing.JOptionPane;

public class Cliente{
    //atributos
    public String nome;
    public int diaNasc;
    public int mesNasc;
    public int anoNasc;
    protected String nCpf;
    protected String endereco;
    protected int numero;
    protected String complemento;
    protected String cep;
    protected String email;
    protected String telefone;


    //construtores
    //padrão
    public Cliente(){}

    //com parametros
    public Cliente (String n, int dn, int mn, int an, String cpf, String e, int nn, String c, String cp, String em, String t){
        this.nome = n;
        this.diaNasc = dn;
        this.mesNasc = mn;
        this.anoNasc = an;
        this.nCpf = cpf;
        this.endereco = e;
        this.numero = nn;
        this.complemento = c;
        this.cep = cp;
        this.email = em;
        this.telefone = t;
    }

    //métodos

    //metodos de acesso

    //leitura
    public String getnCpf() {
        return nCpf;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }

    //gravação
    public void setnCpf(String nCpf) {
        this.nCpf = nCpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //sem retorno e sem parametros
    public void cadastraDados(){
        JOptionPane.showMessageDialog(null, "\t\t\t\t Digite os dados para comprar sua Passagem ");
        nome = JOptionPane.showInputDialog(null, "Digite o nome completo ");
        verificaIdade();
        endereco = JOptionPane.showInputDialog(null, "Digite o endereço ex: rua,av,alameda ");
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero "));
        complemento = JOptionPane.showInputDialog(null, "Digite o complemento ");
        cep = JOptionPane.showInputDialog(null, "Digite o cep ");
        nCpf = JOptionPane.showInputDialog(null, "Digite o numero do CPF ");
        email = JOptionPane.showInputDialog(null, "Digite o Email ");
        telefone = JOptionPane.showInputDialog(null, "Digite o telefone com DDD ");
        

    }

    //verifica dia mes e ano de Nascimento
    public void verificaIdade(){
        
        //verificão dia de Nascimento
        diaNasc= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite apenas o dia de Nascimento"));
            while(diaNasc>31 || diaNasc<0){
                JOptionPane.showMessageDialog(null,"Você digitou o dia incorreto");
                diaNasc= Integer.parseInt(JOptionPane.showInputDialog( "Digite apenas o dia de Nascimento "));
            }

        //verificão mes de Nascimento
        mesNasc= Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero do mês de Nascimento"));
            while(mesNasc>12 || mesNasc<0){
                JOptionPane.showMessageDialog(null,"Você digitou o mês incorreto");
                mesNasc= Integer.parseInt(JOptionPane.showInputDialog( "Digite o numero do mês de Nascimento"));
            }

        //verificão ano de Nascimento
        anoNasc= Integer.parseInt(JOptionPane.showInputDialog( "Digite o ano de Nascimento"));
            while(anoNasc<1902 || anoNasc>2022){
                JOptionPane.showMessageDialog(null,"Você digitou o ano incorreto ");
                anoNasc= Integer.parseInt(JOptionPane.showInputDialog( "Digite o Ano de Nascimento"));
            }

        
    }
     
    //sem retorno e sem parametro
     public String toString(){
        String aux = " ";
        if(aux == " "){ }
        JOptionPane.showMessageDialog(null,"\t\t\t ** Cliente **\n" +"Nome: " + nome + "\nData de nascimento: " +  diaNasc + "/" + mesNasc + "/" + 
        anoNasc + "\nNumero do CPF:" + nCpf + "\nEndereço: " + endereco + "\nNumero: " + numero + "\nComplemento: " + complemento + "\nCEP: " 
        + cep + "\nE-mail: " + email + "\nTelefone: " + telefone);
        return aux;
      
    }

}