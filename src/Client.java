import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException{
        int type,day,cat,number,month,c=0,x;
        String answer,data;
        Socket s = new Socket("localhost",9999);
        System.out.println("How is your destiny today?");
        Scanner sc = new Scanner(System.in);

        while(true){
            PrintStream ps = new PrintStream(s.getOutputStream());
            System.out.println("What type do you want to fortune?");
            System.out.println("1 : Birthday\n" +
                    "2 : Zodiac");
            cat = sc.nextInt();
            if(cat == 1){
                System.out.println("1 : Sunday\n" +
                        "2 : Monday\n" +
                        "3 : Tuesday\n" +
                        "4 : Wednesday\n" +
                        "5 : Thursday\n" +
                        "6 : Friday \n" +
                        "7 : Saturday");
                day = sc.nextInt();
                System.out.println("1 : Work\n" +
                        "2 : Money\n" +
                        "3 : Love");
                System.out.println("Choose what you want to know :");
                type = sc.nextInt();
                data = cat + "-" +day + "-" + type;
                ps.println(data);
                c++;
            }
            else if(cat == 2){
                System.out.println("Input your birthday (dd mm) : ");
                number = sc.nextInt();
                month = sc.nextInt();
                data = cat + "-" + number + "-" + month;
                System.out.println(data);
                ps.println(data);
                c++;
            }
            else {
                ps.println();
                break;
            }
            Scanner sc1 = new Scanner(s.getInputStream());
            answer = sc1.nextLine();
            System.out.println(answer);

            if(c>0){
                System.out.println("Do you want to fortune again?");
                System.out.println("0 : No\n" +
                        "1 : Yes");
                x=sc.nextInt();
                ps.println(x);
                if(x==0){
                    break;
                }
            }

        }



    }


}
//
//    Socket s=new Socket("localhost",3333);
//    DataInputStream din=new DataInputStream(s.getInputStream());
//    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
//    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//
//    String str="",str2="";
//        while(!str.equals("stop")){
//                str=br.readLine();
//                dout.writeUTF(str);
//                dout.flush();
//                str2=din.readUTF();
//                System.out.println("Server says: "+str2);
//                }
//
//                dout.close();
//                s.close();
