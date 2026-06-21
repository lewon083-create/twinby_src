package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l71 {
    public static /* synthetic */ boolean a(Unsafe unsafe, p71 p71Var, long j10, o71 o71Var, o71 o71Var2) {
        while (!unsafe.compareAndSwapObject(p71Var, j10, o71Var, o71Var2)) {
            if (unsafe.getObject(p71Var, j10) != o71Var) {
                return false;
            }
        }
        return true;
    }
}
