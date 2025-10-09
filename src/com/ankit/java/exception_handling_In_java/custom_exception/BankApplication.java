package com.ankit.java.exception_handling_In_java.custom_exception;

import java.util.Scanner;

// Custom Exceptions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

class LoanNotAllowedException extends RuntimeException {
    public LoanNotAllowedException(String message) {
        super(message);
    }
}

// Bank Interface
interface Bank {
    void deposit(double amount) throws InvalidAmountException;
    void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;
    void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
    void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;
    double getBalance();
}

// BankAccount Class
class BankAccount implements Bank {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.printf("Deposit successful. New balance: %.1f%n", balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.printf("Withdrawal successful. New balance: %.1f%n", balance);
    }

    @Override
    public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Transfer amount must be positive");
        }
        if (toAccount == null) {
            throw new AccountNotFoundException("Target account not found");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for transfer");
        }
        balance -= amount;
        toAccount.balance += amount;
        System.out.println("Transfer successful.");
    }

    @Override
    public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Loan amount must be positive");
        }
        if (amount > 50000 || balance < 50000) {
            throw new LoanNotAllowedException("Loan not allowed. Either amount exceeds limit or balance is too low.");
        }
        balance += amount;
        System.out.printf("Loan approved. New balance: %.1f%n", balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}

// Customer Class
class Customer {
    private String name;
    private BankAccount account;

    public Customer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }
}

// ATM Class
public class BankApplication
{
    public static void main(String[] args)
    {
        // Create bank accounts and customers
        BankAccount acc1 = new BankAccount(1111, 60000);
        BankAccount acc2 = new BankAccount(2222, 3000);
        Customer customer1 = new Customer("Alice", acc1);
        Customer customer2 = new Customer("Bob", acc2);

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                // Display menu
                System.out.println("\nSelect an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                System.out.println("4. Loan Application");
                System.out.println("5. Check Balance");
                System.out.println("6. Exit");

                System.out.print("Enter your option: ");
                int option;
                try {
                    option = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                if (option == 6) {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                }

                // Read customer name
                System.out.print("Enter Customer name: ");
                String name = scanner.nextLine().trim();

                // Match customer
                Customer customer = null;
                if (name.equalsIgnoreCase(customer1.getName())) {
                    customer = customer1;
                } else if (name.equalsIgnoreCase(customer2.getName())) {
                    customer = customer2;
                } else {
                    System.out.println("Customer not found!");
                    continue;
                }

                BankAccount account = customer.getAccount();

                try {
                    switch (option) {
                        case 1: // Deposit
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = Double.parseDouble(scanner.nextLine());
                            account.deposit(depositAmount);
                            break;

                        case 2: // Withdraw
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = Double.parseDouble(scanner.nextLine());
                            account.withdraw(withdrawAmount);
                            break;

                        case 3: // Transfer
                            System.out.print("Enter amount to transfer: ");
                            double transferAmount = Double.parseDouble(scanner.nextLine());
                            BankAccount targetAccount = (account.getAccountNumber() == acc1.getAccountNumber()) ? acc2 : acc1;
                            account.transfer(targetAccount, transferAmount);
                            break;

                        case 4: // Loan Application
                            System.out.print("Enter loan amount to apply: ");
                            double loanAmount = Double.parseDouble(scanner.nextLine());
                            account.applyForLoan(loanAmount);
                            break;

                        case 5: // Check Balance
                            System.out.printf("Current balance: %.1f%n", account.getBalance());
                            break;

                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid amount. Please enter a valid number.");
                } catch (InvalidAmountException | LoanNotAllowedException e) {
                    System.out.println("Invalid operation: " + e.getMessage());
                } catch (InsufficientFundsException | AccountNotFoundException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}