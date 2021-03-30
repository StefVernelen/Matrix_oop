package matrix_oop;

import java.util.Arrays;
import java.util.stream.IntStream;

/** Each instance of this class represents an matrix from algebra.
 * 
 * @invar | 1 <= getNbRows()
 * @invar | getElementsRowMajor().length == getNbRows() * getNbColumns()
 * @invar | getElementsRowMajor() != null
 * 
 * @invar | 1 <= getNbColumns()
 *
 */
public class Matrix {
	
	/**
	 * @basic
	 */
	public int getNbRows() { throw new RuntimeException("Not yet implemented");	}
	
	/**
	 * @basic
	 * @create | result
	 */
	public double[] getElementsRowMajor() { throw new RuntimeException("Not yet implemented");	}
	
	/**
	 * @post | result == getElementsRowMajor().length / getNbRows()
	 */
	public int getNbColumns() { throw new RuntimeException("Not yet implemented");	}
	
	/**
	 * @post | result != null
	 * @post | result.length == getNbRows()
	 * @post | Arrays.stream(result).allMatch(row -> row != null && row.length == getNbColumns())
	 * @post | IntStream.range(0, getNbRows()).allMatch(rowIndex ->
	 *       | 		IntStream.range(0, getNbColumns()).allMatch(columnIndex ->
	 *       |			result[rowIndex][columnIndex] == getElementsRowMajor()[rowIndex * getNbColumns() + columnIndex]))
	 * 
	 * @create | result, ...result
	 */
	/* Second last condition dictates that the elements in the result (so the rows of the matrix) should not 
	 * be null AND that the lenght of each row is equal to the number of columns.
	 * 
	 * Last condition iterates over each row, then over each element in the row. And check if that element matches the element in 
	 * the RowMajorOrder
	 */
	
	public double[][] getElementsRowArrays() { throw new RuntimeException("Not yet implemented");	}
	
	/**
	 * Initializes this object so that it represents the matrix with the given number of rows and columns
	 * and the given elements. The elements are given as an array in row major order
	 * 
	 * @inspects | elementsRowMajor
	 * 
	 * @throws IllegalArgumentException | nbRows < 1
	 * @throws IllegalArgumentException | nbColumns < 1
	 * @throws IllegalArgumentException | elementsRowMajor == null
	 * @throws IllegalArgumentException | elementsRowMajor.length != nbRows * nbColumns
	 * 
	 * @post | getNbRows() == nbRows
	 * @post | Arrays.equals(getElementsRowMajor(), elementsRowMajor)
	 * 
	 */
	public Matrix (int nbRows, int nbColumns, double[] elementsRowMajor) { throw new RuntimeException("Not yet implemented");	}
	

}
