package by.java.lesson.mod2;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
	
	
	public static void printArr(int[][] array) {
		
		System.out.println("Current array is: "+"\n");
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j=0; j < array[i].length; j++) {
				
				System.out.print(array[i][j] + " ");
				
			}
			System.out.println("");
		}
		System.out.println(" ");
	}
	
	public static void printArr(double[][] array) {
		
		System.out.println("Current array is: " + "\n");
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				System.out.print(array[i][j] + " ");
				
			}
			
			System.out.println("");
		}
		
		System.out.println(" ");
	}
	

	public static void evenCollPrint(int[][] array) {
		
		System.out.println("Lab 2 Task 1"+ "\n");
		
		printArr(array);
		
		System.out.println("Even index colls where firth element more then last: "+"\n");
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
					if((j % 2 == 0) || (j!=0)) {
						
						if(array[0][j] > array[array[i].length-1][0]) {
					
						
							System.out.print(array[i][j] + " ");
							
						}
					
					}
				}
				
			System.out.println("");
		}
				
	}
	
	
	/*
	 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	 
	    */

	public static void diagonalPrint(int[][] array) {
		
		int counter;
		counter = 0;
		
		System.out.println("Lab 2 Task 2" + "\n");
		
		printArr(array);
		
		System.out.println("Diagonal elements: " + "\n");
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j=0; j < array[i].length; j++) {
				
					if(j == i) {
						
						System.out.print(array[i][j] +" ");
							
					}
				}
			
			System.out.println("");
			
		}
	
	}
	
	
	/*
	 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
	 
    */
	
	public static void setedRowCollPrint(int[][] array, int k, int p) {
		
		System.out.println("Lab 2 Task 3"+ "\n");
		
		printArr(array);
		
		System.out.println("Row number : "+ k +"\n");
		
		for(int i = 0; i < array[k].length; i++) {
							
			System.out.print(array[k][i] + " ");
	
			}
		
		System.out.println("\n");
		
		System.out.println("Coll number : " + p + "\n");
		
		for(int i = 0; i < array[k].length; i++) {
							
			System.out.println(array[i][p]+" ");
	
			}
		
		System.out.println("");
		
		}
	
	/*
	 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 
   */
	public static void matrixCreation(int n) {
		
		
		System.out.println("Lab 2 Task 4"+ "\n");
		System.out.println("Matrix for "+n+ " is: " +"\n");
		
		int[][] array = new int[n][n];
		
		int counter_even;
		counter_even = 1;
		
		int counter_not_even;
		counter_not_even = n;
		
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j=0; j < array[i].length; j++) {
				
				if(i % 2 == 0) {
					
					array[i][j] = counter_even;
					
					counter_even++;
					
				} else {
					
					array[i][j] = counter_not_even;
					
					counter_not_even--;
					
				}

				
			}

			counter_even = 1;
			
			counter_not_even = n;
			
		}
		
		printArr(array);		
		
	}
	
	
	/*
	5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

	*/	

	public static void matrixCreation3(int n) {

		System.out.println("Lab 2 Task 5");

		int[][] array = new int[n][n];
		
		int counter;
		counter = 1;
		
		int counter2;
		counter2 = 1;
		
		int number;
		number = 1;

		
		int num;
		num = 1;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
			
				counter = i;

				if(j!= array.length-1-counter) {
								
					if(j>array.length-1-counter) {
						
						array[i][j] = 0;
						
					} else {
					
						array[i][j]= number;
					}
				
				} else {

					array[i][j] = number;
			
				}
				
						
			}
			
			number++;
			
			}
		
		printArr(array);
	}
			
	

	/*
	 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 
  */
		
public static void fillElements(int[] array, int k) {
	
	int length;
	length = array.length;
	
	int middle = length/2;
	
	for(int j = 0; j < k; j++) {
		
		array[j] = 0;

	}
	
	for(int g = array.length-1; g > array.length-1-k; g--) {
		
		array[g] = 0;

	}
	
}

