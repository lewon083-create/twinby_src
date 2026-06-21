package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rd1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sl1 f9822b = sl1.a(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9823a;

    public final Iterable a(byte[] bArr) {
        List list;
        sl1 sl1Var = f9822b;
        HashMap map = this.f9823a;
        List list2 = (List) map.get(sl1Var);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new sl1(5 > length ? length : 5, bArr));
        } else {
            list = null;
        }
        return (list2 == null && list == null) ? new ArrayList() : list2 == null ? list : list == null ? list2 : new pd1(this, list, list2);
    }
}
