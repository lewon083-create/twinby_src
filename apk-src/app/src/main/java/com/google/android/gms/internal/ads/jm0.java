package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jm0 implements pn0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f6883c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r81 f6885b;

    public jm0(Context context, r81 r81Var) {
        this.f6884a = 3;
        this.f6885b = r81Var;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        switch (this.f6884a) {
            case 0:
                return ((gx) this.f6885b).b(new tk(1));
            case 1:
                return ((gx) this.f6885b).b(tk.f10632d);
            case 2:
                return ((gx) this.f6885b).b(tk.f10633e);
            case 3:
                return ((gx) this.f6885b).b(new tk(this));
            case 4:
                return ((gx) this.f6885b).b(new tk(5));
            default:
                return ((gx) this.f6885b).b(tk.f10634f);
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        switch (this.f6884a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 27;
            case 4:
                return 45;
            default:
                return 51;
        }
    }

    public /* synthetic */ jm0(r81 r81Var, int i) {
        this.f6884a = i;
        this.f6885b = r81Var;
    }
}
