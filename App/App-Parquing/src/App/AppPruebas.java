/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.time.LocalDateTime;

/**
 *
 * @author Andrei
 */
public class AppPruebas {
    public static void main(String[] args) {
        Ticket tiket1= new Ticket("6662DTR", LocalDateTime.MAX, 0, 0);
        Ticket tiket2= new Ticket("6374ACR", LocalDateTime.MAX, 0, 1);
        
        System.out.println(tiket1);
        System.out.println(tiket2);
    }
}
