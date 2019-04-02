
public class UserOfOrderedList {
	 public static void main(String[] arg){
		 
        OrderedList_inArraySlots list = new OrderedList_inArraySlots();
		
		System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);
		
		// Populate the list with diverse elements.
         list.add(1);
		 list.add(19);
		 list.add(7);
		 list.add(14);
		 System.out.println("test add:");
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "list: " + list);
		 
		 
		 list.remove(1);
		 System.out.println("test remove:");
         System.out.println( "number of elements: " + list.size() );
         System.out.println( "list: " + list);
		
	 }

}