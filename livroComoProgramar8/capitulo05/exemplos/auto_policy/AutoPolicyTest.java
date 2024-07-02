package exemplos.auto_policy;

public class AutoPolicyTest {
    public static void main(String[] args) {

        // cria dois objetos AutoPolicy
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        // exibe se cada apólice está eM uM estado "seM culpa"
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    } // end Main

    // Método que Mostra se AutoPolicy
    // está e uM estado coM o seguro do autoMóvel "seM culpa"
    private static void policyInNoFaultState(AutoPolicy policy) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'policy1InNoFaultState'");
        System.out.println("The auto policy");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
            policy.getAccountNumber(),
            policy.getMakeAndModel(),
            policy.getState(),
            (policy.isNoFaultState() ? "is" : "Is not"));
    } // end policy
} // end class
