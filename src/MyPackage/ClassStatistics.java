package MyPackage;
import java.util.*;

public class ClassStatistics {
	private int AA;
	private int BA;
	private int BB;
	private int CB;
	private int CC;
	private int DC;
	private int DD;
	private int ToplamOgrenciSayisi;
	static Scanner sc = new Scanner(System.in);
	boolean notsayısıgir = false;
	
	public void setAA(int AA) {
        this.AA = AA;
    }
	public int getAA() {
        return AA;
    }
 
 
	public void setBA(int BA) {
        this.BA = BA;
    }
	public int getBA() {
        return BA;
    }
 
 
	public void setBB(int BB) {
        this.BB = BB;
    }
	public int getBB() {
        return BB;
    }
 
 
	public void setCB(int CB) {
        this.CB = CB;
    }
	public int getCB() {
        return CB;
    }
 
 
	public void setCC(int CC) {
        this.CC = CC;
    }
	public int getCC() {
        return CC;
    }
 
 
	public void setDC(int DC) {
        this.DC = DC;
    }
	public int getDC() {
        return DC;
    }
 
 
	public void setDD(int DD) {
        this.DD = DD;
    }
	public int getDD() {
        return DD;
    }
 
	public void setToplamOgrenciSayisi(int ToplamOgrenciSayisi) {
        this.ToplamOgrenciSayisi = ToplamOgrenciSayisi;
    }
	public int getToplamOgrenciSayisi() {
        return AA+BA+BB+CB+CC+DC+DD;
    }
	
	 public void baslikYazdır() {
			System.out.println("****************************************");
			System.out.println("*** CLASS GRADES STATISTICS PROGRAM  ***");
			System.out.println("****************************************");
		}
	 
	 public void menuYazdir() {
			System.out.println("MENU:");
			System.out.println("(1) Please enter the number of students for each letter grade of success");
			System.out.println("(2) Print textual statistics");
			System.out.println("(3) Print graphical statistics");
			System.out.println("(4) Reset all data");
			System.out.println("(5) Terminate");
		}
	 
