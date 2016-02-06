public class Digits{
public int getFactorialDigits(int n) {
 return (n==0 || n==1)? 1: (int) Math.floor( ((n+0.5)*Math.log(n) - n + 0.5*Math.log(2*Math.PI))/Math.log(10) ) + 1;
}
public int getDigits(int n){
return (n==0 || n==1)? 1: (int) (Math.floor( Math.log10(n)))+ 1;
}
}
