public class Shortestpath {

    public static void Shortestdistance(String str){
        int y=0;
        int x=0;
       
        for(int i=0;i<str.length();i++){
            // String str ="NSEWWWNSW";
            int dir = str.charAt(i);
             
            
            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;

            }else if(dir == 'E'){
                x++;

            }else{
                x--;
            }
        }
        double distance = (x*x + y*y);
        System.out.println(distance);
    }
    public static void main(String[]args){
        String str ="NSEWWWNSW";
        Shortestdistance(str);
    }
    
}