public static void fillElementInverse(int[] array, int counter) {
	
	for(int i = 0; i < array.length; i++) {
		
		array[i] = 0;
	
	}
	
	
	int length;
	length = array.length;
	
	int middle = length/2;

	for(int i = 1; i <= counter; i++) {
		
		array[middle] = 1;
		
		array[middle - i] = 1;
	
	}
	
	for(int i = 1; i < counter; i++) {

		array[middle] = 1;
		
		array[middle + i] = 1;
	
	}
	

}
	
public static void matrixCreation2(int n) {
		
		
		System.out.println("Lab 2 Task 6"+ "\n");
		System.out.println("Matrix for "+n+ " is: " +"\n");
		
		int[][] array = new int[n][n];
		
		int counter_begin;
		counter_begin = 0;
		
		int counter_end;
		counter_end = n;
		
		int middle;
		middle = array.length/2;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				array[i][j] = 1;
	
			}
		}
		
		
		int counter;
		counter = 1;
		
		for(int i = 0; i < array.length; i++) {
			
			if(i < middle) {
				
				fillElements(array[i], i+1);
				
			} else {
				
				fillElementInverse(array[i], counter);
				
				counter++;
			}
		}
		
		printArr(array);		
		
	}

		
	/*
	7. Сформировать квадратную матрицу порядка N по правилу:
	и подсчитать количество положительных элементов в ней.
	 */

public static void sinMatrixCreation(double i, double j, double n) {
	
	double[][] array = new double[(int) n][(int) n];
	
	double result;
	
	int counter;
	counter = 0;
	
	System.out.println("Lab 2 Task 7"+ "\n");
	System.out.println("Matrix is: "+"\n");
	
	for(int a = 0; a < array.length; a++) {
		
		for(int b = 0; b < array[a].length; b++) {
						
			result = Math.sin((Math.pow(a,2) + Math.pow(b,2))/n);
			
			array[a][b] = result;
			
			if(result < 0) {
				counter++;
				}
			
			System.out.print( array[a][b] +  " ");
			
		}
		
		System.out.println("");
	}
	
	System.out.println(" ");

	System.out.println(counter+ " positive elements"+"\n");
}

	/*
	8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
	на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
	пользователь с клавиатуры.

	*/

public static int call(int m, String s) {
	
	String str;
	
	Scanner in = new Scanner(System.in);

	while(in.hasNextInt() == false) {
		
		str = in.nextLine();
		
		System.out.println(s);
		
	}
	
	m = Integer.valueOf(in.nextLine());
	
	return m;
	
}

public static void changeColls(int[][] array) {
	
	int m;
	int n;
	String str;
	
	m = 0;
	n = 0;
	
	int[] a = new int[array.length];
	
	System.out.println("Lab2 Task 8");
	
	printArr(array);
			
	System.out.println("Enter firth coll`s index:");
	
	m = call(m, "Enter firth coll`s index:");
	
	System.out.println("Enter second coll`s index:");	
	
	n = call(n,"Enter second coll`s index:");
	
	for(int i=0; i < array.length; i++) {
		
		for(int j=0; j < array[i].length; j++) {
			
			if(j == m) {
				
				a[i] = array[i][m];
				
				array[i][m]= array[i][n];
				
				array[i][n]= a[i];
			}
			
		}

	}
	
	printArr(array);	
	
    }

	/*
	9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
	столбец содержит максимальную сумму.

	 */

public static void sumCalc(int[][] array) {
	
	int[] a = new int[array.length];
	
	int index;
	int value;
	
	index = 0;
	value = 0;
	
	System.out.println("Lab2 Task 9");
	
	printArr(array);
	
	for(int i = 0; i < array.length; i++) {
		
		for(int j = 0; j < array[i].length; j++) {
			
				a[j] = a[j] + array[i][j];
		}

	}
	
	System.out.print("Sums in colls are: ");
	
	for(int j = 0; j < a.length; j++) {
		
		 if(j + 1 == a.length) {
			
			if(a[j] > a[j-1]) {
				
				value = a[j];
				
				index = j;
				
			} else {
				
				value = a[j-1];
				
				index = j-1;
			}
		
		 } else {
			
			if(a[j] > a[j+1]) {
			
				value = a[j];
			
				index = j;
			
			} else {
			
				value = a[j+1];
			
				index = j+1;
			}
		
		 }

		System.out.print(a[j]+" ");
		
		}
	
		System.out.println(". Bigest sum is: " + value + ". In coll number: " + index);
	
	}

		/*
		10. Найти положительные элементы главной диагонали квадратной матрицы.

		*/

