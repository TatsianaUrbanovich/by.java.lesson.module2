package by.java.lesson.mod2;

public class Decomposition {
	
	
	public static void printArr(int[] a, String s) {
		
		System.out.println(s+": " );
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
			
		}
		
		System.out.println("\n");
	}
	
	
	public static void printArr(double[] a, String s) {
		
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
	1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
	натуральных чисел:
	
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
	
	
	
	/* 
	2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
	*/
   
   static void gcd4nums(int[] array){
	   
	   printLabNum(2);
	   
	   printArr(array, "Nums for seach GCD");
   	
	   int multiplication;
	   multiplication = 1;
	   
	   int nod;
	   nod = 0;
	   
	   int n;
	   n = 0;
	   
	    for(int i = 0; i < array.length; i++) {
	    	
	    	multiplication *= array[i];
	    }
	    
	    for(int i = 0; i < array.length; i++) {

	       if(i+1 < array.length) {
	    	   
	    	   for(int j = i + 1; j <= i + 1; j++) {
	    		   
	            nod = gcd(array[i], array[j]);
	            
	    	   }
	    	   
	    	   array[i+1]= nod;
	        }
	    }
	 	    
	      System.out.println("GCD "+  array.length +" nums: "+ nod);
	      System.out.println("");

		
	}
   
	/* 
	3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
	*/
   
   public static double trinangleS(int a) {
	   
	   double dnum;
	   
	   dnum = Double.valueOf(a);
	   
	   double s;
	   
	   s = ((3 * Math.sqrt(3)/2)* Math.pow(dnum, 2));
	   
	   return s;
	   
   };

   public static void regularHexagon(int a) {
	   
	   printLabNum(3);
	   
	   double s;
	   
	   s = 6 * trinangleS(a);
  
	   System.out.println("For side "+ a +" square of regular hexagon: "+ s);
	   
   }
   
	/* 
	4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
	какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
	*/
   
	public static double checkWayforPair(double x1, double x2, double y1, double y2 ){

		double d;
		
		d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		return d; 
	}
	
	
	public static double countWay(double[] array) {
		
		   int index;
		   index = 0;
		   
		   double[] d = new double[100];
		   
   
		   for(int j = 0; j < array.length-2; j = j+2) {
		   
		    for(int i = 0; i < array.length-2; i = i+2) {
			  
			   d[i] = checkWayforPair(array[j], array[i+2], array[j+1], array[i+3]);
			 
		     }
		   }
		   
		   
		    for(int k = 0; k < d.length; k++) {
			  
		    if(k+1 == d.length) {
		    	
		    	
				   if(d[k] > d[k-1]) {
					   
					   if(d[k] > d[index]) {
						   
						   index = k;
					   }
					   
				   } else {
					   
					   if(d[k] > d[index]) {
						   
						   index = k-1;
						   
					   }
				   }
		    	
		    	
		    	
		    	
		    } else {
		    	
			   if(d[k] > d[k+1]) {
				   
				   if(d[k] > d[index]) {
					   
				    index = k;
				   
				   }
				   
			   } else {
				   
				   if(d[k+1] > d[index]) {
				    index = k+1;
				   }
				   
			   }

		     } 
		    }
		    
		
		return d[index];
	}
	
	
	public static void checkWay(double[] array) {
		
		   System.out.println("");	
		   printLabNum(4);
		   
		   printArr(array, "Coordinates:");
		   
			
		   int index;
		   index = 0;
		   
		   double[] d = new double[100];
		   
   
		   for(int j = 0; j < array.length-2; j = j+2) {
		   
		    for(int i = 0; i < array.length-2; i = i+2) {
			  
			   d[i] = checkWayforPair(array[j], array[i+2], array[j+1], array[i+3]);
			   
			   if(d[i] == countWay(array)) {
				   
				   System.out.println(array[j] +" "+array[j+1] +" "+array[i+2] +" "+array[i+3]);
				   
			   }

		     }
		   }
	    
		   System.out.println("Max distance is: " + countWay(array));		
		   
	
	}
	
	public static int MaxElement(int[] array){
		
		   
		   int index;
		   index = 0;
		   
		   for(int i = 0; i < array.length; i++) {
			   
			   if(i+1 == array.length) {
				   
				   
				   if(array[i] > array[i-1]) {
					   
						 if(array[i] > array[index]) {
					   
							  index = i;
							  
						 }
					   
				   } else {
					   
						 if(array[i-1] > array[index]) {	
							 
							 index = i-1;
							 
						 }
				   }
				   
				   
			   } else {
			   
			   if(array[i] > array[i+1]) {
				   
				   if(array[i] > array[index]) {
				   
					   index = i;
				   }
				   
			   } else {
				   
			   }
				  if(array[i+1] > array[index]) {
				   
				   index = i+1;
				   
			   }
			}
			   
		   }

		   return array[index];
	}
	
	/* 		
	5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести
	на печать число, которое меньше максимального элемента массива, но больше всех других
	элементов).
	*/
	
	public static void searchSecondMaxElement(int[] array){
		
		   printLabNum(5);
		   
		   printArr(array, "Initial array");
		   
		   int max;
		   max = MaxElement(array);

		   int index;
		   index = 0;
		   
		   for(int i = 0; i < array.length; i++) {
			   
			   if(i+1 == array.length) {
				   
				   
				   if((array[i] > array[i-1])) {
					   
						 if((array[i] > array[index]) && (array[i] != max)) {
					   
							  index = i;
							  
						 }
					   
				   } else {
					   
						 if((array[i-1] > array[index]) && (array[i-1] != max)) {	
							 
							 index = i-1;
							 
						 }
				   }
				   
 				   
			   } else {
			   
			   if((array[i] > array[i+1])) {
				   
				   if((array[i] > array[index]) && (array[i] != max)) {
				   
					   index = i;
				   }
				   
			   } else {
				   
			   }
				  if((array[i+1] > array[index]) && (array[i+1] != max)) {
				   
				   index = i+1;
				   
			   }
			}
			   
		   }
		
		   System.out.println("Second max element in array is: " + array[index]);
		   
	}
	

	/* 		
	6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
	*/		
	
	public static void primeNumbers(int[] array) {
		
		   printLabNum(6);
		   
		   printArr(array, "Initial array");
		   
		   for(int i = 0; i < array.length; i++) {
			   
			   if(i+1==array.length) {
			   
			   if((gcd(array[i],array[i-1]) == 1)) {
				   
				   System.out.println(array[i]+" "+array[i-1]+ " - prime numbers");
				   
			   }
			   
			   } else {
			   
				   if((gcd(array[i],array[i+1]) == 1)) {
				   
					   System.out.println(array[i]+" "+array[i+1]+ " - prime numbers");
				   }
			   }
			   
		   }
		
	}
	
	/*		
	7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
	*/	
	
	public static void factorial() {
		
		System.out.println(" ");
		
		printLabNum(7);
		   
		int factorial;
		factorial = 1;
		
		for(int i = 1; i < 10; i=i+2) {
 
			factorial = factorial*i;
  
		}
		   
		System.out.println("Factorial is: "+factorial);
		   
	}
	
	/*		
	8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
	Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
	*/
	
	public static void arraySumCulc(int[] array) {
		
		printLabNum(8);
		   
	    printArr(array, "Initial array");
		
		int[] arraySum = new int[100];
		   
		for(int i = 0; i < array.length-3; i = i+3) {
			
			arraySum[i] = array[i] + array[i+1] + array[i+2];
			
			System.out.println("Sum for "+array[i] + " " + array[i+1] + " " + array[i+2] + " is: " + arraySum[i]);
			
		}
	}
	
	/*		
	9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если
	угол между сторонами длиной X и Y— прямой.
	*/
	
	public static void squareSearch(int x, int y, int z, int t){
		
		System.out.println("");
		printLabNum(9);
		
		int k;
		
		k = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); 
		
		int p1;
		int p2;
		
		int s1;
		int s2;
		int s3;
		
		p1 = x + y + k; 
		
		p2 = z + t + k; 
		
		s1 = (int) Math.sqrt(p1*(p1-x)*(p1-y)*(p1-z));
		
		s2 = (int) Math.sqrt(p2*(p2-k)*(p2-t)*(p2-z));
		
		s3 = s1 + s2;
		
		System.out.println("Square: " +s3);
		
		
	}

	/*		
	10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами
	которого являются цифры числа N.
	*/		
	
	public static void formArray(int n) {
		
		printLabNum(10);
		
		System.out.println("");
		
		System.out.println("Number is: " + n);
		
		String  a = String.valueOf(n);
		
		char b[] = new char[a.length()];
		
		System.out.println("Array: ");
		
		for(int i = 0; i< a.length(); i++) {
			
			b[i] = a.charAt(i);
			
			System.out.println("Element: " +b[i]);
			
		}

	}
	
	/*		
	11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
	*/
	
	public static void checkNums1(int n1, int n2) {
		
		System.out.println("");
		
		printLabNum(11);
		
		System.out.println("n1 = "+n1+". n2 =  "+n2 );
		
		String a = String.valueOf(n1);
		
		String b = String.valueOf(n2);
		
		if(a.length() > b.length()) {
			
			System.out.println("n1 length > n2 length");
			
		} else if(a.length() < b.length()){
			
			System.out.println("n1 length < n2 length");
			
		} else {
			
			System.out.println("n1 length = n2 length");
			
		}
		
		
	}
	
	/*		
	12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
	которого являются числа, сумма цифр которых равна К и которые не большее N.
	*/	
	
	public static void formArray2(int k, int n){
		
		System.out.println("");
		
		printLabNum(12);

		int a;		
	    a = 50;
	    
	    int b;
	    b = 100;
	    
	    int random_number1;
		
		int[] arr = new int[10];
		
		int l;
		String f;
		
		int num;
		num = 0;
		
		int t;
		t = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
		    random_number1 = a + (int) (Math.random() * b);
		    
			f = String.valueOf(random_number1);
			
			// System.out.print("random_number1 " + random_number1 + " ");
			
			for(int j = 0; j < f.length(); j++) {
				
				int mid = Character.getNumericValue(f.charAt(j));
				
				num = num + mid;
				
			}	
			
			// System.out.println("Num1 "+num);
			
			if(num == k) {
				
				arr[t] = num;
				
				t++;
						
			}
			
			num = 0;
			
		
		}
		
		for(int m = 0; m < arr.length; m++) {
			
			if(arr[m]!= 0) {
				
				System.out.println("Num is "+arr[m]);	
				
			}
			
		}
	
		
	}
	
	
	
	/*		
	13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2
	(например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n -
	заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
	*/	

	
	public static void checkNums(int m, int p){
		
		System.out.println("");
		
		printLabNum(13);
		
		int k2;
		k2=0;
		
		for(int k = m; k <= p; k++) {
			
			if(k+2 == p) {
				
				break;
				
			} else {

				k2 = k+2;
				
				System.out.println("k "+ k +". k+2 "+k2);	
				
			}

		}	
	}
	
	
	
	public static int getStringSum(int number, int pow) {
		
		String s = String.valueOf(number);
		
		int mid;
		mid = 0;
		
		int num;
		num = 0;
		    
		for(int j = 0; j < s.length(); j++) {
				
		  mid = (int) Math.pow((double)Character.getNumericValue(s.charAt(j)),pow);
				
		  num = num + mid;
				
		}
		return num;
		
	}
	
	public static int getStringNumOfChars(int number) {
		
		String s = String.valueOf(number);
		
		int counter;
		counter = 0;

		    
		for(int j = 0; j < s.length(); j++) {
				
		  counter++;
				
			
		}
		return counter;
		
	}	
	
	/*		
	14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его
	цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для
	решения задачи использовать декомпозицию.
	*/		
	
	public static void armstrongNumSearch(int j){
		
		System.out.println("");
		
		printLabNum(14);	
		
		int sum;
		sum = 0;
		
		int result;
		result = 0;
		
		int pow;
		pow = 0;
		
		for(int x = 368; x <= j; x++) {
			
			
			pow = getStringNumOfChars(x);
			
			sum = getStringSum(x, pow);
			
			if(x == sum) {
				
				System.out.println(x + " is armstrong number");
				
			}
					
		}		
		
		
	}

	public static boolean CheackDecreasingStatus(int number) {
		
		String s = String.valueOf(number);
				
		boolean result;
		result = false;

		int counter;
		counter = 0;
		    
		for(int j = 0; j < s.length(); j++) {
		
			
		if(j+1 == s.length()) {
			
			break;
			
		} else {
			

		  if(s.charAt(j) < s.charAt(j+1)) {
			  
			  counter++;
			  
		  };
	
		}
		
	    }
		if(counter == s.length()-1) {
			
			result = true;

		}
		
		
		return result;
	}
	
	/*		
	15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
	последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
	*/	

	public static void printNonDecreasingNums(int n5) {
		
		System.out.println("");
		
		printLabNum(15);
		
		for(int j = 1; j < n5; j++) {
			
			  if(CheackDecreasingStatus(j) == true) {
				  
					System.out.println(j + " is non-decreasing number");
				  
			  };
		
			}
		
	}
	
	
