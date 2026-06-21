package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends o0 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f14245c = new n0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n0 f14246d = new n0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14247b;

    public /* synthetic */ n0(int i) {
        this.f14247b = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f14247b) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                p0 p0Var = (p0) obj;
                p0 p0Var2 = (p0) obj2;
                return t.f14303a.b(p0Var.f14277b, p0Var2.f14277b).b(p0Var.f14278c, p0Var2.f14278c).a();
        }
    }

    public String toString() {
        switch (this.f14247b) {
            case 0:
                return "Ordering.natural()";
            default:
                return super.toString();
        }
    }
}
