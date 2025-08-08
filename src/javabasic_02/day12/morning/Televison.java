package javabasic_02.day12.morning;

public class Televison implements RemoteControl{
    //필드  volume 추가
    private int volume;

    //필드 volume 은 볼륨버튼을 통해 음량을 조정할 수 있다.
    @Override
    public void setVolume(int volume) {
         if(volume >RemoteControl.MAX_VOLUME) {
             this.volume = RemoteControl.MAX_VOLUME;
         }else if(volume <RemoteControl.MIN_VOLUME){
             this.volume = RemoteControl.MIN_VOLUME;
         } else {
             this.volume = volume;
         }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    private int memoryVolume;   // mute 전 원래 볼륨저장

    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음 처리 작동시작");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
            setVolume(this.memoryVolume);
        }

    }

    @Override
    public void trunOn() {
        System.out.println("TV 전원을 켠다");
    }

    @Override
    public void trunOff() {
        System.out.println("TV 전원을 끈다");
    }


}
