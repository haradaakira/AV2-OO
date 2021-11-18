import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        View.createMessage();
        DAO.createTable();
        Integer menuoption = 0;
        do {
            menuoption = option();
        } while (menuoption != 3);
        View.exitMessage();
        System.exit(0);
    }

    public static Integer option() {
        View.menu();
        Scanner scanner = new Scanner(System.in);
        Integer option = 0;
        try {
            option = scanner.nextInt();
        } catch (Exception e) {
            View.invalidValueMessageException();
//            option();
        }
        if (option == 1) {
            Model model = new Model();
            View.insertName();
            model.setNome(scanner.next());
            View.insertAgency();
            try {
                model.setIdagencia(scanner.nextInt());
            } catch (Exception e) {
                View.invalidValueMessageException();
                option();
            }
            View.insertAccount();
            try {
                model.setIdcontacorrente(scanner.nextInt());
            } catch (Exception e) {
                View.invalidValueMessageException();
                option();
            }
            View.insertMoneyAmount();
            try {
                model.setSaldoatualizado(scanner.nextDouble());
            } catch (Exception e) {
                View.invalidValueMessageException();
                option();
            }
            DAO.insertIntoTable(model.getNome(), model.getIdagencia().toString(), model.getIdcontacorrente().toString(), model.getSaldoatualizado().toString());
            model = null;
            View.insertFinish();
            return 1;
        }
        if (option == 2) {
            View.readMessage();
            try {
                DAO.readTable();
            } catch (Exception e) {
                option();
            }
            return 2;
        }
        if (option == 3) {
            return 3;
        }
        View.invalidValueMessage();
        return 0;
    }
}
