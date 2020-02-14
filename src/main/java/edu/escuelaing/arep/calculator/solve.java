package edu.escuelaing.arep.calculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solve{

    /**
     * Método encargado de llamer el ordenamiento de los datos
     * @param data datos a ordenar y sumar
     * @return Json con la lista ordenada y la suma de los elementos
     */
    public static String calculate(String data){
        //System.out.println("nums "+ nums);
        ArrayList<Double> nums = new ArrayList<Double>();
        List<String> doubles = Arrays.asList(data.split(","));        
        NumberFormat formatter = new DecimalFormat("#0.00"); 
        Double sum = 0.0;
        for (String str : doubles) {
            Double newNum = Double.parseDouble(str);
            nums.add(newNum);
            sum += newNum;
        }
        System.out.println("Lista Base");
        System.out.println(nums.toString());
        System.out.println(sum);

        RecursiveMergeSort<Double> rMergeSort = new RecursiveMergeSort<Double>();
        List<Double> result = rMergeSort.mergesort(nums);

        System.out.println("Lista Ordenada");
        System.out.println(result.toString());

        String json ="{\"List\":"+result.toString()+",\"sum\":"+sum+"}";
        System.out.println(json);
        return json;
    }
}