package br.com.stadlab.ejb;

import javax.ejb.Singleton;

@Singleton
public class ContadorAcessosService {
	
  private int pesquisas;
  private int usuarios;
  
  public void novoUsuario() {
	  usuarios++;
  }
  
  public void usuarioSaiu() {
	  usuarios--;
  }
  
  public void novaPesquisa() {
	  pesquisas++;
  }

	public int getPesquisas() {
		return pesquisas;
	}
	
	public void setPesquisas(int pesquisas) {
		this.pesquisas = pesquisas;
	}
	
	public int getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(int usuarios) {
		this.usuarios = usuarios;
	}
	
  
  
}
