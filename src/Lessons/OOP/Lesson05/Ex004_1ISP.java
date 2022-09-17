package Lessons.OOP.Lesson05;

// Interface segregation principle
// Принцип разделения интерфейса
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
//   И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

public class Ex004_1ISP {
    public static void main(String[] args) {

    }
}

interface Phone {
    void Call();
    void SendSMS();
    void SendEmail();
    void SendFax();
}

class Siemens implements Phone {

    @Override
    public void Call() {
        // TODO Auto-generated method stub.
    }

    @Override
    public void SendSMS() {
        // TODO Auto-generated method stub.
    }

    @Override
    public void SendEmail() {
        // TODO Auto-generated method stub.
    }

    @Override
    public void SendFax() {
        // TODO Auto-generated method stub.
    }
}

class Nokia3310 implements Phone {

    @Override
    public void Call() {
        // TODO Auto-generated method stub.
    }

    @Override
    public void SendSMS() {
        // TODO Auto-generated method stub.
    }

    @Override
    public void SendEmail() {
        // TODO Auto-generated method stub.
    }

    @Override
    public void SendFax() {
        // TODO Auto-generated method stub.
    }
}