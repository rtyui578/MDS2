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
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TemaDAO {
	public static Tema loadTemaByORMID(int id_tema) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return loadTemaByORMID(session, id_tema);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema getTemaByORMID(int id_tema) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return getTemaByORMID(session, id_tema);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByORMID(int id_tema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return loadTemaByORMID(session, id_tema, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema getTemaByORMID(int id_tema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return getTemaByORMID(session, id_tema, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByORMID(PersistentSession session, int id_tema) throws PersistentException {
		try {
			return (Tema) session.load(basededatos.Tema.class, new Integer(id_tema));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema getTemaByORMID(PersistentSession session, int id_tema) throws PersistentException {
		try {
			return (Tema) session.get(basededatos.Tema.class, new Integer(id_tema));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByORMID(PersistentSession session, int id_tema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tema) session.load(basededatos.Tema.class, new Integer(id_tema), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema getTemaByORMID(PersistentSession session, int id_tema, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tema) session.get(basededatos.Tema.class, new Integer(id_tema), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTema(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return queryTema(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTema(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return queryTema(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema[] listTemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return listTemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema[] listTemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return listTemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTema(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Tema as Tema");
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
	
	public static List queryTema(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Tema as Tema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tema", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema[] listTemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTema(session, condition, orderBy);
			return (Tema[]) list.toArray(new Tema[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema[] listTemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTema(session, condition, orderBy, lockMode);
			return (Tema[]) list.toArray(new Tema[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return loadTemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return loadTemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tema[] temas = listTemaByQuery(session, condition, orderBy);
		if (temas != null && temas.length > 0)
			return temas[0];
		else
			return null;
	}
	
	public static Tema loadTemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tema[] temas = listTemaByQuery(session, condition, orderBy, lockMode);
		if (temas != null && temas.length > 0)
			return temas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return iterateTemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return iterateTemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Tema as Tema");
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
	
	public static java.util.Iterator iterateTemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Tema as Tema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tema", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema createTema() {
		return new basededatos.Tema();
	}
	
	public static boolean save(basededatos.Tema tema) throws PersistentException {
		try {
			basededatos.OtraPersistentManager.instance().saveObject(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Tema tema) throws PersistentException {
		try {
			basededatos.OtraPersistentManager.instance().deleteObject(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Tema tema)throws PersistentException {
		try {
			if (tema.getEs_de() != null) {
				tema.getEs_de().tiene.remove(tema);
			}
			
			basededatos.Mensaje[] lTienes = tema.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setEs_de(null);
			}
			basededatos.Usuario[] lEs_gustados = tema.es_gustado.toArray();
			for(int i = 0; i < lEs_gustados.length; i++) {
				lEs_gustados[i].gusta_a.remove(tema);
			}
			return delete(tema);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Tema tema, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tema.getEs_de() != null) {
				tema.getEs_de().tiene.remove(tema);
			}
			
			basededatos.Mensaje[] lTienes = tema.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setEs_de(null);
			}
			basededatos.Usuario[] lEs_gustados = tema.es_gustado.toArray();
			for(int i = 0; i < lEs_gustados.length; i++) {
				lEs_gustados[i].gusta_a.remove(tema);
			}
			try {
				session.delete(tema);
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
	
	public static boolean refresh(basededatos.Tema tema) throws PersistentException {
		try {
			basededatos.OtraPersistentManager.instance().getSession().refresh(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Tema tema) throws PersistentException {
		try {
			basededatos.OtraPersistentManager.instance().getSession().evict(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByCriteria(TemaCriteria temaCriteria) {
		Tema[] temas = listTemaByCriteria(temaCriteria);
		if(temas == null || temas.length == 0) {
			return null;
		}
		return temas[0];
	}
	
	public static Tema[] listTemaByCriteria(TemaCriteria temaCriteria) {
		return temaCriteria.listTema();
	}
}
