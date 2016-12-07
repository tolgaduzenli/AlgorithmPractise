package elementsofprogramming.arrays;

import constants.EnumCollectionError;
import exception.NullEmptyCollectionException;
import util.CollectionUtils;

import java.util.List;

/**
 * @author Tolga Duzenli on 07-Dec-2016.
 *         This class rotates 2D array from one side to another one.
 *         Time complexity is O(n^2) and space complexity is O(1).
 *         Matrix should be sqaure(nXn).
 */
public class Rotate2DArray {

    public List<List<Integer>> rotateMatrix(List<List<Integer>> squareMatrix) throws NullEmptyCollectionException {
        if (CollectionUtils.isEmpty(squareMatrix)) {
            throw new NullEmptyCollectionException(EnumCollectionError.NULL_OR_EMPTY_COLLECTION);
        }
        int matrixSize = squareMatrix.size() - 1;
        for (int i = 0; i < squareMatrix.size() / 2; i++) {
            for (int j = i; j < matrixSize - i; j++) {
                int temp1 = squareMatrix.get(matrixSize - j).get(i);
                int temp2 = squareMatrix.get(matrixSize - i).get(matrixSize - j);
                int temp3 = squareMatrix.get(j).get(matrixSize - i);
                int temp4 = squareMatrix.get(i).get(j);

                squareMatrix.get(i).set(j, temp1);
                squareMatrix.get(matrixSize - j).set(i, temp2);
                squareMatrix.get(matrixSize - i).set(matrixSize - j, temp3);
                squareMatrix.get(j).set(matrixSize - i, temp4);
            }
        }
        return squareMatrix;
    }
}
