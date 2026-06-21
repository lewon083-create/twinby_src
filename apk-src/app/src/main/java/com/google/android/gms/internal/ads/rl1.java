package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rl1 implements q91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zd1 f9961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f9962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f9963c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ll1 ll1Var = ll1.f7570b;
        ek1 ek1Var = ek1.f4988b;
        map.put(ll1Var, ek1Var);
        map2.put(ek1Var, ll1Var);
        ll1 ll1Var2 = ll1.f7571c;
        ek1 ek1Var2 = ek1.f4989c;
        map.put(ll1Var2, ek1Var2);
        map2.put(ek1Var2, ll1Var2);
        ll1 ll1Var3 = ll1.f7572d;
        ek1 ek1Var3 = ek1.f4990d;
        map.put(ll1Var3, ek1Var3);
        map2.put(ek1Var3, ll1Var3);
        f9961a = new zd1(25, (Object) Collections.unmodifiableMap(map), (Object) Collections.unmodifiableMap(map2), false);
        f9962b = new byte[0];
        f9963c = new byte[]{0};
    }
}
