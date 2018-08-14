/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonwordstextreader_Esteban;

import static commonwordstextreader_Esteban.TextReaderUI.steps;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public final class Story {
    
    public ArrayList<Words> wordList = new ArrayList<>();

    public Story(String text){
      String[] temp = text.split("\\s+");
      steps+=3;
      sortText(temp);
      sortByCount(wordList);
      
    }
    
    
    
    //sorting words based on new occuences of words, if not new incement the words count
    public void sortText(String[] temp){
        wordList.add(new Words(temp[0]));
        for(int i =0; i< temp.length; i++){
            steps++;
            for(int j = 0; j < wordList.size(); j++){
                steps++;
                if(wordList.get(j).word.equals(temp[i])){       
                  wordList.get(j).increment();
                  break;
                }else if(j +1  == wordList.size()){
                    wordList.add(new Words(temp[i]));
                    wordList.get(j+1).increment();
                    break;
                }
        }
             } 
            
        }

    public void sortByCount(ArrayList<Words> words){
        int k;
        int indexHolder;
        String temp; 
        
        //if current is greater than previous switch places in array
        for (int i = 0; i < words.size(); i++){
            steps++;
            k = words.size() -1;
            
            // by saying k less than -1 + i we can insure that each itteration of I we only find the following highest word count
            //ie when i = 0 the loop finds the highest word count when i= 1 we find the second highest word count and so on
            while (k > -1 + i){
                steps++;
             if (words.get(i).count < words.get(k).count){
                 steps++;
                 temp = words.get(i).word;
                 words.get(i).word = words.get(k).word;
                 words.get(k).word = temp;
                 
                 indexHolder = words.get(i).count;
                 words.get(i).count =words.get(k).count;
                 words.get(k).count = indexHolder;
                 k --;
                } 
             k--;    
            }  
        }
    }

    public ArrayList<Words> GetWordList(){
       return wordList;
    }
}
