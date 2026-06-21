package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0196h0 implements ro {
    @Override // io.appmetrica.analytics.impl.ro
    public final po a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new po(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new po(this, true, "");
        } catch (Throwable unused) {
            return new po(this, false, pe.a.f("Invalid ApiKey=", str, ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html"));
        }
    }
}
