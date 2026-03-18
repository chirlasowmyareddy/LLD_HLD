package LLD_HLD.LowLevelDesign.DesignPatterns.Structural.CompositePattern.MathExpression;

public class Expression implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    OperationType operation;


    public Expression(ArithmeticExpression leftPart, ArithmeticExpression rigthPart, OperationType operation) {
        this.leftExpression = leftPart;
        this.rightExpression = rigthPart;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = 0;
        switch(operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();    
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;

        }
        System.out.println("Expression value is: "+value);
        return value;
    } 
}
