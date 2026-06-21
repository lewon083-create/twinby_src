package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y5 implements t2, e80 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y5 f12496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y5 f12497e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12499c;

    static {
        int i = 0;
        f12496d = new y5(true, i);
        f12497e = new y5(false, i);
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        a80 a80Var = (a80) obj;
        switch (this.f12498b) {
            case 2:
                a80Var.x(this.f12499c);
                break;
            default:
                a80Var.A(this.f12499c);
                break;
        }
    }

    public String toString() {
        switch (this.f12498b) {
            case 0:
                boolean z5 = !this.f12499c;
                StringBuilder sb2 = new StringBuilder(String.valueOf(z5).length() + 33);
                sb2.append("IncorrectFragmentation{expected=");
                sb2.append(z5);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ y5(boolean z5, int i) {
        this.f12498b = i;
        this.f12499c = z5;
    }
}
