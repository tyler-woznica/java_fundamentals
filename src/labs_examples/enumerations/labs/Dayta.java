package labs_examples.enumerations.labs;

public class Dayta {

    public void dayMessage(Day day) {
        switch(day) {
            case MONDAY:
                System.out.println("Start of the workweek...");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            case SATURDAY:
                System.out.println("Time to relax.");
                break;
            case SUNDAY:
                System.out.println("Chill, but prepare for the week.");
                break;
            default:
                System.out.println("Just the middle of the week.");
        }
    }
}
