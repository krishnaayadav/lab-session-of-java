/* 
@PROGRAM: Written a program to room class , the attribute of this class is roomno, room type, room area and ac machine .
  in the class member function are setdata and displaydata.
@author: krishna yadav
@date: 1 septmber 2022
*/
 
  class Room
  {
     int roomNo;
     String roomType;
     float roomArea;
     boolean acMachine;
	 
   void setData(int r_no, String r_type, float r_area, boolean r_ac) 
   {
      roomNo = r_no;
      roomType = r_type;
      roomArea = r_area;
      acMachine = r_ac;
    }
void displayData() 
{
System.out.println("The Room No is:"+ roomNo);
System.out.println("the Room Type is:"+ roomType);
System.out.println("the Room Area is:"+ roomArea);
String s = (acMachine)? "yes":"no";
System.out.println("The AC Machine have in it:" + s);
}
public static void main(String ...args)
 {
    Room room1 = new Room();
	Room room2 = new Room();
    room1.setData(708,"NORMAL",240.0f,false);
	room2.setData(405,"DELUX",320.0f,true); 
    room1.displayData();
	room2.displayData();
 }



}
	   
   