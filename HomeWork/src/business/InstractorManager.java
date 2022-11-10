package business;

import java.util.List;

import Logger.Loggin;
import abstrct.InstractorDao;
import entites.Instractor;

public class InstractorManager {
	private InstractorDao _instractorDao;
	private List<Instractor> _instractor;
	private Loggin[] _logger;
	
	public InstractorManager(InstractorDao _instracorDao, List<Instractor> _instractor, Loggin[] _logger) {
		this._instractorDao=_instractorDao;
		this._instractor=_instractor;
		this._logger=_logger;
		
	}

	public void add(Instractor instructor) {
		 _instractorDao.add(instructor);
		 _instractor.add(instructor);
		 
		 for (Loggin loggers : _logger) {
			 loggers.Log();
		}
	 }

}
