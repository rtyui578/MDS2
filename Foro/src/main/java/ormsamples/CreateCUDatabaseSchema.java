/**
 * Licensee: Ramón Ramos(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateCUDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(foro.CUPersistentManager.instance());
			foro.CUPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
