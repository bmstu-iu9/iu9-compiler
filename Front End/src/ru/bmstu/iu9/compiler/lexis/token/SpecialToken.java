package ru.bmstu.iu9.compiler.lexis.token;

import ru.bmstu.iu9.compiler.Fragment;
import ru.bmstu.iu9.compiler.Position;

/**
 *
 * @author maggot
 */
public final class SpecialToken extends Token {
    public SpecialToken(Fragment coordinates, Type type) {
        super(coordinates, type);
    }
    public SpecialToken(Position starting, Position ending, Type type) {
        super(new Fragment(starting, ending), type);
    }
}
