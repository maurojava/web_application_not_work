/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entita.Persona;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author spazio
 */
@Stateless
public class GestoreEjb {
    @PersistenceContext(unitName = "PrimoconDB_maurojeePU")
    private EntityManager em;

  
 

    public List<Persona> getElencoPersone() {
        return em.createQuery("select p from Persona p").getResultList();

    }

    public void persist(Persona persona) {
        em.persist(persona);
    }
}
