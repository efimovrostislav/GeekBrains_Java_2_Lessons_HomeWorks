public enum WorkDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    private String name;
    private int number;



    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

//   WorkDays(String name, int number) {
//        this.name = name;
//        this.number = number;
//    }

    public static void method(WorkDays workDays){
        switch (workDays){
            case MONDAY:
                System.out.println("Сегодня понедельник, до конца рабочей недели осталось 120 часа");
                break;
            case TUESDAY:
                System.out.println("Сегодня вторник, до конца рабочей недели осталось 96 часов");
                break;
            case WEDNESDAY:
                System.out.println("Сегодня среда, до конца рабочей недели осталось 72 часа");
                break;
            case THURSDAY:
                System.out.println("Сегодня четверг, до конца рабочей недели осталось 48 часов");
                break;
            case FRIDAY:
                System.out.println("Сегодня пятница, до конца рабочей недели осталось 24 часа");
                break;
            case SATURDAY:
                System.out.println("Сегодня cуббота, выходной!!!");
                break;
            case SUNDAY:
                System.out.println("Сегодня воскресенье, завтра на работу");
                break;
        }
    }
}
