package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cm1 extends fm1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4266g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm1(hm1 hm1Var, int i) {
        super(hm1Var);
        this.f4266g = i;
    }

    @Override // com.google.android.gms.internal.ads.fm1, java.util.Iterator
    public Object next() {
        switch (this.f4266g) {
            case 1:
                return b().f5866c;
            default:
                return super.next();
        }
    }
}
