package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Wm extends N2 {
    public Wm(int i, @NonNull String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    public final int b() {
        return this.f22708a;
    }

    public Wm(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Kn
    public final String a(String str) {
        if (str != null) {
            int length = str.length();
            int i = this.f22708a;
            if (length > i) {
                String strSubstring = str.substring(0, i);
                this.f22710c.warning("\"%s\" %s size exceeded limit of %d characters", this.f22709b, str, Integer.valueOf(this.f22708a));
                return strSubstring;
            }
        }
        return str;
    }

    @NonNull
    public final String a() {
        return this.f22709b;
    }
}
