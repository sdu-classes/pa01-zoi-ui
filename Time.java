public class prac1 {
    public static void main(String[] args) {

        Time time = new Time(23,59,59);
        System.out.println(time);
        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());









    }
}

class  Time{
    private int hour;
    private int minute;
    private  int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int h , int m , int s){
        this.hour = h;
        this.minute = m;
        this.second = second;

    }

    @Override
    public String toString() {
        return hour+ ":" + minute + ":" + second;
    }
    public Time nextSecond() {
        ++second;
        if (second == 60) {
            second = 0;
            ++minute;
            if (minute == 60) {
                minute = 0;
                ++hour;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        --second;
        if (second < 0) {
            second = 59;
            --minute;
            if (minute < 0) {
                minute = 59;
                --hour;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}