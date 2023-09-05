/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author Xuan Vinh
 */
public class SortProgramming extends Menu<String> {

    static String[] mc = {"Buddle Sort", "Quick Sort", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SortProgramming(Element element) {
        super("Sort Option:", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    public void execute(int n) {
        System.out.println("Unsorted array: ");
        library.display(array);
        switch (n) {
            case 1: // Buddle Sort
                algorithm.buddleSort(array);
                System.out.println("\nSorted array by Buddle Sort: ");
                library.display(array);
                System.out.println("");
                break;
            case 2: // Quick Sort
                algorithm.quickSort(array, 0, size_array - 1);
                System.out.println("\nSorted array by Quick Sort: ");
                library.display(array);
                System.out.println("");
                break;
            case 3: // Exit the program
                System.exit(0);
        }
    }

}
