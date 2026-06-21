package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h91 implements k81, e80, jr0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h91 f6058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h91 f6059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h91 f6060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h91 f6061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h91 f6062h;
    public static final h91 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h91 f6063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h91 f6064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h91 f6065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h91 f6066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h91 f6067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h91 f6068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h91 f6069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h91 f6070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h91 f6071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h91 f6072s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6074c;

    static {
        int i10 = 0;
        f6058d = new h91("ENABLED", i10);
        f6059e = new h91("DISABLED", i10);
        f6060f = new h91("DESTROYED", i10);
        int i11 = 1;
        f6061g = new h91("TINK", i11);
        f6062h = new h91("CRUNCHY", i11);
        i = new h91("NO_PREFIX", i11);
        int i12 = 2;
        f6063j = new h91("ASSUME_AES_GCM", i12);
        f6064k = new h91("ASSUME_XCHACHA20POLY1305", i12);
        f6065l = new h91("ASSUME_CHACHA20POLY1305", i12);
        f6066m = new h91("ASSUME_AES_CTR_HMAC", i12);
        f6067n = new h91("ASSUME_AES_EAX", i12);
        f6068o = new h91("ASSUME_AES_GCM_SIV", i12);
        int i13 = 3;
        f6069p = new h91("TINK", i13);
        f6070q = new h91("CRUNCHY", i13);
        f6071r = new h91("LEGACY", i13);
        f6072s = new h91("NO_PREFIX", i13);
    }

    public /* synthetic */ h91(String str, int i10) {
        this.f6073b = i10;
        this.f6074c = str;
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public Object a(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.f6074c, Integer.toString(0)});
        return null;
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        p9.k.C.f31302h.d(this.f6074c, th2);
    }

    public String toString() {
        switch (this.f6073b) {
            case 0:
                return this.f6074c;
            case 1:
                return this.f6074c;
            case 2:
                return this.f6074c;
            case 3:
                return this.f6074c;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public /* synthetic */ void mo7a(Object obj) {
        switch (this.f6073b) {
            case 5:
                ((k80) obj).w(this.f6074c);
                break;
            default:
                ((z80) obj).D(this.f6074c);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
    }
}
