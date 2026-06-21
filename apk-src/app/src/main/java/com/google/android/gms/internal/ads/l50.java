package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i41 f7396a = new i41();

    static {
        v41 v41Var = x41.f12018c;
        new l50(r51.f9713f);
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public l50(r51 r51Var) {
        v41 v41Var = x41.f12018c;
        Object[] array = (r51Var == null ? ix.j(r51Var.listIterator(0)) : r51Var).toArray();
        int length = array.length;
        vv.j(length, array);
        Arrays.sort(array, f7396a);
        x41.x(length, array);
    }
}
