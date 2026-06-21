package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0257ja implements O9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8 f24148a = new K8();

    @NotNull
    public final C0102d9[] a(@Nullable byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C0102d9[0];
        }
        Map<String, byte[]> model = this.f24148a.toModel(bArr);
        C0102d9[] c0102d9Arr = new C0102d9[model.size()];
        for (Object obj : model.entrySet()) {
            int i10 = i + 1;
            if (i < 0) {
                kotlin.collections.s.i();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0102d9 c0102d9 = new C0102d9();
            c0102d9.f23679a = ((String) entry.getKey()).getBytes(Charsets.UTF_8);
            c0102d9.f23680b = (byte[]) entry.getValue();
            c0102d9Arr[i] = c0102d9;
            i = i10;
        }
        return c0102d9Arr;
    }
}
