package io.sentry.internal.debugmeta;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import io.sentry.util.DebugMetaPropertiesApplier;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ResourcesDebugMetaLoader implements IDebugMetaLoader {

    @NotNull
    private final ClassLoader classLoader;

    @NotNull
    private final ILogger logger;

    public ResourcesDebugMetaLoader(@NotNull ILogger iLogger) {
        this(iLogger, ResourcesDebugMetaLoader.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    @Nullable
    public List<Properties> loadDebugMeta() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.classLoader.getResources(DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.logger.log(SentryLevel.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (RuntimeException e3) {
                    this.logger.log(SentryLevel.ERROR, e3, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e7) {
            this.logger.log(SentryLevel.ERROR, e7, "Failed to load %s", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.logger.log(SentryLevel.INFO, "No %s file was found.", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
        return null;
    }

    public ResourcesDebugMetaLoader(@NotNull ILogger iLogger, @Nullable ClassLoader classLoader) {
        this.logger = iLogger;
        this.classLoader = ClassLoaderUtils.classLoaderOrDefault(classLoader);
    }
}
