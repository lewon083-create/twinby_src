package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qu0 extends kv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9593f;

    public qu0(int i, long j10) {
        super(i, 0);
        this.f9591d = j10;
        this.f9592e = new ArrayList();
        this.f9593f = new ArrayList();
    }

    public final av0 r(int i) {
        ArrayList arrayList = this.f9592e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            av0 av0Var = (av0) arrayList.get(i10);
            if (av0Var.f7316c == i) {
                return av0Var;
            }
        }
        return null;
    }

    public final qu0 s(int i) {
        ArrayList arrayList = this.f9593f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            qu0 qu0Var = (qu0) arrayList.get(i10);
            if (qu0Var.f7316c == i) {
                return qu0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final String toString() {
        String strP = kv0.p(this.f7316c);
        String string = Arrays.toString(this.f9592e.toArray());
        String string2 = Arrays.toString(this.f9593f.toArray());
        int length = strP.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        l7.o.t(sb2, strP, " leaves: ", string, " containers: ");
        sb2.append(string2);
        return sb2.toString();
    }
}
