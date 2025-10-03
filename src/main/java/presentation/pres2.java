package presentation;

import dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(new File("conf.txt"));
        String daoClass = sc.nextLine();
        Class Cdao = Class.forName(daoClass);
        IDao DAO = (IDao) Cdao.newInstance();
        System.out.println(DAO.getData());








    }
}
