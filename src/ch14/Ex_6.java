package ch14;
import java.io.*;
import java.util.stream.*;
public class Ex_6 {
	public static void main(String[] args) {
		File[] fileArr = {new File("EX1.java"),new File("Ex1.bak"),new File("Ex2.java"),new File("EX1"), new File("EX1.txt")};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println);
		
		fileStream = Stream.of(fileArr);
		fileStream.map(File::getName).filter(s->s.indexOf('.')!=-1).map(String::toUpperCase).distinct().forEach(System.out::print);
		System.out.println();
	}

}
