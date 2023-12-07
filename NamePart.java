import java.util.List;

public abstract class NamePart {
    protected List<String> elements;

    public String getRandomElement() {
        int index = (int) (Math.random() * elements.size());
        return elements.get(index);
    }
}
