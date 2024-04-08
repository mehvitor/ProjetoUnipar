package tela;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class TelaCadastroEstado extends JInternalFrame implements ActionListener {
	
	public JPanel jpBotoes = new JPanel();
	public JButton jbIncluir = new JButton("Incluir");
	public JButton jbAlterar = new JButton("Alterar");
	public JButton jbExcluir = new JButton("Excluir");
	public JButton jbConsultar = new JButton("Consultar");
	public JButton jbConfirmar = new JButton("Confirmar");
	public JButton jbCancelar = new JButton("Cancelar");
	
	public final int padrao = 0;
	public final int incluindo = 1;
	public final int alterando = 2;
	public final int excluindo = 3;
	public final int consultando = 4;
	public int estadoTela = 0; 
	public boolean temDadosNaTela = false;
	
	
	public TelaCadastroEstado() {
		super("Cadastro de Estados", true, true, true, true); //para habilitar o X, minimizar, icone
		
		getContentPane().setLayout(new BorderLayout()); 		//criando o layout
		getContentPane().add(BorderLayout.PAGE_END, jpBotoes); 
		
		jpBotoes.setLayout(new GridLayout(1, 6));				// 1 linha para 6 botoes
		jpBotoes.add(jbIncluir);
		jpBotoes.add(jbAlterar);
		jpBotoes.add(jbExcluir);
		jpBotoes.add(jbConsultar);
		jpBotoes.add(jbConfirmar);
		jpBotoes.add(jbCancelar);
		jbIncluir.addActionListener(this);
		jbAlterar.addActionListener(this);
		jbExcluir.addActionListener(this);
		jbConsultar.addActionListener(this);
		jbConfirmar.addActionListener(this);
		jbCancelar.addActionListener(this);
		
		pack();
		setVisible(true);
		habilitaBotoes();
	}
	
	public void habilitaBotoes() {
		jbIncluir.setEnabled(estadoTela == padrao);
		jbAlterar.setEnabled(estadoTela == padrao && temDadosNaTela);
		jbExcluir.setEnabled(estadoTela == padrao && temDadosNaTela);
		jbConsultar.setEnabled(estadoTela == padrao);
		jbConfirmar.setEnabled(estadoTela != padrao);
		jbCancelar.setEnabled(estadoTela != padrao);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jbIncluir) {
			incluir();
		
		} else if( ae.getSource() == jbAlterar) {
			alterar();
		
		} else if( ae.getSource() == jbExcluir) {
			excluir();
		
		} else if( ae.getSource() == jbConsultar) {
			consultar();	
		
		} else if( ae.getSource() == jbConfirmar) {
			confirmar();	
		
		} else if( ae.getSource() == jbCancelar) {
			cancelar();
		
		}	
		
		habilitaBotoes();
		
	
	}
	
	public void incluir() {
		estadoTela = incluindo;
	}

	public void alterar () {
		estadoTela = alterando;
	}
	
	public void excluir() {
		estadoTela = excluindo;
	}
	
	public void consultar() {
		estadoTela = consultando;
	}
	
	public void confirmar() {
		estadoTela = padrao;
	}
	
	public void cancelar() {
		estadoTela = padrao;
	}
}
