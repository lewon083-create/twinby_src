package yads;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44970e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f44975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f44976l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f44979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f44980p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y53 f44982r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44971f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44972g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44973h = -1;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44974j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44977m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44978n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44981q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f44983s = Float.MAX_VALUE;

    public final y93 a(y93 y93Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (y93Var != null) {
            if (!this.f44968c && y93Var.f44968c) {
                this.f44967b = y93Var.f44967b;
                this.f44968c = true;
            }
            if (this.f44973h == -1) {
                this.f44973h = y93Var.f44973h;
            }
            if (this.i == -1) {
                this.i = y93Var.i;
            }
            if (this.f44966a == null && (str = y93Var.f44966a) != null) {
                this.f44966a = str;
            }
            if (this.f44971f == -1) {
                this.f44971f = y93Var.f44971f;
            }
            if (this.f44972g == -1) {
                this.f44972g = y93Var.f44972g;
            }
            if (this.f44978n == -1) {
                this.f44978n = y93Var.f44978n;
            }
            if (this.f44979o == null && (alignment2 = y93Var.f44979o) != null) {
                this.f44979o = alignment2;
            }
            if (this.f44980p == null && (alignment = y93Var.f44980p) != null) {
                this.f44980p = alignment;
            }
            if (this.f44981q == -1) {
                this.f44981q = y93Var.f44981q;
            }
            if (this.f44974j == -1) {
                this.f44974j = y93Var.f44974j;
                this.f44975k = y93Var.f44975k;
            }
            if (this.f44982r == null) {
                this.f44982r = y93Var.f44982r;
            }
            if (this.f44983s == Float.MAX_VALUE) {
                this.f44983s = y93Var.f44983s;
            }
            if (!this.f44970e && y93Var.f44970e) {
                this.f44969d = y93Var.f44969d;
                this.f44970e = true;
            }
            if (this.f44977m == -1 && (i = y93Var.f44977m) != -1) {
                this.f44977m = i;
            }
        }
        return this;
    }
}
