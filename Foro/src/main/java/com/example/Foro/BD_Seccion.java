package com.example.Foro;

import java.util.Vector;

import org.orm.PersistentException;

import foro.SeccionCriteria;
import foro.SeccionDAO;


public class BD_Seccion {
	public BD_Principal _bD_Principal;
	public Vector<Seccion> _unnamed_Seccion_ = new Vector<Seccion>();

	public foro.Seccion[] Secciones(int aId_usuario, String aFormaOrdenar) {
		try {
			foro.Seccion[] lista = SeccionDAO.listSeccionByCriteria(new SeccionCriteria());
			
			return lista;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hghjh");
		return null;
	}
	public foro.Seccion buscarSeccion(int aId_seccion){
		try {
			foro.Seccion seccion = SeccionDAO.getSeccionByORMID(aId_seccion);
			return seccion;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}