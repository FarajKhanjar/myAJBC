package creationalPatterns.factory.abstract_factory.exe;

public abstract class ThemeFactory {
	
    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
	public abstract Text createText();
	public abstract Resolution createResolution();
}
