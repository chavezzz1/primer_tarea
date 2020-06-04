class tarea{
    public static void main (String[]args){

     System.out.println("Primera tarea de Java");

     for(int i=1;i<=200;i++){

if(i%3==0 && i%5==0){

System.out.println("Tres y Cinco");
}
else 
if(i%3==0){
    System.out.println("Tres");
}
else 
if(i%5==0){
    System.out.println("cinco");
}
else 
System.out.println(i);
     }

    }

}