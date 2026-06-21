package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ModulesLoader implements IModulesLoader {
    public static final String EXTERNAL_MODULES_FILENAME = "sentry-external-modules.txt";
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    @NotNull
    protected final ILogger logger;

    @NotNull
    private final AutoClosableReentrantLock modulesLock = new AutoClosableReentrantLock();

    @Nullable
    private volatile Map<String, String> cachedModules = null;

    public ModulesLoader(@NotNull ILogger iLogger) {
        this.logger = iLogger;
    }

    @Override // io.sentry.internal.modules.IModulesLoader
    @Nullable
    public Map<String, String> getOrLoadModules() {
        if (this.cachedModules == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.modulesLock.acquire();
            try {
                if (this.cachedModules == null) {
                    this.cachedModules = loadModules();
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th2) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return this.cachedModules;
    }

    public abstract Map<String, String> loadModules();

    public Map<String, String> parseStream(@NotNull InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, UTF_8));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.logger.log(SentryLevel.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e3) {
            this.logger.log(SentryLevel.ERROR, "Error extracting modules.", e3);
            return treeMap;
        } catch (RuntimeException e7) {
            this.logger.log(SentryLevel.ERROR, e7, "%s file is malformed.", EXTERNAL_MODULES_FILENAME);
            return treeMap;
        }
    }
}
