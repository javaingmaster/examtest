package theparent;

import sun.text.resources.ext.BreakIteratorResources_th;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Mainfive {
	public static void main(String[] args) {
		List<String> strings=Arrays.asList("a","b","","dfg","jjj","!");
		System.out.println("strings: "+strings);
		long count=strings.stream().filter(string->string.isEmpty()).count();
		System.out.println("empty is "+count);

		count=strings.stream().filter(string-> string.length()==3).count();
		System.out.println("length 3 is: "+count);

		List<String> filtered=strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());

		System.out.println("list after file is : "+filtered);

		String mergedString=strings.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(","));

		System.out.println("merged is: "+mergedString);

		List<Integer> numbers=Arrays.asList(5,1,3,6,15,8,0,7,7,65);
		List<Integer> square=numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());

		System.out.println("square is : "+square);
		IntSummaryStatistics statistics = numbers.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println("max is : "+statistics.getMax());
		System.out.println("min is : "+statistics.getMin());
		System.out.println("sum is : "+statistics.getSum());
		System.out.println("average is : "+statistics.getAverage());

		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);

		System.out.println("并行");
		count=strings.parallelStream().filter(string->string.isEmpty()).count();
		System.out.println("empty is : "+count);
	}
}
