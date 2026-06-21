package me;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.gson.reflect.a f28878g = com.google.gson.reflect.a.get(Object.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f28879a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f28880b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l6.i f28881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f28882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f28883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28884f;

    public k(Excluder excluder, h hVar, Map map, boolean z5, int i, ArrayList arrayList) {
        l6.i iVar = new l6.i(map);
        this.f28881c = iVar;
        this.f28884f = z5;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(com.google.gson.internal.bind.p.B);
        arrayList2.add(com.google.gson.internal.bind.f.f14957b);
        arrayList2.add(excluder);
        arrayList2.addAll(arrayList);
        arrayList2.add(com.google.gson.internal.bind.p.f15001p);
        arrayList2.add(com.google.gson.internal.bind.p.f14993g);
        arrayList2.add(com.google.gson.internal.bind.p.f14990d);
        arrayList2.add(com.google.gson.internal.bind.p.f14991e);
        arrayList2.add(com.google.gson.internal.bind.p.f14992f);
        w iVar2 = i == 1 ? com.google.gson.internal.bind.p.f14996k : new i(0);
        arrayList2.add(com.google.gson.internal.bind.p.b(Long.TYPE, Long.class, iVar2));
        arrayList2.add(com.google.gson.internal.bind.p.b(Double.TYPE, Double.class, new com.google.gson.internal.bind.l(28)));
        arrayList2.add(com.google.gson.internal.bind.p.b(Float.TYPE, Float.class, new i(1)));
        arrayList2.add(com.google.gson.internal.bind.p.f14997l);
        arrayList2.add(com.google.gson.internal.bind.p.f14994h);
        arrayList2.add(com.google.gson.internal.bind.p.i);
        arrayList2.add(com.google.gson.internal.bind.p.c(AtomicLong.class, new com.google.gson.internal.bind.m(new com.google.gson.internal.bind.m(iVar2, 1), 3)));
        arrayList2.add(com.google.gson.internal.bind.p.c(AtomicLongArray.class, new com.google.gson.internal.bind.m(new com.google.gson.internal.bind.m(iVar2, 2), 3)));
        arrayList2.add(com.google.gson.internal.bind.p.f14995j);
        arrayList2.add(com.google.gson.internal.bind.p.f14998m);
        arrayList2.add(com.google.gson.internal.bind.p.f15002q);
        arrayList2.add(com.google.gson.internal.bind.p.f15003r);
        arrayList2.add(com.google.gson.internal.bind.p.c(BigDecimal.class, com.google.gson.internal.bind.p.f14999n));
        arrayList2.add(com.google.gson.internal.bind.p.c(BigInteger.class, com.google.gson.internal.bind.p.f15000o));
        arrayList2.add(com.google.gson.internal.bind.p.f15004s);
        arrayList2.add(com.google.gson.internal.bind.p.f15005t);
        arrayList2.add(com.google.gson.internal.bind.p.f15007v);
        arrayList2.add(com.google.gson.internal.bind.p.f15008w);
        arrayList2.add(com.google.gson.internal.bind.p.f15011z);
        arrayList2.add(com.google.gson.internal.bind.p.f15006u);
        arrayList2.add(com.google.gson.internal.bind.p.f14988b);
        arrayList2.add(com.google.gson.internal.bind.b.f14945b);
        arrayList2.add(com.google.gson.internal.bind.p.f15010y);
        arrayList2.add(com.google.gson.internal.bind.j.f14971b);
        arrayList2.add(com.google.gson.internal.bind.i.f14969b);
        arrayList2.add(com.google.gson.internal.bind.p.f15009x);
        arrayList2.add(com.google.gson.internal.bind.a.f14942c);
        arrayList2.add(com.google.gson.internal.bind.p.f14987a);
        arrayList2.add(new CollectionTypeAdapterFactory(iVar));
        arrayList2.add(new MapTypeAdapterFactory(iVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(iVar);
        this.f28882d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList2.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList2.add(com.google.gson.internal.bind.p.C);
        arrayList2.add(new ReflectiveTypeAdapterFactory(iVar, hVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f28883e = Collections.unmodifiableList(arrayList2);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(p pVar, Class cls) {
        Object objC = c(pVar, cls);
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(objC);
    }

    public final Object c(p pVar, Type type) {
        if (pVar == null) {
            return null;
        }
        com.google.gson.internal.bind.d dVar = new com.google.gson.internal.bind.d(com.google.gson.internal.bind.d.f14947u);
        dVar.f14949q = new Object[32];
        boolean z5 = false;
        dVar.f14950r = 0;
        dVar.f14951s = new String[32];
        dVar.f14952t = new int[32];
        dVar.R(pVar);
        boolean z10 = dVar.f32298c;
        dVar.f32298c = true;
        try {
            try {
                try {
                    try {
                        dVar.s();
                    } catch (AssertionError e3) {
                        AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e3.getMessage());
                        assertionError.initCause(e3);
                        throw assertionError;
                    } catch (IllegalStateException e7) {
                        throw new q(e7);
                    }
                } catch (IOException e10) {
                    throw new q(e10);
                }
            } catch (EOFException e11) {
                e = e11;
                z5 = true;
            }
            try {
                return d(com.google.gson.reflect.a.get(type)).a(dVar);
            } catch (EOFException e12) {
                e = e12;
                if (z5) {
                    return null;
                }
                throw new q(e);
            }
        } finally {
            dVar.f32298c = z10;
        }
    }

    public final w d(com.google.gson.reflect.a aVar) {
        boolean z5;
        com.google.gson.reflect.a aVar2 = aVar == null ? f28878g : aVar;
        ConcurrentHashMap concurrentHashMap = this.f28880b;
        w wVar = (w) concurrentHashMap.get(aVar2);
        if (wVar != null) {
            return wVar;
        }
        ThreadLocal threadLocal = this.f28879a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z5 = true;
        } else {
            z5 = false;
        }
        j jVar = (j) map.get(aVar);
        if (jVar != null) {
            return jVar;
        }
        try {
            j jVar2 = new j();
            map.put(aVar, jVar2);
            Iterator it = this.f28883e.iterator();
            while (it.hasNext()) {
                w wVarA = ((x) it.next()).a(this, aVar);
                if (wVarA != null) {
                    if (jVar2.f28877a != null) {
                        throw new AssertionError();
                    }
                    jVar2.f28877a = wVarA;
                    concurrentHashMap.put(aVar, wVarA);
                    return wVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.8) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z5) {
                threadLocal.remove();
            }
        }
    }

    public final w e(x xVar, com.google.gson.reflect.a aVar) {
        List<x> list = this.f28883e;
        if (!list.contains(xVar)) {
            xVar = this.f28882d;
        }
        boolean z5 = false;
        for (x xVar2 : list) {
            if (z5) {
                w wVarA = xVar2.a(this, aVar);
                if (wVarA != null) {
                    return wVarA;
                }
            } else if (xVar2 == xVar) {
                z5 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final re.c f(Writer writer) {
        re.c cVar = new re.c(writer);
        cVar.i = false;
        return cVar;
    }

    public final String g(List list) {
        if (list == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                i(f(stringWriter));
                return stringWriter.toString();
            } catch (IOException e3) {
                throw new q(e3);
            }
        }
        Class cls = list.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            h(list, cls, f(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e7) {
            throw new q(e7);
        }
    }

    public final void h(Object obj, Class cls, re.c cVar) {
        w wVarD = d(com.google.gson.reflect.a.get((Type) cls));
        boolean z5 = cVar.f32317f;
        cVar.f32317f = true;
        boolean z10 = cVar.f32318g;
        cVar.f32318g = this.f28884f;
        boolean z11 = cVar.i;
        cVar.i = false;
        try {
            try {
                try {
                    wVarD.b(cVar, obj);
                } catch (AssertionError e3) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e3.getMessage());
                    assertionError.initCause(e3);
                    throw assertionError;
                }
            } catch (IOException e7) {
                throw new q(e7);
            }
        } finally {
            cVar.f32317f = z5;
            cVar.f32318g = z10;
            cVar.i = z11;
        }
    }

    public final void i(re.c cVar) {
        r rVar = r.f28894b;
        boolean z5 = cVar.f32317f;
        cVar.f32317f = true;
        boolean z10 = cVar.f32318g;
        cVar.f32318g = this.f28884f;
        boolean z11 = cVar.i;
        cVar.i = false;
        try {
            try {
                com.google.gson.internal.bind.p.A.getClass();
                com.google.gson.internal.bind.l.d(cVar, rVar);
                cVar.f32317f = z5;
                cVar.f32318g = z10;
                cVar.i = z11;
            } catch (IOException e3) {
                throw new q(e3);
            } catch (AssertionError e7) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e7.getMessage());
                assertionError.initCause(e7);
                throw assertionError;
            }
        } catch (Throwable th2) {
            cVar.f32317f = z5;
            cVar.f32318g = z10;
            cVar.i = z11;
            throw th2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f28883e + ",instanceCreators:" + this.f28881c + "}";
    }
}
