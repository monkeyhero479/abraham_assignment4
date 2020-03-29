package abraham_problem1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
//I just nuked my whole project and started over let's hope it works this time
public class DuplicateRemover {
Set<String> uniqueWords=null;

void remove(String dataFile) throws NullPointerException, FileNotFoundException{
	//Create All the objects below
	uniqueWords= new HashSet<String>();
	File x = new File(dataFile);
	Scanner reader = new Scanner(x);
	String word =null;
	String[] counter = null;
	int d=0;
	//Scanning portion of the code
	
	try{
		while(reader.hasNext()){
			word = reader.next().toLowerCase();
			if(uniqueWords.contains(word)) {
				System.out.println("");
			}else {
				uniqueWords.add(word);
			}
		}
		System.out.println(uniqueWords);
	}catch(NullPointerException e){
		System.out.println("we got a null pointer exception on our hands");
	}
	if(reader!=null) {
		reader.close();
		}
	}
//Now time to create the unique_words.txt
void write(String outputFile) {
	File boog = new File(outputFile);
	FileWriter newfile = null;
	String ttt;
	try {
	if(boog.exists()) {
		newfile = new FileWriter(boog,true);
		Iterator adds = uniqueWords.iterator();
		while(adds.hasNext()) {
			ttt = (String)adds.next();
			newfile.write("\n" + ttt);
		}
		newfile.close();
		System.out.println("The upload should be complete by this point.");
	}else {
	}
	}catch(IOException e){	
		}
	}
	}


