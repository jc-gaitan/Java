/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

import static java.lang.Thread.sleep;

/**
 *
 * @author Argenis Figueroa
 */
public class productor extends Thread {
    
    private Buffer buffer;
    private final String letras = "abcdefghijk";

    public productor(Buffer buffer) {
        this.buffer = buffer;
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            char c = letras.charAt((int) (Math.random() * letras.length()));
            buffer.poner(c);
            System.out.println(i + " productor: " + c);
             try{
                sleep(100);
            }catch(InterruptedException e){
            } 
        }
    }
}
