import  java.util.HashMap;
import java.util.Map;

public class GameObjectFactory {
    private static final Map<String, GameObject> objectMap = new HashMap<>();

    public static GameObject getObject(String objectType) {
        GameObject object = objectMap.get(objectType);

        if (object == null) {
            if ("tree".equalsIgnoreCase(objectType)) {
                object = new Tree();
            } else if ("rock".equalsIgnoreCase(objectType)) {
                object = new Rock();
            }
            objectMap.put(objectType, object);
        }

        return object;
    }
}