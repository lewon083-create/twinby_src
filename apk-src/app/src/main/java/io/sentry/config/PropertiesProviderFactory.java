package io.sentry.config;

import io.sentry.SystemOutLogger;
import java.util.ArrayList;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class PropertiesProviderFactory {
    @NotNull
    public static PropertiesProvider create() {
        Properties propertiesLoad;
        Properties propertiesLoad2;
        SystemOutLogger systemOutLogger = new SystemOutLogger();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SystemPropertyPropertiesProvider());
        arrayList.add(new EnvironmentVariablePropertiesProvider());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesLoad2 = new FilesystemPropertiesLoader(property, systemOutLogger).load()) != null) {
            arrayList.add(new SimplePropertiesProvider(propertiesLoad2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesLoad = new FilesystemPropertiesLoader(str, systemOutLogger).load()) != null) {
            arrayList.add(new SimplePropertiesProvider(propertiesLoad));
        }
        Properties propertiesLoad3 = new ClasspathPropertiesLoader(systemOutLogger).load();
        if (propertiesLoad3 != null) {
            arrayList.add(new SimplePropertiesProvider(propertiesLoad3));
        }
        Properties propertiesLoad4 = new FilesystemPropertiesLoader("sentry.properties", systemOutLogger, false).load();
        if (propertiesLoad4 != null) {
            arrayList.add(new SimplePropertiesProvider(propertiesLoad4));
        }
        return new CompositePropertiesProvider(arrayList);
    }
}
