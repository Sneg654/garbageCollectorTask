package com.epam.gc;

import java.util.Scanner;

/**
 * Created by Sergey_Stefoglo on 7/31/2016.
 */
public class Run {
    private static  final String  START_MESSAGE="please set command (Example: void,someValues,somevalue \nreturn,someValues,somevalue)";
    private static  final String DELIMETER=",";
    private static  final String INCOR_DELIMETER=" ";
    private static  final String DEL_INCOR_DELIMETER="";
    private static  final String TOTAL="Total memory ";
    private static  final String FREE="Free memory ";
    private static  final String INCCRRECT_PARAM="Not correct param";
    private static  final String BEFORE_CREATING="Before created object";
    private static  final String AFTER_CREATING="after created object mode:";
    private static  final String AFTER_INVOKING="after invoiking GC: ";
    private static  final String AFTER_SLEEPING="after sleeping ";
    private static  final String VOID="void";
    private static  final String RETURN="return";

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println(START_MESSAGE);
        while (sc.hasNext()) {
            String[] values = sc.nextLine().replaceAll(INCOR_DELIMETER, DEL_INCOR_DELIMETER).split(DELIMETER);
            System.out.println(BEFORE_CREATING);
            System.out.println(TOTAL + Runtime.getRuntime().maxMemory());
            System.out.println(FREE + Runtime.getRuntime().freeMemory());
            CompositeData data;
            CompositeData data1;
            CompositeData data2;
            CompositeData data3;
            CompositeData data4;
            CompositeData data5;
            if (values.length == 3) {
                if (values[0].equals(VOID)) {
                    voidMethod(values[1], values[2]);

                } else if (values[0].equals(RETURN)) {
                    data = returnedMethod(values[1], values[2]);
                    data1 = returnedMethod(values[1], values[2]);
                    data2 = returnedMethod(values[1], values[2]);
                    data3 = returnedMethod(values[1], values[2]);
                    data4 = returnedMethod(values[1], values[2]);
                    data5 = returnedMethod(values[1], values[2]);

                } else {
                    System.out.println(INCCRRECT_PARAM);
                }
                System.out.println(AFTER_CREATING + values[0]);
                System.out.println(TOTAL + Runtime.getRuntime().maxMemory());
                System.out.println(FREE + Runtime.getRuntime().freeMemory());


                System.gc();
                System.out.println(AFTER_INVOKING);
                System.out.println(TOTAL + Runtime.getRuntime().maxMemory());
                System.out.println(FREE + Runtime.getRuntime().freeMemory());

                Thread.sleep(8000);

                System.out.println(AFTER_SLEEPING);
                System.out.println(TOTAL + Runtime.getRuntime().maxMemory());
                System.out.println(FREE + Runtime.getRuntime().freeMemory());

            } else {

                System.out.println(INCCRRECT_PARAM);
            }

            System.out.println(START_MESSAGE);


        }
    }

    public static void voidMethod(String title, String metadata) {
        CompositeData compositeData = new CompositeData(title, metadata);
        CompositeData compositeData1 = new CompositeData(title, metadata);
        CompositeData compositeData2 = new CompositeData(title, metadata);
        CompositeData compositeData3 = new CompositeData(title, metadata);
        CompositeData compositeData4 = new CompositeData(title, metadata);
        CompositeData compositeData5 = new CompositeData(title, metadata);

    }

    public static CompositeData returnedMethod(String title, String metadata) {
        return  new CompositeData(title, metadata);


    }
}
