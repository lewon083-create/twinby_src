package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f1559c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1560a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1561b = new HashMap();

    public static void b(HashMap map, d dVar, n nVar, Class cls) {
        n nVar2 = (n) map.get(dVar);
        if (nVar2 == null || nVar == nVar2) {
            if (nVar2 == null) {
                map.put(dVar, nVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + dVar.f1546b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + nVar2 + ", new value " + nVar);
    }

    public final c a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1560a;
        if (superclass != null) {
            c cVarA = (c) map2.get(superclass);
            if (cVarA == null) {
                cVarA = a(superclass, null);
            }
            map.putAll(cVarA.f1541b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            c cVarA2 = (c) map2.get(cls2);
            if (cVarA2 == null) {
                cVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : cVarA2.f1541b.entrySet()) {
                b(map, (d) entry.getKey(), (n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            f0 f0Var = (f0) method.getAnnotation(f0.class);
            if (f0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                n nVarValue = f0Var.value();
                if (parameterTypes.length > 1) {
                    if (!n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (nVarValue != n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new d(i, method), nVarValue, cls);
                z5 = true;
            }
        }
        c cVar = new c(map);
        map2.put(cls, cVar);
        this.f1561b.put(cls, Boolean.valueOf(z5));
        return cVar;
    }
}
