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

public class NotificacionDAO {
	public static Notificacion loadNotificacionByORMID(int id_notificacion) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return loadNotificacionByORMID(session, id_notificacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion getNotificacionByORMID(int id_notificacion) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return getNotificacionByORMID(session, id_notificacion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion loadNotificacionByORMID(int id_notificacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return loadNotificacionByORMID(session, id_notificacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion getNotificacionByORMID(int id_notificacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return getNotificacionByORMID(session, id_notificacion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion loadNotificacionByORMID(PersistentSession session, int id_notificacion) throws PersistentException {
		try {
			return (Notificacion) session.load(basededatos.Notificacion.class, new Integer(id_notificacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion getNotificacionByORMID(PersistentSession session, int id_notificacion) throws PersistentException {
		try {
			return (Notificacion) session.get(basededatos.Notificacion.class, new Integer(id_notificacion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion loadNotificacionByORMID(PersistentSession session, int id_notificacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Notificacion) session.load(basededatos.Notificacion.class, new Integer(id_notificacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion getNotificacionByORMID(PersistentSession session, int id_notificacion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Notificacion) session.get(basededatos.Notificacion.class, new Integer(id_notificacion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return queryNotificacion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return queryNotificacion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion[] listNotificacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return listNotificacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion[] listNotificacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return listNotificacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryNotificacion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Notificacion as Notificacion");
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
	
	public static List queryNotificacion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Notificacion as Notificacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Notificacion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion[] listNotificacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryNotificacion(session, condition, orderBy);
			return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion[] listNotificacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryNotificacion(session, condition, orderBy, lockMode);
			return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion loadNotificacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return loadNotificacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion loadNotificacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return loadNotificacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion loadNotificacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Notificacion[] notificacions = listNotificacionByQuery(session, condition, orderBy);
		if (notificacions != null && notificacions.length > 0)
			return notificacions[0];
		else
			return null;
	}
	
	public static Notificacion loadNotificacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Notificacion[] notificacions = listNotificacionByQuery(session, condition, orderBy, lockMode);
		if (notificacions != null && notificacions.length > 0)
			return notificacions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotificacionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return iterateNotificacionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificacionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = basededatos.OtraPersistentManager.instance().getSession();
			return iterateNotificacionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateNotificacionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Notificacion as Notificacion");
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
	
	public static java.util.Iterator iterateNotificacionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Notificacion as Notificacion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Notificacion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion createNotificacion() {
		return new basededatos.Notificacion();
	}
	
	public static boolean save(basededatos.Notificacion notificacion) throws PersistentException {
		try {
			basededatos.OtraPersistentManager.instance().saveObject(notificacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Notificacion notificacion) throws PersistentException {
		try {
			basededatos.OtraPersistentManager.instance().deleteObject(notificacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Notificacion notificacion)throws PersistentException {
		try {
			if (notificacion.getEs_de() != null) {
				notificacion.getEs_de().tiene.remove(notificacion);
			}
			
			return delete(notificacion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Notificacion notificacion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (notificacion.getEs_de() != null) {
				notificacion.getEs_de().tiene.remove(notificacion);
			}
			
			try {
				session.delete(notificacion);
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
	
	public static boolean refresh(basededatos.Notificacion notificacion) throws PersistentException {
		try {
			basededatos.OtraPersistentManager.instance().getSession().refresh(notificacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Notificacion notificacion) throws PersistentException {
		try {
			basededatos.OtraPersistentManager.instance().getSession().evict(notificacion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Notificacion loadNotificacionByCriteria(NotificacionCriteria notificacionCriteria) {
		Notificacion[] notificacions = listNotificacionByCriteria(notificacionCriteria);
		if(notificacions == null || notificacions.length == 0) {
			return null;
		}
		return notificacions[0];
	}
	
	public static Notificacion[] listNotificacionByCriteria(NotificacionCriteria notificacionCriteria) {
		return notificacionCriteria.listNotificacion();
	}
}
