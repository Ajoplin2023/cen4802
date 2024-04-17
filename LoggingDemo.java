package com.maventest;

import org.apache.logging.log4j.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
public class LoggingDemo {
    /**
     * the demologger below will evaluate the log levels and display then on to the logdemo.log file
     */
        private static Logger demologger = LogManager.getLogger(LoggingDemo.class.getName());

        public static void main(String[] args){
                        demologger.info("Counting words");
        Scanner txtFile = null;
        try {
            txtFile = new Scanner(new File("C:/Users/aaron/Desktop/ColorCounter.txt"));
        } catch (FileNotFoundException e) {
                demologger.error(e.getMessage());
            throw new RuntimeException(e);
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
                                while (txtFile.hasNext()) {
                                        String word = txtFile.next();
                                        int count = 1;
                                        if (map.containsKey(word)) {
                                                count = map.get(word) + 1;

                                        }
                                        map.put(word, count);
                                }
                                Set<Map.Entry<String, Integer>> set = map.entrySet();
                                List<Map.Entry<String, Integer>> sortedList = new ArrayList<Map.Entry<String, Integer>>(set);
                                Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {
                                        public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                                                return (b.getValue()).compareTo(a.getValue());
                                        }
                                });
                                //txtFile.close();
                                System.out.println("WORDS " + " | " + "FREQUENCY");
                                for (Map.Entry<String, Integer> i : sortedList) {
                                        System.out.println(i.getKey() + " = " + i.getValue());


                                }
                                demologger.info("Finished Counting Words");

                }
        }
