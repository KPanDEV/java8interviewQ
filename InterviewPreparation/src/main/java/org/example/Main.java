package org.example;

import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> lsData = Arrays.asList(23, 28, 34, 25, 67, 38, 29, 10, 10, 23);
        String data = "Something went wrong";

        List<String> str1 = Arrays.asList("Soemthing, went , wring", "Something ,went wrong");
        List<String> str2 = Arrays.asList("Who, knows");

        //below code for find first duplice or non duplicate element in list
       /*Character dataC = data.chars().
               mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
               .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
               .entrySet()
               .stream()
               .filter(entry ->  entry.getValue() == 2L)
               .map(entry -> entry.getKey())
               .findFirst()
               .get();

       System.out.println(dataC);
*/
        ///Sortung using stream
        //lsData.stream().sorted().forEach(System.out::println);//Default sorting

        //lsData.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);//desc order sorting

        /*Stream<String> streamdata = Stream.concat(str1.stream(), str2.stream());
        streamdata.forEach(System.out::println);

        lsData.stream().
                map(i -> i * i * i)
                .filter(i -> i > 50)
                .forEach(System.out::println);

        str1.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);// convert stream of String in upperCase
*/
        Set<Integer> dupsData = new HashSet<>();
        List<String> strData = Arrays.asList("AA", "BB", "CC", "DD", "AA", "CC");
        List<String> strData1 = null;
        Map<String, Long> mapData = strData.stream().
                filter(x -> Collections.frequency(strData, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(mapData);

        Optional<Integer> data1 = lsData.stream().max(Integer::compare);
        //System.out.println(data1.get());

        Map<String, Long> mapData1 = Arrays.stream(data.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));


        //System.out.println(mapData1);
        List<Integer> intData = Arrays.asList(24, 24, 21, 66, 23, 56, 67, 88, 4478, 667777, 669, 55);
        intData.stream()
                .filter(x -> x % 2 != 0);
        //.forEach(System.out::println);

        Set<Integer> intSetData = new HashSet<>();
        List<String> dupsData1 = Arrays.asList("Python", "C++", "Java", "Python");
        // lsData.stream().filter(intSetData::add).forEach(System.out::println);
        List<String> dupsCollectData = dupsData1.stream().distinct().collect(Collectors.toList());
        //System.out.println(dupsCollectData);

        String strData2 = "Something is wrong in the code";
        Map<Character, Long> collectFreq = new HashMap<>();
        Map<Character, Long> strFreq = strData2.chars().
                mapToObj(x -> Character.toLowerCase(Character.valueOf((char) x)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(strFreq);
        String strJoinData = dupsData1.stream().collect(Collectors.joining(",", "[", "]"));
        //System.out.println(strJoinData);

        intData.stream().
                filter(n -> n % 5 == 0).forEach(System.out::println);

        int[] a = new int[]{23, 34, 1, 12, 3, 5, 69};
        int[] b = new int[]{99, 32, 1, 45, 23, 67, 98};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
        //System.out.println(Arrays.toString(c));
        List<Integer> intData1 = Arrays.asList(99, 32, 1, 45, 23, 67, 98);
        //Arrays.stream(c).limit(3).forEach(System.out::println);

        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        //System.out.println("Prinitng data for S1="+s1);
        //System.out.println("Prinitng data for S2="+s2);

        int d = 123678;
        int sumNumbers = Stream.of(String.valueOf(d).split("")).mapToInt(Integer::parseInt).sum();
        //System.out.println(sumNumbers);

        //Optional<Integer>intData2 =
        Optional<Integer> intData2 = intData1.stream().sorted(Comparator.reverseOrder()).limit(2).min(Comparator.naturalOrder());
        //intData2.min( n -> Comparator);
        // System.out.println(intData2);

        /*dupsData1.stream().
                sorted(Comparator.comparing(String::length)).forEach(System.out::println);
*/
        String reverded = Arrays.stream(strData2.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
       // System.out.println(reverded);


        int [] originalArray = new int[]{1,48,38,18,398,18};
        int [] reversedArray =IntStream.rangeClosed(1, originalArray.length).
                map(m -> originalArray[originalArray.length -m]).toArray();

        //System.out.println(Arrays.toString(reversedArray));
        int [] tenNatNum =IntStream.rangeClosed(1,10).map(n -> n*2).toArray();
       // System.out.println(Arrays.toString(tenNatNum));

        Map<String, Long> mostRepeatedMap=dupsData1.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<String, Long> mostRepeatedString =mostRepeatedMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        //System.out.println(mostRepeatedString);

        String forPalinNum = "radar";
        Boolean isPlainDromeOrNot =
                IntStream.range(0,forPalinNum.length()/2)
                        .noneMatch(i -> forPalinNum.charAt(i) != forPalinNum.charAt(forPalinNum.length()-i-1));
      //  System.out.println("Number is PalinDrome or Not ="+

        List<String> lsString = Arrays.asList("Damn", "true","4whom", "5kim");
        lsString.stream().
                filter(i-> Character.isDigit(i.charAt(0)));

        List<Integer> lsInt = Arrays.asList(23,99,23,85,38,99);
        Set<Integer> lsSet = new HashSet<>();
        lsInt.stream().
                    filter(i -> !lsSet.add(i));

    }


}
