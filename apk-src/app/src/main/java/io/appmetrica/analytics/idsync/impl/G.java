package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.collections.j0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModulePreferences f21950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f21951b = new F();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21952c = "request_state";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f21953d = j0.m(a());

    public G(ModulePreferences modulePreferences) {
        this.f21950a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<E> model = this.f21951b.toModel(this.f21950a.getString(this.f21952c, null));
        int iB = i0.b(kotlin.collections.t.j(model, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj : model) {
            linkedHashMap.put(((E) obj).f21943a, obj);
        }
        return linkedHashMap;
    }
}
