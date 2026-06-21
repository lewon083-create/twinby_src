package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j6 f13841c = new j6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f13843b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5 f13842a = new z5(0);

    public final m6 a(Class cls) {
        m6 m6VarU;
        Charset charset = r5.f13944a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f13843b;
        m6 m6Var = (m6) concurrentHashMap.get(cls);
        if (m6Var != null) {
            return m6Var;
        }
        z5 z5Var = this.f13842a;
        z5Var.getClass();
        i5 i5Var = n6.f13895a;
        k5.class.isAssignableFrom(cls);
        l6 l6VarD = ((z5) z5Var.f14118a).d(cls);
        if ((l6VarD.f13870d & 2) == 2) {
            i5 i5Var2 = n6.f13895a;
            i5 i5Var3 = d5.f13706a;
            m6VarU = new g6(i5Var2, l6VarD.f13867a);
        } else {
            int i = h6.f13773a;
            int i10 = w5.f14075a;
            i5 i5Var4 = n6.f13895a;
            i5 i5Var5 = l6VarD.a() + (-1) != 1 ? d5.f13706a : null;
            int i11 = c6.f13686a;
            m6VarU = f6.u(l6VarD, i5Var4, i5Var5);
        }
        m6 m6Var2 = (m6) concurrentHashMap.putIfAbsent(cls, m6VarU);
        return m6Var2 != null ? m6Var2 : m6VarU;
    }
}
