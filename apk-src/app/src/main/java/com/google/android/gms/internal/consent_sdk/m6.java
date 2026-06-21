package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m6 f13489c = new m6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f13491b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6 f13490a = new d6(0);

    public final p6 a(Class cls) {
        p6 p6VarJ;
        Charset charset = x5.f13606a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f13491b;
        p6 p6Var = (p6) concurrentHashMap.get(cls);
        if (p6Var != null) {
            return p6Var;
        }
        d6 d6Var = this.f13490a;
        d6Var.getClass();
        v6 v6Var = q6.f13532a;
        if (!t5.class.isAssignableFrom(cls)) {
            int i = h5.f13404a;
        }
        o6 o6VarC = ((d6) d6Var.f13360c).c(cls);
        if ((o6VarC.f13510d & 2) == 2) {
            int i10 = h5.f13404a;
            v6 v6Var2 = q6.f13532a;
            m4 m4Var = o5.f13506a;
            p6VarJ = new k6(v6Var2, o6VarC.f13507a);
        } else {
            int i11 = h5.f13404a;
            int i12 = l6.f13464a;
            int i13 = b6.f13335a;
            v6 v6Var3 = q6.f13532a;
            m4 m4Var2 = o6VarC.a() + (-1) != 1 ? o5.f13506a : null;
            int i14 = g6.f13394a;
            p6VarJ = j6.j(o6VarC, v6Var3, m4Var2);
        }
        p6 p6Var2 = (p6) concurrentHashMap.putIfAbsent(cls, p6VarJ);
        return p6Var2 != null ? p6Var2 : p6VarJ;
    }
}
