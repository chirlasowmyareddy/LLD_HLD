package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.RainyMountainFamily;

import LLD_HLD.LowLevelDesign.DesignPatterns.Creational.AbstractFactoryPattern.Interfaces.Terrain;

public class MountainTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Rendering Mountain Terrain");
    }
}
