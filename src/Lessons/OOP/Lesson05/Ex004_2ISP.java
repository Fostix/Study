package Lessons.OOP.Lesson05;

// Interface segregation principle
// Клиенты не должны реализовывать интерфейсы,
// которые они не используют.
// Данный принцип требует разделения «толстых»
// интерфейсов на несколько специализированных,
// связанных общей функциональностью.

public class Ex004_2ISP {
    public static void main(String[] args) {

    }
}

interface BasePhone {
    void Call();
    void SendSMS();
}

interface Fax {
    void SendFax();
}

interface Email {
    void SendEmail();
}

class IPhone implements BasePhone, Fax, Email {

    @Override
    public void Call() {

    }

    @Override
    public void SendSMS() {

    }

    @Override
    public void SendFax() {

    }

    @Override
    public void SendEmail() {

    }
}

class Nokia3311 implements BasePhone {

    @Override
    public void Call() {

    }

    @Override
    public void SendSMS() {

    }
}