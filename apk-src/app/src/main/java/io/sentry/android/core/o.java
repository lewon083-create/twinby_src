package io.sentry.android.core;

import android.graphics.SurfaceTexture;
import android.media.AudioFocusRequest;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ SurfaceTexture e() {
        return new SurfaceTexture(false);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest k(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ Locale.LanguageRange p(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void r() {
    }
}
