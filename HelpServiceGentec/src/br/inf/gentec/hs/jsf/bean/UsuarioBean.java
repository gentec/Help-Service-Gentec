package br.inf.gentec.hs.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import br.inf.gentec.hs.jsf.facade.UsuarioFacade;

@ViewScoped
@ManagedBean(name="usuarioBean")
public class UsuarioBean implements Serializable {
	private static final long serialVersionUID = 921227036788420665L;
	
	@Inject
	private UsuarioFacade facade;
	
	public UsuarioFacade getFacade() {
		return facade;
	}
	
	public void saveUsuario(ActionEvent event) {
		getFacade().save();
	}
	
	public void deleteUsuario(ActionEvent event) {
		getFacade().delete();
	}
	
	public void updateUsuario(ActionEvent event) {
		getFacade().update();
	}
}
