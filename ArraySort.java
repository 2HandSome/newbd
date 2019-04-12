package com.com;

import java.util.*;

public class ArraySortEx {
	public static void main(String[] args){
	
	 Scanner scn = new Scanner(System.in);
	 
	 System.out.print(" Enter N words: ");
	 int numOfWords = scn.nextInt();
	 
	 String s;
	 String[] word = new String[numOfWords];
	 
	 System.out.println(" Enter worda: ");
	 for(int i = 0; i < word.length; i++){
	 	 word[i] = scn.next(); 
		}
		
		    for(int i = 0; i < word.length-1; i++){
		    for(int j = 1; j < word.length; j++){
		      if(word[j -1].length() > word[j].length()){
		       s = word[j -1];
		       word[j-1] = word[j];
		       word[j] = s;
				}
			}
		}
		
		for(int i = 0; i < word.length; i++){
		  System.out.println(word[i]);
		}
		
		scn.close();
	}

}
