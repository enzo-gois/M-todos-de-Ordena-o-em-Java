import java.util.Arrays;

public class QuickSort {
	
	public static int posicionaPivo(int vetor[], int lb, int ub) {
		int pivo = vetor[lb];
		
		int left = lb + 1;
		int right = ub;
		
		while (left <= right) {
            while (left <= right && vetor[left] < pivo) {
                left++;
            }

            while (left <= right && vetor[right] > pivo) {
                right--;
            }

            if (left <= right) {
                int temp = vetor[left];
                vetor[left] = vetor[right];
                vetor[right] = temp;
                left++;
                right--;
            }
        }

        int temp = vetor[lb];
        vetor[lb] = vetor[right];
        vetor[right] = temp;

        return right;
	}
	
	static void quickSort(int vetor[], int lb, int ub) {
		
		if(lb < ub) {
			int pos = posicionaPivo(vetor, lb, ub);
			
			quickSort(vetor, lb, pos -1);
			quickSort(vetor, pos +1, ub);	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = {5,0,2,7,1,3,4,8,6};
		quickSort(vetor,0,vetor.length-1);
		
//		int pos = posicionaPivo(vetor,0,vetor.length-1);
//		System.out.println(pos);
	}
}