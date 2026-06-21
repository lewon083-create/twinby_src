package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Zd implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23384a;

    public Zd(@NonNull String str) {
        this.f23384a = str;
    }

    @Override // io.appmetrica.analytics.impl.ro
    public final po a(String str) {
        return TextUtils.isEmpty(str) ? new po(this, false, a0.u.o(new StringBuilder(), this.f23384a, " is empty.")) : new po(this, true, "");
    }
}
