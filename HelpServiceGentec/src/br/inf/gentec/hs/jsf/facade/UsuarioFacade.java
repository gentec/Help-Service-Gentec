package br.inf.gentec.hs.jsf.facade;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import br.inf.gentec.hs.api.ObjectDBPersist;
import br.inf.gentec.hs.api.ObjectDBSearch;
import br.inf.gentec.hs.model.NivelAcesso;
import br.inf.gentec.hs.model.Usuario;

public class UsuarioFacade implements Serializable {
	private static final long serialVersionUID = 5418646339244069342L;
	
	@EJB
	private ObjectDBPersist daoPersist;
	@EJB(beanName="nivelAcessoDAO")
	private ObjectDBSearch<NivelAcesso> daoNivel;
	@EJB(beanName="usuarioDAO")
	private ObjectDBSearch<Usuario> daoUsuario;
	@Inject
	private Usuario usuario;
	private Collection<NivelAcesso> listaNivel;
	private Collection<Usuario> listaUsuario;
	
	private List<Usuario> listaFilterUsuario;
	
	public Collection<NivelAcesso> getListaNivel() {
		if(listaNivel == null) {
			listaNivel = daoNivel.findAll();
		}
		return listaNivel;
	}
	
	public Collection<Usuario> getListaUsuario() {
		if(listaUsuario == null) {
			listaUsuario = daoUsuario.findAll();
		}
		return listaUsuario;
	}
	
	public void save() {
		if(usuario != null) {
			getUsuario().setDataCadastro(new Date());
			
			if(daoPersist.save(getUsuario())) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
						FacesMessage.SEVERITY_INFO, "Usuáio cadastrado com sucesso.", ""));
			} else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
						FacesMessage.SEVERITY_ERROR, "Problema ao salvar usuário.", ""));
			}
			usuario=new Usuario();listaUsuario=null;
		}
	}
	
	public void delete() {
		System.out.println(">>>> "+usuario);
		
		if(usuario != null) {
			if(daoPersist.delete(getUsuario())) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
						FacesMessage.SEVERITY_INFO, "Usuáio removido com sucesso.", ""));
			} else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
						FacesMessage.SEVERITY_ERROR, "Problema ao remover usuário.", ""));
			}
			listaUsuario=null;
		}
	}
	
	public void update() {
		if(usuario != null) {
			if(daoPersist.update(getUsuario())) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
						FacesMessage.SEVERITY_INFO, "Usuáio alterado com sucesso.", ""));
			} else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
						FacesMessage.SEVERITY_ERROR, "Problema ao remover usuário.", ""));
			}
			listaUsuario=null;
		} 
	}
	
	public List<Usuario> getListaFilterUsuario() {
		return listaFilterUsuario;
	}
	public void setListaFilterUsuario(List<Usuario> listaFilterUsuario) {
		this.listaFilterUsuario = listaFilterUsuario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
