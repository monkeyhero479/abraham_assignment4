package abraham_problem1;
import java.io.FileNotFoundException;

public class Application {
	
public static void main(String[] args)throws FileNotFoundException{
	
	DuplicateRemover bruh = new DuplicateRemover();
	bruh.remove("problem1.txt");
	bruh.write("unique_words.txt");
}

}