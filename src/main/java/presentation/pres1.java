package presentation;

import dao.DaoImpl;
import dao.DaoImpl2;
import dao.IDao;
import metier.Imetier;
import metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {

        DaoImpl D1 = new DaoImpl();
        DaoImpl2 D2 = new DaoImpl2();

        IDao dao = new DaoImpl();
        Imetier metier = new MetierImpl(dao);

        System.out.println(D2.getData());



    }
}
