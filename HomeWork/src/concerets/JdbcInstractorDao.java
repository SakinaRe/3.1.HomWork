package concerets;

import abstrct.InstractorDao;
import entites.Instractor;

public class JdbcInstractorDao implements InstractorDao{

	@Override
	public void add(Instractor instractor) {
		System.out.println("JDBC ile Instractor eklendi."+instractor.getFirstName());
		
	}

}
