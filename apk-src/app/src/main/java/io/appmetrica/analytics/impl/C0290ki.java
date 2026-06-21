package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0290ki implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f24249a;

    public C0290ki(@NonNull Map<String, ?> map) {
        this.f24249a = map;
    }

    @Override // io.appmetrica.analytics.impl.ro
    public final po a(String str) {
        return this.f24249a.containsKey(str) ? new po(this, false, pe.a.f("Failed to activate AppMetrica with provided apiKey ApiKey ", str, " has already been used by another reporter.")) : new po(this, true, "");
    }
}
