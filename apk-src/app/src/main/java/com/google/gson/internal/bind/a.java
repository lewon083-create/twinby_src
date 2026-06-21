package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f14942c = new x() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter$1
        @Override // me.x
        public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
            Type type = aVar.getType();
            boolean z5 = type instanceof GenericArrayType;
            if (!z5 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z5 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new a(kVar, kVar.d(com.google.gson.reflect.a.get(genericComponentType)), oe.d.h(genericComponentType));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f14943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f14944b;

    public a(me.k kVar, w wVar, Class cls) {
        this.f14944b = new e(kVar, wVar, cls);
        this.f14943a = cls;
    }

    @Override // me.w
    public final Object a(re.b bVar) {
        if (bVar.s() == 9) {
            bVar.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bVar.beginArray();
        while (bVar.hasNext()) {
            arrayList.add(this.f14944b.f14955c.a(bVar));
        }
        bVar.endArray();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f14943a, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.i();
            return;
        }
        cVar.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f14944b.b(cVar, Array.get(obj, i));
        }
        cVar.endArray();
    }
}
