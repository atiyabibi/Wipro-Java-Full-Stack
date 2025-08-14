package Logic_Building;

import java.util.Scanner;

public class RoobotMovement {
	public static String  moveRobot(int gridX,int gridY, String startPos, String instructions) {
        String []parts=startPos.split("-");
        int x=Integer.parseInt(parts[0]);
        int y=Integer.parseInt(parts[1]);
        char dir=parts[2].charAt(0);
        String []moves=instructions.split(" ");
        boolean invalidMove=false;
        for(String move:moves){
            switch(move){
                case "M":
                int newX=x;
                int newY=y;
                switch(dir){
                    case 'N':newY+=1;break;
                    case 'S':newY-=1; break;
                    case 'E': newX+=1; break;
                    case 'W': newX -=1; break;
                }
                if(newX<0||newX>gridX||newY<0|| newY>gridY){
                    invalidMove=true;
                    break;
                }
                x=newX;
                y=newY;
                break;
                case "L":
                dir=turnLeft(dir);
                break;
                case "R":
                dir=turnRight(dir);
                break;
            }
            if(invalidMove) break;
        }
        String result=x+"-"+y+"-"+dir;
        if(invalidMove) result+="-ER";
        return result;
	}
    private static char turnLeft(char dir){
        switch(dir){
            case 'N': return 'W';
            case 'W': return 'S';
            case 'S': return 'E';
            case 'E': return 'N';
        }
        return dir;
    }
     private static char turnRight(char dir){
        switch(dir){
            case 'N': return 'E';
            case 'E': return 'S';
            case 'S': return 'W';
            case 'W': return 'N';
        }
        return dir;
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	s.nextLine();
	String start=s.nextLine();
	String ins=s.nextLine();
	System.out.println(moveRobot(x,y,start,ins));
	s.close();
	}

}
