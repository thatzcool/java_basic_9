package javabasic_02.day12;

public class User {

    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Televison();
        rc.trunOn();
        rc.setVolume(10);
        rc.setVolume(11);
        rc.setMute(true);
        rc.setMute(false);
        RemoteControl.chageBattery();   //정적 메소드 수행
        rc.

        //리모컨을 통해서 청소기를 동작시키려 한다. rc를 이용하여
        //1. 청소기의 전원을 켜고
        //2. 청소를 10분 시킨다.
        //3. 10분 후 청소기를 끈다

        // TV의 최대 볼륨 확인  public static final은 타입.상수명 바로 접근하여 상수값읽음
        System.out.println(RemoteControl.MAX_VOLUME);
        //TV의 최소 볼륨 확인
        System.out.println(RemoteControl.MIN_VOLUME);




    }
}
