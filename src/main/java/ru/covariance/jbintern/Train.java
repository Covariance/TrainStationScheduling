package ru.covariance.jbintern;

public class Train {
    private final int ID;
    private final double arrival;
    private final double unloading;
    private final double payment;

    public Train(int ID, double arrival, double unloading, double payment) {
        this.ID = ID;
        this.arrival = arrival;
        this.unloading = unloading;
        this.payment = payment;
    }

    public int getID() {
        return ID;
    }

    public double getArrival() {
        return arrival;
    }

    public double getUnloadingEnd() {
        return arrival + unloading;
    }

    public double getPayment() {
        return payment;
    }

    public static Train parseTrain(String input) {
        String[] splitInput = input.split(" ");
        if (splitInput.length != 4) {
            throw new ClassFormatError("Cannot parse train: " + input);
        }
        return new Train(Integer.parseInt(splitInput[0]),
                Double.parseDouble(splitInput[1]),
                Double.parseDouble(splitInput[2]),
                Double.parseDouble(splitInput[3]));
    }

    @Override
    public String toString() {
        return ID + " " + arrival + " " + unloading + " " + payment;
    }
}
