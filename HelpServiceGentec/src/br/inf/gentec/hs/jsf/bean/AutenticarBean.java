package br.inf.gentec.hs.jsf.bean;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import br.inf.gentec.hs.model.Usuario;

@Named(value="autenticarBean")
@Stateless
public class AutenticarBean {
	
	@Inject
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void login(ActionEvent event) {
		try {
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			
			FacesContext.getCurrentInstance().getExternalContext().redirect(request.getContextPath()+"/pages/home.jsf");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
