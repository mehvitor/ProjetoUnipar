package tela;

import componente.MeuCampoTexto;

public class TelaCadastroCidade extends TelaCadastro {

	public MeuCampoTexto jtfCodigo = new MeuCampoTexto(10, true, "Código");
	public MeuCampoTexto jtfNome = new MeuCampoTexto(50, true, "Nome");
	public MeuCampoTexto jtfAtivo = new MeuCampoTexto(1, true, "Ativo");
	
	public TelaCadastroCidade() {
		super("Cadastro de Cidade");
		adicionaComponente(1,2,1,1, jtfCodigo);
		adicionaComponente(2,2,1,1,jtfNome);
		adicionaComponente(4,2,1,1,jtfAtivo);
		pack();
		habilitaComponentes(false);
		
		
		
		
}
}