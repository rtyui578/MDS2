package basededatos;

import java.util.Vector;

import org.orm.PersistentException;


public class BD_Secciones {
	public BD_Principal _bD_Principal;
	public Vector<Seccion> _seccions = new Vector<Seccion>();

	public Seccion[] listaSecciones() {
		Seccion[] secciones=null;
		try {
			secciones = SeccionDAO.listSeccionByCriteria(new SeccionCriteria());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return secciones;
	}

	public Seccion conseguirSeccion(int aId_seccion) {
		Seccion seccion = null;
		try {
			seccion = SeccionDAO.getSeccionByORMID(aId_seccion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return seccion;
	}

	public void crearSeccion(String aTitulo, int aId_usuario) {
		Seccion seccion = new Seccion();
		seccion.setTitulo_seccion(aTitulo);
		try {
			seccion.setCreada_por(UsuarioDAO.getUsuarioByORMID(aId_usuario));
			SeccionDAO.save(seccion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrarSeccion(int aId_seccion) {
		try {
			BD_Temas bdt = new BD_Temas();
			Tema[] temas = SeccionDAO.getSeccionByORMID(aId_seccion).tiene.toArray();
			if(temas!=null) {
				for(int i=0;i<temas.length;i++) {
					bdt.borrar_Tema(temas[i].getId_tema());
				}
			}
		
			SeccionDAO.deleteAndDissociate(SeccionDAO.getSeccionByORMID(aId_seccion));
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}