package ru.bmstu.iu9.compiler;

/**
 * Created by IntelliJ IDEA. User: maggot Date: 19.05.11 Time: 20:36 To change
 * this template use File | Settings | File Templates.
 *
 * @author anton.bobukh
 */
class aPositionedException extends CompilerException {
    public aPositionedException(Position position) {
        super();
        this.position = position;
    }
    public aPositionedException(
            String message,
            Position position) {

        super(message);
        this.position = position;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " at " + position;
    }

    public final Position position;
}
