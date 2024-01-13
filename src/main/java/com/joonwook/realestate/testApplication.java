package com.joonwook.realestate;

import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testApplication {
    public static void main(String[] args) {

        //Stream 생성
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream  = list.stream();

        String[] arr = {"a","b","c"};
        Stream<String> stream2 = Arrays.stream(arr);

        Stream<String> stream3 = Stream.of("a","b","c");

        //filter : 조건에 맞는 요소만을 Stream으로 반환
        Stream<String> stream4 = Stream.of("apple","banana","cherry","durian");
        stream4 = stream4.filter(str -> str.length()>5);
        stream4.forEach(rs -> System.out.println(rs));

        //map: 각 요소에 대해 매핑 함수를 적용하여 새로운 Stream 반환
        Stream<String> stream5 = Stream.of("apple","banana","cherry");
        Stream<Integer> mappedStream = stream5.map(str -> str.length());
        mappedStream.forEach(rs -> System.out.println(rs));

        //sorted 요소를 정렬하여 Stream으로 반환한다.
        Stream<Integer> stream6 = Stream.of(3,5,1,4);
        Stream<Integer> sortedStream = stream6.sorted();
        sortedStream.forEach(rs -> System.out.println(rs));

        //distinct 중복된 요소를 제거한 Stream을 반환
        Stream<String> stream7 = Stream.of("apple","banana","apple","cherry");
        Stream<String> distinctStream = stream7.distinct();
        distinctStream.forEach(rs -> System.out.println(rs));

        //limit : 처리할 요소의 개수를 제한하여 Stream을 반환합니다.
        Stream<String> stream8 = Stream.of("apple","banana","cherry","durian");
        Stream<String> limitedStream = stream8.limit(1);
        limitedStream.forEach(rs -> System.out.println(rs));

        //배열로 변환
        Stream<String> stream9 = Stream.of("apple","banana","cherry","durian");
        String[] arr2 = stream9.toArray(String[]::new);

        //collect : Stream의 요소를 수집해서 새로운 Collection, List, Set 등으로 반환
        Stream<String> stream10 =  Stream.of("apple","banana","cherry","durian");
        List<String> list2 = stream10.collect(Collectors.toList());

        //anyMatch : 하나 이상의 요소가 조건에 맞는지 검사하여 결과 반환
        Stream<String> stream11 = Stream.of("apple","banana","cherry","durian");
        System.out.println(stream.anyMatch(str -> str.startsWith("a"))); // true 반환
    }
}
