import java.util.Stack;

public class UndoRedoFunctionality {
    private Stack<String> undoStack;
    private Stack<String> redoStack;
    private String currentState;

    public UndoRedoFunctionality() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        currentState = "";
    }

    public void setState(String state) {
        undoStack.push(currentState);
        currentState = state;
        redoStack.clear();
        System.out.println("Current state: " + currentState);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentState);
            currentState = undoStack.pop();
            System.out.println("Undo: " + currentState);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentState);
            currentState = redoStack.pop();
            System.out.println("Redo: " + currentState);
        } else {
            System.out.println("Nothing to redo.");
        }
    }

    public static void main(String[] args) {
        UndoRedoFunctionality undoRedo = new UndoRedoFunctionality();

        undoRedo.setState("State 1");
        undoRedo.setState("State 2");
        undoRedo.setState("State 3");

        undoRedo.undo(); // Undo: State 2
        undoRedo.undo(); // Undo: State 1

        undoRedo.redo(); // Redo: State 2
        undoRedo.redo(); // Redo: State 3

        undoRedo.undo(); // Undo: State 2

        undoRedo.setState("State 4");
        undoRedo.undo(); // Undo: State 2

        undoRedo.redo(); // Redo: State 4
        undoRedo.redo(); // Nothing to redo.
    }
}
