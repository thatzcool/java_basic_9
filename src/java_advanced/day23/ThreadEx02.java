package java_advanced.day23;

class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }

    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);

        }
    }
}


class User1Thread extends Thread {
    private Calculator calculator;

    public User1Thread() {
        setName("User1Thread");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);
    }
}
class User2Thread extends Thread {
    private Calculator calculator;

    public User2Thread() {
        setName("User2Thread");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50);
    }
}


//Calculator 를 생성해서 User1 과 User2에서 사용하도록 setCalculator()메소드를 호출하고  두 스레드를 시작시키면 알아서 동작한다.

public class ThreadEx02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1Thread user1Thread = new User1Thread();
        user1Thread.setCalculator(calculator);
        user1Thread.start();

        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(calculator);
        user2Thread.start();
    }
}
