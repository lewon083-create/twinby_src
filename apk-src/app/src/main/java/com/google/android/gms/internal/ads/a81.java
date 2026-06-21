package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a81 extends u71 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f2806q;

    public a81(x41 x41Var, boolean z5) {
        List arrayList;
        super(x41Var, z5, true);
        if (x41Var.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = x41Var.size();
            fs1.y(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < x41Var.size(); i++) {
            arrayList.add(null);
        }
        this.f2806q = arrayList;
        w();
    }

    @Override // com.google.android.gms.internal.ads.u71
    public final void s(int i) {
        this.f10865m = null;
        this.f2806q = null;
    }

    @Override // com.google.android.gms.internal.ads.u71
    public final void x(int i, Object obj) {
        List list = this.f2806q;
        if (list != null) {
            list.set(i, new b81(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.u71
    public final void y() {
        List<b81> list = this.f2806q;
        if (list != null) {
            int size = list.size();
            fs1.y(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (b81 b81Var : list) {
                arrayList.add(b81Var != null ? b81Var.f3671a : null);
            }
            e(Collections.unmodifiableList(arrayList));
        }
    }
}
