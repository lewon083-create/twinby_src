package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import me.q;
import me.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe.k f14967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14968b;

    public h(oe.k kVar, LinkedHashMap linkedHashMap) {
        this.f14967a = kVar;
        this.f14968b = linkedHashMap;
    }

    @Override // me.w
    public final Object a(re.b bVar) throws re.d {
        if (bVar.s() == 9) {
            bVar.nextNull();
            return null;
        }
        Object objL = this.f14967a.l();
        try {
            bVar.beginObject();
            while (bVar.hasNext()) {
                g gVar = (g) this.f14968b.get(bVar.nextName());
                if (gVar == null || !gVar.f14961c) {
                    bVar.skipValue();
                } else {
                    Object objA = gVar.f14964f.a(bVar);
                    if (objA != null || !gVar.i) {
                        gVar.f14962d.set(objL, objA);
                    }
                }
            }
            bVar.endObject();
            return objL;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (IllegalStateException e7) {
            throw new q(e7);
        }
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.i();
            return;
        }
        cVar.beginObject();
        try {
            for (g gVar : this.f14968b.values()) {
                boolean z5 = gVar.f14960b;
                Field field = gVar.f14962d;
                if (z5 && field.get(obj) != obj) {
                    cVar.d(gVar.f14959a);
                    w eVar = gVar.f14964f;
                    Object obj2 = field.get(obj);
                    if (!gVar.f14963e) {
                        eVar = new e(gVar.f14965g, eVar, gVar.f14966h.getType());
                    }
                    eVar.b(cVar, obj2);
                }
            }
            cVar.endObject();
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
