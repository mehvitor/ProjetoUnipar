package tela;

import componente.MeuCampoTexto;
import dao.EstadoDao;
import pojo.Estado;

public class TelaCadastroEstado extends TelaCadastro {

	public Estado estado = new Estado();
	public EstadoDao estadoDao = new EstadoDao(estado);			
	public MeuCampoTexto jtfCodigo = new MeuCampoTexto(10, true, "Código");
	public MeuCampoTexto jtfNome = new MeuCampoTexto(50,true, "Nome");
	public MeuCampoTexto jtfSigla = new MeuCampoTexto(2,true, "Sigla");		//true é para dizer se o campo é obrigatorio
	public MeuCampoTexto jtfAtivo = new MeuCampoTexto(1,true, "Ativo");
	
	public TelaCadastroEstado() {
		super("Cadastro de Estado");
		adicionaComponente(1,1,1,1, jtfCodigo);
		adicionaComponente(2,1,1,1,jtfNome);
		adicionaComponente(3,1,1,1, jtfSigla);
		adicionaComponente(4,1,1,1,jtfAtivo);
		pack();
		habilitaComponentes(false);	
	
	}
	
	public void setPersistencia() {
		estado.setId(Integer.parseInt(jtfCodigo.getText()));
		estado.setNome(jtfNome.getText());
		estado.setSigla(jtfSigla.getText());
		estado.setAtivo(jtfAtivo.getText());
	}
	
	@Override
	public void incluirBD() {
		setPersistencia();
		estadoDao.inserir();
	}
	
	@Override
	public void alterarBD() {
		setPersistencia();
		estadoDao.alterar();
	}
	
	@Override
	public void excluirBD() {
		estadoDao.excluir();
		super.excluirBD();
	}
	
	@Override
	public void consultar() {
		super.consultar();
		new TelaConsulta(this, "Consulta de Estado", new String[] {"Código", "Nome", "Sigla", "Ativo"}, EstadoDao.SQL_PESQUISAR);
	}
	
	
	@Override
	public void preencherDados(int pk) {
		estado.setId(pk);
		estadoDao.consultar();
		jtfCodigo.setText("" + estado.getId());
		jtfNome.setText(estado.getNome());
		jtfSigla.setText(estado.getSigla());
		jtfAtivo.setText(estado.getAtivo());
		super.preencherDados(pk);
		
	}
}