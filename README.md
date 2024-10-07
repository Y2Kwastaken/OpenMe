# OpenMe

## [This library is no longer needed as of 1.21.1](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/inventory/MenuType.html)

I worked very hard to get these changes into spigot itself hope you enjoy!

## Archive

Using OpenMe is as easy as 1-2-3.

You can setup OpenMe in your onEnable with the following code:
```java
public class MyPlugin extends JavaPlugin {
    
    @Override
    public void onEnable() {
        OpenMe.setup();
    }
    
    @Override
    public void onDisable() {
        OpenMe.destroy();
    }
}
```

## Usage

This example opens an anvil with your custom title
```java
final InventoryView anvilView = OpenMe.string().createAnvil(player, "My Custom Anvil Name");
player.openInventory(anvilView);
```

This example opens an anvil inventory with a default title
```java
final InventoryView anvilView = OpenMe.string().createAnvil(player, null);
player.openInventory(anvilView);
```

## Maven

```xml
<repository>
  <id>miles-repos-libraries</id>
  <name>Miles Repositories</name>
  <url>https://maven.miles.sh/libraries</url>
</repository>

<dependency>
  <groupId>sh.miles</groupId>
  <artifactId>OpenMe</artifactId>
  <version>1.1.3-SNAPSHOT</version>
</dependency>
```

## Gradle Kts/Groovy

```kotlin
maven {
    name = "milesReposLibraries"
    url = uri("https://maven.miles.sh/libraries")
}

implementation("sh.miles:OpenMe:1.1.3-SNAPSHOT")
```
