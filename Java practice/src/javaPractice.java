import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class javaPractice {
    public static void main(String[] args) throws IOException {
        //FindDuplicateEntries();
        //FindDuplicateEntries2();
        //FindDuplicatesInString();
        //DuplicatesInString2();
        //reverseString();
        //reverseInteger();
        //reverseInteger2();
        //printonlyAlphaNnum();
        //largestNumber();
        //isArmstrongNum();
        //isPalindrome();
        //Factorialvalue();
        //swappingintegers();
        //swappingStrings();
        //greaterOfNumbers();
        //EvenorOddNumber();
        //SumofDigits();
        //enterInputvalues();
        //FibonacciSeries();
        //isPrimeNum();
        //getPrimeNumber(20);
        //countWordsinSentence();
        //reverseEachWrodInSentence();
        //readDataFromTextfile();
        writeDatatoTextfile();

    }

    public static void FindDuplicateEntries(){
        String str[] = {"java","selenium","C","python","JAVA","c"};
        for(int i=0; i< str.length; i++){
            for(int j=i+1; j< str.length; j++){
                if(str[i].equalsIgnoreCase(str[j])){
                    System.out.println("Duplicate string :"+str[i]);
                }
            }
        }
    }
    public static void FindDuplicateEntries2() {
        String arr[] = {"JAVA", "C++", "selenium", "java", "c++", "java"};
        Set<String> newarr = new HashSet<>();
        for (String s : arr) {
            //newarr.add(s.toUpperCase());
            if(!newarr.add(s.toUpperCase())){
                System.out.println("Duplicate entry :"+s);
            }
        }
        System.out.println("New array :"+newarr);
    }
    public static void FindDuplicatesInString() {
        String s = "sampath selenium test ing ";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j) && s.charAt(i) !=' ' ){ //removing space form printing
                    System.out.println("Duplicate char is :"+s.charAt(i));
                }
            }
        }
    }
    public static void DuplicatesInString2(){
        String s = "sampath java practice";
        int len = s.length();
        Set<String> str = new HashSet();
        for(char ns : s.toCharArray()){
            if(ns != ' ') {
                str.add(String.valueOf(ns));
            }
        }
        System.out.println("NEW string without duplicate chars is :" +str);
    }
    public static void reverseString() {
        String str = "sampath";
        String newstr = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse :"+newstr);

        int len = str.length();
        String revstr = "";
        if(!str.isEmpty()) {
            for(int i=len-1; i>=0; i--){
                revstr = revstr + str.charAt(i);
            } }
        else {
                System.out.println("Please enter input value"); }

        System.out.println("Reverse str :"+revstr);

    }
    public static void reverseInteger() {
        int num = 12345;
        int revnum = 0;
        while(num!=0){
            revnum = revnum*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse int :"+revnum);
    }
    public static void reverseInteger2(){
        int num = 12345;
        int rev = 0;
        for(; num != 0; num =num/10){
            rev = rev*10 + num%10;
        }
        System.out.println("Rever interger for loop :"+rev);
    }
    public static void printonlyAlphaNnum() {
        String str = "asdfg`12345!@#$,.;QWERTY";
        String newstr = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("New String is "+newstr);
    }
    public static void largestNumber(){
        int num[] = {10,5,3,1,2,6,3,1,9,14};
        int max = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
                //System.out.println("I value "+i+" Num value "+num[i]);
            }
        }
        System.out.println("Largest number is :"+max);
        int min = num[0];
        for(int j=0; j<num.length; j++){
            if(num[j]<min){
                min = num[j];
                //System.out.println("J value "+j+" Num value "+num[j]);
            }
        }
        System.out.println("Smallest number is :"+min);

        // another method to print large number
        int max2 = Arrays.stream(num).max().getAsInt();
        int min2 = Arrays.stream(num).min().getAsInt();
        System.out.println("Max is :"+max2+" And Min is :"+min2);
    }
    public static void isArmstrongNum(){
        int num = 420;
        int tem = num;
        int cube =0;
        while(num >0){ // dont use num != 0 as 0 is not armstrong
            int r = num%10;
            num = num/10;
            cube = cube + (r*r*r);
            System.out.println("r value is :"+r+" Num value is :"+num+" Cube value is :"+cube);
        }
        if(cube == tem){
            System.out.println("Given num "+tem+" is Armstrong");
        }
        else {
            System.out.println("Given num "+tem+" is not Armstrong"); }
    }
    public static void isPalindrome(){
        int num = 0;
        int temp = num;
        int pal = 0;
        while(num != 0){
            pal = pal*10 + num%10;
            num = num/10;
        }
        if(pal == temp){
        System.out.println("Num is palindrome :"+temp);}
        else { System.out.println("Num is not palindrome :"+temp);}
    }
    public static void Factorialvalue(){
        int num = 8;
        int fact = 1;
            for(int i=1; i<= num; i++){
                fact = fact*i;
            }
        System.out.println("The Factorial value of "+num +" is :"+fact);
    }
    public static void swappingintegers(){
        int a = 5;
        int b = 10;
        a = a+b; //15
        b = a-b; //5
        a = a-b; //10
        System.out.println("A value is :"+a+" and B value is :"+b);
    }
    public static void swappingStrings(){
        String a ="sampath";
        String b = "selenium";
        int lenA = a.length();
        int lenB = b.length();
        a = a+b;
        b = a.substring(0,lenA);
        a = a.substring(lenA);
        System.out.println("A value is :"+a);
        System.out.println("B value is :"+b);
    }
    public static void greaterOfNumbers(){
        int a = 25;
        int b = 10;
        int c = 18;
        if(a>b && a>c){
            System.out.println("A is the largest number.");
        }
        else if (b>c){
            System.out.println("B is the largest number.");
        }
        else {
            System.out.println("C is the largest number.");
        }
    }
    public static void EvenorOddNumber(){
        int num = 0;
        int Even_count = 0;
        int Odd_count = 0;
        if(num == 0){
            Even_count++;}
        while(num != 0){
            int digit = num%10;
            if (digit%2 == 0){
                //System.out.println("Given number is Even :" +digit);
                Even_count++;
            }
            else {
                //System.out.println("Given number is Odd :"+digit);
                Odd_count++;
            }
            num = num/10;

        }
        System.out.println("total even numbers :"+Even_count);
        System.out.println("total odd numbers :"+Odd_count);

    }
    public static void SumofDigits(){
        int num = 1234567;
        int sum = 0;
        while(num !=0){
            sum = sum+num%10;
            num = num/10;
        }
        System.out.println("Sum of the given numbers :"+sum);
    }
    public static void enterInputvalues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a :");
        int a = sc.nextInt();
        System.out.println("enter number b :");
        int b = sc.nextInt();
        System.out.println("Given a is :"+a+" And b is :"+b);

        System.out.println("Enter First name :");
        String First_name = sc.next();
        System.out.println("Given First name is :"+First_name);
    }
    public static void FibonacciSeries() {
        int n1=0, n2=1, sum=0;
        System.out.print(+n1+" "+n2);
        for(int i=2; i<10; i++){
            sum = n1+n2;
            System.out.print(" "+sum);
            n1 = n2;
            n2 = sum;
        }
    }
    public static void isPrimeNum(){
        int num = 11, counter =0;
        if(num>1){
            for(int i=1; i<=num; i++){
                if(num%i == 0);
                counter++;
            }
            if(counter ==2){
                System.out.println("Given number is prime "+num);
            }
            else {
                System.out.println("Given number is not prime "+num); }
        }
        else {
            System.out.println("Given number is not prime "+num); }
    } // not correct
    public static boolean isPrimeNumber2(int num){
        if (num<=1){ return false; }
        for(int i=2; i<num; i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void getPrimeNumber(int num){
        for(int i=2; i<=num; i++){
            if(isPrimeNumber2(i)){
                System.out.print(+i+" ");
            }
        }
    }
    public static void countWordsinSentence(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String str = sc.nextLine();
        System.out.println("The text entered : "+str);
        int count = 1;
        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ') ){
                count++;
            }
        }
        System.out.println("The words count is : "+count);
    }
    public static void reverseEachWrodInSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Sentence entered is :"+str);

        String[] eachword = str.split(" ");
        String revSentence = "";
            for(String s : eachword){
                String reverseWord ="";
                for(int j=s.length()-1;j>=0; j--){
                    reverseWord = reverseWord+s.charAt(j);
                }
                revSentence = revSentence+reverseWord+" ";
            }
        System.out.println("The reverse sentence is :"+revSentence.toLowerCase());

    }
    public static void readDataFromTextfile() throws IOException {

        FileReader fr = new FileReader("/Users/sampathchinamanagonda/Desktop/javatest.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while((str=br.readLine()) != null){
            System.out.println(str);
        }
        br.close();

    }
    public static void writeDatatoTextfile() throws IOException {
        FileWriter fw = new FileWriter("/Users/sampathchinamanagonda/Desktop/javatestwrite.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Line 1 text"+'\n');
        bw.write("Line 2 text"+'\n');
        bw.write("Line 3 text"+'\n');
        System.out.println("___!!!Finished!!!___");
        bw.close();

    }


}