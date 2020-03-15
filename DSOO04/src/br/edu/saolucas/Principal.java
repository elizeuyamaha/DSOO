package br.edu.saolucas;
import javax.swing.JOptionPane;
import br.edu.saolucas.modelos.Bovina;


public class Principal {

	public static void main(String[] args) {


		
		Bovina boiBonito = new Bovina();
		Bovina vacaMimosa = new Bovina();
		
		int opcao;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu"+"\n"
					+"1 - cadastrar boiBonito"+"\n"
					+"2 - cadastrar vacaMimosa"+"\n"
					+"3 - Exibir boiBonito"+"\n"
					+"4 - Exibir vabaMimosa"+"\n"
					+"9 - Sair"
					));		
			
			if (opcao == 1){
				boiBonito.atribuirData_nasc(JOptionPane.showInputDialog("Digite a Data de Nascimento "));
				boiBonito.atribuirPeso_inicial(Float.valueOf(JOptionPane.showInputDialog("Digite o peso Inicial ")));
				boiBonito.atribuirPeso_final(Float.valueOf(JOptionPane.showInputDialog("Digite O Peso Final ")));
				boiBonito.atribuirRaca(JOptionPane.showInputDialog("Digite a Raca "));
				boiBonito.atribuirTipo(JOptionPane.showInputDialog("Digite o Tipo: 'Bezerro (a), Vaca (Boi), Nuvilha(Garrote), etc.'"));
			} else if (opcao == 2) {
				vacaMimosa.atribuirData_nasc(JOptionPane.showInputDialog("Digite a Data de Nascimento "));
				vacaMimosa.atribuirPeso_inicial(Float.valueOf(JOptionPane.showInputDialog("Digite o peso Inicial ")));
				vacaMimosa.atribuirPeso_final(Float.valueOf(JOptionPane.showInputDialog("Digite O Peso Final ")));
				vacaMimosa.atribuirRaca(JOptionPane.showInputDialog("Digite a Raca "));
			} else if (opcao == 3) {
				JOptionPane.showMessageDialog(null, 
						"Este Animal Nasceu em:  "+boiBonito.pegarData_nasc() + "\n" +
						"Seu peso Inicial foi:  "+boiBonito.pegarPeso_inicial() + "\n" +
						"É um(a):  "+boiBonito.pegarTipo() + "\n" +
						"Seu peso Final foi:  "+boiBonito.pegarPeso_final() + "\n" +
						"Sua Raca é:  "+boiBonito.pegarRaca());
			} else if (opcao == 4) {
				JOptionPane.showMessageDialog(null, 
						"Este Animal Nasceu em:  "+vacaMimosa.pegarData_nasc() + "\n" +
						"Seu peso Inicial foi:  "+vacaMimosa.pegarPeso_inicial() + "\n" +
						"É um(a):  "+vacaMimosa.pegarTipo() + "\n" +
						"Seu peso Final foi:  "+vacaMimosa.pegarPeso_final() + "\n" +
						"Sua Raca é:  "+vacaMimosa.pegarRaca());
			}
			
		} while (opcao != 9);
		
		
		

		

		}

}
