package componente;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class MeuCampoTexto extends JTextField implements FocusListener, MeuComponente{
	
	public MeuCampoTexto(int colunas){
		setColumns(colunas);
		addFocusListener(this);
	}

	@Override
	public void focusGained(FocusEvent fe) {
		setBackground(new Color(255, 255,240));
		
	}

	@Override
	public void focusLost(FocusEvent fe) {
		setBackground(Color.WHITE);
		
	}

	@Override
	public boolean eVazio() {
		String conteudo = getText();
		String conteuSemEspaco = conteudo.trim();    //trim() tira os espaços de sobra antes e depois da palavra
		return conteuSemEspaco.isEmpty();
		
		//return getText().trim().isEmpty();       mesma função das linahs de cima, porém resumida
	}

	@Override
	public void limpar() {
		setText("");
		
	}

	@Override
	public void habilitar(boolean status) {
		setEnabled(status);
		
	}		
}
