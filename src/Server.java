import java.lang.reflect.Array;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    private static Socket s;
    public static void main(String[] args) throws IOException{
        int number,type,day,cat,month,c=0,x,count=0;
        String answer,data;
        String[] a;
        ServerSocket ss = new ServerSocket(9999);

        while (true){
            s = ss.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());
            Scanner sc = new Scanner(s.getInputStream());
            if(count==0) {
                System.out.println("client connect");
            }
            data = sc.next();
            System.out.println(data);
            a = data.split("-");
            cat = Integer.parseInt(a[0]);
//            System.out.println(cat);

            if(cat == 1){
                day = Integer.parseInt(a[1]);
                type = Integer.parseInt(a[2]);
                answer = Day.fortune(day,type);
                System.out.println(answer);
                ps.println(answer);
                count++;
            }
            else if(cat == 2){
                number = Integer.parseInt(a[1]);
                month = Integer.parseInt(a[2]);
                answer = Zodiac.fortune(number,month);
                System.out.println(answer);
                ps.println(answer);
                count++;
            }
            else{
                answer = "There is no category.";
                ps.println(answer);
                break;
            }

            if(count>0){

                if(sc.hasNext()){
                    x = sc.nextInt();
                    System.out.println(x);
                    if(x==0) {
                        break;
                    }
                    else {
                        System.out.println("again");
                    }
                }
            }
        }













    }




}

//    ServerSocket ss=new ServerSocket(3333);
//    Socket s=ss.accept();
//    DataInputStream din=new DataInputStream(s.getInputStream());
//    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
//    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//
//    String str="",str2="";
//        while(!str.equals("stop")){
//                str=din.readUTF();
//                System.out.println("client says: "+str);
//                str2=br.readLine();
//                dout.writeUTF(str2);
//                dout.flush();
//                }
//                din.close();
//                s.close();
//                ss.close();
