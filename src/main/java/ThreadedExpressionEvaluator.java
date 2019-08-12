public class ThreadedExpressionEvaluator {

  public enum Operator {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String operator;

    private Operator(String operator) {
      this.operator = operator;
    }

    public String getOperator() {
      return this.operator;
    }
  }

  protected void operand() {
    while (true) {
      // generate random operand here.
      // The operand is a valid number < 100.
    }
  }

  protected void operator() {
    while (true) {
      // generate random operator here.
      // The operator can be any one of the operators in the above 'Operator'
      // enum field.
    }
  }

  protected Double getResult() {
    // Return result as Double here.
    return 0.0;
  }

  protected String getExpression() {
    // Return expression string here.
    // For example --> 10 + 52 - 31 / 76
    return "";
  }

  public static void main(String[] args) {

    ThreadedExpressionEvaluator obj = new ThreadedExpressionEvaluator();

    /**
     * You will need to pass the same instance of ThreadedExpressionEvaluator to
     * two different threads A and B. Thread A will invoke operator() while
     * thread B will invoke operand().
     */

    System.out.println("Expression : " + obj.getExpression());
    System.out.println("Result : " + obj.getResult());
  }
}
