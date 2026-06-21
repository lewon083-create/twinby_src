package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.ContextUtils;
import io.sentry.internal.debugmeta.IDebugMetaLoader;
import io.sentry.util.DebugMetaPropertiesApplier;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AssetsDebugMetaLoader implements IDebugMetaLoader {

    @NotNull
    private final Context context;

    @NotNull
    private final ILogger logger;

    public AssetsDebugMetaLoader(@NotNull Context context, @NotNull ILogger iLogger) {
        this.context = ContextUtils.getApplicationContext(context);
        this.logger = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.IDebugMetaLoader
    @Nullable
    public List<Properties> loadDebugMeta() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.context.getAssets().open(DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List<Properties> listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.logger.log(SentryLevel.INFO, "%s file was not found.", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            return null;
        } catch (IOException e3) {
            this.logger.log(SentryLevel.ERROR, "Error getting Proguard UUIDs.", e3);
            return null;
        } catch (RuntimeException e7) {
            this.logger.log(SentryLevel.ERROR, e7, "%s file is malformed.", DebugMetaPropertiesApplier.DEBUG_META_PROPERTIES_FILENAME);
            return null;
        }
    }
}
