import java.util.Scanner;
import java.util.Random;

public class Constructor {
	private static Scanner scanner;
	public String dificultate;
	public String[][] tabla=new String[10][10];
	public int x,y,numere,mine;
	Random rand = new Random();
	public int linieb1,linieb2,linieb3,linieb4,linieb5;
	public int coloanab1,coloanab2,coloanab3,coloanab4,coloanab5;
	private Scanner scanner1;
	private Scanner scanner2;
	
	public void verificare_dificultate() {
		System.out.println("Introduceti dificultatea(Usor/Mediu/Greu):");
		scanner = new Scanner(System.in);
		dificultate=scanner.nextLine();
		switch(dificultate)
		{
		case "Usor": {this.x=2; 
					  this.y=2;
					  this.numere=3;
					  this.mine=1;
					  linieb1=rand.nextInt(2)+0;
					  coloanab1=rand.nextInt(2)+0;
					break;
					}
		case "Mediu":{
					  this.x=3;
				      this.y=3;
				      this.numere=6;
				      this.mine=3;
				      linieb1=rand.nextInt(3)+0;
					  coloanab1=rand.nextInt(3)+0;
					  linieb2=rand.nextInt(3)+0;
					  coloanab2=rand.nextInt(3)+0;
					  linieb3=rand.nextInt(3)+0;
					  coloanab3=rand.nextInt(3)+0;
					break;
						}
		case "Greu":{ this.x=4;
				      this.y=4;
				      this.numere=11;
				      this.mine=5;
				      linieb1=rand.nextInt(3)+0;
					  coloanab1=rand.nextInt(3)+0;
					  linieb2=rand.nextInt(3)+0;
					  coloanab2=rand.nextInt(3)+0;
					  linieb3=rand.nextInt(3)+0;
					  coloanab3=rand.nextInt(3)+0;
					  linieb4=rand.nextInt(3)+0;
					  coloanab4=rand.nextInt(3)+0;
					  linieb5=rand.nextInt(3)+0;
					  coloanab5=rand.nextInt(3)+0;
					break;}
		default: System.out.println("Nu ati introdus dificultatea bine!");
					break;
		}
	}
	public void Tabla()
	{
		for(int i=0;i<this.x;i++) {
			for (int j=0;j<this.y;j++) {
				tabla[i][j]="X";
			}
		}
 	}
	
	public void Afisare() {
		for(int i=0;i<this.x;i++) {
			for (int j=0;j<this.y;j++) {
				System.out.print(this.tabla[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public boolean Introducere() {
		System.out.println("Introduceti linia: ");
		scanner1 = new Scanner(System.in);
		int linie=scanner1.nextInt();
		System.out.println("Introduceti coloana: ");
		scanner2 = new Scanner(System.in);
		int coloana=scanner2.nextInt();
		switch(dificultate) {
		case "Usor": {
						if(linie==linieb1 && coloana==coloanab1) {
							System.out.println("Ai pierdut!");
							tabla[linieb1][coloanab1]="1";
							for(int i=0;i<this.x;i++) {
								for (int j=0;j<this.y;j++) {
									System.out.print(this.tabla[i][j]+" ");
								}
								System.out.println();
							}
							return false;
							}
						else {
							tabla[linie][coloana]="0";
							for(int i=0;i<this.x;i++) {
								for (int j=0;j<this.y;j++) {
									System.out.print(this.tabla[i][j]+" ");
								}
								System.out.println();
							}
							numere=numere-1;
							if(numere==0){
								System.out.println("Ai castigat!");
								return false;
							}
							else
							{
							System.out.println("Mai ai de introdus "+numere+" pozitii!");
							}
						}
						break;
					 }
			
		case "Mediu": {
						if((linie==linieb1 && coloana==coloanab1) || (linie==linieb2 && coloana==coloanab2) || (linie==linieb3 && coloana==coloanab3)) {
							System.out.println("Ai pierdut!");
							tabla[linieb1][coloanab1]="1";
							tabla[linieb2][coloanab2]="1";
							tabla[linieb3][coloanab3]="1";
							for(int i=0;i<this.x;i++) {
								for (int j=0;j<this.y;j++) {
									System.out.print(this.tabla[i][j]+" ");
								}
								System.out.println();
							}
							return false;
							}
						else {
							tabla[linie][coloana]="0";
							for(int i=0;i<this.x;i++) {
								for (int j=0;j<this.y;j++) {
									System.out.print(this.tabla[i][j]+" ");
								}
								System.out.println();
							}
							numere=numere-1;
							if(numere==0){
								System.out.println("Ai castigat!");
								return false;
							}
							else
							{
							System.out.println("Mai ai de introdus "+numere+" pozitii!");
							}
						}				
						break;
					  }
		case "Greu": {
						if((linie==linieb1 && coloana==coloanab1) || (linie==linieb2 && coloana==coloanab2) || (linie==linieb3&& coloana==coloanab3) || (linie==linieb4 && coloana==coloanab4) || (linie==linieb5&&coloana==coloanab5)) {
							System.out.println("Ai pierdut!");
							tabla[linieb1][coloanab1]="1";
							tabla[linieb2][coloanab2]="1";
							tabla[linieb3][coloanab3]="1";
							tabla[linieb4][coloanab4]="1";
							tabla[linieb5][coloanab5]="1";
							for(int i=0;i<this.x;i++) {
								for (int j=0;j<this.y;j++) {
									System.out.print(this.tabla[i][j]+" ");
								}
								System.out.println();
							}
							return false;
							}
						else {
							tabla[linie][coloana]="0";
							for(int i=0;i<this.x;i++) {
								for (int j=0;j<this.y;j++) {
									System.out.print(this.tabla[i][j]+" ");
								}
								System.out.println();
							}
							numere=numere-1;
							if(numere==0){
								System.out.println("Ai castigat!");
								return false;
							}
							else
							{
							System.out.println("Mai ai de introdus "+numere+" pozitii!");
							}
						}			
						break;
					 }
		}
		return true;
		
	}
}