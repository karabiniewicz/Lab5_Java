package s180009.view;

import s180009.controller.BeerController;

import java.util.Scanner;

public class BeerDelete implements View {
    private final BeerController beerController;

    public BeerDelete(BeerController beerController) {
        this.beerController = beerController;
    }

    @Override
    public void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("name: ");
        String name = scanner.nextLine();

        String delete = beerController.delete(name);
        System.out.println(delete);
    }
}
