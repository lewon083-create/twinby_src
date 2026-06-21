package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ho0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d8.e0 f6205b;

    public /* synthetic */ ho0(d8.e0 e0Var, int i) {
        this.f6204a = i;
        this.f6205b = e0Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f6204a) {
            case 0:
                String str = ((ku) this.f6205b.f15621d).f7300e;
                gr.G(str);
                return str;
            case 1:
                return Integer.valueOf(this.f6205b.f15620c);
            case 2:
                return Boolean.valueOf(((ku) this.f6205b.f15621d).f7307m);
            case 3:
                return Boolean.valueOf(((ku) this.f6205b.f15621d).f7306l);
            case 4:
                String str2 = ((ku) this.f6205b.f15621d).i;
                gr.G(str2);
                return str2;
            case 5:
                return Integer.valueOf(this.f6205b.v());
            default:
                return Integer.valueOf(((ku) this.f6205b.f15621d).f7310p);
        }
    }
}
