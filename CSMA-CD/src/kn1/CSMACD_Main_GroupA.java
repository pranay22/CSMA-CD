package kn1;
import java.util.Scanner;

/**
 * CSMA/CD Simulator
 * KN1 - Communication Networks 1
 * TU Darmstadt 
 * Summer 2015
 * Group: A:CSMA/CD
 * @author Pranay Sarkar
 *
 */
public class CSMACD_Main_GroupA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hostNumber;					/**< Integer containing number of hosts */
		int transNumber;				/**< Integer containing transmission number*/
		int delayTime;					/**< Integer containing propagation delay*/
		
		Scanner scan = new Scanner(System.in);
		//Number of Clients
		System.out.println("Enter the number of hosts:");
		hostNumber=scan.nextInt();
		 
		// Number of transmissions
		System.out.println("Enter the number of transmissions:(per host)");
		transNumber=scan.nextInt();
		       
		//Propagation delay
		System.out.println("Enter the propagation delay time:");
		delayTime=scan.nextInt();
		 
		//Array container of virtual hosts
		virtualHost[] virtualHosts=new virtualHost[hostNumber];
		//Assign each virtual host thread to each of the virtual hosts
		for(int j=0;j<hostNumber;j++){
			virtualHosts[j]=new virtualHost("EndHost"+j,transNumber,delayTime);
		}
	 	//Starting host threads (start sending)
		for (int i = 0; i < hostNumber; i++) {
			virtualHosts[i].start();
		}
	}
}
