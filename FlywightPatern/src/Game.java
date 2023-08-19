public class Game {
    public static void main(String[] args) {
        GameObject tree1 = GameObjectFactory.getObject("tree");
        GameObject rock1 = GameObjectFactory.getObject("rock");
        GameObject tree2 = GameObjectFactory.getObject("tree");

        tree1.render();     // Rendering a tree.
        rock1.render();     // Rendering a rock.
        tree2.render();     // Rendering a tree.
    }
}

