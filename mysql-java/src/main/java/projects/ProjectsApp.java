package projects;

import projects.dao.DbConnection;

/**
 * @author Matt Johnson
 *
 */

public class ProjectsApp {
	
	/**
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
	        DbConnection.getConnection();
	    
	}

}

