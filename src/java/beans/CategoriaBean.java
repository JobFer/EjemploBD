package beans;

import dao.CategoriaFacade;
import entities.Categoria;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class CategoriaBean {

    @EJB
    private CategoriaFacade categoriaFacade;

    public CategoriaBean() {
    }
    
    /*****************************************************/
    
    private Categoria categoria = new Categoria();
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /*****************************************************/
    
    private List<Categoria> listaCategorias;
    
    public List<Categoria> getListaCategorias() {
        return categoriaFacade.findAll();
    }

    public void setListaCategorias(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

}
