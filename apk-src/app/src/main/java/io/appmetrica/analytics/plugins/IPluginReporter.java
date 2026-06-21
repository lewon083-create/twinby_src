package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface IPluginReporter {
    void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str);

    void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails);

    void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails);
}
