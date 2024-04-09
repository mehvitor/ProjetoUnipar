package tela;

import javax.swing.JLabel;

import componente.MeuCampoTexto;

public class TelaCadastroEstado extends TelaCadastro {
	
	public JLabel jlCodigo = new JLabel("Código");
	public JLabel jlNome = new JLabel("Nome");
	public JLabel jlSigla = new JLabel("Sigla");
	public JLabel jlAtivo= new JLabel("Ativo");
	
	public MeuCampoTexto jtfCodigo = new MeuCampoTexto(10);
	public MeuCampoTexto jtfNome = new MeuCampoTexto(50);
	public MeuCampoTexto jtfSigla = new MeuCampoTexto(2);
	public MeuCampoTexto jtfAtivo = new MeuCampoTexto(1);
	
	public TelaCadastroEstado() {
		super("Cadastro de Estado");
		adicionaComponente(1,1,1,1, jlCodigo);
		adicionaComponente(1,2,1,1, jtfCodigo);
		adicionaComponente(2,1,1,1,jlNome);
		adicionaComponente(2,2,1,1,jtfNome);
		adicionaComponente(3,1,1,1, jlSigla);
		adicionaComponente(3,2,1,1, jtfSigla);
		adicionaComponente(4,1,1,1,jlAtivo);
		adicionaComponente(4,2,1,1,jtfAtivo);
		pack();
		habilitaComponentes(false);
		
		
	
		
	}
}