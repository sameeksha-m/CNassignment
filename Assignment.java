# End-to-end-delay-with-ack
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		float t1,t2,d1,d2,m,a,s;
		float tdA,pdA,tdR,pdR,routerTime,hostB;
    float ackA=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bandwidth t1 in Mbps: ");
		t1 = sc.nextFloat();
		System.out.println("Bandwidth t2 in Mbps: ");
		t2 = sc.nextFloat();
		System.out.println("Distance from host A to router d1(in km):  ");
		d1 = sc.nextFloat();
		System.out.println("Distance from router to host B d2(in km):  ");
		d2 =  sc.nextFloat();
		System.out.println("Packet size in bits M: "); 
		m = sc.nextFloat();
		System.out.println("Acknowledgement size in bits A: "); 
		a = sc.nextFloat();
		System.out.println("Speed of communication S*10^5(in km/s): ");
		s = sc.nextFloat();
     System.out.println();
		for(int i=1;i<=2;i++)
		{
			tdA = m/(t1*1000);                                        //transmission delay in A
			pdA = d1/(s*100);                                         // propogation delay from A to R
			routerTime =ackA + tdA + pdA;                             // time taken to reach router from A
			System.out.println("Time taken for packet " +i+" to reach router: "+routerTime+" ms");
			tdR = m/(t2*1000);                                        //transmission delay in R
			pdR = (d2/(s*100));                                       //propogation delay from R to B
			hostB = routerTime + tdR + pdR;                           //time taken for the packet to reach host B
			System.out.println("Time taken for packet "+i+" to reach host B: "+hostB+" ms");
			float aB=a/(t2*1000);                                     //transmission delay for acknowledgement at B     
      float aR= a/(t1*1000);                                                      //transmission delay for acknowledgement at R
      float ackR= hostB + aB + pdR;                                               //time taken for acknowledgement to reach R
		  ackA =ackR+ aR + pdA;                                           //time taken for acknowledgement to reach A
			System.out.println("Time after receiving acknowledgement from host B: "+ackA+ " ms");
			System.out.println();
			
		}
	}
}
