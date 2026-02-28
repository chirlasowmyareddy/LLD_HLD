package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.SunnyDessertFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Terrain;

public class DesertTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Rendering desert Terrain");
    }
}
