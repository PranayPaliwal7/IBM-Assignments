import java.util.*;
class MenuDriven{
    public static void main(String[] args) {
 
        Computer first = new Computer(64, "HP", "black", 500, 8);
         
        java.util.ArrayList<Computer> list = new java.util.ArrayList<Computer>();
        list.add(new Computer(234,"apple","silver",1024,12));
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Press 1 : Add a new Computer");
        System.out.println("Press 2 : Display all computers");
        System.out.println("Press 3 : Search for a computer");
        System.out.println("Press 4 : Delete a computer");
        System.out.println("Press 5 : Update Computer Details");
        
        int choice =sc.nextInt();
        
        switch(choice){
        case 1:
            System.out.println("Enter the id");
            int id=sc.nextInt();
            System.out.println("Enter the brand");
            String brand=sc.next();
            System.out.println("Enter the color");
            String color=sc.next();
            System.out.println("Enter the hdd Size");
            int hddSize=sc.nextInt();
            System.out.println("Enter the ram Size");
            int ramSize=sc.nextInt();
            list.add(new Computer(id,brand,color,hddSize,ramSize));
            System.out.println("Succesfully added");
          break;
        case 2: 
          System.out.println("List of the computers  : " + list);
          break;
        case 3:

          System.out.println("By which attribute you want to search the computer?");
          System.out.println("1. color");
          System.out.println("2. brand");
          System.out.println("3. hddSize");
          System.out.println("4. RamSize");
          int at=sc.nextInt();
            switch(at){
                case(1):
                    System.out.println("Which color?");
                    String col=sc.next();
                    for(int i=0;i<list.size();i++){
                      if(list.get(i).getColor().compareTo(col)==0){
                         System.out.println("Computer is : " + list.get(i));
                       }
                      
                    }
                    break;
                case(2):
                    System.out.println("Which brand?");
                    String br=sc.next();
                    for(int i=0;i<list.size();i++){
                      if(list.get(i).getBrand().compareTo(br)==0){
                         System.out.println("Computer is : " + list.get(i));
                       }
                       
                    }
                    break;
                case(3):
                    System.out.println("What is the hdd Size?");
                    int hdd=sc.nextInt();
                    for(int i=0;i<list.size();i++){
                      if(list.get(i).getHddSize()==hdd){
                         System.out.println("Computer is : " + list.get(i));
                       }
                       
                    }
                    break;
                case(4):
                    System.out.println("What is the Ram Size?");
                    int ram=sc.nextInt();
                    for(int i=0;i<list.size();i++){
                      if(list.get(i).getRamSize()==ram){
                         System.out.println("Computer is : " + list.get(i));
                       }
                       
                    }
                    break;
                default:
                    break;
            }
            
      
          break;
        case 4:
            System.out.println("Enter the computer ID which you want to delete.");
            int id1=sc.nextInt();
            for(int i=0;i<list.size();i++){
                if(list.get(i).getid()==id1){
                    list.remove(i);
                    System.out.println("Deleted Succesfully");
                }
                
                
            }

            break;
        case 5:
            System.out.println("Enter the id in which you want to make the updates");
            int idCheck=sc.nextInt();
            System.out.println("Enter the new color");
            String newColor= sc.next();
            System.out.println("Enter the new brand");
            String newBrand=sc.next();
            System.out.println("Enter the new HddSize");
            int newHddSize=sc.nextInt();
            System.out.println("Enter the new RamSize");
            int newRamSize=sc.nextInt();
            int index=0;
            int flag=0;
            for(int i=0;i<list.size();i++){
                if(list.get(i).getid()==idCheck){
                    index=i;
                    flag=1;

                }
            }
            if(flag==1){
                    list.set(index, new Computer(list.get(index).getid(), newBrand, newColor,newHddSize, newRamSize));
                    System.out.println("Updated Succesfully");
            }
            
            break;
        default:
            break;
        }
}
}
}
 
 
 
class Computer{
    String brand, color;
    int id, hddSize, ramSize;
 
    Computer(int id, String brand, String color, int hddSize, int ramSize){
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.hddSize = hddSize;
        this.ramSize = ramSize;
    }
    public Integer getid(){
        return this.id;
    }

    public String getColor(){
        return this.color;
    }
 
    public String getBrand(){
        return this.brand;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
     
    public Integer getRamSize(){
        return this.ramSize;
    }
 
    @Override
    public String toString(){
        return "Computer : (" + this.getid()
            + ", " + this.getBrand()
            + ", " + this.getColor()
            + ", " + this.getHddSize()
            + ", " + this.getRamSize()
            + ")";
    }
 
 
}
