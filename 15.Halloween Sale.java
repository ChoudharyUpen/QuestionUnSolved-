pattern ---- 




status ---- some probelm in my code because out of 2 basic test cases it is not passing one 




my code ----   
class Result {
    public static int howManyGames(int p, int d, int m, int s) {
    int count=1;
    int sum=p;
    while(p>=m &&  sum <s){
       if(p !=m) {
        p=p -d ;
       }
        sum +=p;
        count++;
    }
    return count;
    }
}
