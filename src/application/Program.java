/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

/**
 *
 * @author ferna
 */
public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TESTE 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TESTE 2: seller findByDepartmentId ===");
        Departament departament = new Departament(2, null);
        List<Seller> list = sellerDao.findByDepartament(departament);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: seller findAll ===");
        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 4: seller insert ===");
        Seller newSeller = new Seller(null, "Fernando", "fernando@gmail.com", new Date(), 4000.0, departament);
        sellerDao.insert(newSeller);
        System.out.println("Inserido! Novo ID = "+ newSeller.getId());
        
        System.out.println("\n=== TESTE 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Jonas");
        sellerDao.update(seller);
        System.out.println("Update completo");

    }

}