public static void sumDiagonal(int[][] array) {
	
	System.out.println("Lab2 Task 10");
	
	printArr(array);
	
	int diagonalSum;
	diagonalSum = 0;
	
	for(int i = 0; i < array.length; i++) {
		
		for(int j = 0; j < array[i].length; j++) {
			
			if(i==j) {
				
				diagonalSum = diagonalSum + array[i][j];
				//System.out.println(array[i][j]+" ");
				
				
			}
		}
	}
	
	System.out.println("Diagonal sum is: " + diagonalSum);
	
 }

	/*
	11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    	которых число 5 встречается три и более раз.
	 
	 */
public static void createMatrix4() {
	
	System.out.println("");
	
	System.out.println("Lab2 Task 11");
	
	int[][] array = new int[10][20];
	
	int[] a = new int[200];
	
	int counter;
	counter = 0;
	
	int result;
	result = 0;
	
	for(int i = 0; i < array.length; i++) {
		
		for(int j = 0; j < array[i].length; j++) {
			
			array[i][j] = (int) (Math.random()*16);
			
		
		}
	}
	
	for(int i = 0; i < array.length; i++) {
		
		for(int j = 0; j < array[i].length; j++) {
			
			if((array[i][j] == 5)||(array[i][j] == 15)) {
				
				counter++;
			}
			
		a[i] = counter;
		
		//System.out.print(a[i]+" ");
		
		}
		
		counter = 0;
		
	}
	
	printArr(array);
	
	System.out.println("Rows indexes where '5' comes 3 or more then 3 times");
	
	for(int i = 0; i < a.length; i++) {
		
		 if(a[i] > 2) {
			 
				System.out.print(i + " ");
				
		 }
		
	}
	
	System.out.println(" ");

  }

	/*
	12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
	 
	*/


public static void sortRowsAndElementsInRows(int[][] array) {
	
	
	System.out.println("Lab2 Task 12");
	
	printArr(array);
	
	for(int j = 0; j<array.length; j++) {
	 for(int i = 0; i<array.length; i++) {
		
		sortElementsInRows(array[i]);
		
	 }
	 
	}
	
	for(int i = 0; i< array.length-1; i++) {
	 for(int j = 0; j< array.length-1; j++) {

	  if(i+1 > array.length-1) {
		  
			if(array[i][0] < array[i-1][0]) {
				
				   sortRows(array, i, i-1);
				   
				}		  
			
		} else {
		
		if(array[i][0] < array[i+1][0]) {
			
		   sortRows(array, i, i+1);
		   
		}
	  }
	 }
	}
	
	printArr(array);
}


public static void sortElementsInRows(int[] array) {
	
	int value;
	value = 0;
	
    for(int j = 0; j < array.length-1; j++) {
	  for(int i = j; i < array.length-1; i++) {
		 
		if(array[j] < array[i+1]) {
				
				value = array[j];
				array[j] = array[i+1];
				array[i+1] = value;
				
		}
	 
	  }
	  
	 }

	
}


public static void sortRows(int[][] array, int index1, int index2) {
	
	
	int[][] array2 = new int[array.length][array.length];
	
	array2[0] = array[index1];
	array[index1] = array[index2];
	array[index2] = array2[0];

}

	/*
	13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
	 
	*/

public static void sortCollsAndElemsInMatrix(int[][]array) {
	
	System.out.println("Lab2 Task 13");
	
	printArr(array);
	
	for(int i = 0; i < array.length-1; i++) {
		
		sortElemsInColl(array, i);
		
	}
	
	for(int i = 0; i < array.length-1; i++) {
		
		sortColls(array, i);
		
	}
	
	printArr(array);
	
}



public static void sortColls(int[][] array, int index1) {
	
	int[][] array2 = new int[array.length][array.length];
	
	for(int j = 0; j < array.length-1; j++) {
		
	 for(int i = 0; i < array[j].length-1; i++) {
		 
		if(array[i][index1] < array[i+1][index1]) {
		 
		 array2[i][index1] = array[i][index1];
		
		 array[i][index1] = array[i+1][index1];
		
		 array[i+1][index1] = array2[i][index1];
		 
		}
		
	  }
		
	}

 }

