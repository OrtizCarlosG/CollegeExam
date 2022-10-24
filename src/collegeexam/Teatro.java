/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeexam;

/**
 *
 * @author carlo
 */
public class Teatro {
    
    private String title, date, time;
    private int dimF, dimC;
    private Butaca[][] seats;
    public Teatro(String title, String date, String time, int dimF, int dimC)
    {
        this.title = title;
        this.date = date;
        this.time = time;
        this.dimF = dimF + 1;
        this.dimC = dimC + 1;
        this.seats = new Butaca[this.dimF][this.dimC];
        initializeSeats();
    }
    
    private void initializeSeats(){
        for (int i = 1; i < this.dimF; i++)
        {
            for (int j = 1; j < this.dimC; j++)
            {
                Butaca seat = new Butaca("Butaca " + i+ " " +j , 800 + (100 * i));
                this.seats[i][j] = seat;
            }
        }
    }
    
    public double takeSeat(int seatF, int seatC)
    {
        this.seats[seatF][seatC].setState(true);
        return this.seats[seatF][seatC].getPrice();
    }
    
    public void vacateSeat(int seatF)
    {
        for(int i = 1; i < this.dimC; i++)
            this.seats[seatF][i].setState(false);
    }
    
    public String getSeats(int seatF)
    {
        String result = "";
        for (int i = 1; i < this.dimC; i++)
            result+= this.seats[seatF][i].toString() + "\n";
        return result;
    }
    
    @Override
    public String toString()
    {
        String result = "Title: "+this.title +" Date: " + this.date+" Time: " + this.time +"\n";
        for (int i = 1; i < this.dimF; i++)
            for (int j = 1; j < this.dimC; j++)
                result += this.seats[i][j].toString() +"\n";
        return result;
    }
}
