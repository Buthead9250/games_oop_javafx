package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void position() {
        Cell start = Cell.C8;
        BishopBlack bishop = new BishopBlack(start);
        assertThat(bishop.position(), is(start));
    }

    @Test
    public void way() throws ImpossibleMoveException {
        BishopBlack bishop = new BishopBlack(Cell.F8);
        Cell[] way = bishop.way(Cell.A3);
        Cell[] expected = {Cell.E7, Cell.D6, Cell.C5, Cell.B4, Cell.A3};
        assertThat(way, is(expected));
    }

    @Test
    public void copy() {
        Cell next = Cell.E7;
        BishopBlack bishop = new BishopBlack(Cell.F8);
        assertThat(bishop.copy(next).position(), is(next));
    }
}
