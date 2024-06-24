public class App {

    public int Compute(Order order) {
        // Vérification des entrées
        if (order.getType() == null || order.getName() == null || order.getType().isEmpty() || order.getName().isEmpty()) return -1;

        // Initialisation du prix total
        int total = 0;

        if (order.getType().equals("assiette")) {
            total += 15;
        } else {
            total += 10;
        }

        total = computeBeverageAndDessert(total, order.getSize(), order.getDessertSize(), order.getType());

        // Gestion du café
        total = handleCoffee(total, order.getType(), order.getSize(), order.getDessertSize(), order.getCoffee());

        return total;
    }

    // Méthode pour calculer le prix en fonction de la boisson et du dessert
    private int computeBeverageAndDessert(int total, String size, String dessertSize, String type) {
        int basePrice = total;

        switch (size) {
            case "petit" -> {
                total += 2;
                total = addDessertPrice(total, dessertSize);
            }
            case "moyen" -> {
                total += 3;
                total = applyStandardFormula(total, dessertSize, type, basePrice);
            }
            case "grand" -> {
                total += 4;
                total = applyMaxFormula(total, dessertSize, type, basePrice);
            }
        }

        return total;
    }

    // Méthode pour ajouter le prix du dessert
    private int addDessertPrice(int total, String dsize) {
        if (dsize.equals("normal")) {
            total += 2;
        } else {
            total += 4;
        }
        return total;
    }

    // Méthode pour appliquer la formule standard
    private int applyStandardFormula(int total, String dsize, String type, int basePrice) {
        if (dsize.equals("normal")) {
            System.out.print("Prix Formule Standard appliqué ");
            if (type.equals("assiette")) {
                total = 18;
            } else {
                total = 13;
            }
        } else {
            total += 4;
        }
        return total;
    }

    // Méthode pour appliquer la formule maximale
    private int applyMaxFormula(int total, String dsize, String type, int basePrice) {
        if (dsize.equals("normal")) {
            total += 2;
        } else {
            System.out.print("Prix Formule Max appliquée ");
            if (type.equals("assiette")) {
                total = 21;
            } else {
                total = 16;
            }
        }
        return total;
    }

    // Méthode pour gérer le café
    private int handleCoffee(int total, String type, String size, String dsize, Boolean coffee) {
        if(coffee) {
            if (type.equals("assiette") && size.equals("moyen") && dsize.equals("normal") ) {
                System.out.print("avec café offert!");
            } else { total += 1; }
        }
        return total;
    }

}