/* David Robinson */
/* Method that determines the least angle formed by the hour and minute hand for a clock given the inputted hours and minutes */

class Solution {
    public double angleClock(int hour, int minutes) {
        double min_dec = 0, hour_dec = 0, angle_hour = 0;
        double total_outer_angle = 360, total_inner_angle = 0;
        int angle_min = 0;
        
        /* Making sure inputs are valid */
        if (minutes >= 0 && minutes <= 59 && hour >= 1 && hour <= 12) {
            
            /* Hour 12 is at a 0 angle */
            if (hour == 12) {
                hour -= 12;
            }
            min_dec = (double) minutes / 60;
            /* Tells how far the hour is in between */
            hour_dec = hour + min_dec;
            /* Calculating the angles for the hours and minuts, since a circle is 360 degrees */
            angle_hour = hour_dec * 30;
            angle_min = minutes * 6;
            if(angle_min > angle_hour) {
                total_inner_angle = angle_min - angle_hour;
            } else {
                total_inner_angle = angle_hour - angle_min;
            }
            total_outer_angle -= total_inner_angle;
        }
        /* Checking which angle is smaller, and returning it */
        if (total_inner_angle > total_outer_angle) {
            return total_outer_angle;
        } else {
            return total_inner_angle;
        }
    }
}
