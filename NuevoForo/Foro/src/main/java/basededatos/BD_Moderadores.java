package basededatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.orm.PersistentException;


public class BD_Moderadores {
	public BD_Principal _bD_Principal;
	public Vector<Moderador> _moderadors = new Vector<Moderador>();

	public List<Integer> listaModeradores() {
		List<Integer> list = new ArrayList<Integer>();
		try {
			Moderador[] Moderador= ModeradorDAO.listModeradorByCriteria(new ModeradorCriteria());
			for(int i=0;i<Moderador.length;i++) {
				list.add(Moderador[i].getId_usuario());
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}