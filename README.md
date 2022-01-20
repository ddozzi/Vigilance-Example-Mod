# Vigilance Example Mod (Java)
I haven't really seen any mods that use [Vigilance](https://github.com/Sk1erLLC/Vigilance) and Essential with Java, so here's a quick example mod I made.
It's basically a spinoff of the [ModCore Example Mod](https://github.com/Sk1erLLC/ModCore-Example-Mod), and the [example on the Vigilance github repo](https://github.com/Sk1erLLC/Vigilance/tree/master/src/main/kotlin/gg/essential/vigilance/example). ModCore is depricated and the Vigilance examples all use Kotlin.

## Usage
If you're planning on using this in a development environment, don't forget to add
```java
--tweakClass gg.essential.loader.stage0.EssentialSetupTweaker
```
to the JVM arguments or it won't work

