package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d8.e0 f7219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c5 f7220f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7227n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f7221g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f7222h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f7223j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7224k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7225l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7226m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f7228o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f7229p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f7230q = "";

    public kh(int i, int i10, int i11, int i12, int i13, int i14, int i15, boolean z5) {
        this.f7215a = i;
        this.f7216b = i10;
        this.f7217c = i11;
        this.f7218d = z5;
        this.f7219e = new d8.e0(i12);
        c5 c5Var = new c5();
        c5Var.f4027b = i13;
        i14 = (i14 > 64 || i14 < 0) ? 64 : i14;
        if (i15 <= 0) {
            c5Var.f4028c = 1;
        } else {
            c5Var.f4028c = i15;
        }
        c5Var.f4029d = new th(i14);
        this.f7220f = c5Var;
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sb2.append((String) arrayList.get(i));
            sb2.append(' ');
            i++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final void a(String str, boolean z5, float f10, float f11, float f12, float f13) {
        c(str, z5, f10, f11, f12, f13);
        synchronized (this.f7221g) {
            try {
                if (this.f7226m < 0) {
                    u9.i.c("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f7221g) {
            try {
                int i = this.f7224k;
                int i10 = this.f7225l;
                int i11 = this.f7216b;
                if (!this.f7218d) {
                    i11 = (i10 * i11) + (i * this.f7215a);
                }
                if (i11 > this.f7227n) {
                    this.f7227n = i11;
                    p9.k kVar = p9.k.C;
                    if (!kVar.f31302h.g().l()) {
                        d8.e0 e0Var = this.f7219e;
                        this.f7228o = e0Var.p(this.f7222h);
                        this.f7229p = e0Var.p(this.i);
                    }
                    if (!kVar.f31302h.g().m()) {
                        this.f7230q = this.f7220f.a(this.i, this.f7223j);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, boolean z5, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.f7217c) {
                return;
            }
            synchronized (this.f7221g) {
                try {
                    this.f7222h.add(str);
                    this.f7224k += str.length();
                    if (z5) {
                        this.i.add(str);
                        this.f7223j.add(new qh(f10, f11, f12, f13, r10.size() - 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((kh) obj).f7228o;
        return str != null && str.equals(this.f7228o);
    }

    public final int hashCode() {
        return this.f7228o.hashCode();
    }

    public final String toString() {
        int i = this.f7225l;
        int i10 = this.f7227n;
        int i11 = this.f7224k;
        String strD = d(this.f7222h);
        String strD2 = d(this.i);
        String str = this.f7228o;
        String str2 = this.f7229p;
        String str3 = this.f7230q;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i11).length();
        int length4 = String.valueOf(strD).length();
        int length5 = String.valueOf(strD2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        om1.u(sb2, "ActivityContent fetchId: ", i, " score:", i10);
        sb2.append(" total_length:");
        sb2.append(i11);
        sb2.append("\n text: ");
        sb2.append(strD);
        l7.o.t(sb2, "\n viewableText", strD2, "\n signture: ", str);
        return om1.n(sb2, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
