package elementsofprogramming.arrays;

import constants.EnumCollectionError;
import exception.NullEmptyCollectionException;
import util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tolga Duzenli on 07-Dec-2016.
 *         <p/>
 *         This class provides order for 2D array under spiral order which can be row-by-row or column-by-column.
 *         We will handle different formats.Each of them will be finish at the center of the array.
 *         You can use array or list as a parameter.
 */
public class ComputeSpiralOrder {

    public List<Integer> matrixFromTopLeftCornerToClockwise(List<List<Integer>> matrix) throws NullEmptyCollectionException {
        List<Integer> spiralOrder = new ArrayList<>();
        if (CollectionUtils.isEmpty(matrix)) {
            throw new NullEmptyCollectionException(EnumCollectionError.NULL_OR_EMPTY_COLLECTION);
        }
        for (int offset = 0; offset < Math.ceil(0.5 * matrix.size()); offset++) {
            fromTopLeftCornerToClockWise(matrix, offset, spiralOrder);
        }

        return spiralOrder;
    }

    public List<Integer> matrixFromTopRightCornerToOppositeClockwise(List<List<Integer>> matrix) throws NullEmptyCollectionException {
        List<Integer> spiralOrder = new ArrayList<>();
        if (CollectionUtils.isEmpty(matrix)) {
            throw new NullEmptyCollectionException(EnumCollectionError.NULL_OR_EMPTY_COLLECTION);
        }
        for (int offset = 0; offset < Math.ceil(0.5 * matrix.size()); offset++) {
            fromTopRightCornerToOppositeClockwise(matrix, offset, spiralOrder);
        }

        return spiralOrder;
    }

    private void fromTopLeftCornerToClockWise(List<List<Integer>> matrix, int offset, List<Integer> spiralOrder) {
        if (offset == matrix.size() - offset - 1) {
            spiralOrder.add(matrix.get(offset).get(offset));
            return;
        }
        for (int j = offset; j < matrix.size() - offset - 1; j++) {
            spiralOrder.add(matrix.get(offset).get(j));
        }
        for (int i = offset; i < matrix.size() - offset - 1; i++) {
            spiralOrder.add(matrix.get(i).get(matrix.size() - offset - 1));
        }
        for (int j = matrix.size() - offset - 1; j > offset; j--) {
            spiralOrder.add(matrix.get(matrix.size() - offset - 1).get(j));
        }
        for (int i = matrix.size() - offset - 1; i > offset; i--) {
            spiralOrder.add(matrix.get(i).get(offset));
        }
    }

    private void fromTopRightCornerToOppositeClockwise(List<List<Integer>> matrix, int offset, List<Integer> spiralOrder) {
        if (offset == matrix.size() - offset - 1) {
            spiralOrder.add(matrix.get(offset).get(offset));
            return;
        }
        for (int j = matrix.size() - offset - 1; j > offset; j--) {
            spiralOrder.add(matrix.get(offset).get(j));
        }
        for (int i = offset; i < matrix.size() - offset - 1; i++) {
            spiralOrder.add(matrix.get(i).get(offset));
        }
        for (int j = offset; j < matrix.size() - offset - 1; j++) {
            spiralOrder.add(matrix.get(matrix.size() - offset - 1).get(j));
        }
        for (int i = matrix.size() - offset - 1; i > offset; i--) {
            spiralOrder.add(matrix.get(i).get(matrix.size() - offset - 1));
        }
    }
}
