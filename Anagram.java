package anagram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Anagram {
	
	String sort(String s){
		char temp;
		char[] c = s.toCharArray();
		for(int i=0; i<c.length; i++){
			for (int j=i; j<c.length; j++){
				if(c[i]>c[j]){
					temp=c[i];
					c[i]= c[j];
					c[j]=temp;
				}
			}
		}
		String result = new String(c);
		return result; 
	}
	
	public static void main(String[] args) {
		int max=0;
		int noOfStrings = 0;
		String[] s1 = {"ba","ab","bac","cab","abc","farhan","nahraf","rafnah","hanfar","abcdef","fedcba"};
		int length=0;
		Anagram ob  = new Anagram();
		
		//maximum length calculate
		for(int i=0;i<s1.length;i++)
		{
			if(max<s1[i].length())
			{
				max=s1[i].length();
				
			}
		}
		
		//counts the max value strings
		for(int j=0; j<s1.length;j++){
			if(s1[j].length()==max)
				noOfStrings++;
		}
		System.out.println(noOfStrings);
		String[] maxvaluestrings= new String[noOfStrings];
			int i=0;
			for(int j=0; j<s1.length;j++){	
				if(s1[j].length()==max){
					maxvaluestrings[i]=s1[j];
					i++;
				}
			
			}
				System.out.println(Arrays.toString(maxvaluestrings));
				String[] s=new String[noOfStrings];
		for(int k=0; k<noOfStrings; k++){
			s[k]=ob.sort(maxvaluestrings[k]);
		}
		System.out.println(Arrays.toString(s));
		
		
		//count the number of anagram
		int[] count = new int[noOfStrings];
		for(int j=0;j<s.length;j++){
			for(int k=0;k<s.length;k++){
			if(	s[j].equals(s[k])){
				count[j]++;
				}
			}
		}
		System.out.println(Arrays.toString(count));
		int maxCount=0;
		for(int j=0;j<count.length-1;j++){
			maxCount=count[0];
			if(count[j+1]>maxCount)
			maxCount=count[j+1];
		}
	System.out.println("Max count: "+maxCount);
	}

}
