package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import me.q;
import me.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14985c;

    public n(TypeAdapters$35 typeAdapters$35, Class cls) {
        this.f14983a = 0;
        this.f14985c = typeAdapters$35;
        this.f14984b = cls;
    }

    @Override // me.w
    public final Object a(re.b bVar) {
        switch (this.f14983a) {
            case 0:
                Class cls = (Class) this.f14984b;
                Object objA = ((TypeAdapters$35) this.f14985c).f14941c.a(bVar);
                if (objA == null || cls.isInstance(objA)) {
                    return objA;
                }
                throw new q("Expected a " + cls.getName() + " but was " + objA.getClass().getName());
            case 1:
                if (bVar.s() == 9) {
                    bVar.nextNull();
                    return null;
                }
                Collection collection = (Collection) ((oe.k) this.f14985c).l();
                bVar.beginArray();
                while (bVar.hasNext()) {
                    collection.add(((e) this.f14984b).f14955c.a(bVar));
                }
                bVar.endArray();
                return collection;
            default:
                if (bVar.s() != 9) {
                    return (Enum) ((HashMap) this.f14984b).get(bVar.nextString());
                }
                bVar.nextNull();
                return null;
        }
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) throws IOException {
        switch (this.f14983a) {
            case 0:
                ((TypeAdapters$35) this.f14985c).f14941c.b(cVar, obj);
                break;
            case 1:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    cVar.beginArray();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((e) this.f14984b).b(cVar, it.next());
                    }
                    cVar.endArray();
                } else {
                    cVar.i();
                }
                break;
            default:
                Enum r42 = (Enum) obj;
                cVar.s(r42 == null ? null : (String) ((HashMap) this.f14985c).get(r42));
                break;
        }
    }

    public n(Class cls) {
        this.f14983a = 2;
        this.f14984b = new HashMap();
        this.f14985c = new HashMap();
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant()) {
                    AccessController.doPrivileged(new o(field));
                    Enum r42 = (Enum) field.get(null);
                    String strName = r42.name();
                    ne.b bVar = (ne.b) field.getAnnotation(ne.b.class);
                    if (bVar != null) {
                        strName = bVar.value();
                        for (String str : bVar.alternate()) {
                            ((HashMap) this.f14984b).put(str, r42);
                        }
                    }
                    ((HashMap) this.f14984b).put(strName, r42);
                    ((HashMap) this.f14985c).put(r42, strName);
                }
            }
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }

    public n(me.k kVar, Type type, w wVar, oe.k kVar2) {
        this.f14983a = 1;
        this.f14984b = new e(kVar, wVar, type);
        this.f14985c = kVar2;
    }
}
