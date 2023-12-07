import java.util.Random;

public class NameGenerator {
    private VowelManager vowelManager;
    private ConsonantManager consonantManager;

    public NameGenerator() {
        this.vowelManager = new VowelManager();
        this.consonantManager = new ConsonantManager();
    }

    public String generateName() {
        Random random = new Random();
        int nameLength = random.nextInt(5) + 5; // Name length between 5 and 10 characters

        StringBuilder name = new StringBuilder();

        // First letter is a consonant
        name.append(consonantManager.getRandomElement().toUpperCase());

        // Alternate between vowels and consonants
        for (int i = 1; i < nameLength; i++) {
            if (i % 2 == 0) {
                name.append(vowelManager.getRandomElement());
            } else {
                name.append(consonantManager.getRandomElement());
            }
        }

        return name.toString();
    }
}
