package RoundRobinAlgo;

import QuickSortAlgo.Process;

import java.util.LinkedList;
import java.util.Queue;

class RoundRobin{

    public static void main(String[] args){

        //time for each process
        int timeQuantum = 2;

        Queue<Process> readyQueue = new LinkedList<>();


        readyQueue.add(new Process("P1",4));
        readyQueue.add(new Process("P2",3));
        readyQueue.add(new Process("P3",2));


        roundRobin(readyQueue, timeQuantum);

    }

    private static void roundRobin(Queue<Process> readyQueue, int timeQuantum) {
        int time = 0;
        while(time < timeQuantum){
            //we get the first process from the linkedList
            Process currentProcess = readyQueue.poll();

            if (currentProcess.getRemainingTime() > timeQuantum){

                System.out.println("Process" + currentProcess.getId() + " executed for " + timeQuantum + " units");
                currentProcess.getRemainingTime() -= timeQuantum;


            }




        }
    }


}