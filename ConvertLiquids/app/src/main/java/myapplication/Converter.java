package k00364744.myapplication;

public class Converter {
    public Converter() {   }
    public double volumeConvert(double originalNum, String originalUnit, String desiredUnit) {

        double num1 = originalNum;
        double num2 = 0.0d;
        String original = originalUnit.toLowerCase();
        String newU = desiredUnit.toLowerCase();

        switch (original) { //Begin conversion table
            case "milliliter":
                switch (newU) {
                    case "milliliter":
                        num2 = num1;
                        break;
                    case "liter":
                        num2 = originalNum * 0.001d;
                        break;
                    case "kiloliter":
                        num2 = originalNum * 0.1d;
                        break;
                    case "pint":
                        num2 = originalNum * .00211338d;
                        break;
                    case "quart":
                        num2 = originalNum * .00105669d;
                        break;
                    case "gallon":
                        num2 = originalNum * .000264172d;
                        break;
                    case "cup":
                        num2 = originalNum * .00422675d;
                        break;
                }
                break;

            case "liter":
                switch (newU) {
                    case "milliliter":
                        num2 = originalNum * 0.001d;
                        break;
                    case "liter":
                        num2 = num1;
                        break;
                    case "kiloliter":
                        num2 = originalNum * 0.1d;
                        break;
                    case "pint":
                        num2 = originalNum * 2.11338d;
                        break;
                    case "quart":
                        num2 = originalNum * 1.05669d;
                        break;
                    case "gallon":
                        num2 = originalNum * 0.264172d;
                        break;
                    case "cup":
                        num2 = originalNum * 4.22675d;
                        break;
                }
                break;

            case "kiloliter":
                switch (newU) {
                    case "milliliter":
                        num2 = originalNum * 0.001d;
                        break;
                    case "liter":
                        num2 = originalNum * 0.1d;
                        break;
                    case "kiloliter":
                        num2 = num1;
                        break;
                    case "pint":
                        num2 = originalNum * 2113.38d;
                        break;
                    case "quart":
                        num2 = originalNum * 1056.69d;
                        break;
                    case "gallon":
                        num2 = originalNum * 264.172d;
                        break;
                    case "cup":
                        num2 = originalNum * 4226.75d;
                        break;
                }
                break;

            case "pint":
                switch (newU) {
                    case "milliliter":
                        num2 = originalNum * 473.176d;
                        break;
                    case "liter":
                        num2 = originalNum * 0.473176d;
                        break;
                    case "kiloliter":
                        num2 = originalNum * .00047176d;
                        break;
                    case "pint":
                        num2 = num1;
                        break;
                    case "quart":
                        num2 = originalNum * .5d;
                        break;
                    case "gallon":
                        num2 = originalNum * .125d;
                        break;
                    case "cup":
                        num2 = originalNum * 2.0d;
                        break;
                }
                break;

            case "quart":
                switch (newU) {
                    case "milliliter":
                        num2 = originalNum * 946.353d;
                        break;
                    case "liter":
                        num2 = originalNum * 0.946353d;
                        break;
                    case "kiloliter":
                        num2 = originalNum * .000946353d;
                        break;
                    case "pint":
                        num2 = originalNum * 2.0d;
                        break;
                    case "quart":
                        num2 = num1;
                        break;
                    case "gallon":
                        num2 = originalNum * .25d;
                        break;
                    case "cup":
                        num2 = originalNum * 4.0d;
                        break;
                }
                break;

            case "gallon":
                switch (newU) {
                    case "milliliter":
                        num2 = originalNum * 3785.41d;
                        break;
                    case "liter":
                        num2 = originalNum * 3.78541d;
                        break;
                    case "kiloliter":
                        num2 = originalNum * .00378541d;
                        break;
                    case "pint":
                        num2 = originalNum * 8.0d;
                        break;
                    case "quart":
                        num2 = originalNum * 4.0d;
                        break;
                    case "gallon":
                        num2 = num1;
                        break;
                    case "cup":
                        num2 = originalNum * 16.0d;
                        break;
                }
                break;

            case "cup":
                switch (newU) {
                    case "milliliter":
                        num2 = originalNum * 236.588d;
                        break;
                    case "liter":
                        num2 = originalNum * 0.236588d;
                        break;
                    case "kiloliter":
                        num2 = originalNum * .000236588d;
                        break;
                    case "pint":
                        num2 = originalNum * .5d;
                        break;
                    case "quart":
                        num2 = originalNum * .25d;
                        break;
                    case "gallon":
                        num2 = originalNum * .0625d;
                        break;
                    case "cup":
                        num2 = originalNum;
                        break;
                }
                break;
        }
        return num2;
    }
}
