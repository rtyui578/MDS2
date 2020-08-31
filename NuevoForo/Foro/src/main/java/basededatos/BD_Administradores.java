package basededatos;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.orm.PersistentException;

public class BD_Administradores {
	public BD_Principal _bD_Principal;
	public Vector<Administrador> _administradors = new Vector<Administrador>();

	public List<Integer> listaAdministradores() {
		List<Integer> list = new ArrayList<Integer>();
		try {
			Administrador[] Administrador= AdministradorDAO.listAdministradorByCriteria(new AdministradorCriteria());
			System.out.println(Administrador.length);
			for(int i=0;i<Administrador.length;i++) {
				list.add(Administrador[i].getId_usuario());
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}