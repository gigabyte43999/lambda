import java.util.Optional;

public class Person {

    private Optional<ClassRoom> classRoom;

    public Optional<ClassRoom> getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(Optional<ClassRoom> classRoom) {
        this.classRoom = classRoom;
    }
}
