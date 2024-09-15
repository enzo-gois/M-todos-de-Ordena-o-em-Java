import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int vetor[] = {6,10,1,3,5,9999,123,345,7,0,-8};
		bubbleSort(vetor);
	}
	
	public static void bubbleSort(int vetor[]) {
		for(int i = 0; i < vetor.length;i++) {
			for(int x = 0;x < vetor.length - 1;x++) {
				if(vetor[x] > vetor[x+1]) {
					int var = vetor[x];
					vetor[x] = vetor[x+1];
					vetor[x+1] = var;
				}
			}			
		}
		System.out.println(Arrays.toString(vetor));
	}
}