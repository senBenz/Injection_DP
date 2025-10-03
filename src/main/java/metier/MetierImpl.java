package metier;

import dao.IDao;


public class MetierImpl implements Imetier{
     private IDao dao = null ;

     public MetierImpl(IDao dao) {
        this.dao = dao;

    }

    @Override
    public double calcul() {
         double total=dao.getData();
         return total+2;

    }
}