public static void sortElemsInColl(int[][] array, int index1) {
	
	
	int[][] array2 = new int[array.length][array.length];
	
	for(int j = 0; j < array.length-1; j++) {

	 for(int i = 0; i < array[j].length-1; i++) {
		
		if(array[j][index1] < array[i+1][index1]) {
			
			array2[i][index1] = array[i][index1];
			
			array[i][index1] = array[i+1][index1];
			
			array[i+1][index1] = array2[i][index1];
			
		}
		
	  }
	}
	
}

	/*
	14. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
	 
	*/

private static int getRandomNumberInRange(int min, int max) {

	Random r = new Random();
	
	return r.nextInt((max - min) + 1) + min;
}


public static int cheakCounter(int[] array) {
	
	int counter;
	counter = 0;
	
	for(int i = 0; i < array.length-1; i++) {
		
		if(array[i] == 1) {
		
		counter++;
		
		}
	}
	
	return counter;
	
}


public static int[] formRow(int n) {
	
	int[] array = new int[n];
	
	int num;
	
	for(int i = 0; i < array.length-1; i++) {
		
		num =  getRandomNumberInRange(0,1);
		
		array[i] = num;
	}
	
	return array;	
}

public static int[] formRowSetNumAndIndex(int[] array, int counter, int index) {
	
	int check;
	check = counter - index;
	
	if(index == 0) {
		
		for(int j = 0; j < array.length-1; j++) {
	
		  array[j] = 0;

		}
		
	} else {
	
	if(check > 0) {	
		
		for(int j = 0; j < array.length-1; j++) {
		
		 if(check != 0) {
		 if (array[j] == 1) {
					
			 array[j] = 0;
			 check--;
				
		 }
		 
		 }
		 
		}
		
				
	} else if(check < 0){
		
		check = Math.abs(check);
		
		for(int j = 0; j < array.length-1; j++) {
			
		 if(check != 0) {	
			 if (array[j] != 1) {
						
				 array[j] = 1;
				 check--;
					
			 }		
		 }
		
		
	   }
				
	}
	}
	
	return array;
	
}

public static int[][] inverseMatrix(int[][] array){
	

	
	int[][] newArr = new int[array.length][array.length];
	
	for(int i = 0; i <= array.length-1; i++) {
		for(int j = 0; j <= array[i].length-1; j++) {
			
			newArr[j][i] = array[i][j];
			
		}
	}

	return newArr;
}

public static void matrixCreation14(int n, int m) {
	
	System.out.println("Lab2 Task 14");	
	
	int[][] mainArr = new int[n][m];
	
	int[] row = new int[n];
	
	int counter;
	
	for(int k = 0; k <= mainArr.length-1; k++) {	

			row = formRow(n);
			
			counter = cheakCounter(row);

			row = formRowSetNumAndIndex(row, counter, k);

			mainArr[k]= row;
	}
	
	mainArr = inverseMatrix(mainArr);
	
	printArr(mainArr);

}

	/*
	15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
	 
	 */

public static void maxElem(int[][] array) {
	
	System.out.println("Lab2 Task 15");
	
	printArr(array);	
	
	int maxValue;
	
	maxValue = 0;
	
	for(int i = 0; i < array.length; i++) {
		
		for(int j = 0; j < array[i].length; j++) {
			
			if(maxValue < array[i][j]) {
				
				maxValue = array[i][j];
				
			};
			
		}
	}
		
	for(int k = 0; k < array.length; k++) {
			
		for(int m = 0; m < array[k].length; m++) {
				
			if((array[k][m] % 2) != 0) {
				
				array[k][m]= maxValue;
				
			};
				
		}

	}

	printArr(array);
	
}
	/*
	16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
    ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
    собой. Построить такой квадрат.
	 
	 */		

