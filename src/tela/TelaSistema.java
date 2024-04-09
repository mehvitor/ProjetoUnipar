package tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
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
	public JDesktopPane jdp = new JDesktopPane();
	
	
	public TelaSistema() {
		
		getContentPane().add(jdp);
		setTitle("Sistemas Comercial");
		setSize(800		, 400);
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
			TelaCadastroEstado telaCadastroEstado = new TelaCadastroEstado();
			jdp.add(telaCadastroEstado);
		
		} else if (ae.getSource() == jmiCidade) {
			TelaCadastroCidade telaCadastroCidade = new TelaCadastroCidade();
			jdp.add(telaCadastroCidade);
			
		} else if (ae.getSource() == jmiFornecedor) {
			System.out.println("Fornecedor Selecionado");
		}
		
	
	}
	
	

}
