package metier;

import couplage.faible.IDao;

public class MetierImpl2 implements IMetier{
	private IDao dao;
	@Override
	public double calcule() {
		// TODO Auto-generated method stub
		
		double temp=dao.getData();
		double res=temp*20;
		return res;
	}
	// injecter dans la variable dao un object d'une class 
	// qui implements l'interfacce DAO
	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
