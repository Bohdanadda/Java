public class Time {
    public int hours;
    public int minutes;

    public Time(int hours,int minutes)
    {
        this.hours = hours;
        this.minutes = minutes;
    }
    public Time addTime(Time otherTime)
    {
        int newHours = this.hours + otherTime.hours;
        int newMinutes = this.minutes + otherTime.minutes;

        if (newMinutes >= 60)
        {
            newHours += newMinutes /60;
            newMinutes = newMinutes % 60;
        }

        if (newHours >= 24)
        {
            newHours = newHours % 24;
        }
        return new Time(newHours,newMinutes);
    }
    public String toString()
    {
        return String.format("%02d:%02d",hours,minutes);
    }
}
