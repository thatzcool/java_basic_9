package javabasic_02.day07;

public class MovieTest {

    public static void main(String[] args) {

        Movie movie1 = new Movie();

        movie1.movieTitle ="아바타";
        movie1.movieStartDay = "2022.12.14";
        movie1.actor = "제이크 설러";
        movie1.genre = "액션";
        movie1.runningTime = "192";
        movie1.movieLevel = "12세";

        System.out.println("영화제목 " + movie1.movieTitle);

    }
}
