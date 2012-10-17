package br.inf.gentec.hs.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ViewScoped
@ManagedBean(name="autenticarBean")
public class AutenticarBean {

	public void login(ActionEvent event) {
		try {
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
			HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();

			ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
			context.redirect("/pages/home.jsf");
			
			
			response.sendRedirect(request.getContextPath()+"/pages/home.jsf");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
