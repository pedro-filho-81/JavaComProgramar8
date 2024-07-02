/*
 * Você foi contratado por uma companhia de seguros de automóvel 
 * que atende estes estados do nordeste dos Estados Unidos — 
 * Connecticut, Maine, Massachusetts, New Hampshire, Nova Jersey, 
 * Nova York, Pensilvânia, Rhode Island e Vermont. A empresa quer 
 * que você crie um programa que produz um relatório indicando para 
 * cada uma das apólices de seguro de automóvel se a apólice é válida 
 * em um estado com seguro de automóvel “sem culpa” (modalidade de 
 * seguro em que o segurado é indenizado independentemente de sua 
 * responsabilidade no sinistro) — Massachusetts, Nova Jersey,
 *  Nova York e Pensilvânia.
 */
package exemplos.auto_policy;

public class AutoPolicy {
   
    // variáveis de instância
    private int accountNumber; // número da conta da apólice
    private String makeAndModel; // o carro da apólice
    private String state; // abriviatura do estado com duas letras

    // construtor
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {

        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    } // end construct

    // define accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    } // end set account
    // retorna accountNumber
    public int getAccountNumber() {
        return accountNumber;
    } // end account

    // define M make And model
    public void setMakeAndModel(String makeAndMake) {
        this.makeAndModel = makeAndMake;
    } // end set
    // retorna makaAnemodel
    public String getMakeAndModel() {
        return makeAndModel;
    } // end get

    // define state
    public void setState(String state) {
        this.state = state;
    } // end state
    // retorna state
    public String getState() {
        return state;
    } // end get stte

    // método predicado é retornado se se o estado tem seguro "sem culpa"
    public boolean isNoFaultState() {
        
        // variável
        boolean noFaultState;

        // determina se o estado tem seguro de automóvel "sem culpa"
        switch (getState()) { // obtém a abriviatura do estado do objeto AutoPolicy
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;          
                break;
        
            default:
                noFaultState = false;
                break;
        } // end switch
        return noFaultState;
    } // end function
} // end class AutoPolice
