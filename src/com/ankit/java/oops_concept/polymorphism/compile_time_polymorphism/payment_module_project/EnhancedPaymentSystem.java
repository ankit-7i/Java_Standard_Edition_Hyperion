package com.ankit.java.oops_concept.polymorphism.compile_time_polymorphism.payment_module_project;

class EnhancedPaymentSystem {


    private void printHeader(String title) {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("    " + title);
        System.out.println("=".repeat(40));
    }

    private void printFooter() {
        System.out.println("=".repeat(40) + "\n");
    }

    //Cash Payment
    public void makePayment(double amount) {
        printHeader("CASH PAYMENT");
        System.out.println("Paid via Cash: ₹" + amount);
        System.out.println("Payment Successful!");
        printFooter();
    }

    // UPI Payment
    public void makePayment(String upiId, double amount) {
        printHeader("UPI PAYMENT");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Paid: ₹" + amount);
        System.out.println("Payment Successful!");
        printFooter();
    }

    // Card Payment
    public void makePayment(String cardNumber, String cvv, String expiry, double amount) {
        printHeader("CARD PAYMENT");
        System.out.println("Card Number: ****-****-****-" + cardNumber.substring(cardNumber.length()-4));
        System.out.println("Expiry: " + expiry);
        System.out.println("Paid: ₹" + amount);
        System.out.println("Payment Successful!");
        printFooter();
    }

    // Partial Payment (Cash + UPI)
    public void makePayment(double cashAmount, double totalAmount, String upiId) {
        printHeader("PARTIAL PAYMENT");
        double remaining = totalAmount - cashAmount;
        System.out.println("Cash Paid: ₹" + cashAmount);
        System.out.println("Remaining Paid via UPI (" + upiId + "): ₹" + remaining);
        System.out.println("Payment Successful!");
        printFooter();
    }

    // Gift Card Payment
    public void makePayment(String giftCardCode, double amount, boolean isGiftCard) {
        printHeader("GIFT CARD PAYMENT");
        System.out.println("Gift Card Code: " + giftCardCode);
        System.out.println("Redeemed Amount: ₹" + amount);
        System.out.println("Payment Successful!");
        printFooter();
    }

    // EMI Payment
    public void makePayment(String cardNumber, double emiAmount, int months) {
        printHeader("EMI PAYMENT");
        System.out.println("Card Number: ****-****-****-" + cardNumber.substring(cardNumber.length()-4));
        System.out.println("EMI Amount: ₹" + emiAmount + " for " + months + " months");
        System.out.println("Payment Scheduled!");
        printFooter();
    }

    // Net Banking Payment
    public void makePayment(String bankName, String accountNumber, double amount, int dummy) {
        printHeader("NET BANKING PAYMENT");
        System.out.println("Bank: " + bankName);
        System.out.println("Account: ****" + accountNumber.substring(accountNumber.length()-4));
        System.out.println("Paid: ₹" + amount);
        System.out.println("Payment Successful!");
        printFooter();
    }
}
