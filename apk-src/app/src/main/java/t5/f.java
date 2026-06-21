package t5;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33512e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f33517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f33518l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f33521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f33522p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f33524r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f33526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f33527u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33513f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33514g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33515h = -1;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33516j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f33519m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f33520n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f33523q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f33525s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f33510c && fVar.f33510c) {
                this.f33509b = fVar.f33509b;
                this.f33510c = true;
            }
            if (this.f33515h == -1) {
                this.f33515h = fVar.f33515h;
            }
            if (this.i == -1) {
                this.i = fVar.i;
            }
            if (this.f33508a == null && (str = fVar.f33508a) != null) {
                this.f33508a = str;
            }
            if (this.f33513f == -1) {
                this.f33513f = fVar.f33513f;
            }
            if (this.f33514g == -1) {
                this.f33514g = fVar.f33514g;
            }
            if (this.f33520n == -1) {
                this.f33520n = fVar.f33520n;
            }
            if (this.f33521o == null && (alignment2 = fVar.f33521o) != null) {
                this.f33521o = alignment2;
            }
            if (this.f33522p == null && (alignment = fVar.f33522p) != null) {
                this.f33522p = alignment;
            }
            if (this.f33523q == -1) {
                this.f33523q = fVar.f33523q;
            }
            if (this.f33516j == -1) {
                this.f33516j = fVar.f33516j;
                this.f33517k = fVar.f33517k;
            }
            if (this.f33524r == null) {
                this.f33524r = fVar.f33524r;
            }
            if (this.f33525s == Float.MAX_VALUE) {
                this.f33525s = fVar.f33525s;
            }
            if (this.f33526t == null) {
                this.f33526t = fVar.f33526t;
            }
            if (this.f33527u == null) {
                this.f33527u = fVar.f33527u;
            }
            if (!this.f33512e && fVar.f33512e) {
                this.f33511d = fVar.f33511d;
                this.f33512e = true;
            }
            if (this.f33519m != -1 || (i = fVar.f33519m) == -1) {
                return;
            }
            this.f33519m = i;
        }
    }
}
