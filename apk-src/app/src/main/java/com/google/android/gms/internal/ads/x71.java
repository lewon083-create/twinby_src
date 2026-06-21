package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x71 extends g71 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final gr f12063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q81 f12064l = new q81(0, x71.class);
    public volatile Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f12065j;

    static {
        Throwable th2;
        gr w71Var;
        try {
            w71Var = new v71(14);
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            w71Var = new w71(14);
        }
        Throwable th4 = th2;
        f12063k = w71Var;
        if (th4 != null) {
            f12064l.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th4);
        }
    }
}
