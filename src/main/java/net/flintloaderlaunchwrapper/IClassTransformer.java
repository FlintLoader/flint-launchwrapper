package net.flintloaderlaunchwrapper;

public interface IClassTransformer {

    byte[] transform(String name, String transformedName, byte[] basicClass);

}
