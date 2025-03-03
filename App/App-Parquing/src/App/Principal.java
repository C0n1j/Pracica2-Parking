/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *@author jovcubni
 * @author Andrei
 */


public class Principal {
    static Terminal terminal;
    //al hacerlo de forma static, la clase terminal pertenece a la clase principal y no a un objeto
    public static void main(String[] args) {
        terminal=new Terminal();
        terminal.setVisible(true);//de esta forma ejecutamos la clase terminal dentro de esta
    }
}