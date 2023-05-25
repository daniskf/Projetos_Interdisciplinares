algoritmo CompraPassagem
inicio
	caractere resp;
	inteiro tipo,qtdpassagem;
	real preco, precot;
	literal nome[60],nCpf[60],endereco[60],complemento[60],cep[60],email[60],telefone[60],
			destino[60], localEmbarque[60], escolha[60], onibusAviao[60], poltrona[60], codEmbarque[60];
	inteiro diaNasc[60],mesNasc[60],anoNasc[60],numero[60],diaIda[60], mesIda[60], anoIda[60],
			diaVolta[60], mesVolta[60], anoVolta[60], poltrona[60], horario[60];	
	
	
	resp = 'S'
	
	faça{
		escreva("/t/t/t Bem vindo ao programa de Compra de Passagens\n 1 para Comprar \n 2 para Sair");
		leia(tipo);
		escolha(tipo){
			caso 1:
				escreva("Digite a quantidade de passagem que deseja comprar");
				leia(qtdpassagem);
				enquanto(qtdpassagem>60 ou qtdpassagem<0){
					escreva("Desculpe no momento só temos 60 Passagens disponíveis\n contando com 30 lugares para Onibus\n 30 lugares para Avião");
					escreva("Digite a quantidade de passagem que deseja comprar");
					leia(qtdpassagem);
				}
				inteiro i;
				//cadastra dados
				para(i=0;i<qtdpassagem;i++){
					escreva("Digite os dados para compra da pessagem");
					escreva("Digite seu nome completo: ");
					leia(nome[i]);
					verificaIdade();
					escreva("Digite seu endereço ex: rua,av,alameda: ");
					leia(endereco[i]);
					escreva("Digite o numero: ");
					leia(numero[i]);
					escreva("Digite o complemento: ");
					leia(completo[i]);
					escreva("Digite o cep: ");
					leia(cep[i]);
					escreva("Digite o cpf: ");
					leia(nCpf[i]);
					escreva("Digite email: ");
					leia(email[i]);
					escreva("Digite o telefone: ");
					leia(telefone[i]);
					escreva ("\t\t\t\t Compre sua Passagem\n");
					escreva ("Digite o local de origem: ");
					leia (localEmbarque[i]);
					escreva ("Digite o destino: ");
					leia (destino[i]);
					verificaOA();
					verificaIdaEV();
					verificaPol();
					verificaH();
				}
				//mostra dados
				para(i=0;i<qtdpassagem;i++){
					//Dados Cliente
					escreva("\t\t\t ** Cliente **\n" +"Nome: " + nome[i] + "\nData de nascimento: " +  diaNasc[i] + "/" + mesNasc[i] + "/" + 
					anoNasc[i] + "\nNumero do CPF:" + nCpf[i] + "\nEndereço: " + endereco[i] + "\nNumero: " + numero[i] + "\nComplemento: " + 
					complemento[i] + "\nCEP: " + cep[i] + "\nE-mail: " + email[i] + "\nTelefone: " + telefone[i]);
					//Dados da Passagem
					escreva("\t\t\t ** Passagem **\n" +"\nLocal de Origem: "+ localEmbarque[i]+ "\nDestino: "+ destino[i] +"\nTipo de Transporte: "
					+onibusAviao[i]+ "\nEscolhido: "+ escolha[i] + "\nData de ida: " + diaIda[i] + "/" + mesIda[i] + "/"+ anoIda[i] +"\nData de Volta: " 
					+ diaVolta[i] + "/" + mesVolta[i] + "/"+ anoVolta[i] +"\nPoltrona: "+ poltrona[i] + "\nHorario: "+ horario[i] + " horas"+ "\nPreço: "
					+ preco+ "\nCodigo Passagem: "+geradorCod());
				}
				
			escreva("Deseja continuar? (S/N)");
			leia(resp);
			
			pare ;
			
			caso 2:
			
			resp = 'N';
			pare ;
			
			padrao:
			
			escreva("Opção Invalida");
			
			escreva("Deseja continuar? (S/N)");
			leia(resp);
			pare ;
			}
			
		
	
	}enquanto(resp == 's' ou resp == 'S');
	
	//metodos
	
	inicio
	 //verifica a idade
		void verificaIdade(){
		
			escreva("Digite apenas o dia de nascimento");
			leia(diaNasc[i]);
			enquanto(diaNasc[i]>31 ou diaNasc[i]<0){
				escreva("Você digitou o dia incorreto !!!");
				escreva("Digite apenas o dia de nascimento");
				leia(diaNasc[i]);
			}
			escreva("Digite mês de nascimento");
			leia(mesNasc[i]);
			enquanto(mesNasc[i]>12 ou mesNasc[i]<0){
				escreva("Você digitou o dia incorreto !!!");
				escreva("Digite o mês de nascimento");
				leia(mesNasc[i]);
			}
			escreva("Digite o ano de nascimento");
			leia(anoNasc[i]);
				enquanto(anoNasc[i]>2022 ou anoNasc[i]<1902){
				escreva("Você digitou o ano incorreto !!!");
				escreva("Digite o ano de nascimento");
				leia(anoNasc[i]);
			}

		}
	fim
	
	inicio 
	  //Verifica Onibus ou Avião
		logico verificaOA(){
		
			caractere verificaOA;
			escreva("Digite a letra\n (O) para Ônibus \n (A) para Avião");
			leia(verificaOA);
			enquanto (verificaOA!= 'O' e verificaOA!= 'A' e verificaOA!='o' e verificaOA'a') {
				escreva ("OPÇÃO INCORRETA!!!");
				escreva ("Digite a letra\n (O) para Ônibus \n (A) para Avião");
			}
			se(verificaOA == 'o'ou verificaOA == 'O'){
				onibusAviao[i] ="Ônibus";
				//acrescenta o valor do preço para escolha do veiculo
				precot = 150;
				escreva ("Você escolheu Ônibus");
				retorno verdadeiro
			}
			senao {
				onibusAviao[i] ="Avião";
				//acrescenta o valor do preço para escolha do veiculo
				precot = 500;
				escreva ("você escolheu Avião");
				retorno falso
			}
		}
	fim
	
		
	
	inicio
	 //verifica se é somente ida ou se é ida e volta
		logico verificaIdaEV(){
			caractere verifica;
			escreva ("Digite 1 para somente ida ou 2 para ida e volta");
			enquanto (verifica!= '1' e verifica != '2'){
				escreva("VALOR INCORRETO!!!");
				escreva ("Digite 1 para somente ida ou 2 para ida e volta");
			}
			se (verifica =='1'){
				escolha[i] = "somente Ida"
				leia ("Você escolheu "+escolha[i])
				verificaDMAI();
				//multiplica o valor de acordo com a escolha 
				preco = 2;
				retorno verdadeiro;
			}
			senao{
				escolha[i] = "Ida e Volta";
				leia ("Você escolheu "+escolha[i]);
				verificaDMAI();
				verificaDMAV();
				//multiplica o valor de acordo com a escolha 
				preco = 4;
				retorno falso;
			}
		}
	fim
	
	inicio
	 //verifica Dia Mês e Ano da Ida
		void verificaDMAI(){
			escreva ("Digite o dia de Ida");
			leia(diaIda[i]);
			enquanto (diaIda[i]>31 ou diaIda[i]<0){
				escreva ("Você digitou o dia incorreto !!!");
				escreva ("Digite o dia de Ida: ");
				leia(diaIda[i]);
			}
	
			escreva ("Digite o numero do mês de Ida");
			leia(mesIda[i]);
			enquanto(mesIda[i]>12 ou mesIda[i]<0){
				escreva ("Você digitou o mês incorreto !!!");
				escreva ("Digite o numero do mês de Ida:");
				leia(mesIda[i]);
			}

			escreva ("Digite o ano de Ida");
			leia(anoIda[i]);
			enquanto(anoIda[i]<2022){
				escreva ("Você digitou o ano incorreto !!!");
				escreva ("Digite o Ano de Ida: ");
				leia(anoIda[i]);
			}
		}
	fim
	
	inicio
	   //verifica Dia Mês e Ano da Volta
		void verificaDMAV(){
			escreva ("Digite o dia de Volta");
			leia(diaVolta[i]);
			enquanto(diaVolta[i]>31 ou diaVolta[i]<0){
				escreva("Você digitou o dia incorreto");
				escreva ("Digite o dia de Volta");
				leia(diaVolta[i]);
			}
	
			escreva ("Digite o numero do mês de Volta");
			leia(mesVolta);
			enquanto (mesVolta[i]>12 ou mesIda[i]<0){
				escreva ("Você digitou o mês incorreto");
				escreva ("Digite o numero do mês de Volta");
				leia(mesVolta[i]);
			}
	
			escreva ("Digite o ano de Volta");
			leia(anoVolta[i]);
			enquanto(anoVolta[i]<2022){
				escreva ("Você digitou o ano incorreto \n por enquanto ainda não fazemos viagem para o passado :( ");
				escreva ("Digite o numero do ano de Volta");
				leia(anoVolta[i]);
			}
		}
	
	fim
	
	inicio
	 //verifica poltrona
		void verificaPol(){
			escreva ("Lembrando que há 30 poltronas disponiveis\n \t\t As de numero impares são na janela");
			escreva ("Digite a poltrona desejada");
			leia(poltrona[i]);
			enquanto ( poltrona > 30 ){
				escreva("Poltrona incorreta!!!");
				escreva ("Digite a poltrona desejada");
				leia(poltrona[i]);
			}
		}
	fim
	
	inicio
	 //verifica Hora
		void verificaH(){
			escreva ("\t\t Digite o horario\n Apenas horarios inteiros");
			leia(horario[i]);
			enquanto( horario > 23 ){
				escreva ("Horario incorreto!!!");
				escreva("Lembrando Apenas horarios inteiros");
				escreva ("Digite o horario");
				leia(horario[i]);
			}
		}
	fim
	
	inicio
	 //calcula o preço da passagem
		real precoP(){
			preco= preco*precot;
			retorno preco;
		}
	
	fim
	
	inicio
		literal geradorCod(){
			inteiro aleatorio;
			literal s;
			s="";
			
			para(num=0;num<7;num++){
				aleatorio = rand(100);
				codEmbarque[i]=aleatorio+s;
			}
			
			retorno codEmbarque;
		}
	
	fim
	
fim

