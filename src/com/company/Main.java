
package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                ArrayList<String> items = new ArrayList<>();
                items.add("Red-Hot Spicy Doritos");
                items.add("Cool Ranch Doritos");
                items.add("Coke");
                items.add("Diet Coke ");
                items.add("Pepsi");
                items.add("Five Hour Energy ");
                items.add("Sunflower Seeds ");
                items.add("Peanuts");
                items.add("Mac Book Chargers ");
                items.add("Sunflower Seeds");


                ArrayList<Double> itemsPrice = new ArrayList<>();
                itemsPrice.add(2.99);
                itemsPrice.add(2.99);
                itemsPrice.add(0.99);
                itemsPrice.add(0.99);
                itemsPrice.add(0.99);
                itemsPrice.add(3.99);
                itemsPrice.add(0.99);
                itemsPrice.add(0.99);
                itemsPrice.add(120.0);
                itemsPrice.add(50.0);

                ArrayList<String> custItem = new ArrayList<>();
                ArrayList<Integer> custItemAmounts = new ArrayList<>();
                String input;
                Scanner stringInput = new Scanner(System.in);

                String output = "";
                double total;
                double grandTotal = 0;
                System.out.print("\nEnter the name of the customer: ");
                while(!(input = stringInput.nextLine()).equalsIgnoreCase("no")){ //loop to enter each the customer (s) order
                    output = "\n" + input;
                    total = 0; //assigning 0 for as initial for all customers
                    System.out.println("Enter the name of items: (0 to exit at any time)");
                    while(!(input = stringInput.nextLine()).equalsIgnoreCase("0")) { //loop to enter each ordered item
                        for(String i:items) {
                            if(i.contains(input) || i.equalsIgnoreCase(input)) {
                                total += itemsPrice.get(items.indexOf(i));
                                output = "\n\t"+input;
                                if(!custItem.contains(input)) {
                                    custItem.add(input);
                                    custItemAmounts.add(1);
                                }
                                else {
                                    int index = custItem.indexOf(input);
                                    custItemAmounts.set(index, custItemAmounts.get(index) + 1);
                                }
                                break;
                            }
                        }
                    }
                    output += "\n\t\t"+total+"\n";
                    grandTotal += total;
                    System.out.print("\nEnter the name of the next customer (no to exit): ");
                }
                System.out.println("RECEIPT: \n");
                System.out.println("Sample Data \n");

                for(String ignored :items){
                    System.out.println(output);
                }

                System.out.println("Closing \n" );
                System.out.println("Receipts \n" );
                System.out.println(output );
                System.out.println("\nInventory Sold: ");
                for(String i:custItem) {
                    System.out.println("\t"+i+" ("+custItemAmounts.get(custItem.indexOf(i))+")");
                }
                for(String ignored :items){
                    custItem.add(input);
                    custItemAmounts.add(1);
                }

                System.out.println("\n Grand Total: "+grandTotal);
            }
        }
