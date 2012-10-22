package br.inf.gentec.hs.jsf.bean;

import java.io.IOException;
import java.util.Enumeration;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import br.inf.gentec.hs.model.Usuario;

@ViewScoped
@Named(value="autenticarBean")
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
			request.getSession().setAttribute("usuariologado", getUsuario());
			FacesContext.getCurrentInstance().getExternalContext().redirect(request.getContextPath()+"/pages/home.jsf");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void logouf(ActionEvent event) {
		try {
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			Enumeration enumeration = request.getSession().getAttributeNames();
			
			while(enumeration.hasMoreElements()) {
				request.getSession().removeAttribute(enumeration.nextElement().toString());
			}
			
			request.getSession().invalidate();
			FacesContext.getCurrentInstance().getExternalContext().redirect(request.getContextPath()+"/");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
