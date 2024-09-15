import java.util.Arrays;
import java.util.Random;

public class comparacao {
	
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = rand.nextInt(10001); // Números aleatórios de 0 a 10000
        }
        return randomArray;
    }
	
//	public static void main(String[] args) {
//        int[] sizes = { 50000, 100000, 200000 };
//        double[] executionTimes = new double[3]; // 3 cenários
//
//        for (int i = 0; i < sizes.length; i++) {
//            int size = sizes[i];
//
//            for (int j = 0; j < 30; j++) {
//                int[] randomArray = generateRandomArray(size);
//                int[] arrayCopy = Arrays.copyOf(randomArray, size);
//                int[] aux = new int[arrayCopy.length];
//
//                long startTime = System.nanoTime();
//                sort(arrayCopy,aux,0,arrayCopy.length-1);
//                long endTime = System.nanoTime();
//
//                executionTimes[i] += (endTime - startTime);
//            }
//
//            executionTimes[i] /= 30.0; // Calcula a média dos tempos de execução em nanossegundos
//            executionTimes[i] /= 1e9; // Converter nanossegundos para segundos
//        }
//
//        // Exibir média dos tempos de execução para o Merge Sort em cada cenário
//        System.out.println("Média dos tempos de execução do Merge Sort em segundos:");
//        for (int i = 0; i < sizes.length; i++) {
//            System.out.println("Tamanho do vetor: " + sizes[i]);
//            System.out.println("Merge Sort: " + executionTimes[i] + "s");
//            System.out.println();
//        }
//    }
//	
//	static void sort(int vetor[], int aux[], int low, int high){
//
//		if (low >= high) {
//			return;			
//		}
//
//		int mid = (low + high) / 2;
//
//		sort(vetor, aux, low, mid);
//
//		sort(vetor, aux, mid + 1, high);
//
//		merge(vetor, aux, low, mid, high);
//	
//	}
//	
//	static void merge(int vetor[], int aux[], int low, int mid, int high){
//
//		int i = low;
//		int j = mid + 1;
//	
//		for (int k = low; k <= high; k++) {
//			aux[k] = vetor[k];		
//		}
//
//		for (int k = low; k <= high; k++){
//
//			if (i > mid) {
//				vetor[k] = aux[j++];			
//			}else if (j > high) {
//				vetor[k] = aux[i++];			
//			}else if (aux[j] < aux[i]) {
//				vetor[k] = aux[j++];			
//			}else {
//				vetor[k] = aux[i++];			
//			}
//		}
//	}
		
	
//    public static void main(String[] args) {
//        int[] sizes = { 50000, 100000, 200000 };
//        double[] executionTimes = new double[3]; // 3 cenários
//
//        for (int i = 0; i < sizes.length; i++) {
//            int size = sizes[i];
//
//            for (int j = 0; j < 30; j++) {
//                int[] randomArray = generateRandomArray(size);
//                int[] arrayCopy = Arrays.copyOf(randomArray, size);
//
//                long startTime = System.nanoTime();
//                quickSort(arrayCopy, 0, size - 1);
//                long endTime = System.nanoTime();
//
//                executionTimes[i] += (endTime - startTime);
//            }
//
//            executionTimes[i] /= 30.0; // Calcula a média dos tempos de execução em nanossegundos
//            executionTimes[i] /= 1e9; // Converter nanossegundos para segundos
//        }
//
//        // Exibir média dos tempos de execução para o Quick Sort em cada cenário
//        System.out.println("Média dos tempos de execução do Quick Sort em segundos:");
//        for (int i = 0; i < sizes.length; i++) {
//            System.out.println("Tamanho do vetor: " + sizes[i]);
//            System.out.println("Quick Sort: " + executionTimes[i] + "s");
//            System.out.println();
//        }
//    }
//    
//	public static int posicionaPivo(int vetor[], int lb, int ub) {
//		int pivo = vetor[lb];
//		
//		int left = lb + 1;
//		int right = ub;
//		
//		while (left <= right) {
//            while (left <= right && vetor[left] < pivo) {
//                left++;
//            }
//
//            while (left <= right && vetor[right] > pivo) {
//                right--;
//            }
//
//            if (left <= right) {
//                int temp = vetor[left];
//                vetor[left] = vetor[right];
//                vetor[right] = temp;
//                left++;
//                right--;
//            }
//        }
//
//        int temp = vetor[lb];
//        vetor[lb] = vetor[right];
//        vetor[right] = temp;
//
//        return right;
//	}
//	
//	static void quickSort(int vetor[], int lb, int ub) {
//		
//		if(lb < ub) {
//			int pos = posicionaPivo(vetor, lb, ub);
//			
//			quickSort(vetor, lb, pos -1);
//			quickSort(vetor, pos +1, ub);	
//		}
//	}
    
    public static void main(String[] args) {
        int[] sizes = { 50000, 100000, 200000 };
        double[] executionTimes = new double[3]; // 3 cenários

        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];

            for (int j = 0; j < 30; j++) {
                int[] randomArray = generateRandomArray(size);
                int[] arrayCopy = Arrays.copyOf(randomArray, size);

                long startTime = System.nanoTime();
                bubbleSort(arrayCopy);
                long endTime = System.nanoTime();

                executionTimes[i] += (endTime - startTime);
            }

            executionTimes[i] /= 30.0; // Calcula a média dos tempos de execução em nanossegundos
            executionTimes[i] /= 1e9; // Converter nanossegundos para segundos
        }

        // Exibir média dos tempos de execução para o Bubble Sort em cada cenário
        System.out.println("Média dos tempos de execução do Bubble Sort em segundos:");
        for (int i = 0; i < sizes.length; i++) {
            System.out.println("Tamanho do vetor: " + sizes[i]);
            System.out.println("Bubble Sort: " + executionTimes[i] + "s");
            System.out.println();
        }
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
	}
}