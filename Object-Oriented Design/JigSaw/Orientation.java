import jdk.nashorn.internal.ir.ReturnNode;

public enum Orientation {
    LEFT, TOP, RIGHT, BOTTOM; // should stay in this order only

    public Orientation getOpposite() {
        switch (this) {
            // if the piece have edge on left then return right
            case LEFT:
                return RIGHT;
            case RIGHT:
                return LEFT;
            case TOP:
                return BOTTOM;
            case BOTTOM:
                return TOP;
            default:
                return null;
        }
    }
}
