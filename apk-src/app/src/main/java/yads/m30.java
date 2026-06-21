package yads;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m30 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u30 f40760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f40761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40763h;

    public m30() {
        super(false);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws qb2, q30 {
        e();
        this.f40760e = u30Var;
        Uri uri = u30Var.f43533a;
        String scheme = uri.getScheme();
        ni.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = lb3.f40466a;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw new qb2("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f40761f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e3) {
                throw new qb2(com.google.android.gms.internal.ads.om1.k("Error while parsing Base64 encoded string: ", str), e3, true, 0);
            }
        } else {
            this.f40761f = lb3.c(URLDecoder.decode(str, bu.f37144a.name()));
        }
        long j10 = u30Var.f43538f;
        byte[] bArr = this.f40761f;
        if (j10 > bArr.length) {
            this.f40761f = null;
            throw new q30(2008);
        }
        int i10 = (int) j10;
        this.f40762g = i10;
        int length = bArr.length - i10;
        this.f40763h = length;
        long j11 = u30Var.f43539g;
        if (j11 != -1) {
            this.f40763h = (int) Math.min(length, j11);
        }
        b(u30Var);
        long j12 = u30Var.f43539g;
        return j12 != -1 ? j12 : this.f40763h;
    }

    @Override // yads.p30
    public final void close() {
        if (this.f40761f != null) {
            this.f40761f = null;
            d();
        }
        this.f40760e = null;
    }

    @Override // yads.p30
    public final Uri getUri() {
        u30 u30Var = this.f40760e;
        if (u30Var != null) {
            return u30Var.f43533a;
        }
        return null;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f40763h;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.f40761f;
        int i12 = lb3.f40466a;
        System.arraycopy(bArr2, this.f40762g, bArr, i, iMin);
        this.f40762g += iMin;
        this.f40763h -= iMin;
        c(iMin);
        return iMin;
    }
}
