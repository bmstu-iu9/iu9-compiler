package ru.bmstu.iu9.compiler;

/**
 *
 * @author maggot
 */
public final class CharConstantToken extends ConstantToken {
    public CharConstantToken(Fragment coordinates, int value) {
        super(coordinates, Type.CONST_INT);
        this.value = value;
    }
    public CharConstantToken(Position starting, Position ending, int value) {
        super(new Fragment(starting, ending), Type.CONST_CHAR);
        this.value = value;
    }
    
    @Override
    public Integer value() { return this.value; }
    
    private int value;
}
