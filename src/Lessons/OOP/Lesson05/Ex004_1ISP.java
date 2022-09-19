package Lessons.OOP.Lesson05;

// Interface segregation principle
// Клиенты не должны реализовывать интерфейсы,
// которые они не используют.
// Данный принцип требует разделения «толстых»
// интерфейсов на несколько специализированных,
// связанных общей функциональностью.

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