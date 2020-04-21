package by.java.lesson.mod2;

import java.math.BigDecimal;

public class OneDimensionalArrays {
	
	
	/*
	 Вспомогательные методы вывода массивов
	 */
	
	public static void printArr(int[] array) {
		
		System.out.println("Current array is: ");
		
		for(int l = 0; l <= array.length-1; l++) {
			
			System.out.print(array[l] + "  ");
			
		}
		
		System.out.println("");
		
	}
	
	
	public static void printArr(double[] array) {
		
		System.out.println("Current array is: ");
		
		for(int l = 0; l <= array.length-1; l++) {
			
			System.out.print(array[l] + "  ");
			
		}
		
		System.out.println("");
		
	}
	
	/*
	 1. В массив A [N] занесены натуральные числа. Найти сумму тех
	    элементов, которые кратны данному К.
	 */
	
	static public void sum(int[] array, int k) {
		
		int result;
		result=0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] % k == 0) {
				
				result += array[i];

			}
		}
		
		System.out.println("Lab 2 Task 1"+"\n");
		
		printArr(array);
		
		System.out.println("Sum of numbers multipled " + k + " is: " + result+ "\n");
				
	}
	
	
	/*
	 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
       числом. Подсчитать количество замен.
    */
	
	static public void changeNums(double[] array, double z) {
		
		int counter;
		counter=0;
		
		System.out.println("Lab 2 Task 2"+ "\n");
		
		System.out.println( "Num for compare is: "+ z +". Current array is: ");
		
		for(int j = 0; j < array.length; j++) {
			
			System.out.print(array[j] + "  ");
			
		}
		
		System.out.println("");
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > z) {
				
				counter++;
				
				array[i]=z;
			}
		}
		
		System.out.println("");
		
		System.out.println( "Amount of changes is: " + counter + "\n");

		System.out.println( "New array is: ");
		
		for(int l = 0; l < array.length; l++) {
			
			System.out.print(array[l] + "  ");
			
		}

	}
	
		
	/*
    3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    положительных и нулевых элементов.
	 */
	
	public static void countersSearch(double[] array) {
		
		int counter_0;
		int counter_1;
		int counter_2;
		
		counter_0 = 0;
		counter_1 = 0;
		counter_2 = 0;
		
		System.out.println("\n");
		
		System.out.println("Lab 2 Task 3"+ "\n");
		
		System.out.println("Current array is: ");
				
		for(int l = 0; l < array.length; l++) {
			
			System.out.print(array[l] + "  ");
			
		}
		
		System.out.println("");
		
		for(int n = 0; n < array.length; n++)
		{
		  
		  if (array[n] > 0)
		  {
			  counter_1++;

		  } else {
			  
			  if(array[n] < 0) {
				  
				  counter_2++;
				  
			  } else {
				  
				  if(array[n] == 0) {
					  
					  counter_0++;
				  }
			  }
		  }
		  
         }
		
		System.out.println("");
		
		System.out.println("Positive numbers are: " + counter_1 + " Negative numbers are: "
		                          + counter_2 + " Zero numbers are: "+ counter_0 +"\n");
		
	}
	
	/*
    4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
	 */
	
	public static int minElement(double[] array) {
		
		BigDecimal e1;
		BigDecimal e2;
		BigDecimal e_cur;
		
		
		e1 = new BigDecimal("0.0");
		e2 = new BigDecimal("0.0");
		e_cur = new BigDecimal(array[0]);
		
		int position;
		position = 0;
		
		double result;

		for(int n = 1; n < array.length-2; n++) {
		
		e1 = new BigDecimal(array[n]);
			
		e2 = new BigDecimal(array[n+1]);
			
		if(e1.compareTo(e2) == -1) {
			
		   if(e1.compareTo(e_cur) == -1) 
		   {
			 e_cur = e1;
			 
		     position = n;
		     
		   }
		   
		 }
		
		 else  {
			 
			   if(e2.compareTo(e_cur) == -1) {
				   
				     e_cur = e1;
				     
				     position = n + 1;
				     
				  }
			   
		 }
		
		}
		
		result = e_cur.doubleValue();
		
		System.out.println("Min element is: " + result + "\n");
		
		return position;
	}	
	
	public static int maxElement(double[] array) {
		
		BigDecimal e1;
		BigDecimal e2;
		BigDecimal e_cur;
		
		int position;
		position = 0;
		
		double result;
		
		e1 = new BigDecimal("0.0");
		e2 = new BigDecimal("0.0");
		e_cur = new BigDecimal(array[0]);

		for(int n = 1; n < array.length-2; n++) {
		
		e1 = new BigDecimal(array[n]);
			
		e2 = new BigDecimal(array[n+1]);
			
		if(e1.compareTo(e2) == 1) {
			
		   if(e1.compareTo(e_cur) == 1) {
			   
			 e_cur = e1;
			 
		     position = n;
		     
		   }
		   
		 }
		
		 else  {
			 
			  if(e2.compareTo(e_cur) == 1) {
				  
					 e_cur = e1;
					 
				     position = n + 1;
				     
				  }
		 }
		
		}	
		
		result = e_cur.doubleValue();
		
		System.out.println("Max element is: " + result + "\n");
		
		return position;
	
	}
	
	public static void changeMaxMinElements(double[] array) {
		
		int positionMax;
		int positionMin;
		double current;
		
		System.out.println("Lab 2 Task 4"+ "\n");
		
		printArr(array);
		
		positionMax = maxElement(array);
		positionMin = minElement(array);

		current = array[positionMax];
		
		array[positionMax] = array[positionMin];
		array[positionMin] = current;
		
		System.out.println("New array is: ");
		
		for(int m = 0; m < array.length; m++) {
			
			System.out.print(array[m] + "  ");
			
		}
		
		System.out.println("\n");

	}
	
	
	/*
    5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
	 */
	
	public static void printArray(int[] array){
		
		System.out.println("Lab 2 Task 5"+ "\n");
		
		System.out.println("Current array is: ");
		
		printArr(array);
		
		System.out.println("Array where a[i] > i ");
		
		for(int i = 0; i < array.length; i++)
		{
			
			if(array[i] > i) {
				
				System.out.print(array[i] + " ("+ i +"- position in array) ");				
			}
			
		}
		
		System.out.println("\n");
		
	}
	
	/*
    6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
       являются простыми числами.
	 */
	
	public static boolean simpleNumsPrint(int length, double[] m) {
		
		int i;
		i = length;
		
		boolean marker;
		marker = false;
		
		System.out.print("Array inedex: "+ length + " with value: "+ m[length] + " ");
		
		if((i == 2) || (i == 3) || (i == 5) || (i == 7))
		{
			
			System.out.println("Simple");
			
			marker = true;
			
		} else {
		
			if((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0) && (i != 1))
			{
				System.out.println("Simple");
				
				marker = true;
				
		        } else {
		        	
					System.out.println(" ");
					
					marker = false;
		        }

		}

    	return marker;
	}
	
	public static void simpleNums(double[] array) {
		
		double result;
		result = 0.0;
		
		int length;
		length = array.length;
		
		int counter;
		counter = 0;
        
		BigDecimal sum;
		BigDecimal f2;
        
		boolean marker;
		marker = false;

		System.out.println("Lab 2 Task 6"+ "\n");
		
		printArr(array);
		
		System.out.println("\n");
		
		sum = new BigDecimal("0.0");
		
		for(int k = 0; k < array.length; k++) {
			
			f2 = new BigDecimal(array[k]);
			
			marker = simpleNumsPrint(k,array);
			
			if(marker == true) {
				
				sum = sum.add(f2);
			
				counter++;
			}
			
		}
		
		System.out.println("\n");
		
		System.out.println("Indexes that are simple numbers: " + counter);
 
		result = sum.doubleValue();
		
		System.out.println("Total Sum of values in BigDecimal type: " + result);
        
		System.out.println("\n");

	}
	
	/*
    7. Даны действительные числа a1,.....a(n); Найти максимум из (a1+a(2n),a2+a(3n),...a(n)+a(n+1))
	 */
	
	public static void MaxSearch(int[] array) {
		
		int length;
		int min;
		int max;
		
		length = array.length;
		int[] b_array = new int[length];
		
		min = 0;
		max = 0;
		
		System.out.println("Lab 2 Task 7"+ "\n");
		
		printArr(array);

		for(int i = 0; i < length; i ++) {
			
			if(i+1 < length) {
				
				b_array[i] = array[i] + array[i+1];
				
			} else {
				
				b_array[i] = array[i];
				
			}
			
		}
		
		for(int k = 0; k < length; k ++) {
			
		 if(k+1 < length) {
			 
			if(b_array[k] > b_array[k+1]) {
				
				max = b_array[k];
				
			} else {
				
				max = b_array[k+1];
				
			};
			
		} else {
			
			if(b_array[k] > max) {
				
				max = b_array[k];
				
			}
			
		 }
			
		}
	
		System.out.println("Max element according declared condition is: " + max + "\n");		
	
	}
	
	/*
    8. Дана последовательность целых чисел a(1)....a(n).Образовать новую последовательность, выбросив из
	   исходной те члены, которые равны min(a(1)....a(n)).
	   */
	
	public static void deleteMin(int[] array, int min) {
		
		int counter;
		counter = 0;
		
		int j;
		j = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i]!= min) {
				
				counter++;
			}
		}
		
		int[] newArray = new int[counter];
		
		for(int i = 0; i< array.length-1; i++) {
			
			if(array[i]!= min) {

				newArray[j] = array[i];
				
				j++;
			}

		}
		
		printArr(newArray);
		
	}
	
	public static void newSequenceMinusMinElement(int[] array) {
		
		int length;
		
		int min;
		min = 0;

		
		System.out.println("Lab 2 Task 8"+ "\n");
		
		printArr(array);
		
		for(int k = 0; k < array.length; k ++) {
			
		 if(k+1 < array.length) {
			 
			if(array[k] < array[k+1]) {
				
				min = array[k];
				
			} else {
				
				min = array[k+1];
				
			};
			
		} else {
			
			if(array[k] < min) {
				
				min = array[k];
				
			}
			
		 }
			
		}
		
		System.out.println("Min element is: " + min +"\n");	
		
		deleteMin(array, min);
	
	}
	
	/*
    9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
       чисел несколько, то определить наименьшее из них.
	*/
	
	
	public static int searchMax(int[] array, int[] arrayInit){
	
		int index;
		index = 0;

			
			for(int i = 0; i < array.length - 1; i++) {

				if(array[i]!=0) {
					
					
				if(i == array.length - 2) {
					
					if(array[i] > array[i-1]) {
						
						index = i;
						
					} else {
						
						index = i-1;
						
					}
					
				if(array[i] == array[i-1]) {
						
						if(arrayInit[i] > arrayInit[i-1]) {
							
							index = i;
							
						} else {
							
							index = i + 1;
							
						}
					
					}
					
				}
				
  			     if(array[i] > array[i+1]) {
						
						index = i;
						
					} else {
						
						index = i + 1;
						
					}
					
					if(array[i] == array[i+1]) {
						
						if(arrayInit[i] > arrayInit[i+1]) {
							
							index = i;
							
						} else {
							
							index = i+1;
						}
					
					}
					
					
					
				}
				
			}
		

		return index;
	}
	
	public static boolean checkElement(int[] array,int value, int index) {
		
		boolean result;
		result = false;
		
		if(index == 0) {
			
			result = false;
			
		} else {
			
			for (int i = index; i > 0 ; i--) {
	    	  
	             if (array[i-1] == value) {
	            	  
	                    result = true;
	                    
	                }
		  }
	      
		}
		
		return result;
	}
	
	
	public static void OftenNumbers(int[] array) {
		
		int length;
		length = array.length;
		
		int counter;
		counter = 1;
		
		int[] b = new int[length];
		b[0]=1;
		
		System.out.println("Lab 2 Task 9"+ "\n");
		
		printArr(array);
		
		for(int n = 0; n <= array.length-1; n++) {
			
		 for(int m = n + 1; m <= array.length-1; m++) {
	
			if(array[n] == array[m]) {
				
				
				if(checkElement(array, array[n] ,n) == false) {
					
					counter++;
					
					b[n] = counter;
				}

			}
			

		 }
			counter = 1;

		}
		
		System.out.println("New array is: ");
		
		for(int l = 0; l <= array.length-1; l++) {
			
			System.out.print(array[l] + "  ");
			
		}	
		
		System.out.println("");
		
		System.out.println("Counters array is: ");
		
		for(int m = 0; m <= length-1; m++) {
			
			System.out.print(b[m] + "  ");
			
		}
		
		System.out.println("");
		
		int index;
		index = searchMax(b, array);
		
		System.out.println("Most often ellement is: "+ array[index]+"\n");
		
	}
	
	/*
    10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
	элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
	 */
	
	
	public static void ChangeElements(int[] array){
		
		int step;
		step = 1;
		
		
		System.out.println("Lab 2 Task 10"+ "\n");
		
		printArr(array);
		
		for(int i = 1; i <= array.length-1; i = step) {
			
			if(i == array.length-2) {

					array[i] = 0;
					break;
			
			} else {
				
			array[i]= 0;
			
			step = step + 2;
			
			}
			
		}
		
		System.out.println("");
		
		System.out.println("New array is: ");
		
		for(int m = 0; m <= array.length-1; m++) {
			
			System.out.print(array[m] + "  ");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int k;
		double z;
		
		/*
		 1. В массив A [N] занесены натуральные числа. Найти сумму тех
		    элементов, которые кратны данному К.
		 */
		
		int[] a = {1, 3, 4, 5, 6, 7};
		
		k = 3;
		
		sum(a,k);
		
		/*
		 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
            числом. Подсчитать количество замен.
         */
		
		double[] b = {1.4, 3.6, 4.6, 5.0345345, 6.345, 7.1};
		
		z = 3.6;
		
		changeNums(b,z);
		
		/*
          3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
          положительных и нулевых элементов.
		 */
		
		double[] c = {2.3, -4.5, 0, 4.5, 67.1, 0.1, -1.0, -2.3}; 
		
		countersSearch(c);
		
		/*
          4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
		 */
		
		double[] d = {2.3, -4.5, 0, 4.5, -67.1, 0.1, -1.0, -2.3};
		
		changeMaxMinElements(d);
	
		
		/*
          5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
		 */
		
		int[] i = {0, 3, 7, 1, 1, 0};
		
		printArray(i);
				
		
		/*
        6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
           являются простыми числами.
		 */
		
		double[] f = {0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1};
		simpleNums(f);
		
		
		/*
        7. Даны действительные числа a1,.....a(n); Найти максимум из (a1+a(2n),a2+a(4n),...a(n)+a(2n))
		 */
		
		int[] o = {1, 2, 3, 4, 5, 6};
		
		MaxSearch(o);
		
		/*
	    8. Дана последовательность целых чисел a(1)....a(n).Образовать новую последовательность, выбросив из
		   исходной те члены, которые равны min(a(1)....a(n)).
   	   */
		
		int[] p = {1, 2, 3, 4, 1, 5, 6, 1};
		
		newSequenceMinusMinElement(p);
				
		
		/*
        9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
           чисел несколько, то определить наименьшее из них.
		 */
		
		int[] q = {1, 1, 1, 2, 2, 2, 98, 43};
		
		OftenNumbers(q);
		
		/*
        10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
		элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
		 */
		
		int[] r = {1, 1, 1, 1, 1, 1, 1};
		ChangeElements(r);
		
	}
}
