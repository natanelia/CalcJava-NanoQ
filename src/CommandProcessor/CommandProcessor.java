/* File		: CommandProcessor.java			    		*/
/* Author	: Nitho Alif Ibadurrahman (13513072)	*/

class CommandProcessor{
	public void ShowMem(int n){
		System.out.println("Proses ShowMem " + n);
	}
	
	public void ShowAll(){
		System.out.println("Proses ShowMem Semua");
	}

	public void Redo(int n){
		System.out.println("Proses Redo " + n);
	}

	public void Undo(int n){
		System.out.println("Proses Undo " + n);
	}

}
