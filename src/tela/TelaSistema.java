package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaSistema extends JFrame implements ActionListener {
	
	public JMenuBar jmb = new JMenuBar();
	public JMenu jmCadastros = new JMenu("Cadastros");
	public JMenu jmMovimentos = new JMenu("Movimentos");
	public JMenu jmRelatorios = new JMenu("Relatórios");
	public JMenuItem jmiEstado = new JMenuItem("Estado");
	public JMenuItem jmiCidade = new JMenuItem("Cidade");
	public JMenuItem jmiFornecedor = new JMenuItem("Fornecedor");
	
	
	public TelaSistema() {
		setTitle("Sistemas Comercial");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setJMenuBar(jmb);
		
		jmb.add(jmCadastros);
		jmb.add(jmMovimentos);
		jmb.add(jmRelatorios);
		jmCadastros.add(jmiCidade);
		jmCadastros.add(jmiEstado);
		jmCadastros.add(jmiFornecedor);
		
		jmiEstado.addActionListener(this);
		jmiCidade.addActionListener(this);
		jmiFornecedor.addActionListener(this);
		
		setVisible(true); //ficar sempre por ultimo
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jmiEstado ) {
			System.out.println("Estado Selecionado");
		
		} else if (ae.getSource() == jmiCidade) {
			System.out.println("Cidade Selecionada");
			
		} else if (ae.getSource() == jmiFornecedor) {
			System.out.println("Fornecedor Selecionado");
		}
		
	
	}
	
	

}