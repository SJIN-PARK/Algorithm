package LeetCode;

/*
1041. Robot Bounded In Circle 
 
On an infinite plane, a robot initially stands at (0, 0) and faces north. Note that:

The north direction is the positive direction of the y-axis.
The south direction is the negative direction of the y-axis.
The east direction is the positive direction of the x-axis.
The west direction is the negative direction of the x-axis.
The robot can receive one of three instructions:

"G": go straight 1 unit.
"L": turn 90 degrees to the left (i.e., anti-clockwise direction).
"R": turn 90 degrees to the right (i.e., clockwise direction).
The robot performs the instructions given in order, and repeats them forever.

Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 
 */

public class Robot_Bounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String instruction = "GGLLGG";
		
		int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0, y = 0, dir = 0;
        
        for(char array : instruction.toCharArray()){
        	if(array == 'G'){
        		x = x + dx[dir];
        		y = y + dy[dir];
        	}else if(array == 'L'){
        		dir = (dir + 1) % 4;
        	}else{
        		dir = (dir + 3) % 4;
        	}
        	System.out.println("x : " + x);
        	System.out.println("y : " + y);
        	System.out.println("dir : " + dir);
        }
        
        if(x == 0 && y == 0 || dir != 0){
        	System.out.println("circle");
        }else{
        	System.out.println("no circle");
        }
        
        

	}

}
