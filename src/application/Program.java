/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;
import model.entities.Departament;
import model.entities.Seller;

/**
 *
 * @author ferna
 */
public class Program {
    public static void main(String[] args) {
        Departament obj = new Departament(1, "Books");
        Seller seller =  new Seller(21,"Fernando", "fefis@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
                
    }
    
}
