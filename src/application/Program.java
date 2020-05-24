/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

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
        
        for(Seller obj : list){
            System.out.println(obj);
        }
                
    }
    
}
