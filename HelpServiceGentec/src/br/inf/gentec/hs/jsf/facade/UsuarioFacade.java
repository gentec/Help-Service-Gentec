package br.inf.gentec.hs.jsf.facade;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.inf.gentec.hs.api.ObjectDBPersist;
import br.inf.gentec.hs.model.NivelAcesso;
import br.inf.gentec.hs.model.Usuario;

public class UsuarioFacade implements Serializable {
	private static final long serialVersionUID = 5418646339244069342L;
	
	@EJB
	private ObjectDBPersist daoPersist;
	@Inject
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void save() {
		if(usuario != null) {
			getUsuario().setDataCadastro(new Date());
			NivelAcesso nivel = new NivelAcesso();
			nivel.setId(1L);
			getUsuario().setNivelAcesso(nivel);
			
			if(daoPersist.save(getUsuario())) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
						FacesMessage.SEVERITY_INFO, "Usuáio cadastrado com sucesso.", ""));
			} else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
						FacesMessage.SEVERITY_ERROR, "Problema ao salvar usuário.", ""));
			}
			usuario=new Usuario();
		}
	}
}
