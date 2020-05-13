/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package foro;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TemasDAO {
	public static Temas loadTemasByORMID(int attribute) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadTemasByORMID(session, attribute);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas getTemasByORMID(int attribute) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return getTemasByORMID(session, attribute);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas loadTemasByORMID(int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadTemasByORMID(session, attribute, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas getTemasByORMID(int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return getTemasByORMID(session, attribute, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas loadTemasByORMID(PersistentSession session, int attribute) throws PersistentException {
		try {
			return (Temas) session.load(foro.Temas.class, new Integer(attribute));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas getTemasByORMID(PersistentSession session, int attribute) throws PersistentException {
		try {
			return (Temas) session.get(foro.Temas.class, new Integer(attribute));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas loadTemasByORMID(PersistentSession session, int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Temas) session.load(foro.Temas.class, new Integer(attribute), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas getTemasByORMID(PersistentSession session, int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Temas) session.get(foro.Temas.class, new Integer(attribute), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTemas(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return queryTemas(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTemas(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return queryTemas(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas[] listTemasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return listTemasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas[] listTemasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return listTemasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTemas(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Temas as Temas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTemas(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Temas as Temas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Temas", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas[] listTemasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTemas(session, condition, orderBy);
			return (Temas[]) list.toArray(new Temas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas[] listTemasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTemas(session, condition, orderBy, lockMode);
			return (Temas[]) list.toArray(new Temas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas loadTemasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadTemasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas loadTemasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadTemasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas loadTemasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Temas[] temases = listTemasByQuery(session, condition, orderBy);
		if (temases != null && temases.length > 0)
			return temases[0];
		else
			return null;
	}
	
	public static Temas loadTemasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Temas[] temases = listTemasByQuery(session, condition, orderBy, lockMode);
		if (temases != null && temases.length > 0)
			return temases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTemasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return iterateTemasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return iterateTemasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Temas as Temas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Temas as Temas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Temas", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas createTemas() {
		return new foro.Temas();
	}
	
	public static boolean save(foro.Temas temas) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().saveObject(temas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foro.Temas temas) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().deleteObject(temas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foro.Temas temas)throws PersistentException {
		try {
			if (temas.getTemas() != null) {
				temas.getTemas().setOcultos(null);
			}
			
			if (temas.getPertenece_a() != null) {
				temas.getPertenece_a().tiene.remove(temas);
			}
			
			foro.Usuario[] lEs_gustados = temas.es_gustado.toArray();
			for(int i = 0; i < lEs_gustados.length; i++) {
				lEs_gustados[i].le_da_me_gusta.remove(temas);
			}
			if (temas.getCreado_por() != null) {
				temas.getCreado_por().crea_un.remove(temas);
			}
			
			foro.Mensaje[] lTienes = temas.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setSon_de(null);
			}
			if (temas.getOcultos() != null) {
				temas.getOcultos().setTemas(null);
			}
			
			return delete(temas);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foro.Temas temas, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (temas.getTemas() != null) {
				temas.getTemas().setOcultos(null);
			}
			
			if (temas.getPertenece_a() != null) {
				temas.getPertenece_a().tiene.remove(temas);
			}
			
			foro.Usuario[] lEs_gustados = temas.es_gustado.toArray();
			for(int i = 0; i < lEs_gustados.length; i++) {
				lEs_gustados[i].le_da_me_gusta.remove(temas);
			}
			if (temas.getCreado_por() != null) {
				temas.getCreado_por().crea_un.remove(temas);
			}
			
			foro.Mensaje[] lTienes = temas.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setSon_de(null);
			}
			if (temas.getOcultos() != null) {
				temas.getOcultos().setTemas(null);
			}
			
			try {
				session.delete(temas);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(foro.Temas temas) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().getSession().refresh(temas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foro.Temas temas) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().getSession().evict(temas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Temas loadTemasByCriteria(TemasCriteria temasCriteria) {
		Temas[] temases = listTemasByCriteria(temasCriteria);
		if(temases == null || temases.length == 0) {
			return null;
		}
		return temases[0];
	}
	
	public static Temas[] listTemasByCriteria(TemasCriteria temasCriteria) {
		return temasCriteria.listTemas();
	}
}
