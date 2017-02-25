/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhay Goyal
 */
import java.util.*;

public class grocerybill {
    double val[]=new double[5];
    double pay;static int total;
    StringBuffer thingb=new StringBuffer();
    StringBuffer thingvalb=new StringBuffer();
   
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        grocerybill text=new grocerybill();
        grocerybill stat=new grocerybill();
        grocerybill house=new grocerybill();
        grocerybill elect=new grocerybill();
        grocerybill groc=new grocerybill();
        grocerybill c=new grocerybill();
 
        System.out.println("1.Get textiles here\n");
        text=c.computetext(text);
        System.out.println("2.Get stationary here\n");
        stat=c.computestat(stat);
        //System.out.println(""+stat.pay);
        System.out.println("1.Get household items here\n");
        house=c.computehouse(house);
        //System.out.println(""+house.pay);
        System.out.println("1.Get eletrical items here\n");
        elect=c.computeelect(elect);
        //System.out.println(""+elect.pay);
        System.out.println("1.Get groceries here\n");
        groc=c.computegroc(groc);
        System.out.println("This is the final bill");
        text.calculate();     System.out.print(" Discount availed is:"+0.3*text.pay+"\n");
        stat.calculate();     System.out.print(" Discount availed is:"+0.05*stat.pay+"\n");
        house.calculate();    System.out.print(" Discount availed is:"+0.15*house.pay+"\n");
        elect.calculate();    System.out.print(" Discount availed is:"+0.25*elect.pay+"\n");
        groc.calculate();     System.out.print(" Discount availed is:"+0.4*groc.pay+"\n");
        System.out.println("Total payment is without discount is:-"+total);
        double val=0.7*text.pay+0.95*stat.pay+0.85*house.pay+0.75*elect.pay+0.6*groc.pay;
        System.out.println("Total payment with discount is:-"+val);
        
    }

    public void calculate()
    {
        //int valtext=textb.length();
        String s=thingb.toString();
        String s1=thingvalb.toString();int i,j=0;
        for(i=0;i<thingb.length();i++)
        {
            if(s.charAt(i)=='\n')
            {
                System.out.print("   ");
                
                for(;j<thingvalb.length();)
                {
                    if(s1.charAt(j)=='\n')
                    {
                        System.out.print("");
                        j++;
                        break;
                    }
                    System.out.print(s1.charAt(j));
                    j++;
                }
            }
            else
            {
                System.out.print(s.charAt(i));
            }
           
        } 
    }
    public grocerybill computetext(grocerybill text) {
        
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Trousers\n2.Jeans\n3.Shorts\n4.Shirts\n5.T-Shirts");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    text.thingb.append("Trousers\n");
                    //System.out.println(textb);
                    text.thingvalb.append("250\n");
                    text.pay=text.pay+250;
                    total=total+250;
                    break;
                case 2:
                    text.thingb.append("Jeans\n");
                    text.thingvalb.append("350\n");
                    text.pay=text.pay+350;
                    total=total+350;
                    break;
                case 3:
                    text.thingb.append("Shorts\n");
                    text.thingvalb.append("400\n");
                    text.pay=text.pay+400;
                    total=total+400;
                    break;
                case 4:
                    text.thingb.append("Shirts\n");
                    text.thingvalb.append("999\n");
                    text.pay=text.pay+999;
                    total=total+999;
                    break;
                case 5:
                    text.thingb.append("T-Shirts\n");
                    text.thingvalb.append("250\n");
                    text.pay=text.pay+250;
                    total=total+250;
                    break;
            }
            System.out.print("Do u want to continue?\n1.Yes 2.No");
            int cho=sc.nextInt();
            if(cho==1)
                continue;
            else
                return text;
            }      
        }
    
    public grocerybill computestat(grocerybill stat) {
        
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Pen\n2.Pencil\n3.Eraser\n4.Stencil\n5.Ruler");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    stat.thingb.append("Pen\n");
                    stat.thingvalb.append("20\n");
                    stat.pay=stat.pay+20;
                    total=total+20;
                    break;
                case 2:
                    stat.thingb.append("Pencil\n");
                    stat.thingvalb.append("20\n");
                    stat.pay=stat.pay+20;
                    total=total+20;
                    break;
                case 3:
                    stat.thingb.append("Eraser\n");
                    stat.thingvalb.append("5\n");
                    stat.pay=stat.pay+5;
                    total=total+5;
                    break;
                case 4:
                    stat.thingb.append("Stencil\n");
                    stat.thingvalb.append("20\n");
                    stat.pay=stat.pay+20;
                    total=total+20;
                    break;
                case 5:
                    stat.thingb.append("Ruler\n");
                    stat.thingvalb.append("25\n");
                    stat.pay=stat.pay+25;
                    total=total+25;
                    break;
            }
            System.out.print("Do u want to continue?\n1.Yes 2.No");
            int cho=sc.nextInt();
            if(cho==1)
                continue;
            else
                return stat;
            }      
        }
    
    public grocerybill computehouse(grocerybill house) {
        
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Detergent\n2.Dishwash bar\n3.Toothpaste\n4.Scrubber\n5.Toilet Cleaner");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    house.thingb.append("Detergent\n");
                    house.thingvalb.append("100\n");
                    house.pay=house.pay+100;
                    total=total+100;
                    break;
                case 2:
                    house.thingb.append("Dishwash Bar\n");
                    house.thingvalb.append("50\n");
                    house.pay=house.pay+50;
                    total=total+50;
                    break;
                case 3:
                    house.thingb.append("Toothpaste\n");
                    house.thingvalb.append("80\n");
                    house.pay=house.pay+80;
                    total=total+80;
                    break;
                case 4:
                    house.thingb.append("Scrubber\n");
                    house.thingvalb.append("99\n");
                    house.pay=house.pay+99;
                    total=total+99;
                    break;
                case 5:
                    house.thingb.append("Toilet Cleaner\n");
                    house.thingvalb.append("150\n");
                    house.pay=house.pay+150;
                    total=total+150;
                    break;
            }
            System.out.print("Do u want to continue?\n1.Yes 2.No");
            int cho=sc.nextInt();
            if(cho==1)
                continue;
            else
                return house;
            }      
        }
    
    public grocerybill computeelect(grocerybill elect) {
        
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Fan\n2.Tubelight\n3.Bulb\n4.Wires\n5.Supplies");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    elect.thingb.append("Fan\n");
                    elect.thingvalb.append("200\n");
                    elect.pay=elect.pay+200;
                    total=total+200;
                    break;
                case 2:
                    elect.thingb.append("Tubelight\n");
                    elect.thingvalb.append("35\n");
                    elect.pay=elect.pay+35;
                    total=total+35;
                    break;
                case 3:
                    elect.thingb.append("Bulb\n");
                    elect.thingvalb.append("40\n");
                    elect.pay=elect.pay+40;
                    total=total+40;
                    break;
                case 4:
                    elect.thingb.append("Wires\n");
                    elect.thingvalb.append("79\n");
                    elect.pay=elect.pay+79;
                    total=total+79;
                    break;
                case 5:
                    elect.thingb.append("Supplies\n");
                    elect.thingvalb.append("250\n");
                    elect.pay=elect.pay+250;
                    total=total+250;
                    break;
            }
            System.out.print("Do u want to continue?\n1.Yes 2.No");
            int cho=sc.nextInt();
            if(cho==1)
                continue;
            else
                return elect;
            }      
        }
    
    public grocerybill computegroc(grocerybill groc) {
        
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Rice\n2.Dal\n3.Fruits\n4.Vegetables\n5.Curd");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    groc.thingb.append("Rice\n");
                    groc.thingvalb.append("150\n");
                    groc.pay=groc.pay+150;
                    total=total+150;
                    break;
                case 2:
                    groc.thingb.append("Dal\n");
                    groc.thingvalb.append("250\n");
                    groc.pay=groc.pay+250;
                    total=total+250;
                    break;
                case 3:
                    groc.thingb.append("Fruits\n");
                    groc.thingvalb.append("100\n");
                    groc.pay=groc.pay+100;
                    total=total+100;
                    break;
                case 4:
                    groc.thingb.append("Vegetables\n");
                    groc.thingvalb.append("99\n");
                    groc.pay=groc.pay+99;
                    total=total+99;
                    break;
                case 5:
                    groc.thingb.append("Curd\n");
                    groc.thingvalb.append("60\n");
                    groc.pay=groc.pay+60;
                    total=total+60;
                    break;
            }
            System.out.print("Do u want to continue?\n1.Yes 2.No");
            int cho=sc.nextInt();
            if(cho==1)
                continue;
            else
                return groc;
            }      
        }
      
      
}
