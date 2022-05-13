package br.com.faixanumerica.entidades;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CreateRange {

	Range faixa;

	public CreateRange() {
		faixa = new Range();
	};

	public Object range() throws IOException {

		try {

			faixa.setCn(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o CN", "Código Nacional",
					JOptionPane.INFORMATION_MESSAGE)));

			if (String.valueOf(faixa.getCn()).length() != 2) {
				JOptionPane.showMessageDialog(null, "CN Inválido..");
				System.exit(0);
			}

			faixa.setPrefixo(Integer.parseInt(
					JOptionPane.showInputDialog(null, "Digite o Prefixo", "Prefixo", JOptionPane.INFORMATION_MESSAGE)));

			if (String.valueOf(faixa.getPrefixo()).length() != 4) {
				JOptionPane.showMessageDialog(null, "Prefixo Inválido");
				System.exit(0);
			}

			faixa.setMcduInicial(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o MCDU Inicial",
					"MCDU Inicial", JOptionPane.INFORMATION_MESSAGE)));

			if (String.valueOf(faixa.getMcduInicial()).length() != 4) {
				JOptionPane.showMessageDialog(null, "MCDU Inicial Inválido");
				System.exit(0);
			}

			faixa.setMcduFinal(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o MCDU Final", "MCDU Final",
					JOptionPane.INFORMATION_MESSAGE)));

			if (String.valueOf(faixa.getMcduFinal()).length() != 4) {
				JOptionPane.showMessageDialog(null, "MCDU Final Inválido");
				System.exit(0);
			}

			// Criando a lista de Terminais numéricos
			ArrayList<String> listaTn = new ArrayList<String>();

			for (int i = faixa.getMcduInicial(); i <= faixa.getMcduFinal(); i++) {
				listaTn.add(new StringBuilder().append(faixa.getCn()).append(faixa.getPrefixo()).append(i).toString());
			}

			JTextArea textArea = new JTextArea(10, 10);
			textArea.setText(new StringBuilder().append(String.join("\n", listaTn)).toString());
			textArea.setEnabled(true);
			textArea.setColumns(30);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.setCaretPosition(0);
			textArea.setEditable(false);
			textArea.setSize(textArea.getPreferredSize().width, 1);
			JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Faixa de Ramais Criado.",
					JOptionPane.WARNING_MESSAGE);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite somente números");
		}
		return faixa;
	}

}
