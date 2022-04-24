public class Pokemon {
    private String name;
    private int numberOfEvolutions;
    private int generationIntroduced;

    Pokemon(String name, int numberOfEvolutions, int generationIntroduced) {
        this.name = name;
        this.numberOfEvolutions = numberOfEvolutions;
        this.generationIntroduced = generationIntroduced;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfEvolutions(int numberOfEvolutions) {
        this.numberOfEvolutions = numberOfEvolutions;
    }

    public void setGenerationIntroduced(int generationIntroduced) {
        this.generationIntroduced = generationIntroduced;
    }

    public String getPokemonDetails() {
        return name + ": " + numberOfEvolutions + ": " + generationIntroduced;
    }

}// end of Pokémon class
