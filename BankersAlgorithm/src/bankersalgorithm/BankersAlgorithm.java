/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankersalgorithm;

/**
 *
 * @author kp86251
 */
public class BankersAlgorithm {

    public BankersAlgorithm(int maxTens, int maxFifties, int maxBenjis) {
        int accountHolders = 3;
        int moneyTypes = 3; //3 money types (10s, 50s, 100s)
        int[] available = new int[moneyTypes];  
        int[][] max = new int[accountHolders][moneyTypes];
        int[][] allocation = new int[accountHolders][moneyTypes];
        
        available[0] = maxTens;
        available[1] = maxFifties;
        available[2] = maxBenjis;
        
        max[0][0] = 20;
        max[0][1] = 14;
        max[0][2] = 6;
        
        max[1][0] = 27;
        max[1][1] = 19;
        max[1][2] = 9;
        
        max[2][0] = 70;
        max[2][1] = 24;
        max[2][2] = 13;
        
        allocation[0][0] = 20;
        allocation[0][1] = 14;
        allocation[0][2] = 6;
        
        allocation[1][0] = 27;
        allocation[1][1] = 19;
        allocation[1][2] = 9;
        
        allocation[2][0] = 70;
        allocation[2][1] = 24;
        allocation[2][2] = 13;
        
    }
    public boolean request(int account, ) {
        //placeholder code
        boolean isSafe = false;
        return isSafe;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
        Total:
            maxTens = 100
            maxFifties = 50
            maxBenjis = 25
        
            account 1: 
                maxTens = 20
                maxFifties = 14
                maxBenjis = 6
        
            account 2: 
                maxTens = 27
                maxFifties = 19
                maxBenjis = 9
        
            account 3: 
                maxTens = 70
                maxFifties = 24
                maxBenjis = 13
        
        */
        BankersAlgorithm myBank = new BankersAlgorithm(100, 50, 25);
        System.out.println("Success");
    } 
}
