package tema1;

import java.io.PrintWriter;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class PriorityQueue {
	public Passenger[] heap;
	private static int size;
	private int maxSize;
	PrintWriter output;

	/**
	 * @param maxSize initializeaza heap-ul cu numarul total de pasageri
	 * @param output fisierul de output in care se face scrierea
	 */
	protected PriorityQueue(int maxSize, PrintWriter output) {
		this.maxSize = maxSize;
		size = 0;
		heap = new Passenger[this.maxSize + 1];
		this.output = output;
	}

	/**
	 * metoda elimina root-ul heap-ului si il reface astfel incat sa devina din nou maxheap
	 */
	public void embark() {
		heap[1] = heap[size];
		heap[size] = null;
		size--;
		maxHeapify(1);
	}

	/**
	 * metoda returneaza pozitia parintelui nodului primit ca parametru
	 * @param pos nodul pentru care se vrea sa se stie parintele
	 * @return pozitia parintelui
	 */
	private int parent(int pos) {
		return pos / 2;
	}

	/**
	 * metoda returneaza pozitia copilului stanga al nodului primit ca parametru
	 * @param pos nodul pentru care se vrea sa se stie copilul stanga
	 * @return pozitia copilului stanga
	 */
	private int leftChild(int pos) {
		return (2 * pos);
	}

	/**
	 * metoda returneaza pozitia copilului dreapta al nodului primit ca parametru
	 * @param pos nodul pentru care se vrea sa se stie copilul dreapta
	 * @return pozitia copilului dreapta
	 */
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	/**
	 * matoda adauga un element de tip Passenger in heap
	 * @param p elemtul ce trebuie introdus in heap
	 * @param priority prioritatea pasagerului
	 */
	public void insert(Passenger p, int priority) {
		heap[++size] = p;
		int current = size;
		
		if (current == 1) {
			return;
		} else {
			while (parent(current) != 0 && (heap[current].getPriority() > heap[parent(current)].getPriority())) {
				swap(current, parent(current));
				current = parent(current);
			}
		}
	}

	/**
	 * metoda face interschimbarea intre doua elemente din heap
	 * @param fpos pozitia elementului din heap care trebuie mutat
	 * @param spos pozitia cu care trebuie facuta schimbarea primului parametru
	 */
	public void swap(int fpos, int spos) {
		Passenger tmp;
		tmp = heap[fpos];
		heap[fpos] = heap[spos];
		heap[spos] = tmp;
	}

	/**
	 * metoda reordoneaza heap-ul astfel incat sa devina din nou maxheap
	 * @param pos pozitia de unde trebuie rearanjat arborele
	 */
	public void maxHeapify(int pos) {

		if (pos < size) {
			Passenger root = heap[pos];
			Passenger left = heap[leftChild(pos)];
			Passenger right = heap[rightChild(pos)];

			if (leftChild(pos) <= size && left.getPriority() > root.getPriority()) {
				if (right != null) {
					if (left.getPriority() >= right.getPriority()) {
						swap(pos, leftChild(pos));
						maxHeapify(leftChild(pos));
					} else {
						swap(pos, rightChild(pos));
						maxHeapify(rightChild(pos));
					}
				} else {
					swap(pos, leftChild(pos));
					maxHeapify(leftChild(pos));
				}
			} else {
				if (rightChild(pos) <= size && right.getPriority() > root.getPriority()) {
					swap(pos, rightChild(pos));
					maxHeapify(rightChild(pos));
				}

			}
		}

	}

	/**
	 * metoda parcurge recursiv arborele si face scrierea in fisier
	 * @param index folosit ca si contor
	 */
	public void print(int index) {

		if (index > size) {
			return;
		}
		output.print(heap[index].getId() + " ");

		print((2 * index));
		print((2 * index) + 1);
	}

	public void list() {
		print(1);
		output.println();
	}

	/**
	 * metoda sterge toata entitatea sau doar o persoana din aceasta
	 * @param p pasagerul care trebuie sa fie sters din arbore
	 */
	public void delete(Passenger p) {
		int contor = 0;
		for (int i = 1; i <= size; i++) {
			if (heap[i].getId().equals(p.getId())) {
				for (int j = 0; j < heap[i].pers.length; j++) {
					int index = j;
					if (heap[i].pers[j] != null)
						if (heap[i].pers[j].getRemove() == true) {
							contor++;
							while (index < heap[i].pers.length - 1) {
								heap[i].pers[index] = heap[i].pers[index + 1];
								index++;
							}
							heap[i].pers[index] = null;
							maxHeapify(i);
						}
				}

				if (contor == 0) {
					heap[i] = heap[size];
					heap[size] = null;
					size--;
					maxHeapify(i);
				}

			}
		}
	}

}
