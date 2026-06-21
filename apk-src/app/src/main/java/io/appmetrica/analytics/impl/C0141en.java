package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0141en implements InterfaceC0495t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0545v f23811b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0520u f23810a = new C0520u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij.g f23812c = ij.h.b(new C0116dn(this));

    public C0141en(@NotNull Context context) {
        this.f23811b = new C0545v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0495t
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.putAll((Map) this.f23812c.getValue());
        return map;
    }
}
