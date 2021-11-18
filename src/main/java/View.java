public class View {

    public static void menu() {
        System.out.print("\n<<< MENU PRINCIPAL >>>\n1 - Inserir os dados na tabela\n2 - Apresentar a tabela\n3 - Encerrar\nEscolha: ");
    }

    public static void createMessage() {
        System.out.println("\n--- Criando a tabela ---");
    }

    public static void insertName() {
        System.out.print("Insira o nome: ");
    }

    public static void insertAgency() {
        System.out.print("Insira a agencia: ");
    }

    public static void insertAccount() {
        System.out.print("Insira o numero da conta: ");
    }

    public static void insertMoneyAmount() {
        System.out.print("Insira o saldo: ");
    }

    public static void insertFinish() {
        System.out.println("--- Inserindo na tabela ---");
    }

    public static void readMessage() {
        System.out.println("--- Apresentando a tabela ---");
    }

    public static void exitMessage() {
        System.out.println("--- Encerrando ---");
    }

    public static void invalidValueMessageException() {
        System.out.println("\n!!! INSIRA UM NUMERO !!!");
    }

    public static void invalidValueMessage() {
        System.out.println("!!! VALOR INVALIDO !!!\n");
    }
}
