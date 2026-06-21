package p3;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f31145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f31146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f31147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f31148u;

    @Override // p3.h
    public final void close() {
        if (this.f31146s != null) {
            this.f31146s = null;
            transferEnded();
        }
        this.f31145r = null;
    }

    @Override // p3.h
    public final Uri getUri() {
        l lVar = this.f31145r;
        if (lVar != null) {
            return lVar.f31172a;
        }
        return null;
    }

    @Override // p3.h
    public final long open(l lVar) throws j3.d0, i {
        transferInitializing(lVar);
        this.f31145r = lVar;
        Uri uri = lVar.f31172a;
        long j10 = lVar.f31178g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        h5.j("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = m3.z.f28608a;
        String[] strArrSplit = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (strArrSplit.length != 2) {
            throw new j3.d0("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f31146s = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e3) {
                throw new j3.d0(om1.k("Error while parsing Base64 encoded string: ", str2), e3, true, 0);
            }
        } else {
            this.f31146s = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j11 = lVar.f31177f;
        byte[] bArr = this.f31146s;
        if (j11 > bArr.length) {
            this.f31146s = null;
            throw new i(2008);
        }
        int i = (int) j11;
        this.f31147t = i;
        int length = bArr.length - i;
        this.f31148u = length;
        if (j10 != -1) {
            this.f31148u = (int) Math.min(length, j10);
        }
        transferStarted(lVar);
        return j10 != -1 ? j10 : this.f31148u;
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f31148u;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.f31146s;
        String str = m3.z.f28608a;
        System.arraycopy(bArr2, this.f31147t, bArr, i, iMin);
        this.f31147t += iMin;
        this.f31148u -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }
}
