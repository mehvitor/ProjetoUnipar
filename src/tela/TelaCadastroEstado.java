package tela;

import javax.swing.JLabel;

import componente.MeuCampoTexto;
import dao.EstadoDao;
import pojo.Estado;

public class TelaCadastroEstado extends TelaCadastro {
	public Estado estado = new Estado();
	public EstadoDao estadoDao = new EstadoDao(estado);			
			
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
	
	@Override
	public void incluirBD() {
		estado.setId(Integer.parseInt(jtfCodigo.getText()));
		estado.setNome(jtfNome.getText());
		estado.setSigla(jtfSigla.getText());
		estado.setAtivo(jtfAtivo.getText());
		estadoDao.inserir();
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