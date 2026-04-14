

// public class countvowel {
//     public static int countvowels(String str){
//         int count=0;
//         for(int i=0; i<str.length(); i++){
//             char ch=str.charAt(i);

//         if(ch =='a' || ch=='e'  ||  ch =='i' || ch=='o'|| ch =='u' ){
//              count ++;

//         }
//         }
//          return count;
//     }
//     public static void main(String[] args) {
//         String str ="hello world";
//         int result =countvowels(str);
//         System.out.println("vowels:"+result);
        
//     }
// }


public class count{
    public static int countvowwels(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
               if(ch=='a' || ch=='A'){
                System.out.println("vowels:A/a" );
               }if(ch =='e' || ch=='E'){
                System.out.println("vowels :E/e");
               }if(ch =='i' || ch=='I'){
                System.out.println("vowels:I/i");
               }if(ch=='o' || ch=='O'){
                System.out.println("vowels: o/O");
               
            //  if(ch =='a' || ch=='e'  ||  ch =='i' || ch=='o'|| ch =='u' ){
             // count ++;
        }}
         return count;
    }
    public static void main(String[] args) {
        String str="Aditya Raj";
        int result=countvowwels(str);
        System.out.println("vowels:"+result);
    }
}