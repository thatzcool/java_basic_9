package java_advanced.day24.jsonbased_chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//채팅서버 실행클래스가 하는 일에 대해 기술하세요
//클라이언트의 연결 요청을 수락하고 통신용 SocketClient를 생성하는 역할을 한다.
  import org.json.*;
public class ChatServer {
   //3개의 필드
    ServerSocket serverSocket;  // 클라이언트의 연결 요청 수락
    ExecutorService threadPool = Executors.newFixedThreadPool(100); //100개의 클라이언트가 동시에 채팅할 수 있도록 운영하기 위해
    Map<String,SocketClient> chatRoom = new Collections.synchronizedMap(new HashMap<>()); //통신용 SocketClient를 관리하는 동기화된 Map 컬렌션이다.


    //메소드 : 서버 시작 채팅서버가 시작할때 가장 먼저 호출되는 메소드
    //50001번 Port에 바인딩하는 ServerSocket을 생성하고 작업스레드가 처리할 Runnable을 람다식 ()->{....} 제공
    public void start() throws IOException {
        serverSocket = new ServerSocket(50001);
        System.out.println("Server started");

        Thread thread = new Thread(
                ()->{
                    try{
                        while(true){    //람다식이 하는일을 개발자가 아래와 같이 2가지를 지정함
                            Socket socket = serverSocket.accept();   //1. accpet()로 연결을 수락
                            SocketClient client = new SocketClient();  //2. 통신용 SocketClient를 반복해서 생성한다.
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }
        );
        thread.start();

    }
}
