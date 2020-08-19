package multiThreadedHS.util;

import java.util.ArrayList;
import multiThreadedHS.util.Results;
/**
 *@author Pranav Sahu
 *Code cited from "https://www.codexpedia.com/java/java-merge-sort-implementation/"
 */
public class MergeSort{
    public ArrayList<String> mergeSort(ArrayList<String> store) {
    ArrayList<String> left = new ArrayList<String>();
    ArrayList<String> right = new ArrayList<String>();
    int center;
 
    if (store.size() == 1) {    
        return store;
    } else {
        center = store.size()/2;
        /**
         *copy left half of store into the left ArrayList
         */
        for (int i=0; i<center; i++) {
                left.add(store.get(i));
        }
        /*
         *copy the right half of store into the right ArrayList
         */
        for (int i=center; i<store.size(); i++) {
                right.add(store.get(i));
        }
        /**
         *Sort both the left and Right ArrayLists
         */
        left  = mergeSort(left);
        right = mergeSort(right);
        /**
         *Merge the sorted ArrayLists together
         */
        merge(left, right, store);
    }
    return store;
} 

private void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> store) {
    int leftIndex = 0;
    int rightIndex = 0;
    int storeIndex = 0;
    /**
     *Keep traversing the left and Right ArrayLists and keep splitting ArrayLists in smaller parts
     *till entire ArrayLists have been used up
     */
    while (leftIndex < left.size() && rightIndex < right.size()) {
        if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
            store.set(storeIndex, left.get(leftIndex));
            leftIndex++;
        } else {
            store.set(storeIndex, right.get(rightIndex));
            rightIndex++;
        }
        storeIndex++;
    }
    /**
     * Made use of a new Data Structure to copy those elements which have not been used up
     * in either left or right ArrayLists
     */
    ArrayList<String> rest;
    int restIndex;
    if (leftIndex >= left.size()) {
        rest = right;
        restIndex = rightIndex;
    } else {
        rest = left;
        restIndex = leftIndex;
    }
    for (int i=restIndex; i<rest.size(); i++) {
        store.set(storeIndex, rest.get(i));
        storeIndex++;
    }
}
}
