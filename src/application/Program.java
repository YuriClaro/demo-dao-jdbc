package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		System.out.print("Qual o id do seller devo puxar?: ");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(x);
		
		System.out.println(seller);
		
		sc.close();
	}

}
