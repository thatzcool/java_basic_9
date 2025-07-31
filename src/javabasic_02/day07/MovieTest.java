package javabasic_02.day07;

public class MovieTest {

    public static void main(String[] args) {

        Movie movie1 = new Movie();

        movie1.movieTitle = "아바타";
        movie1.movieStartDay = "2022.12.14";
        movie1.actor = "제이크 설러";
        movie1.genre = "액션";
        movie1.runningTime = "192";
        movie1.movieLevel = "12세";

        System.out.println("영화제목 " + movie1.movieTitle);

        //Movie 클래스 타입으로 영화3편을 배열 movieList 에 저장하고
        //저장한 영화의 제목을 iter 방법으로 출력

        Movie movie2 = new Movie();
        movie2.movieTitle = "좀비딸";
        Movie movie3 = new Movie();
        movie3.movieTitle = "킹오브킹스";

        Movie[] movieList = new Movie[3];
        movieList[0] = movie1;
        movieList[1] = movie2;
        movieList[2] = movie3;

        System.out.println("----------각 배열의 인덱스를 참조 출력----------");
        System.out.println("01 영화제목" + movieList[0]);
        System.out.println("01 영화제목" + movieList[1]);
        System.out.println("01 영화제목" + movieList[2]);

        System.out.println("----------iter 참조 출력---------------------");
        for (Movie movie : movieList) {
            System.out.println(movie.movieTitle);
        }
        System.out.println("----------itar 참조 출력---------------------");
        for (int i = 0; i < movieList.length; i++) {
            Movie movie = movieList[i];
            System.out.println(movie.movieTitle);

        }
    }
}
