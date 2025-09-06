import java.util.Scanner;
public class ArrayOperations{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        int[] arr={20,60,50,10,30,40};
        System.out.println("----This is your array----");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n---This is the operations you can perform in this  array---- \n1.Insertion. \n2.Deletion. \n3.searching.\n4.sorting\n ");
        System.out.println("enter your choice ");
        int n=sc.nextInt();
        if(n==1){
         arr =insertion(sc,arr);
         System.out.println("array after insertion : ");
               for (int i = 0; i < arr.length; i++)
                 {
                     System.out.print(arr[i] + " ");
                 }
        }
        else if(n==2){
                arr=deletion(sc,arr);
                System.out.println("array after deletion : ");
                for (int i = 0; i < arr.length; i++)
                 {
                     System.out.print(arr[i] + " ");
                 }
               
        }
        else if(n==3){
            int index =searching(sc,arr);
            if(index!=-1){
                System.out.print("the element is found in this array "+(index+1));
            }
            else{
                System.out.print("the element is not found in this array ");
            }
        }
        else if(n==4){
            arr=sorting(sc,arr);
            System.out.println("array after sorting : ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
public static int[] insertion(Scanner sc,int[] arr){
    System.out.println("enter the element to be insert : ");
    int ele=sc.nextInt();
    System.out.println("enter the position you want to insert : ");
    int pos=sc.nextInt();
    int newarr[]=new int[arr.length+1];
    for(int i=0;i<pos;i++){
        newarr[i]=arr[i];
    }
    newarr[pos]=ele;
    for(int i=pos;i<arr.length;i++){
        newarr[i+1]=arr[i];
    }
   return newarr;
}
public static int[] deletion(Scanner sc,int[] arr){
    System.out.println("enter the element you want to delete : ");
    int ele=sc.nextInt();
    int pos=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==ele){
            pos=i;
            break;
        }
    }
    if(pos==-1){
        System.out.println("element not found : ");
        
    }
    int newarr[]=new int[arr.length-1];
    for(int i=0;i<pos;i++){
        newarr[i]=arr[i];
    }
    for(int i=pos+1;i<arr.length;i++){
        newarr[i-1]=arr[i];
    }
    return newarr;
}

public static int  searching(Scanner sc,int[] arr){
    System.out.println("enter the element you want to search : ");
    int ele=sc.nextInt();
    boolean isfound=false;
    int index=-1;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==ele){
            isfound=true;
            index= i;
            break;
        }
    }
    return index;
}

public static int[] sorting(Scanner sc,int[] arr){
    int temp;
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        }
    }
    return arr;
}

}