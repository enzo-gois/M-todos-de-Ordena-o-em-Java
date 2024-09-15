import java.util.Arrays;

public class MergeSort {
		
	static void sort(int vetor[], int aux[], int low, int high){

		if (low >= high) {
			return;			
		}

		int mid = (low + high) / 2;

		sort(vetor, aux, low, mid);

		sort(vetor, aux, mid + 1, high);

		merge(vetor, aux, low, mid, high);
	
	}
	
	static void merge(int vetor[], int aux[], int low, int mid, int high){

		int i = low;
		int j = mid + 1;
	
		for (int k = low; k <= high; k++) {
			aux[k] = vetor[k];		
		}

		for (int k = low; k <= high; k++){

			if (i > mid) {
				vetor[k] = aux[j++];			
			}else if (j > high) {
				vetor[k] = aux[i++];			
			}else if (aux[j] < aux[i]) {
				vetor[k] = aux[j++];			
			}else {
				vetor[k] = aux[i++];			
			}
		}
		System.out.println(Arrays.toString(vetor));
	}
	
	public static void main(String[] args) {
		int vetor[] = {5,7,3,2,9,10,4,1};
		int aux[] = new int[vetor.length];
		sort(vetor, aux, 0, vetor.length -1);
	}

}
