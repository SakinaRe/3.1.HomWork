package concerets;

import abstrct.InstractorDao;
import entites.Instractor;

public class HibernateInstractorDao implements InstractorDao{

	@Override
	public void add(Instractor instractor) {
	    System.out.println("Hibernate ile Egitmin Eklendi"+instractor.getFirstName());
	}

}
