package abraham_problem2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCounter {
	private Integer wordCounter;
	Map<String,Integer> list;
	void count(String dataFile) throws NullPointerException, FileNotFoundException{
		//Create All the objects below
		list = new HashMap<String,Integer>();
		File x = new File(dataFile);
		Scanner reader = new Scanner(x);
		while(reader.hasNext()) {
			String word = reader.next();
			wordCounter = list.get(word);
			if(wordCounter!=null) {
				list.put(word,wordCounter+1);
				System.out.println("I think this works");
			}else {
				list.put(word,1);
				System.out.println("Second strike");
			}
		}
		reader.close();
		}
	
	void write(String outputFile){
		//Writing to a file with a hashmap might be tricky, do some more research into it later and come back
		try {
	    //Initialize everything here
		FileWriter author = new FileWriter(outputFile);
		for(Map.Entry<String,Integer>entry:list.entrySet()) {
			author.write(entry.getKey() + "\t" + entry.getValue() + "\n");
			
		
		}
		
		
		author.close();
		}catch(IOException e) {
			System.out.println("You have an IOException on your hands.");
		}
		
		}
		}


