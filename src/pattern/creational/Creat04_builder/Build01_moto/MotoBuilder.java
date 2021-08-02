package pattern.creational.Creat04_builder.Build01_moto;

public class MotoBuilder {
    public Moto build (String modelName) {
        return new Moto(MotoWiki.getCapacityByName(modelName),
                MotoWiki.getPowerByName(modelName),
                MotoWiki.getSpeedByName(modelName),
                modelName
        );
    }
}
