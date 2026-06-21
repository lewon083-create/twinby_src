package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ManifestModulesLoader extends ModulesLoader {
    private final Pattern NAME_AND_VERSION;
    private final Pattern URL_LIB_PATTERN;
    private final ClassLoader classLoader;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Module {

        @NotNull
        private final String name;

        @NotNull
        private final String version;

        public Module(@NotNull String str, @NotNull String str2) {
            this.name = str;
            this.version = str2;
        }
    }

    public ManifestModulesLoader(@NotNull ILogger iLogger) {
        this(ManifestModulesLoader.class.getClassLoader(), iLogger);
    }

    @Nullable
    private Module convertOriginalNameToModule(@Nullable String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.NAME_AND_VERSION.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new Module(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    @NotNull
    private List<Module> detectModulesViaManifestFiles() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.classLoader.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Module moduleConvertOriginalNameToModule = convertOriginalNameToModule(extractDependencyNameFromUrl(resources.nextElement()));
                if (moduleConvertOriginalNameToModule != null) {
                    arrayList.add(moduleConvertOriginalNameToModule);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            this.logger.log(SentryLevel.ERROR, "Unable to detect modules via manifest files.", th2);
            return arrayList;
        }
    }

    @Nullable
    private String extractDependencyNameFromUrl(@NotNull URL url) {
        Matcher matcher = this.URL_LIB_PATTERN.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public Map<String, String> loadModules() {
        HashMap map = new HashMap();
        for (Module module : detectModulesViaManifestFiles()) {
            map.put(module.name, module.version);
        }
        return map;
    }

    public ManifestModulesLoader(@Nullable ClassLoader classLoader, @NotNull ILogger iLogger) {
        super(iLogger);
        this.URL_LIB_PATTERN = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.NAME_AND_VERSION = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.classLoader = ClassLoaderUtils.classLoaderOrDefault(classLoader);
    }
}
