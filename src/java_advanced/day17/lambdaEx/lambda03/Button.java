package java_advanced.day17.lambdaEx.lambda03;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClickListener{
         void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
     public void click() {
        this.clickListener.onClick();
     }

    public static void main(String[] args) {
         Button buttonOk = new Button();

         //Ok 버튼 객체에 람다식 주입
        buttonOk.setClickListener(
                ()->{
                    System.out.println("Ok버튼 클릭!");
                }
        );

        //Ok버튼 클릭
        buttonOk.click();

        //Cancle 버튼 객체 생성

        Button buttonCancel = new Button();
        buttonCancel.setClickListener(
                () -> {
                    System.out.println("취소버튼 클릭!");
                }
        );

        for (int i = 0; i < 100 ; i++) {
            buttonCancel.click();
        }

    }
}
