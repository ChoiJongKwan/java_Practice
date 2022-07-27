package ch14;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;
import java.util.*;

class Student2 {
	String name;
	int ban,score,hak;
	boolean ismale;
	Student2(String name, boolean ismale,int hak,int ban, int score ) {
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
public class Ex_10 {
	public static void main(String[] args) {
		Student2[] stuArr= {
				new Student2("나자바", true,  1,1, 300),
				new Student2("김지미", false, 1,1, 250),
				new Student2("김자바", true,  1,1, 200),
				new Student2("이지미", false, 1,2, 150),
				new Student2("남자바", true,  1,2, 100),
				new Student2("안지미", false, 1,2, 50),
				new Student2("황지미", false, 1,3, 100),
				new Student2("강지미", false, 1,3, 150),
				new Student2("이자바", true,  1,3, 200),
				new Student2("나자바", true,  1,1, 300),
				new Student2("김지미", false, 2,1, 250),
				new Student2("김자바", true,  2,1, 200),
				new Student2("이지미", false, 2,2, 150),
				new Student2("남자바", true, 2,2, 100),
				new Student2("안지미", false,  2,2, 50),
				new Student2("황지미", false, 2,3, 100),
				new Student2("강지미", false, 2,3, 150),
				new Student2("이자바", true, 2,3, 200),
				
		};
			
		System.out.printf("1. 단순 그룹화(성별로 그룹화)\n");
		Map<Boolean, List<Student2>> stuBySex =Stream.of(stuArr).collect(partitioningBy(Student2::isMale));
		List<Student2> maleStudent = stuBySex.get(true);
		List<Student2> fmaleStudent = stuBySex.get(false);
		for(Student2 s: maleStudent) System.out.println(s);
		for(Student2 s: fmaleStudent) System.out.println(s);
		System.out.println();
		System.out.printf("2. 단순분할+ 통계(성별 학생수)\n");
		Map<Boolean, Long> stuNumBtSex = Stream.of(stuArr).collect(partitioningBy(Student2::isMale,counting()));
		System.out.println("남학생수 :"+stuNumBtSex.get(true));
		System.out.println("여학생수 :"+stuNumBtSex.get(false));
		System.out.printf("\n3. 단순분할 + 통계(성별 1등)\n");
		Map<Boolean, Optional<Student2>> topScoreBySex = Stream.of(stuArr).collect(partitioningBy(Student2::isMale,maxBy(comparingInt(Student2::getScore))));
		System.out.println("남학생 1등 :"+topScoreBySex.get(true));
		System.out.println("여학생 1등 :"+topScoreBySex.get(false));
		Map<Boolean, Student2> topScoreBySex2 = Stream.of(stuArr).collect(partitioningBy(Student2::isMale, collectingAndThen(
				maxBy(comparingInt(Student2::getScore)), Optional::get)
				));
		System.out.println("남학생 1등 :"+topScoreBySex2.get(true));
		System.out.println("여학생 1등 :"+topScoreBySex2.get(false));
		System.out.printf("\n4. 다중분할(성별불합격자, 100점이하)\n");
		Map<Boolean,Map<Boolean, List<Student2>>> failedStuBySex= Stream.of(stuArr).collect(partitioningBy(Student2::isMale, partitioningBy(s->s.getScore()<=100)));
		List<Student2> failMaleStu = failedStuBySex.get(true).get(true);
		List<Student2> failFmaleStu = failedStuBySex.get(false).get(true);
		for(Student2 s : failMaleStu)System.out.println(s);
		for(Student2 s : failFmaleStu)System.out.println(s);
	
	}

}