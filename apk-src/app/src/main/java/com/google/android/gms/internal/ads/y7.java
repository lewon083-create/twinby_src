package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12517e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f12522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f12523l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f12526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f12527p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t7 f12529r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f12531t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f12532u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12518f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12519g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12520h = -1;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12521j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12524m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12525n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12528q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f12530s = Float.MAX_VALUE;

    public final String a() {
        return this.f12531t;
    }

    public final String b() {
        return this.f12532u;
    }

    public final void c(y7 y7Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (y7Var != null) {
            if (!this.f12515c && y7Var.f12515c) {
                this.f12514b = y7Var.f12514b;
                this.f12515c = true;
            }
            if (this.f12520h == -1) {
                this.f12520h = y7Var.f12520h;
            }
            if (this.i == -1) {
                this.i = y7Var.i;
            }
            if (this.f12513a == null && (str = y7Var.f12513a) != null) {
                this.f12513a = str;
            }
            if (this.f12518f == -1) {
                this.f12518f = y7Var.f12518f;
            }
            if (this.f12519g == -1) {
                this.f12519g = y7Var.f12519g;
            }
            if (this.f12525n == -1) {
                this.f12525n = y7Var.f12525n;
            }
            if (this.f12526o == null && (alignment2 = y7Var.f12526o) != null) {
                this.f12526o = alignment2;
            }
            if (this.f12527p == null && (alignment = y7Var.f12527p) != null) {
                this.f12527p = alignment;
            }
            if (this.f12528q == -1) {
                this.f12528q = y7Var.f12528q;
            }
            if (this.f12521j == -1) {
                this.f12521j = y7Var.f12521j;
                this.f12522k = y7Var.f12522k;
            }
            if (this.f12529r == null) {
                this.f12529r = y7Var.f12529r;
            }
            if (this.f12530s == Float.MAX_VALUE) {
                this.f12530s = y7Var.f12530s;
            }
            if (this.f12531t == null) {
                this.f12531t = y7Var.f12531t;
            }
            if (this.f12532u == null) {
                this.f12532u = y7Var.f12532u;
            }
            if (!this.f12517e && y7Var.f12517e) {
                this.f12516d = y7Var.f12516d;
                this.f12517e = true;
            }
            if (this.f12524m != -1 || (i = y7Var.f12524m) == -1) {
                return;
            }
            this.f12524m = i;
        }
    }

    public final String d() {
        return this.f12523l;
    }
}
