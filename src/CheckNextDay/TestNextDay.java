package CheckNextDay;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNextDay {
    @Test
    public void checkNextDay(){
        int day=24;
        int month=3;
        int year=1999;
        int newDay=day+1;
        String expected=newDay+" "+month+" "+year;
        String result=CheckNextDay.NextDay(day,month,year);

        assertEquals(expected,result);

    }

}
