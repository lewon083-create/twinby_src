package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.ArrayList;
import me.w;
import me.x;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f14957b = new x() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter$1
        @Override // me.x
        public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == Object.class) {
                return new f(kVar);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me.k f14958a;

    public f(me.k kVar) {
        this.f14958a = kVar;
    }

    @Override // me.w
    public final Object a(re.b bVar) {
        int iM = z.m(bVar.s());
        if (iM == 0) {
            ArrayList arrayList = new ArrayList();
            bVar.beginArray();
            while (bVar.hasNext()) {
                arrayList.add(a(bVar));
            }
            bVar.endArray();
            return arrayList;
        }
        if (iM == 2) {
            oe.j jVar = new oe.j();
            bVar.beginObject();
            while (bVar.hasNext()) {
                jVar.put(bVar.nextName(), a(bVar));
            }
            bVar.endObject();
            return jVar;
        }
        if (iM == 5) {
            return bVar.nextString();
        }
        if (iM == 6) {
            return Double.valueOf(bVar.nextDouble());
        }
        if (iM == 7) {
            return Boolean.valueOf(bVar.nextBoolean());
        }
        if (iM != 8) {
            throw new IllegalStateException();
        }
        bVar.nextNull();
        return null;
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.i();
            return;
        }
        w wVarD = this.f14958a.d(com.google.gson.reflect.a.get((Class) obj.getClass()));
        if (!(wVarD instanceof f)) {
            wVarD.b(cVar, obj);
        } else {
            cVar.beginObject();
            cVar.endObject();
        }
    }
}
