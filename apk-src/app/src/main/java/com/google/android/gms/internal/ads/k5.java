package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k5 implements t2, q4.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7121e;

    public String toString() {
        switch (this.f7118b) {
            case 0:
                String strX = cq0.x(this.f7119c);
                int length = strX.length();
                long j10 = this.f7120d;
                int length2 = String.valueOf(j10).length();
                int i = this.f7121e;
                StringBuilder sb2 = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i).length() + 1);
                sb2.append("AtomSizeTooSmall{type=");
                sb2.append(strX);
                sb2.append(", size=");
                sb2.append(j10);
                sb2.append(", minHeaderSize=");
                sb2.append(i);
                sb2.append("}");
                return sb2.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder("AtomSizeTooSmall{type=");
                sb3.append(m3.z.X(this.f7119c));
                sb3.append(", size=");
                sb3.append(this.f7120d);
                sb3.append(", minHeaderSize=");
                return t.z.d(this.f7121e, "}", sb3);
        }
    }

    public /* synthetic */ k5(int i, int i10, long j10, int i11) {
        this.f7118b = i11;
        this.f7119c = i;
        this.f7120d = j10;
        this.f7121e = i10;
    }
}
