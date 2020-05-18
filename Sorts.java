package by.java.lesson.mod2;

public class Sorts {
	
	public static void printArr(int[] a, String s) {
		
		
		System.out.println(s+": " );
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
			
		}
		
		System.out.println("\n");
	}
	
	public static void printLabNum(int num) {
		
		System.out.println("Lab 2, Task " + num+"\n");
		
	}
	
	
	/*
		1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
	один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
	дополнительный массив.
	
	 */	
	
	public static void appendArrays(int[] a, int[] b, int k) {
		
		printLabNum(1);
		
		printArr(a,"Array a");
		
		printArr(b,"Array b");
		
		int newArrayLength;
		
		int i;
		
		int d;
		
		newArrayLength = a.length + b.length;
		
		int[] c = new int[newArrayLength];
		
		for(i = 0; i <= k; i++) {

				c[i] = a[i];
								
		}
		
		int n;
		n = i;
		
		for(int j = 0; j < b.length; j++) {
				
			c[n] = b[j];
			n++;
				
		}

		d = k+1;				
			
		for(i = i + b.length ; i < c.length; i++) {
				
						
		    c[i] = a[d];
				
			d++;
				
		}
			
		printArr(c,"New array");

	};
	
	/*	
	2. Даны две последовательности n m a  a  a и b  b  b 1 2 1 2 . Образовать из них новую последовательность
	чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
	*/
	
	
	public static void changeSort2(int[] a) {
		

		int mid;
		mid=0;

		for(int j = 0; j < a.length; j++) {	
		for(int i = 0; i < a.length; i++) {
			
			if(i+1 == a.length) {
				
				break;
				
			} else {
			
			if(a[i] > a[i+1]) {
				
				mid = a[i];
				a[i]= a[i+1];
				a[i+1] = mid;
				
			} 
		  }
			
		 }
		}
	}
	
	
	public static void newSequence(int[] a, int[] b){
		
		int c_length;
		c_length = a.length + b.length;
		
		int[] c = new int[c_length];
		
		printArr(a,"A array");
		printArr(b,"B array");
		
		int index;
		index = 0;
		

				
			for(int j = 0; j < a.length; j++) {
				c[j]=a[j];

				index = j;
			}
			
			int d;
			d = index+1;
			
			for(int m = 0; m < b.length; m++) {
				c[d]=b[m];

				d++;
			}
			
			changeSort2(c);
		
		printArr(c,"C array");	
		
	}

	
	/*		
	3. Сортировка выбором. Дана последовательность чисел n a a a     1 2 .Требуется переставить элементы так,
	чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
	элемент и ставится на первое место, а первый - на место наибольшего.
	 */
	
	public static void chooseSort(int[] a) {
		
		printLabNum(3);
		printArr(a,"Choose sort. Current array");
		
		int max_ind;
		max_ind = 0;
		
		int mid;
		mid = 0;
		
		int j;
		j = 0;
		
		int k;
		k = 0;
		
		for(int i = a.length-1; i > 0; i--) {
			

			max_ind = maxElemSearch(a, k);
			
			mid = a[j];
			a[j] = a[max_ind];
			a[max_ind] = mid;
			j++;
			k++;
		
		}
		
		printArr(a,"Sorted array");
		
	}
	
	
	public static int maxElemSearch(int[] a, int k) {
		
		
		int max_index;
		max_index = k;
		
		for(int i = k; i < a.length; i++) {
			
			
			if(i+1 ==  a.length) {
				
				if(a[i] >= a[max_index]) {
					
					max_index = i;
					
				} 
				
			} else {
			
			if(a[i] > a[i+1]) {
				
				max_index = i;
				
			} else {
				
				if(a[max_index] < a[i]) {
					max_index = i;
				}
			}
			
		  }
			
		}
		
		return max_index;
	}
	
	
	/*			
	4. Сортировка обменами. Дана последовательность чисел n a a a     1 2 .Требуется переставить числа в
	порядке возрастания. Для этого сравниваются два соседних числа 1+i i a и a . Если 1+  i i a a , то делается
	перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
	Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
	 */
	
		
	public static void changeSort(int[] a) {
		
		printLabNum(4);
		
		printArr(a,"Change sort. Current array");
		
		int mid;
		mid=0;

		for(int j = 0; j < a.length; j++) {	
		for(int i = 0; i < a.length; i++) {
			
			if(i+1 == a.length) {
				
				break;
				
			} else {
			
			if(a[i] > a[i+1]) {
				
				mid = a[i];
				a[i]= a[i+1];
				a[i+1] = mid;
				
			} 
		  }
			
		 }
		}
		printArr(a,"Sorted array");
		
	}
	
	/*	
	5. Сортировка вставками. Дана последовательность чисел n a ,a , ,a 1 2  . Требуется переставить числа в порядке
	возрастания. Делается это следующим образом. Пусть i a ,a , ,a 1 2  - упорядоченная последовательность, т. е.
	n a  a  a 1 2 . Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
	последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
	не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
	с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
	 */
	
	public static void insertSort(int array[]) {
		
		printArr(array,"Current array");
		
		int low;
		low = 0;
		
		int high;
		int index;
		
		int middle;	
		middle=0;

		int counter;
		counter=0;
		
		for (int left = 0; left < array.length; left++) {

			int elem = array[left];
							
			high = left-1;

			index = binarySearch(array, elem, low, high);
			
			if(left-1!=-1) {
				
			if((array[left] < array[left-1])) {
				
				for(int j = left-1; j > index-1; j--) {
					
					if(array[j] > array[j+1]) {
					
					 middle =array[j]; 
					
					 array[j] = array[j+1];
					
					 array[j+1] = middle;
					}
					
				}
				
			}
			}
			
			System.out.println("index: "+index+" left: "+left);
			

			}

		
		printArr(array,"Sorted array");
			

	}


	
	public static int binarySearch(int[] sortedArray, int key, int low, int high) {
		
	    int index;
	    
	    index = -1;
	    
	    int mid;
	    mid = 0;
	    
	    int iterations;
	    iterations = 0;

	    while (low <= high) {
	    	
	       mid = (low + high) / 2;
	        
	        if (sortedArray[mid] < key) {
	        	
	            low = mid + 1;
	            

	            
	        } else if (sortedArray[mid] > key) {
	        	
	            high = mid - 1;

	            
	        } else if (sortedArray[mid] == key) {
	        	
	            index = mid;
	            
	            break;
	            
	        }
	        
            iterations++;
	        
	    }
	    
	    if(index == -1) {
	    	
	    	index = mid;
	    }
	    

	    return index;
	}
	
	/*	6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
	Делается это следующим образом: сравниваются два соседних элемента i i+1 a и a . Если +1  i i a a , то продвигаются
	на один элемент вперед. Если +1  i i a a , то производится перестановка и сдвигаются на один элемент назад.
	Составить алгоритм этой сортировки.
	 *
	*/
	
    private static void insertionSort(int[] array, int start, int d){
    	
		printLabNum(5);
		
		printArr(array,"Current array");
    	
        int tmp;
        
        for(int i = start; i < array.length - 1; i += d) {
        	
            for(int j = Math.min(i+d, array.length-1); j-d >= 0; j = j-d) {
            	
                if(array[j - d] > array[j])
                	
                {
                    tmp = array[j];
                    
                    array[j] = array[j-d];
                    
                    array[j-d] = tmp;
                    
                }
                
                else break;
                
            }
        }
        
		printArr(array,"Sorted array");
    }
	
 
    public static void shellSort(int[] array){
    	
        for(int inc = array.length / 2; inc >= 1; inc = inc / 2) {
        	
            for(int step = 0; step < inc; step++) {
            	
                insertionSort(array, step, inc);
                
            }
        }
    }
	
	/* 7. Пусть даны две неубывающие последовательности действительных чисел n m a  a  a и b  b  b 1 2 1 2 .
	Требуется указать те места, на которые нужно вставлять элементы последовательности m b  b  b 1 2 в первую
	последовательность так, чтобы новая последовательность оставалась возрастающей.
	*/
    
    public static void cheakIndex(int[] array_a, int[] array_b) {
    	
		printLabNum(6);
		
		printArr(array_a,"Array a");
		
		printArr(array_b,"Array b");
    	
    	int index;
    	index = 0;
    	
    	int k;
    	
    	for(int j = 0; j < array_b.length; j++){

        	index = binarySearch(array_a, array_b[j], 0, array_a.length-1);
        	
        	k = j+1;
        	
        	System.out.println("Position "+array_b[index]+": for array_a["+k+"]");
    	}


    	
    }
    
	/*8.Даны дроби ). Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
	*/

    static int lcm(int a, int b){
    	
		return a / gcd(a,b) * b;
	}
    
    
   static int gcd(int a, int b){

       while (b !=0) {
    	   
           int tmp = a % b;
           
           a = b;
           
           b = tmp;
           
       }
       
       return a;
	
    }
    
       
    public static void fractions(int[] k1, int[] k2) {
    	
		System.out.println(" ");
		printLabNum(7);
		
		System.out.println("Initial fractions:");
		
    	for(int j = 0; j < k2.length; j++){
    		
    		System.out.print(k1[j]+"/"+k1[j]+"; ");
    	}
    
    	int nok;
    	
    	int add_num_1;
    	
    	int add_num_2;
    	
    	for(int j = 0; j < k2.length; j++){
    		
    		
    		if(j+1 == k2.length) {
    			
        		nok = lcm(k2[j],k2[j-1]);
        		
        		add_num_1 = nok/k2[j];
        		
        		add_num_2 = nok/k2[j-1];
        		
        		k1[j] = k1[j] * add_num_1;
        		
        		k1[j-1] = k1[j-1] * add_num_2;
        		
    			k2[j] = nok;
    			
    			k2[j-1] = nok;
    			
    		} else {
    			
    			nok = lcm(k2[j],k2[j+1]);
    			
    			add_num_1 = nok/k2[j];
    			
    			add_num_2 = nok/k2[j+1];
    		
    			k1[j] = k1[j]*add_num_1;
    			
    			k1[j+1] = k1[j+1]*add_num_2;
    			
    			k2[j] = nok;
    			
    			k2[j+1] = nok;
    		
    		}
    	}
    	
		System.out.println(" ");
		System.out.println("Final fractions:");

    	for(int j = 0; j < k2.length; j++){
    		
    		System.out.print(k1[j]+"/"+k1[j]+"; ");
    	}
    	
    }
    
    
	public static void main(String[] args) {
		
		
		/*
 		1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
		один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
		дополнительный массив.
		 */
		
		int[] a = {1,1,7,8,1};
		
		int[] b = {2,2,2};
		
		int k;
		k = 2;
		
		appendArrays(a,b,k);
		
		/*	
		2. Даны две последовательности n m a  a  a и b  b  b 1 2 1 2 . Образовать из них новую последовательность
		чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
		*/
		
		int[] a1 = {1,2,3,4,5};
		
		int[] b1 = {1,2,3};
		
		newSequence(a1, b1);
		
		/*		
		3. Сортировка выбором. Дана последовательность чисел n a a a     1 2 .Требуется переставить элементы так,
		чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
		элемент и ставится на первое место, а первый - на место наибольшего.
		 */
		
		int[] c = {1,1,7,8,1};
		
		chooseSort(c);
			
		
		/*			
		4. Сортировка обменами. Дана последовательность чисел n a a a     1 2 .Требуется переставить числа в
		порядке возрастания. Для этого сравниваются два соседних числа 1+i i a и a . Если 1+  i i a a , то делается
		перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
		Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
		 */
		
		int[] d = {9,1,7,8,1};
		
		changeSort(d);	
		
		/*	
		5. Сортировка вставками. Дана последовательность чисел n a ,a , ,a 1 2  . Требуется переставить числа в порядке
		возрастания. Делается это следующим образом. Пусть i a ,a , ,a 1 2  - упорядоченная последовательность, т. е.
		n a  a  a 1 2 . Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
		последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
		не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
		с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
		 */
		int[] k1 = {11,1,5,7,12,19,20,3,29,30};
		
		insertSort(k1);
		
		
		/*	6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
		Делается это следующим образом: сравниваются два соседних элемента i i+1 a и a . Если +1  i i a a , то продвигаются
		на один элемент вперед. Если +1  i i a a , то производится перестановка и сдвигаются на один элемент назад.
		Составить алгоритм этой сортировки.
		 *
		*/
		int[] k2 = {32,95,16,82,24,66,35,19,75,54,40,43,93,68};
		
		shellSort(k2);
		
		/* 7. Пусть даны две неубывающие последовательности действительных чисел n m a  a  a и b  b  b 1 2 1 2 .
		Требуется указать те места, на которые нужно вставлять элементы последовательности m b  b  b 1 2 в первую
		последовательность так, чтобы новая последовательность оставалась возрастающей.
		*/
		
		int[] k3 = {32,34,36,38,40,42,44,46,48,50};
		
		int[] k4 = {33,35,37,39,41,42,45,47,49,51};
		
		cheakIndex(k3, k4);
		
		/*8.Даны дроби ). Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
		*/		
		int[] k5 = {13,7,5,12};
		int[] k6 = {18,12,3,4};
		
		fractions(k5,k6);

	}

}
