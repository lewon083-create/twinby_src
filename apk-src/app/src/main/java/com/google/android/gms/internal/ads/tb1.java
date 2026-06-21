package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tb1 implements g91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f10579c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final me1 f10580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kf1 f10581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s31 f10582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v61 f10583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g91 f10584h;
    public jn1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c81 f10585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v61 f10586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g91 f10587l;

    public tb1(Context context, me1 me1Var) {
        this.f10578b = context.getApplicationContext();
        this.f10580d = me1Var;
    }

    public static final void b(g91 g91Var, em1 em1Var) {
        if (g91Var != null) {
            g91Var.H(em1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) {
        g91 g91Var = this.f10587l;
        g91Var.getClass();
        return g91Var.C(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void H(em1 em1Var) {
        em1Var.getClass();
        this.f10580d.H(em1Var);
        this.f10579c.add(em1Var);
        b(this.f10581e, em1Var);
        b(this.f10582f, em1Var);
        b(this.f10583g, em1Var);
        b(this.f10584h, em1Var);
        b(this.i, em1Var);
        b(this.f10585j, em1Var);
        b(this.f10586k, em1Var);
    }

    public final void a(g91 g91Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10579c;
            if (i >= arrayList.size()) {
                return;
            }
            g91Var.H((em1) arrayList.get(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.g91, com.google.android.gms.internal.ads.zj1
    public final Map d() {
        g91 g91Var = this.f10587l;
        return g91Var == null ? Collections.EMPTY_MAP : g91Var.d();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        g91 g91Var = this.f10587l;
        if (g91Var != null) {
            try {
                g91Var.g();
            } finally {
                this.f10587l = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) {
        ix.k0(this.f10587l == null);
        Uri uri = db1Var.f4544a;
        String scheme = uri.getScheme();
        String str = cq0.f4293a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f10578b;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f10581e == null) {
                    kf1 kf1Var = new kf1(false);
                    this.f10581e = kf1Var;
                    a(kf1Var);
                }
                this.f10587l = this.f10581e;
            } else {
                if (this.f10582f == null) {
                    s31 s31Var = new s31(context);
                    this.f10582f = s31Var;
                    a(s31Var);
                }
                this.f10587l = this.f10582f;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f10582f == null) {
                s31 s31Var2 = new s31(context);
                this.f10582f = s31Var2;
                a(s31Var2);
            }
            this.f10587l = this.f10582f;
        } else if ("content".equals(scheme)) {
            if (this.f10583g == null) {
                v61 v61Var = new v61(context, 0);
                this.f10583g = v61Var;
                a(v61Var);
            }
            this.f10587l = this.f10583g;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            me1 me1Var = this.f10580d;
            if (zEquals) {
                if (this.f10584h == null) {
                    try {
                        g91 g91Var = (g91) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f10584h = g91Var;
                        a(g91Var);
                    } catch (ClassNotFoundException unused) {
                        rs.r("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e3) {
                        throw new RuntimeException("Error instantiating RTMP extension", e3);
                    }
                    if (this.f10584h == null) {
                        this.f10584h = me1Var;
                    }
                }
                this.f10587l = this.f10584h;
            } else if ("udp".equals(scheme)) {
                if (this.i == null) {
                    jn1 jn1Var = new jn1();
                    this.i = jn1Var;
                    a(jn1Var);
                }
                this.f10587l = this.i;
            } else if ("data".equals(scheme)) {
                if (this.f10585j == null) {
                    c81 c81Var = new c81(false);
                    this.f10585j = c81Var;
                    a(c81Var);
                }
                this.f10587l = this.f10585j;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f10586k == null) {
                    v61 v61Var2 = new v61(context, 1);
                    this.f10586k = v61Var2;
                    a(v61Var2);
                }
                this.f10587l = this.f10586k;
            } else {
                this.f10587l = me1Var;
            }
        }
        return this.f10587l.k(db1Var);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        g91 g91Var = this.f10587l;
        if (g91Var == null) {
            return null;
        }
        return g91Var.l();
    }
}
