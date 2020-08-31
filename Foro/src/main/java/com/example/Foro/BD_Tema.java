package com.example.Foro;

import java.util.Vector;

import org.orm.PersistentException;

import foro.SeccionDAO;
import foro.Tema;
import foro.TemaCriteria;
import foro.TemaDAO;
import foro.UsuarioDAO;
// import FORO.Tema;
// import interfaz.Tema;

public class BD_Tema {
	public BD_Principal _bD_Principal;
	public Vector<Tema> _unnamed_Tema_ = new Vector<Tema>();

	public void crearTema(String aTitulo, String aSubtitulo, int aId_seccion, int aId_usuario) {
		foro.Tema tema = new foro.Tema();
		tema.setNombre(aTitulo);
		tema.setNum__likes(0);
		try {
			tema.setPertenece_a(SeccionDAO.getSeccionByORMID(aId_seccion));
			tema.setCreado_por(UsuarioDAO.getUsuarioByORMID(aId_usuario));
			TemaDAO.save(tema);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void meGustaTema(int aId_tema, int aId_usuario) {
		try {
			foro.Usuario user = UsuarioDAO.getUsuarioByORMID(aId_usuario);
			user.le_da_me_gusta.add(TemaDAO.getTemaByORMID(aId_tema));
			UsuarioDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrarTema(int aId_tema, int aId_usuario) {
		try {
			foro.Tema tema = TemaDAO.getTemaByORMID(aId_tema);
			TemaDAO.delete(tema);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public foro.Tema[] Temas(int aId_usuario, String aFormaOrdenar) {
		try {
			foro.Tema[] temas=TemaDAO.listTemaByCriteria(new TemaCriteria());
			return temas;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Tema[] buscarTema(String aTema) {
		throw new UnsupportedOperationException();
	}
	public foro.Tema[] temasDeSeccion(int aIdseccion) {
		int j=0;
		int i=0;
		foro.Tema[] temas;
		try {
			temas = TemaDAO.listTemaByCriteria(new TemaCriteria());
			foro.Tema[] devolver = new foro.Tema[temas.length];
			for( i=0;i<temas.length;i++) {
				if(temas[i].getPertenece_a().getId__seccion()==aIdseccion) {
					devolver[j]=temas[i];
					j++;
				}
			}
			System.out.println(j);
			foro.Tema[] otro = new foro.Tema[j];
			for( i=0;i<j;i++) {
				otro[i]=devolver[i];
			}
			return otro;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}