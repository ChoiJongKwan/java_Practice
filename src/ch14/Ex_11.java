package ch14;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;
import java.util.*;
class Student3 {
	String name;
	int ban,score,hak;
	boolean ismale;
	Student3(String name, boolean ismale,int hak,int ban, int score ) {
		this.ban=ban;
		this.name=name;
		this.score=score;
		this.hak=hak;
		this.ismale=ismale;
	}

	String getName() {return name;}
	boolean isMale() {return ismale;}
	int getHak()     {return hak;}
	int getBan()     {return ban;}
	int getScore()   {return score;}

	public String toString() {
		return String.format("[%s, %s, %d학년, %d반, %3d점]",name,ismale ? "남":"여",hak,ban,score );
	}
	enum Level{HIGH, MID, LOW}
}
public class Ex_11 {
	public static void main(String[] args) {
		Student3[] stuArr= {
				new Student3("나자바", true,  1,1, 300),
				new Student3("김지미", false, 1,1, 250),
				new Student3("김자바", true,  1,1, 200),
				new Student3("이지미", false, 1,2, 150),
				new Student3("남자바", true,  1,2, 100),
				new Student3("안지미", false, 1,2, 50),
				new Student3("황지미", false, 1,3, 100),
				new Student3("강지미", false, 1,3, 150),
				new Student3("이자바", true,  1,3, 200),
				new Student3("나자바", true,  1,1, 300),
				new Student3("김지미", false, 2,1, 250),
				new Student3("김자바", true,  2,1, 200),
				new Student3("이지미", false, 2,2, 150),
				new Student3("남자바", true, 2,2, 100),
				new Student3("안지미", false,  2,2, 50),
				new Student3("황지미", false, 2,3, 100),
				new Student3("강지미", false, 2,3, 150),
				new Student3("이자바", true, 2,3, 200),

		};
		System.out.println("1.단순그룹화(반별로 그룹화)");
		Map<Integer, List<Student3>> stuByban = Stream.of(stuArr).collect(groupingBy(Student3::getBan));
		for(List<Student3> ban : stuByban.values()) {
			for(Student3 s : ban) {
				System.out.println(s);
			}
		}
		System.out.println("2.단순 그룹화(성적별로 그룹화)");
		

	}
}
