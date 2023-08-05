package com.order;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAndParallelStreamTimeComplexity {

	public static void main (String [] args) {
	
	long startTime1=System.currentTimeMillis();
	StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream)
	.distinct().collect(Collectors.toList()).forEach(System.out::println);
	long endTime1=System.currentTimeMillis();
	System.out.println(endTime1-startTime1);
	
	long startTime2=System.currentTimeMillis();
	StudentDatabase.getAllStudents().parallelStream().map(Student::getActivities).flatMap(List::stream)
	.distinct().collect(Collectors.toList()).forEach(System.out::println);
	long endTime2=System.currentTimeMillis();
	System.out.println(endTime2-startTime2);
	}
}
