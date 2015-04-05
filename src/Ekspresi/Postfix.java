/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatornano.q;
import Operand.BilanganArab;
import java.util.*;
import Operand.BilanganRomawi;
/**
 *
 * @author FiqieUlya
 */
public class PostFix {
    protected String ekspresi; /*!ekspresi dalam bentuk postfix*/
    protected String operandType; /*!tipe operand yang sedang dikenainya*/
    protected BilanganArab hasil; /*!hasil '=' perhitungan*/
    
    PostFix() { //default ctor
	ekspresi = "";
	hasil = new BilanganArab();
	operandType = "ARAB";
    }

    PostFix(String _operandType) { //ctor
	ekspresi = "";
	hasil = new BilanganArab();
	operandType = _operandType;
    }
    PostFix(String _ekspresi, String _operandType) { //ctor
	ekspresi = _ekspresi;
	//std::transform(ekspresi.begin(), ekspresi.end(), ekspresi.begin(), ::toupper);
	operandType = _operandType;
	Hitung();
}


    PostFix(PostFix P) { //cctor
	ekspresi = P.ekspresi;
	hasil = P.hasil;
}


    public PostFix operatorequal(PostFix P) { //assign
	ekspresi = P.ekspresi;
	hasil = P.hasil;
	return this;
}
    protected void Hitung(){
        //melakukan perhitungan berdasarkan ekspresi yang menghasilkan Operand hasil
	Stack<BilanganArab> tabEkspresi = new Stack<BilanganArab>();
	BilanganArab temp;

	Vector<String> Strings = new Vector<String>();
	int x=0;
	for (int i=1; i<ekspresi.length(); i++) {
		if (ekspresi.charAt(i) ==  ' ') {
			String s = ekspresi.substring(x, i-x);
                        Strings.add(s);
			x = i+1;
		}
	}
	if (ekspresi.length() > 0)
                Strings.add(ekspresi.substring(x, ekspresi.length()));

	for (int i=0;i<Strings.size();i++) {
		if (Strings.get(i).equals("+")){   // .compare("+") == 0) {
			assert(!tabEkspresi.empty());
			temp = tabEkspresi.peek();
			tabEkspresi.pop();
			assert(!tabEkspresi.empty());
			tabEkspresi.peek().plus(temp);
		} else if (Strings.get(i).equals("-")) {
			assert(!tabEkspresi.empty());
			temp = tabEkspresi.peek();
			tabEkspresi.pop();
			assert(!tabEkspresi.empty());
			tabEkspresi.peek().minus(temp);
		} else if (Strings.get(i).equals("*")) {
			assert(!tabEkspresi.empty());
			temp = tabEkspresi.peek();
			tabEkspresi.pop();
			assert(!tabEkspresi.empty());
			tabEkspresi.peek().multiplication(temp);
		} else if (Strings.get(i).equals("/")) {
			assert(!tabEkspresi.empty());
			temp = tabEkspresi.peek();
			tabEkspresi.pop();
			assert(!tabEkspresi.empty());
			tabEkspresi.peek().division(temp);

		} else if (Strings.get(i).equalsIgnoreCase("DIV")) {
			assert(!tabEkspresi.empty());
			temp = tabEkspresi.peek();
			tabEkspresi.pop();
			assert(!tabEkspresi.empty());
			tabEkspresi.peek().Div(temp);
		} else if (Strings.get(i).equalsIgnoreCase("MOD")) {
			assert(!tabEkspresi.empty());
			temp = tabEkspresi.peek();
			tabEkspresi.pop();
			assert(!tabEkspresi.empty());
			tabEkspresi.peek().modulo(temp); 
		} else if (Strings.get(i).equalsIgnoreCase("AND")) {
			assert(!tabEkspresi.empty());
			temp = tabEkspresi.peek();
			tabEkspresi.pop();
			assert(!tabEkspresi.empty());
			//tabEkspresi.peek().operatorand((temp));
		} else if (Strings.get(i).equalsIgnoreCase("OR")) {
			assert(!tabEkspresi.empty());
			temp = tabEkspresi.peek();
			tabEkspresi.pop();
			assert(!tabEkspresi.empty());
			//tabEkspresi.peek().operatoror((temp));
		} else if (Strings.get(i).equalsIgnoreCase("XOR")) {
			assert(!tabEkspresi.empty());
			temp = tabEkspresi.peek();
			tabEkspresi.pop();
			assert(!tabEkspresi.empty());
			//tabEkspresi.top().operatorxor((temp));
		} else {
			//Memasukkan operand ke dalam stack
			if (operandType.equalsIgnoreCase("ARAB")) {
				//tabEkspresi.push(new BilanganArab(Strings[i]));
			} else if (operandType.equalsIgnoreCase("ROMAWI")) {
				//tabEkspresi.push(new Romawi(strings[i]));
			} else if (operandType.equalsIgnoreCase("LOGIKA")) {
				//tabEkspresi.push(new Logika(strings[i]));
			}
			
		}
	}
	assert(!tabEkspresi.empty());
	hasil = tabEkspresi.peek();
    }
    public BilanganArab getHasil() {
	return hasil;
    }
    public String getEkspresi() { return ekspresi; } //mengembalikan string ekspresi postfix
    public void printEkspresi() { System.out.println(getEkspresi());} //mencetak string ekspresi ke layar
    public void printHasil() {
//mencetak nilai Operand hasil ke layar
	if (operandType.equalsIgnoreCase("ROMAWI")) {
		BilanganRomawi R = (BilanganRomawi ) hasil;
                System.out.println(R.getRomawi());
		
	} else {
		System.out.println(hasil.getNilai());
	}
}
}










