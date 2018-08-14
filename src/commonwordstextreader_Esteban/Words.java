package commonwordstextreader_Esteban;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Words {
    int count;
    String word;
    
    public Words(String word){
        this.word = word;
    }
    
    public void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
