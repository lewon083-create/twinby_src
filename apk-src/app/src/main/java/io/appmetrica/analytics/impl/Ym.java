package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ym implements so {
    @Override // io.appmetrica.analytics.impl.so
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C0264jh c0264jh) {
        return !TextUtils.isEmpty(o82.f22776b) ? StringUtils.getUTF8Bytes(o82.f22776b) : new byte[0];
    }
}
