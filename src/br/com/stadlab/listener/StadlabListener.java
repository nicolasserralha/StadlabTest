package br.com.stadlab.listener;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import br.com.stadlab.ejb.ContadorAcessosService;

@WebListener
public class StadlabListener implements HttpSessionListener {

  public void sessionCreated(HttpSessionEvent se) {
    try {
      InitialContext ic =  new InitialContext();
      
/*      se.getSession().setAttribute(
	  "estabelecimentosService", ic.lookup("java:module/EstabelecimentosService"));
      
      se.getSession().setAttribute(
	  "historicoService", ic.lookup("java:module/HistoricoPesquisasService"));*/
      
      ContadorAcessosService contadorService 
	  = (ContadorAcessosService) ic.lookup("java:module/ContadorAcessosService");
      
      contadorService.novoUsuario();
      
      se.getSession().setAttribute(
	  "contadorService", contadorService);
	  
    } catch (NamingException e) {
	    e.printStackTrace();
    }
  }

  public void sessionDestroyed(HttpSessionEvent se) {
    ContadorAcessosService contadorService = 
	(ContadorAcessosService) se.getSession().getAttribute("contadorService");
    
    contadorService.usuarioSaiu();
  }
}