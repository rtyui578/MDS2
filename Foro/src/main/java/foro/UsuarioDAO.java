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

public class UsuarioDAO {
	public static Usuario loadUsuarioByORMID(int attribute) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, attribute);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int attribute) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return getUsuarioByORMID(session, attribute);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, attribute, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return getUsuarioByORMID(session, attribute, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int attribute) throws PersistentException {
		try {
			return (Usuario) session.load(foro.Usuario.class, new Integer(attribute));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int attribute) throws PersistentException {
		try {
			return (Usuario) session.get(foro.Usuario.class, new Integer(attribute));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.load(foro.Usuario.class, new Integer(attribute), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.get(foro.Usuario.class, new Integer(attribute), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Usuario as Usuario");
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
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy, lockMode);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = foro.CUPersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Usuario as Usuario");
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
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From foro.Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario createUsuario() {
		return new foro.Usuario();
	}
	
	public static boolean save(foro.Usuario usuario) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().saveObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(foro.Usuario usuario) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().deleteObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foro.Usuario usuario)throws PersistentException {
		if (usuario instanceof foro.Moderador) {
			return foro.ModeradorDAO.deleteAndDissociate((foro.Moderador) usuario);
		}
		
		try {
			foro.Usuario[] lEs_amigo_des = usuario.es_amigo_de.toArray();
			for(int i = 0; i < lEs_amigo_des.length; i++) {
				lEs_amigo_des[i].es_su_amigo.remove(usuario);
			}
			foro.Temas[] lCrea_uns = usuario.crea_un.toArray();
			for(int i = 0; i < lCrea_uns.length; i++) {
				lCrea_uns[i].setCreado_por(null);
			}
			foro.Mensaje[] lEscribes = usuario.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setPertenece_a(null);
			}
			foro.Usuario[] lReporta_as = usuario.reporta_a.toArray();
			for(int i = 0; i < lReporta_as.length; i++) {
				lReporta_as[i].es_reportado_por.remove(usuario);
			}
			foro.Notificaciones[] lTienes = usuario.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setDe(null);
			}
			foro.Usuario[] lEs_su_amigos = usuario.es_su_amigo.toArray();
			for(int i = 0; i < lEs_su_amigos.length; i++) {
				lEs_su_amigos[i].es_amigo_de.remove(usuario);
			}
			if (usuario.getEliminado_por() != null) {
				usuario.getEliminado_por().elimina.remove(usuario);
			}
			
			foro.Mensaje[] lGustas = usuario.gusta.toArray();
			for(int i = 0; i < lGustas.length; i++) {
				lGustas[i].es_gustado.remove(usuario);
			}
			foro.Usuario[] lEs_reportado_pors = usuario.es_reportado_por.toArray();
			for(int i = 0; i < lEs_reportado_pors.length; i++) {
				lEs_reportado_pors[i].reporta_a.remove(usuario);
			}
			foro.Temas[] lLe_da_me_gustas = usuario.le_da_me_gusta.toArray();
			for(int i = 0; i < lLe_da_me_gustas.length; i++) {
				lLe_da_me_gustas[i].es_gustado.remove(usuario);
			}
			return delete(usuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(foro.Usuario usuario, org.orm.PersistentSession session)throws PersistentException {
		if (usuario instanceof foro.Moderador) {
			return foro.ModeradorDAO.deleteAndDissociate((foro.Moderador) usuario, session);
		}
		
		try {
			foro.Usuario[] lEs_amigo_des = usuario.es_amigo_de.toArray();
			for(int i = 0; i < lEs_amigo_des.length; i++) {
				lEs_amigo_des[i].es_su_amigo.remove(usuario);
			}
			foro.Temas[] lCrea_uns = usuario.crea_un.toArray();
			for(int i = 0; i < lCrea_uns.length; i++) {
				lCrea_uns[i].setCreado_por(null);
			}
			foro.Mensaje[] lEscribes = usuario.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setPertenece_a(null);
			}
			foro.Usuario[] lReporta_as = usuario.reporta_a.toArray();
			for(int i = 0; i < lReporta_as.length; i++) {
				lReporta_as[i].es_reportado_por.remove(usuario);
			}
			foro.Notificaciones[] lTienes = usuario.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setDe(null);
			}
			foro.Usuario[] lEs_su_amigos = usuario.es_su_amigo.toArray();
			for(int i = 0; i < lEs_su_amigos.length; i++) {
				lEs_su_amigos[i].es_amigo_de.remove(usuario);
			}
			if (usuario.getEliminado_por() != null) {
				usuario.getEliminado_por().elimina.remove(usuario);
			}
			
			foro.Mensaje[] lGustas = usuario.gusta.toArray();
			for(int i = 0; i < lGustas.length; i++) {
				lGustas[i].es_gustado.remove(usuario);
			}
			foro.Usuario[] lEs_reportado_pors = usuario.es_reportado_por.toArray();
			for(int i = 0; i < lEs_reportado_pors.length; i++) {
				lEs_reportado_pors[i].reporta_a.remove(usuario);
			}
			foro.Temas[] lLe_da_me_gustas = usuario.le_da_me_gusta.toArray();
			for(int i = 0; i < lLe_da_me_gustas.length; i++) {
				lLe_da_me_gustas[i].es_gustado.remove(usuario);
			}
			try {
				session.delete(usuario);
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
	
	public static boolean refresh(foro.Usuario usuario) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().getSession().refresh(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(foro.Usuario usuario) throws PersistentException {
		try {
			foro.CUPersistentManager.instance().getSession().evict(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		Usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
		if(usuarios == null || usuarios.length == 0) {
			return null;
		}
		return usuarios[0];
	}
	
	public static Usuario[] listUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		return usuarioCriteria.listUsuario();
	}
}
