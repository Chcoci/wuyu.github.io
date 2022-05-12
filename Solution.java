import java.util.*;
class Solution {
    public static int romanToInt(char s) {
        int a = 0;
       switch(s){
           case 'M':a=1000;break;
            case 'D':a=500;break;
             case 'C':a=100;break;
              case 'L':a=50;break;
               case 'X':a=10;break;
                case 'V':a=5;break;
                 case 'I':a=1;break;
       }
       return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a,x,num=0;
        x = str.length();
        for(a=0;a<x;){
        	char s = str.charAt(a),m = 0;
        	if(a+1<x) {
        		 m = str.charAt(a+1);
        	}
        	
        	if(romanToInt(s)<romanToInt(m)) {
        		num -= romanToInt(s);
        	}else {
        		num += romanToInt(s);
        	}
        	a++;
            
        }
        System.out.println(num);
    }
}