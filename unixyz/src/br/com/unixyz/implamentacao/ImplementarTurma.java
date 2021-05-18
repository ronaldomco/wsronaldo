package br.com.unixyz.implamentacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;

public class ImplementarTurma {

	public static void main(String[] args) {

		Turma turma = new Turma
				(
					Integer.parseInt(JOptionPane.showInputDialog("Código")),
					JOptionPane.showInputDialog("Nome").toUpperCase(),
					JOptionPane.showInputDialog("Período").toUpperCase(),
					new Aluno
					(
						Integer.parseInt(JOptionPane.showInputDialog("RM")),
						JOptionPane.showInputDialog("Nome").toUpperCase(),
						JOptionPane.showInputDialog("Email").toLowerCase(),
						JOptionPane.showInputDialog("Fone"),
						JOptionPane.showInputDialog("CPF"),
						new Endereco
						(
								JOptionPane.showInputDialog("Logradouro").toUpperCase(),
								JOptionPane.showInputDialog("Bairro").toUpperCase(),
								JOptionPane.showInputDialog("Cidade").toUpperCase(),
								JOptionPane.showInputDialog("Estado").toUpperCase(),
								JOptionPane.showInputDialog("CEP").toUpperCase(),
								JOptionPane.showInputDialog("Numero").toUpperCase(),
								JOptionPane.showInputDialog("Complemento").toUpperCase()
						),
						new Professor
						(
								new Endereco(
										JOptionPane.showInputDialog("Logradouro").toUpperCase(),
										JOptionPane.showInputDialog("Bairro").toUpperCase(),
										JOptionPane.showInputDialog("Cidade").toUpperCase(),
										JOptionPane.showInputDialog("Estado").toUpperCase(),
										JOptionPane.showInputDialog("CEP").toUpperCase(),
										JOptionPane.showInputDialog("Numero").toUpperCase(),
										JOptionPane.showInputDialog("Complemento").toUpperCase()
										),
								JOptionPane.showInputDialog("Nome").toUpperCase(),
								JOptionPane.showInputDialog("Titulação").toUpperCase(),
								Double.parseDouble(JOptionPane.showInputDialog("Valor Hora"))
						),
						new Curso 
						(
								JOptionPane.showInputDialog("Descrição").toUpperCase(),
								JOptionPane.showInputDialog("Sigla").toUpperCase(),
								Double.parseDouble(JOptionPane.showInputDialog("Valor Hora")),
								JOptionPane.showInputDialog("Sigla").toUpperCase()
						)
					)
				);


						System.out.println("Professor" + turma.getProfessor().getNome());
						System.out.println("Aluno" + turma.getAluno().getNome());
						System.out.println("Cidade" + turma.getAluno().getEndereco().getCidade());

	}

}
