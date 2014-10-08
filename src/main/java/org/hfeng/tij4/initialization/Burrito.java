package org.hfeng.tij4.initialization;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {
        this.degree = degree;
    }
    public void describe() {
        System.out.print("This burrito is");
        switch(degree) {
        case NOT:
            System.out.println("not spicy at all");
            break;
        case MILD:
        case MEDIUM:
            System.out.println(" a little hot.");
            break;
        case HOT:
        case FLAMING:
            System.out.println(" may be too hot");
        default:
        }
    }

    public static void main(String[] args) {
        Burrito
            plain = new Burrito(Spiciness.NOT),
            greenChile = new Burrito(Spiciness.MEDIUM),
            jalapeno = new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// This burrito isnot spicy at all                //
// This burrito is a little hot.                  //
// This burrito is may be too hot                 //
////////////////////////////////////////////////////