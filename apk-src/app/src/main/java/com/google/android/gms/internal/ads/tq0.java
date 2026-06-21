package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10697c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f10695a = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gr0 f10698d = new gr0();

    public tq0(int i, int i10) {
        this.f10696b = i;
        this.f10697c = i10;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f10695a;
            if (linkedList.isEmpty()) {
                return;
            }
            yq0 yq0Var = (yq0) linkedList.getFirst();
            p9.k.C.f31304k.getClass();
            if (System.currentTimeMillis() - yq0Var.f12690d < this.f10697c) {
                return;
            }
            gr0 gr0Var = this.f10698d;
            gr0Var.f5897f++;
            gr0Var.f5893b.f5424c++;
            linkedList.remove();
        }
    }
}
