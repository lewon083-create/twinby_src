package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class am0 implements on0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f3323b;

    public /* synthetic */ am0(int i, Integer num) {
        this.f3322a = i;
        this.f3323b = num;
    }

    @Override // com.google.android.gms.internal.ads.on0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f3322a) {
            case 0:
                w50 w50Var = (w50) obj;
                Integer num = this.f3323b;
                if (num != null) {
                    w50Var.f11646a.putInt("aos", num.intValue());
                }
                break;
            default:
                w50 w50Var2 = (w50) obj;
                Integer num2 = this.f3323b;
                if (num2 != null) {
                    w50Var2.f11646a.putInt("dspct", Math.min(num2.intValue(), 20));
                }
                break;
        }
    }
}
