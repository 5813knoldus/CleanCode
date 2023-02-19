public class CleanCode
{
	public static void main(String[] args) 
	{
        
        int array[] = {5,10,50,40,20};
        
        int tempArray[] ={5,10,50,40,20};
        
        int sortedArray [] = sortArray(array);
        
        printIndex(sortedArray,tempArray);
                
                
    }
	
	/* function for sorting the given Array*/
	
	public static int[] sortArray(int array[])
	{
	    
	    for(int index1 = 0; index1<array.length; index1++)
        {
            
                for(int index2 = index1+1;index2<array.length;index2++)
                {
                    
                    int temp = 0;
                    
                    if(array[index1]>array[index2])
                    {
                        
                        temp = array[index2];
                        
                        array[index2] = array[index1];
                        
                        array[index1] = temp;
                        
                    }
                }
        }
        return array;
	}
	
	/* function which is printing the actual index of the given array */
	
	public static void printIndex(int sortedArray[],int tempArray[])
	{
	    System.out.println(" Output of Clean Code assignment :  ");
	    for(int index1 =0 ; index1<sortedArray.length; index1++){
                    
                    for(int index2 = 0; index2<sortedArray.length;index2++){
                        
                        if(tempArray[index1] == sortedArray[index2])
                        {
                            System.out.print("  " +index2);
                            break;
                        }
                    }
                }
                                            System.out.println();
        
	}
	

}
