package vetores;

	public class Ex1 {

		public static void main(String[] args) {
	    //Ordem crescente       
		int vetor [] = {1,2,3,4};
		for (int i = 0; i < vetor.length; i++) { 
			System.out.println(vetor[i] + " ");
              			
		}
		System.out.println("-----------");
		 //Ordem decrescente
         for (int i = vetor.length - 1; i >= 0; i--) {
              System.out.println(vetor[i] + " ");			
		}		

	}
	}
	