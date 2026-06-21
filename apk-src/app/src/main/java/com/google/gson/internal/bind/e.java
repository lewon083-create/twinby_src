package com.google.gson.internal.bind;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import me.q;
import me.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14953a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f14955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14956d;

    public e(MapTypeAdapterFactory mapTypeAdapterFactory, me.k kVar, Type type, w wVar, Type type2, w wVar2, oe.k kVar2) {
        this.f14954b = new e(kVar, wVar, type);
        this.f14955c = new e(kVar, wVar2, type2);
        this.f14956d = kVar2;
    }

    @Override // me.w
    public final Object a(re.b bVar) {
        switch (this.f14953a) {
            case 0:
                w wVar = ((e) this.f14955c).f14955c;
                w wVar2 = ((e) this.f14954b).f14955c;
                int iS = bVar.s();
                if (iS == 9) {
                    bVar.nextNull();
                    return null;
                }
                Map map = (Map) ((oe.k) this.f14956d).l();
                if (iS == 1) {
                    bVar.beginArray();
                    while (bVar.hasNext()) {
                        bVar.beginArray();
                        Object objA = wVar2.a(bVar);
                        if (map.put(objA, wVar.a(bVar)) != null) {
                            throw new q("duplicate key: " + objA);
                        }
                        bVar.endArray();
                    }
                    bVar.endArray();
                } else {
                    bVar.beginObject();
                    while (bVar.hasNext()) {
                        re.a.f32296a.getClass();
                        re.a.a(bVar);
                        Object objA2 = wVar2.a(bVar);
                        if (map.put(objA2, wVar.a(bVar)) != null) {
                            throw new q("duplicate key: " + objA2);
                        }
                    }
                    bVar.endObject();
                }
                return map;
            default:
                return this.f14955c.a(bVar);
        }
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) {
        switch (this.f14953a) {
            case 0:
                Map map = (Map) obj;
                e eVar = (e) this.f14955c;
                if (map == null) {
                    cVar.i();
                } else {
                    cVar.beginObject();
                    for (Map.Entry entry : map.entrySet()) {
                        cVar.d(String.valueOf(entry.getKey()));
                        eVar.b(cVar, entry.getValue());
                    }
                    cVar.endObject();
                }
                break;
            default:
                Type type = (Type) this.f14956d;
                Type type2 = (obj == null || !(type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) ? type : obj.getClass();
                w wVar = this.f14955c;
                if (type2 != type) {
                    w wVarD = ((me.k) this.f14954b).d(com.google.gson.reflect.a.get(type2));
                    if (!(wVarD instanceof h) || (wVar instanceof h)) {
                        wVar = wVarD;
                    }
                }
                wVar.b(cVar, obj);
                break;
        }
    }

    public e(me.k kVar, w wVar, Type type) {
        this.f14954b = kVar;
        this.f14955c = wVar;
        this.f14956d = type;
    }
}
