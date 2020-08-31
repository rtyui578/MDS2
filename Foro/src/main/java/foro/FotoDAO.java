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

public class FotoDAO {
	public static Foto loadFotoByORMID(int id_media) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadFotoByORMID(session, id_media);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto getFotoByORMID(int id_media) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return getFotoByORMID(session, id_media);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto loadFotoByORMID(int id_media, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadFotoByORMID(session, id_media, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto getFotoByORMID(int id_media, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return getFotoByORMID(session, id_media, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto loadFotoByORMID(PersistentSession session, int id_media) throws PersistentException {
		try {
			return (Foto) session.load(foro.Foto.class, new Integer(id_media));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto getFotoByORMID(PersistentSession session, int id_media) throws PersistentException {
		try {
			return (Foto) session.get(foro.Foto.class, new Integer(id_media));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto loadFotoByORMID(PersistentSession session, int id_media, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Foto) session.load(foro.Foto.class, new Integer(id_media), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto getFotoByORMID(PersistentSession session, int id_media, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Foto) session.get(foro.Foto.class, new Integer(id_media), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return queryFoto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return queryFoto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto[] listFotoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return listFotoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto[] listFotoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return listFotoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFoto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Foto as Foto");
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
	
	public static List queryFoto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Foto as Foto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Foto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto[] listFotoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFoto(session, condition, orderBy);
			return (Foto[]) list.toArray(new Foto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto[] listFotoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFoto(session, condition, orderBy, lockMode);
			return (Foto[]) list.toArray(new Foto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto loadFotoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadFotoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto loadFotoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadFotoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto loadFotoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Foto[] fotos = listFotoByQuery(session, condition, orderBy);
		if (fotos != null && fotos.length > 0)
			return fotos[0];
		else
			return null;
	}
	
	public static Foto loadFotoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Foto[] fotos = listFotoByQuery(session, condition, orderBy, lockMode);
		if (fotos != null && fotos.length > 0)
			return fotos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFotoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return iterateFotoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFotoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return iterateFotoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFotoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Foto as Foto");
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
	
	public static java.util.Iterator iterateFotoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Foto as Foto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Foto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto createFoto() {
		return new foro.Foto();
	}
	
	public static boolean save(foro.Foto foto) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().saveObject(foto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foro.Foto foto) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().deleteObject(foto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foro.Foto foto)throws PersistentException {
		try {
			if (foto.getEs_de() != null) {
				foto.getEs_de().contiene.remove(foto);
			}
			
			return delete(foto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foro.Foto foto, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (foto.getEs_de() != null) {
				foto.getEs_de().contiene.remove(foto);
			}
			
			try {
				session.delete(foto);
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
	
	public static boolean refresh(foro.Foto foto) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().getSession().refresh(foto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foro.Foto foto) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().getSession().evict(foto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Foto loadFotoByCriteria(FotoCriteria fotoCriteria) {
		Foto[] fotos = listFotoByCriteria(fotoCriteria);
		if(fotos == null || fotos.length == 0) {
			return null;
		}
		return fotos[0];
	}
	
	public static Foto[] listFotoByCriteria(FotoCriteria fotoCriteria) {
		return fotoCriteria.listFoto();
	}
}
