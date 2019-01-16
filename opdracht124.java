package com.company.Hoofdstuk12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class opdracht124 {

    public static void main(String[] args) throws IOException {
boolean isPresent=false;
Integer index=null;
        int array[]={1,2,4,3,6,4};
        System.out.println("Typ het nummer");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        Integer number=Integer.valueOf(input);

        for (int i=0;i<array.length;i++){
            if (array[i]==number){
                isPresent=true;
                index=i;
            }
        }
if (isPresent==true){
    System.out.println("Element is bij index");
}else{
    System.out.println("Element is niet bij index");
}
    }




}
