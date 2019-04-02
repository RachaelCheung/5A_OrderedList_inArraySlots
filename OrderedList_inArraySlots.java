public class OrderedList_inArraySlots {
	
	private List_inArraySlots arrayList;
	
    public OrderedList_inArraySlots () {
        arrayList = new List_inArraySlots();
    }


    //return the number of elements in this list
    public int size() {
        return arrayList.size();
    }


    //return a string representation of this list in [a,b,c,] format
    public String toString() {
        return arrayList.toString();
    }

    // accessors
 
    //return element @index from this list
    public int get( int index ) {
        return arrayList.get(index);
    }
	
	// Adds value to the ordered list
    public boolean add( int value) { 
	
		if(arrayList.size() == 0) {
			return arrayList.add(value);
		}
		
		else{
			for (int index = 0; index < arrayList.size(); index++){
				if (arrayList.get(index) >= value){
					arrayList.add(index, value);
					return true;
				}
			}
        } 
		
		return arrayList.add(value);
	}

     
    //Remove the element at given index 
    public int remove( int index) {
       return arrayList.remove(index);
    }

}