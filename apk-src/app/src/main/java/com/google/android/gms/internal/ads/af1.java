package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class af1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zd1 f2881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zd1 f2882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nd1 f2883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ld1 f2884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tc1 f2885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rc1 f2886f;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ei1 ei1Var = ei1.RAW;
        qe1 qe1Var = qe1.f9473e;
        map.put(ei1Var, qe1Var);
        map2.put(qe1Var, ei1Var);
        ei1 ei1Var2 = ei1.TINK;
        qe1 qe1Var2 = qe1.f9470b;
        map.put(ei1Var2, qe1Var2);
        map2.put(qe1Var2, ei1Var2);
        ei1 ei1Var3 = ei1.LEGACY;
        qe1 qe1Var3 = qe1.f9472d;
        map.put(ei1Var3, qe1Var3);
        map2.put(qe1Var3, ei1Var3);
        ei1 ei1Var4 = ei1.CRUNCHY;
        qe1 qe1Var4 = qe1.f9471c;
        map.put(ei1Var4, qe1Var4);
        map2.put(qe1Var4, ei1Var4);
        f2881a = new zd1(25, (Object) Collections.unmodifiableMap(map), (Object) Collections.unmodifiableMap(map2), false);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        bh1 bh1Var = bh1.SHA1;
        pe1 pe1Var = pe1.f9032b;
        map3.put(bh1Var, pe1Var);
        map4.put(pe1Var, bh1Var);
        bh1 bh1Var2 = bh1.SHA224;
        pe1 pe1Var2 = pe1.f9033c;
        map3.put(bh1Var2, pe1Var2);
        map4.put(pe1Var2, bh1Var2);
        bh1 bh1Var3 = bh1.SHA256;
        pe1 pe1Var3 = pe1.f9034d;
        map3.put(bh1Var3, pe1Var3);
        map4.put(pe1Var3, bh1Var3);
        bh1 bh1Var4 = bh1.SHA384;
        pe1 pe1Var4 = pe1.f9035e;
        map3.put(bh1Var4, pe1Var4);
        map4.put(pe1Var4, bh1Var4);
        bh1 bh1Var5 = bh1.SHA512;
        pe1 pe1Var5 = pe1.f9036f;
        map3.put(bh1Var5, pe1Var5);
        map4.put(pe1Var5, bh1Var5);
        f2882b = new zd1(25, (Object) Collections.unmodifiableMap(map3), (Object) Collections.unmodifiableMap(map4), false);
        f2883c = new nd1(re1.class, cc1.f4178u);
        f2884d = new ld1(sl1VarA, cc1.f4175r);
        f2885e = new tc1(ne1.class, cc1.f4176s);
        f2886f = new rc1(sl1VarA, cc1.f4177t);
    }
}
