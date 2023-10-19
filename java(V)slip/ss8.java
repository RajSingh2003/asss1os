import java.util.Scanner;

class Clock 
{
    int hours;
    int minutes;
    int seconds;
    String amPm;

    public Clock(int hours, int minutes, int seconds) 
	{
        if (isValidTime(hours, minutes, seconds)) 
		{
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.amPm = (hours < 12) ? "AM" : "PM";
            this.hours = (hours > 12) ? hours - 12 : hours;
        } 
		else 
		{
            System.out.println("Invalid time values. Setting to default time (12:00:00 AM).");
            this.hours = 12;
            this.minutes = 0;
            this.seconds = 0;
            this.amPm = "AM";
        }
    }

    private boolean isValidTime(int hours, int minutes, int seconds) 
	{
        return (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59);
    }

    public void displayTime() 
	{
        System.out.printf("Time: %02d:%02d:%02d %s%n", hours, minutes, seconds, amPm);
    }
}

public class ss8
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter hours (0-23): ");
        int hours = s.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int minutes = s.nextInt();
        System.out.print("Enter seconds (0-59): ");
        int seconds = s.nextInt();

        Clock clock = new Clock(hours, minutes, seconds);
        clock.displayTime();

    }
}