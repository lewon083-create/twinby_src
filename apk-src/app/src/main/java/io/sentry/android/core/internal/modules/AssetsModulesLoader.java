package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.appmetrica.analytics.impl.lp;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.ContextUtils;
import io.sentry.internal.modules.ModulesLoader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AssetsModulesLoader extends ModulesLoader {

    @NotNull
    private final Context context;

    public AssetsModulesLoader(@NotNull Context context, @NotNull SentryOptions sentryOptions) {
        super(sentryOptions.getLogger());
        this.context = ContextUtils.getApplicationContext(context);
        try {
            sentryOptions.getExecutorService().submit(new lp(3, this));
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "AssetsModulesLoader submit failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        getOrLoadModules();
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public Map<String, String> loadModules() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(ModulesLoader.EXTERNAL_MODULES_FILENAME);
            try {
                Map<String, String> stream = parseStream(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return stream;
                }
                inputStreamOpen.close();
                return stream;
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            this.logger.log(SentryLevel.INFO, "%s file was not found.", ModulesLoader.EXTERNAL_MODULES_FILENAME);
            return treeMap;
        } catch (IOException e3) {
            this.logger.log(SentryLevel.ERROR, "Error extracting modules.", e3);
            return treeMap;
        }
    }
}
