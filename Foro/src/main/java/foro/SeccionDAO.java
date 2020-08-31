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

public class SeccionDAO {
	public static Seccion loadSeccionByORMID(int id__seccion) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadSeccionByORMID(session, id__seccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(int id__seccion) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return getSeccionByORMID(session, id__seccion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByORMID(int id__seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadSeccionByORMID(session, id__seccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(int id__seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return getSeccionByORMID(session, id__seccion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByORMID(PersistentSession session, int id__seccion) throws PersistentException {
		try {
			return (Seccion) session.load(foro.Seccion.class, new Integer(id__seccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(PersistentSession session, int id__seccion) throws PersistentException {
		try {
			return (Seccion) session.get(foro.Seccion.class, new Integer(id__seccion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByORMID(PersistentSession session, int id__seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Seccion) session.load(foro.Seccion.class, new Integer(id__seccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion getSeccionByORMID(PersistentSession session, int id__seccion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Seccion) session.get(foro.Seccion.class, new Integer(id__seccion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return querySeccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return querySeccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return listSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return listSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySeccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Seccion as Seccion");
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
	
	public static List querySeccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Seccion as Seccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Seccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySeccion(session, condition, orderBy);
			return (Seccion[]) list.toArray(new Seccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion[] listSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySeccion(session, condition, orderBy, lockMode);
			return (Seccion[]) list.toArray(new Seccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Seccion[] seccions = listSeccionByQuery(session, condition, orderBy);
		if (seccions != null && seccions.length > 0)
			return seccions[0];
		else
			return null;
	}
	
	public static Seccion loadSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Seccion[] seccions = listSeccionByQuery(session, condition, orderBy, lockMode);
		if (seccions != null && seccions.length > 0)
			return seccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSeccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return iterateSeccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return iterateSeccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSeccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Seccion as Seccion");
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
	
	public static java.util.Iterator iterateSeccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Seccion as Seccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Seccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion createSeccion() {
		return new foro.Seccion();
	}
	
	public static boolean save(foro.Seccion seccion) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().saveObject(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foro.Seccion seccion) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().deleteObject(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foro.Seccion seccion)throws PersistentException {
		try {
			if (seccion.getEs_creada_por() != null) {
				seccion.getEs_creada_por().crea.remove(seccion);
			}
			
			foro.Tema[] lTienes = seccion.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setPertenece_a(null);
			}
			return delete(seccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foro.Seccion seccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (seccion.getEs_creada_por() != null) {
				seccion.getEs_creada_por().crea.remove(seccion);
			}
			
			foro.Tema[] lTienes = seccion.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setPertenece_a(null);
			}
			try {
				session.delete(seccion);
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
	
	public static boolean refresh(foro.Seccion seccion) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().getSession().refresh(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foro.Seccion seccion) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().getSession().evict(seccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Seccion loadSeccionByCriteria(SeccionCriteria seccionCriteria) {
		Seccion[] seccions = listSeccionByCriteria(seccionCriteria);
		if(seccions == null || seccions.length == 0) {
			return null;
		}
		return seccions[0];
	}
	
	public static Seccion[] listSeccionByCriteria(SeccionCriteria seccionCriteria) {
		return seccionCriteria.listSeccion();
	}
}
