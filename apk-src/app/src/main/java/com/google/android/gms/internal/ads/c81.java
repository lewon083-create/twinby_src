package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c81 extends h41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public db1 f4096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f4097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4098h;
    public int i;

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.i;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.f4097g;
        String str = cq0.f4293a;
        System.arraycopy(bArr2, this.f4098h, bArr, i, iMin);
        this.f4098h += iMin;
        this.i -= iMin;
        c(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        if (this.f4097g != null) {
            this.f4097g = null;
            f();
        }
        this.f4096f = null;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) throws eb, t91 {
        a(db1Var);
        this.f4096f = db1Var;
        Uri uriNormalizeScheme = db1Var.f4544a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        ix.e0("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = cq0.f4293a;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw new eb("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f4097g = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e3) {
                throw new eb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e3, true, 0);
            }
        } else {
            this.f4097g = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j10 = db1Var.f4546c;
        int length = this.f4097g.length;
        if (j10 > length) {
            this.f4097g = null;
            throw new t91();
        }
        int i = (int) j10;
        this.f4098h = i;
        int i10 = length - i;
        this.i = i10;
        long j11 = db1Var.f4547d;
        if (j11 != -1) {
            this.i = (int) Math.min(i10, j11);
        }
        b(db1Var);
        return j11 != -1 ? j11 : this.i;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        db1 db1Var = this.f4096f;
        if (db1Var != null) {
            return db1Var.f4544a;
        }
        return null;
    }
}
