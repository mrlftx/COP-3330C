package Poem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.nio.file.Path;
public class Searcher{
	
	public static void main(String[] args) {
		ArrayList<Pair> wordStore = new ArrayList<Pair>();
		Pair adder = new Pair("", 0);

		String holder = new String();
		holder.equalsIgnoreCase(holder);

		File file = new File("output.txt");
		int store = 0;
		boolean isIn = false;
		Path filename = Path.of("poem.html");
		Remover strip = new Remover();
		try {
			strip.removeHTML(filename);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try(Scanner sc = new Scanner(new FileInputStream(file))){
			while(sc.hasNext()){
				isIn = false;
				holder = sc.next();
				holder = holder.replaceAll("[,.!?;—$\"“”‘’]", "");
				adder = new Pair("", 0);
				adder.setLeft(holder);
					for(int i = 0; i < wordStore.size(); i++) {
						if(wordStore.get(i).leftEquals(holder)){
							store = wordStore.get(i).getRight();
							store++;
							wordStore.get(i).setRight(store);
							isIn= true;
						}
					}
					if(!isIn) {
						adder.setRight(1);
						wordStore.add(adder);
					}
				

		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Collections.sort(wordStore, Comparator.comparing(pair -> -pair.getRight()));
		for(int i = 0; i < wordStore.size(); i++) {
			adder = wordStore.get(i);
			System.out.println(adder.getLeft() + " " + adder.getRight());
		}
		System.out.println(wordStore.size());
	}
}
