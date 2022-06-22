package net.flintloader.launchwrapper;

public interface IClassTransformer {

    byte[] transform(String name, String transformedName, byte[] basicClass);

}