	 public void notSayisiGir() {
		 	System.out.print("Please enter the number of students who has AA: ");
			this.setAA(sc.nextInt());
			System.out.print("Please enter the number of students who has BA: ");
			this.setBA(sc.nextInt());
			System.out.print("Please enter the number of students who has BB: ");
			this.setBB(sc.nextInt());
			System.out.print("Please enter the number of students who has CB: ");
			this.setCB(sc.nextInt());
			System.out.print("Please enter the number of students who has CC: ");
			this.setCC(sc.nextInt());
			System.out.print("Please enter the number of students who has DC: ");
			this.setDC(sc.nextInt());
			System.out.print("Please enter the number of students who has DD: ");
			this.setDD(sc.nextInt());
			this.setToplamOgrenciSayisi(ToplamOgrenciSayisi);
			System.out.print("Total number of students "+this.getToplamOgrenciSayisi()+"\n");
			notsayısıgir = true;
		}
	 
public void metinselIstatistikYazdir() {
		 
		 if(notsayısıgir == false) {
			 System.out.println("WARNING: Numeric data has not been entered for letter grades yet!");
			 return;
		 }
		 
		 double yuzdeAA = (double) this.getAA() / this.getToplamOgrenciSayisi() * 100;
		 double yuzdeBA = (double) this.getBA() / this.getToplamOgrenciSayisi() * 100;
		 double yuzdeBB = (double) this.getBB() / this.getToplamOgrenciSayisi() * 100;
		 double yuzdeCB = (double) this.getCB() / this.getToplamOgrenciSayisi() * 100;
		 double yuzdeCC = (double) this.getCC() / this.getToplamOgrenciSayisi() * 100;
		 double yuzdeDC = (double) this.getDC() / this.getToplamOgrenciSayisi() * 100;
		 double yuzdeDD = (double) this.getDD() / this.getToplamOgrenciSayisi() * 100;
		 
		 System.out.printf("AA: %.2f%%\n", yuzdeAA);
		 System.out.printf("BA: %.2f%%\n", yuzdeBA);
		 System.out.printf("BB: %.2f%%\n", yuzdeBB);
		 System.out.printf("CB: %.2f%%\n", yuzdeCB);
		 System.out.printf("CC: %.2f%%\n", yuzdeCC);
		 System.out.printf("DC: %.2f%%\n", yuzdeDC);
		 System.out.printf("DD: %.2f%%\n", yuzdeDD);
		 
		 
	 }

public void grafikselIstatitikYazdir() {
	 
	 if(notsayısıgir == false) {
		 System.out.println("WARNING: Numeric data has not been entered for letter grades yet!");
		 return;
	 }
	 
	 double yuzdeAA = (double) this.getAA() / this.getToplamOgrenciSayisi() * 100;
	 double yuzdeBA = (double) this.getBA() / this.getToplamOgrenciSayisi() * 100;
	 double yuzdeBB = (double) this.getBB() / this.getToplamOgrenciSayisi() * 100;
	 double yuzdeCB = (double) this.getCB() / this.getToplamOgrenciSayisi() * 100;
	 double yuzdeCC = (double) this.getCC() / this.getToplamOgrenciSayisi() * 100;
	 double yuzdeDC = (double) this.getDC() / this.getToplamOgrenciSayisi() * 100;
	 double yuzdeDD = (double) this.getDD() / this.getToplamOgrenciSayisi() * 100;
	 
	 yuzdeAA = Math.round(yuzdeAA*10) / 10.0;
	 yuzdeBA = Math.round(yuzdeBA*10) / 10.0;
	 yuzdeBB = Math.round(yuzdeBB*10) / 10.0;
	 yuzdeCB = Math.round(yuzdeCB*10) / 10.0;
	 yuzdeCC = Math.round(yuzdeCC*10) / 10.0;
	 yuzdeDC = Math.round(yuzdeDC*10) / 10.0;
	 yuzdeDD = Math.round(yuzdeDD*10) / 10.0;
	 
	 int yıldızAA = (int) Math.round(this.getAA() * 50.0 / this.getToplamOgrenciSayisi());
	 int yıldızBA = (int) Math.round(this.getBA() * 50.0 / this.getToplamOgrenciSayisi());
	 int yıldızBB = (int) Math.round(this.getBB() * 50.0 / this.getToplamOgrenciSayisi());
	 int yıldızCB = (int) Math.round(this.getCB() * 50.0 / this.getToplamOgrenciSayisi());
	 int yıldızCC = (int) Math.round(this.getCC() * 50.0 / this.getToplamOgrenciSayisi());
	 int yıldızDC = (int) Math.round(this.getDC() * 50.0 / this.getToplamOgrenciSayisi());
	 int yıldızDD = (int) Math.round(this.getDD() * 50.0 / this.getToplamOgrenciSayisi());
	 
	 
	 System.out.println("    0   10   20   30   40  50  60   70   80   90   100");
	 System.out.println("    |    |    |   |    |   |   |    |    |    |      |");
	 System.out.println("    **************************************************");
	 
	 System.out.print("AA: ");
	 for(int i =0; i <= yıldızAA; i++) {
		 System.out.print("*");
	 }
	 
	 System.out.print("\nBA: ");
	 for(int j =0; j <= yıldızBA; j++) {
		 System.out.print("*");
	 }
	 
	 System.out.print("\nBB: ");
	 for(int k =0; k <= yıldızBB; k++) {
		 System.out.print("*");
	 }
	 
	 System.out.print("\nCB: ");
	 for(int l =0; l <= yıldızCB; l++) {
		 System.out.print("*");
	 }
	 
	 System.out.print("\nCC: ");
	 for(int m =0; m <= yıldızCC; m++) {
		 System.out.print("*");
	 }
	 
	 System.out.print("\nDC: ");
	 for(int n =0; n <= yıldızDC; n++) {
		 System.out.print("*");
	 }
	 
	 System.out.print("\nDD: ");
	 for(int s =0; s <= yıldızDD; s++) {
		 System.out.print("*");
	 }
	 System.out.println();
	 
	}

public void verileriSifirla() {
	 
	 this.setAA(0);
	 this.setBA(0);
	 this.setBB(0);
	 this.setCB(0);
	 this.setCC(0);
	 this.setDC(0);
	 this.setDD(0);
	 this.setToplamOgrenciSayisi(0);
	 notsayısıgir = false;
	 System.out.println("All data reseted!");
	}

public ClassStatistics(int AA,int BA,int BB,int CB,int CC,int DC,int DD) {

    this.AA = AA;
    this.BA = BA;
    this.BB = BB;
    this.CB = CB;
    this.CC = CC;
    this.DC = DC;
    this.DD = DD;
    ToplamOgrenciSayisi = AA+BA+BB+CB+CC+DC+DD;
	}

public static void main(String[] args) {
 	ClassStatistics ders = new ClassStatistics(0, 0, 0, 0, 0, 0, 0);
    int userinput;
	ders.baslikYazdır();
	
	do {
		ders.menuYazdir();
		System.out.print("Select operation: ");
		userinput = sc.nextInt();
		System.out.println("----------------");
		
		if(userinput==1) {
			ders.notSayisiGir();
		}
		
		else if(userinput==2) {
			ders.metinselIstatistikYazdir();
		}
		
		else if(userinput==3) {
			ders.grafikselIstatitikYazdir();
		}
		
		else if(userinput==4) {
			ders.verileriSifirla();
		}
		
		else if(userinput > 5 || userinput < 1) {
				
			System.out.print("WARNING: A number between 1 and 5 must be selected to perform an operation!\n"
					+ " Press any key to continue and then press ENTER key: ");
			sc.next();
		}
		
	} while(userinput != 5);
	
	System.out.println("Terminated.");
	}
}
