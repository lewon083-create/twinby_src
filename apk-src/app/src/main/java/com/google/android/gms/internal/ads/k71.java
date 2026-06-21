package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k71 {
    public static /* synthetic */ boolean a(Unsafe unsafe, h71 h71Var, long j10, e71 e71Var, e71 e71Var2) {
        while (!unsafe.compareAndSwapObject(h71Var, j10, e71Var, e71Var2)) {
            if (unsafe.getObject(h71Var, j10) != e71Var) {
                return false;
            }
        }
        return true;
    }
}