public static void magicSquare(int a, int b, int c) {
	
	System.out.println("Lab2 Task 16");
	
	int[][] num = new int[3][3];
	
	num[0][0] = a + b;
	num[0][1] = a + 2*b + 2*c;
	num[0][2] = a + c;
	
	num[1][0] = a + 2*c;
	num[1][1] = a + b + c;
	num[1][2] = a + 2*b;
	
	num[2][0] = a + 2*b + c;
	num[2][1] = a;
	num[2][2]= a + b + 2*c;
	
	printArr(num);
	
}

	public static void main(String[] args) {	
		
		/*
		 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
		 

		 - Функция проверяет четность столбца.
	     - Функция сравнивает первый и последний элемент в столбце.
		 
		 */
		
		int[][] array =  {{11,12,13,44,15,46},
						  {17,18,19,20,21,22},
						  {23,24,25,26,27,28},
						  {29,30,31,32,33,34},
						  {35,36,37,38,39,40},
						  {41,42,43,14,45,16}};
		
		evenCollPrint(array);
		
		
		/*
		 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
		 
   	    */
		
		diagonalPrint(array);
		
		/*
		 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		 
  	    */
			
		setedRowCollPrint(array,0,1);
		
		
		/*
		 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
		 
	    */
		
		int n;
		n = 8;
		
		matrixCreation(n);
		
		
		/*
		 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
		 
	    */	
		int n3;
		n3 = 8;
		
		matrixCreation3(n);
		
		
		/*
		 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
		 
	    */
		
		int n2;
		n2 = 8;
		
		matrixCreation2(n);
		
		
		/*
		 7. Сформировать квадратную матрицу порядка N по правилу:
		 
	    */
		double i;
		double j;
		double n1;
		
		i = -3.0;
		j = 4.0;
		n1 = 5;
		
		sinMatrixCreation(i,j,n1);
		
		/*
		 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
		 на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
		 пользователь с клавиатуры.
		 
	   */
		
		int[][] array2 =  {{11,12,13,44,15,46},
				  		   {17,18,19,20,21,22},
				  		   {23,24,25,26,27,28},
				  		   {29,30,31,32,33,34},
				  		   {35,36,37,38,39,40},
				  		   {41,42,43,14,45,16}};
		
		changeColls(array2);
		
		/*
		 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
		 столбец содержит максимальную сумму.
		 
	   */
		
		int[][] array3 =  {{1,2,3,0,7,0},
		  		   		   {1,2,3,0,7,0},
		  		   		   {1,2,3,0,7,0},
		  		   		   {1,2,3,0,7,0},
		  		   		   {1,2,3,0,7,0},
		  		   		   {1,2,3,0,7,0}};
		sumCalc(array3);
		
	   /*
	   10. Найти положительные элементы главной диагонали квадратной матрицы.
	 
	   */
		int[][] array4 =  {{1,1,1,0},
	   		   			   {2,2,2,0},
	   		   			   {3,3,3,0},
	   		   			   {4,4,4,-8}};
		
		sumDiagonal(array4);
		
		
	   /*
	   11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
	       которых число 5 встречается три и более раз.
		 
	   */
		
		createMatrix4();
		
	   /*
	   12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
		 
	   */
		int[][] array5 =  {{6,7,8,0},
	   			   		   {19,2,9,0},
	   			   		   {11,3,0,0},
	   			   		   {7,4,4,-8}};
		
		int[] array6 = {1,7,8,0,6,23,67,1};
		
		sortRowsAndElementsInRows(array5);
		
		 /*
		 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
			 
		 */
		int[][] array7 =  {{6,7,8,0},
		   		   		   {19,2,9,0},
		   		           {11,3,0,0},
		   		           {7,4,4,-8}};
		
		sortCollsAndElemsInMatrix(array7);
		
		/*
		14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
			единиц равно номеру столбца.
			 
		*/
		
		matrixCreation14(6,6);

		
		/*
		15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
			 
		*/
		
		int[][] array8 =  {{6,7,8,0},
						   {19,2,9,0},
						   {11,3,0,0},
						   {7,4,4,-8}};
		maxElem(array8);
		
		 /*
		 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
		     ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
		     собой. Построить такой квадрат.
			 
		 */		
		
		int a;
		int b;
		int c;
		a = 3;
		b = 3;
		c = 5;
		
		magicSquare(a,b,c);

  }
	
}
