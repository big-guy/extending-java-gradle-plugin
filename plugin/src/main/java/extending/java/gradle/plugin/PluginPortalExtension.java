package extending.java.gradle.plugin;

import org.gradle.api.provider.Property;

import java.net.URI;

public interface PluginPortalExtension {
    Property<URI> getVcsUrl();
    Property<URI> getWebsiteUrl();
}
