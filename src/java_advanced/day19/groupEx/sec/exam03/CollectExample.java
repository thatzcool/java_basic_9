package java_advanced.day19.groupEx.sec.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		

		List<Student> maleList = totalList.stream().filter(student -> student.getGender().equals("남")).toList();
		maleList.forEach(student -> System.out.println(student.getName()));
		maleList.stream().forEach(s -> System.out.println(s.getName()));

		System.out.println();

		Map<String , Integer>  map = totalList.stream().collect(
				Collectors.toMap(student -> student.getName(), student -> student.getScore())
		);

		System.out.println(map);

	}
}