package br.com.faixanumerica.entidades;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CreateRange {

	public CreateRange() throws IOException {

		try {
			Range faixa = new Range();

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
			
			ArrayList<Integer> listaTn = new ArrayList<Integer>();
			
			
			
			for (int i = faixa.getMcduInicial(); i <= faixa.getMcduFinal(); i++) {
				// System.out.println(faixa.getCn() + "" + faixa.getPrefixo() + i);
				//JOptionPane.showMessageDialog(null, faixa.getCn() + "" + faixa.getPrefixo() + i);
				listaTn.add(i);
				
			}
			
			JTextArea textArea = new JTextArea();
		    textArea.setColumns(30);
		    textArea.setLineWrap(true);
		    textArea.setWrapStyleWord(true);
		    textArea.append("" + listaTn.toString().replace(",", "]").replace("[", "").replace("]", ""));
		    textArea.setSize(textArea.getPreferredSize().width, 1);
		    JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Faixa de Ramais Criado.",JOptionPane.WARNING_MESSAGE);
			
			
			//System.out.println(listaTn);
			// System.out.println(faixa.getPrefixo());

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite somente números");
		}
	}

}
