package io.sentry;

import io.sentry.util.LoadClass;
import io.sentry.util.Platform;
import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SpanFactoryFactory {
    private static final String OTEL_SPAN_FACTORY = "io.sentry.opentelemetry.OtelSpanFactory";

    @NotNull
    public static ISpanFactory create(@NotNull LoadClass loadClass, @NotNull ILogger iLogger) {
        Class<?> clsLoadClass;
        if (Platform.isJvm() && loadClass.isClassAvailable(OTEL_SPAN_FACTORY, iLogger) && (clsLoadClass = loadClass.loadClass(OTEL_SPAN_FACTORY, iLogger)) != null) {
            try {
                Object objNewInstance = clsLoadClass.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance != null && (objNewInstance instanceof ISpanFactory)) {
                    return (ISpanFactory) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return new DefaultSpanFactory();
    }
}
