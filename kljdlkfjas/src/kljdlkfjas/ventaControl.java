package kljdlkfjas;

import java.io.Serializable;
import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

@Named
@SessionScoped

public class ventaControl implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Venta venta;
	
	ventaControl(){
		venta = new Venta();
	}
	
	@PersistenceContext(unitName = "kljdlkfjas")
	private EntityManager em;    

	@Resource
	private UserTransaction userTransaction;

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	public void guardar() throws Exception  {
	    userTransaction.begin();
	    em.persist(venta);
	    userTransaction.commit();
	}

}