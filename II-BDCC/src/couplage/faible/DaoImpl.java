package couplage.faible;

public class DaoImpl implements IDao{

	@Override
	public double getData() {
		// TODO se connecter a la BDD et recuperer data
		System.out.println("Version base de donnes ::: ");
		double temp=12*40;
		
		return temp;
	}

	
	
	
	
	
	
	
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateClient(String name) {
		// TODO Auto-generated method stub
		
	}

}
