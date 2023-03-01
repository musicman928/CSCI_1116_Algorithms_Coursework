class Exercise24_03 {
	public static void main(String[] args) {
		TwoWayLinkedList<Integer> list = new TwoWayLinkedList<Integer>();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);

		java.util.ListIterator<Integer> iterator = list.iterator();
		iterator.next();
		iterator.next();
		iterator.next();


		// System.out.print(iterator.next() + " ");

		System.out.println();
		while (iterator.hasPrevious())
		  System.out.print(iterator.previous() + " ");
	}
}