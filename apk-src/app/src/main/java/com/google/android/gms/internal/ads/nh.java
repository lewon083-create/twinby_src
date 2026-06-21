package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nh {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f8296m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n5 f8297n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8298a = f8296m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n5 f8299b = f8297n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c2 f8305h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8308l;

    static {
        v41 v41Var = x41.f12018c;
        r51 r51Var = r51.f9713f;
        List list = Collections.EMPTY_LIST;
        r51 r51Var2 = r51.f9713f;
        b4 b4Var = b4.f3576a;
        Uri uri = Uri.EMPTY;
        f8297n = new n5("androidx.media3.common.Timeline", new h0(), uri != null ? new q2(uri, r51Var2) : null, new c2(), r7.B);
        String str = cq0.f4293a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(n5 n5Var, boolean z5, boolean z10, c2 c2Var, long j10) {
        this.f8298a = f8296m;
        if (n5Var == null) {
            n5Var = f8297n;
        }
        this.f8299b = n5Var;
        this.f8300c = -9223372036854775807L;
        this.f8301d = -9223372036854775807L;
        this.f8302e = -9223372036854775807L;
        this.f8303f = z5;
        this.f8304g = z10;
        this.f8305h = c2Var;
        this.f8306j = j10;
        this.f8307k = 0;
        this.f8308l = 0;
        this.i = false;
    }

    public final boolean b() {
        return this.f8305h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !nh.class.equals(obj.getClass())) {
            return false;
        }
        nh nhVar = (nh) obj;
        return Objects.equals(this.f8298a, nhVar.f8298a) && Objects.equals(this.f8299b, nhVar.f8299b) && Objects.equals(this.f8305h, nhVar.f8305h) && this.f8300c == nhVar.f8300c && this.f8301d == nhVar.f8301d && this.f8302e == nhVar.f8302e && this.f8303f == nhVar.f8303f && this.f8304g == nhVar.f8304g && this.i == nhVar.i && this.f8306j == nhVar.f8306j && this.f8307k == nhVar.f8307k && this.f8308l == nhVar.f8308l;
    }

    public final int hashCode() {
        int iHashCode = ((this.f8298a.hashCode() + 217) * 31) + this.f8299b.hashCode();
        c2 c2Var = this.f8305h;
        int iHashCode2 = ((iHashCode * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        long j10 = this.f8300c;
        int i = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f8301d;
        int i10 = (i + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f8302e;
        int i11 = ((((((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f8303f ? 1 : 0)) * 31) + (this.f8304g ? 1 : 0)) * 31) + (this.i ? 1 : 0);
        long j13 = this.f8306j;
        return ((((((i11 * VKApiCodes.CODE_CALL_LINK_OUTDATED) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f8307k) * 31) + this.f8308l) * 31;
    }
}
