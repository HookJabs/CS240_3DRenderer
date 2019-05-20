import java.util.ArrayList;
import java.util.List;

public class Scene {
    private List<WorldObject> objects;

    public Scene() {
        this.objects = new ArrayList<WorldObject>();
    }

    public void addMesh(Mesh mesh) {
        WorldObject wo = new WorldObject(mesh);
        wo.applyTranslation(Matrix.translationMatrix(0, 0, -3f));
        objects.add(wo);
    }

    public List<WorldObject> getObjects() {
        return objects;
    }
}
