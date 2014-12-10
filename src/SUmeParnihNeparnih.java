
public class SUmeParnihNeparnih {

	public static void main(String[] args) {
		int pocetak=TextIO.getlnInt();
		int kraj=TextIO.getlnInt();
		int parni=0;
		int neparni=0;
		while (pocetak<=kraj){
			if (pocetak%2==0){
				parni=parni+pocetak;
			}
			else {
				neparni=neparni+pocetak;
			}
		pocetak++;	
		}
		System.out.println("Suma parnih je "+ parni);
		System.out.println("Suma neparnih je" + neparni);
	}

}