public static int nonOddNums(int number) {
		
		String s = String.valueOf(number);
		
		int num2;
		num2 = 0; 
		
		int counter;
		counter = 0;
		
		for(int j = 0; j <= s.length(); j++) {
			
		if(j+1 == s.length()+1) {
			
			break;
			
		} else {
			
		  num2 = Character.getNumericValue(s.charAt(j));
		  
		  if((num2 == 2)||(num2 == 4)||(num2 == 6)||(num2 == 8)||(num2 == 10)) {
			  
			  	counter++;
			  
		  } 
	
		}
		
	    }		
		
		return counter;
	}
	

	/*		
	16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
	Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать
	декомпозицию.
	*/	

	public static void sumOfOddNums(int number) {
		
		
		System.out.println("");
		
		printLabNum(16);		
		
		String s = String.valueOf(number);
		
		int num2;
		num2 = 0; 
		
		int sum;
		sum = 0;
		
		for(int j = 0; j <= s.length(); j++) {
			
		if(j+1 == s.length()+1) {
			
			break;
			
		} else {
			
		num2 = Character.getNumericValue(s.charAt(j));
		  
		  if((num2 == 1)|(num2 == 3)|(num2 == 5)|(num2 == 7)|(num2 == 9)) {
			  
			  	sum = sum + num2;
			  
		  } else {
			  
			  sum = 0;
			  
		  }
	
		}
		
	    }		
		
		if(sum == 0) {
			
			System.out.println(number + " is non-odd number");		
			
		} else {
			
			System.out.println("Sum of num: " + number + " is " + sum);
			
			System.out.println("Amount of Non Odd numbers in sum: "+ nonOddNums(sum));
			
		}
	}
	
	public static int sumOfNums(int number) {
		
		
		String s = String.valueOf(number);
		
		int num2;
		num2 = 0; 
		
		int sum;
		sum = 0;
		
		for(int j = 0; j <= s.length(); j++) {
			
			if(j+1 == s.length()+1) {
			
				break;
			
			} else {
			
				num2 = Character.getNumericValue(s.charAt(j));
		  
				sum = sum + num2;
	
			}
		
	     }		
		
		return sum;
	}

	/*		
	17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
	Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать
	декомпозицию.
	*/		
	
	public static void minusSumOfOddNums(int number) {
		
		System.out.println("");
		
		printLabNum(17);		
		
		int sum;
		sum = 0 ;
		
		int counter;
		counter = 0;
		
		int result;
		result = number;
		
		String s = String.valueOf(number);
	

		
		for(int j = number; j > 0; j = j-sum) {
			
			sum = sumOfNums(number);
		
			System.out.println("Number is " + number+". Sum is "+sum);
		
			number = number - sum;
			
			counter++;
			
		}

		System.out.println("We will need " + counter + " operations");

		
	}

	public static void main(String[] args) {
		
		/* 
		1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
		натуральных чисел:
		*/
		
		printLabNum(1);
		
		int a;
		int b;
		
		a = 3;
		b = 11;
		
		System.out.println("Nums: "+ a +" "+ b);
		
		System.out.print("LCM: ");
		
		System.out.println(lcm(a,b));
		
		System.out.print("GCD: ");
		
		System.out.println(gcd(a,b));
		
		System.out.println("");
		
		/* 
		2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
		*/
	
		
		int[] array = {5, 10, 15, 20};
		
		gcd4nums(array);
		
		/* 
		3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
		*/

		int a1;
		a1 = 5;
		
		regularHexagon(a1);
		
		/* 
		4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
		какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
		*/
		
		double[] b1 = {12,23,20,45,7,4};
		checkWay(b1);
		
		/* 		
		5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести
		на печать число, которое меньше максимального элемента массива, но больше всех других
		элементов).
		*/		
		
		int[] b2 = {12,23,20,45,7,4};
		
		searchSecondMaxElement(b2);
		
		
		/* 		
		6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
		*/			
		
		int[] b3 = {12,23,20};
		
		primeNumbers(b3);
		
		/*		
		7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
		*/	
		
		factorial();
		
		/*		
		8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
		Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
		*/
		
		int[] b4 = {1,2,3,4,5,6,7,8,9,12,11,12};
		
		arraySumCulc(b4);
		
		/*		
		9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, если
		угол между сторонами длиной X и Y— прямой.
		*/		
		
		int x;
		int y;
		int z;
		int t;
		
		x = 2;
		y = 2;
		z = 3;
		t = 4;
		
		squareSearch(x,y,z,t);
		
		/*		
		10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами
		которого являются цифры числа N.
		*/	
		
		int n;
		n = 2345;
		
		formArray(n);

		
		/*		
		11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
		*/
		
		int n1;
		n1 = 234533;
		
		int n2;
		n2 = 2345;
		
		checkNums1(n1,n2);
		
		/*		
		12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
		которого являются числа, сумма цифр которых равна К и которые не большее N.
		*/

		int k3;
		k3 = 11;
		
		int n3;
		n3 = 34544;
		
		formArray2(k3,n3);
		
		/*		
		13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2
		(например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n -
		заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
		*/
		
		int m;
		m = 10;
		
		int p;
		p = 2*m;
		
		checkNums(m,p);
			
		/*		
		14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его
		цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для
		решения задачи использовать декомпозицию.
		*/		
		
		int j;
		j = 380;
		
		armstrongNumSearch(j);
		
		/*		
		15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
		последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
		*/	
		
		int n5;
		n5 = 30;
		
		printNonDecreasingNums(n5);

		/*		
		16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
		Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать
		декомпозицию.
		*/		
		
		int number;
		number = 135717;
		
		sumOfOddNums(number);
		
		/*		
		17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
		Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать
		декомпозицию.
		*/	
		
		int number2;
		number2 = 13;
		
		minusSumOfOddNums(number2);
	}



}
