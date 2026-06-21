package e4;

import android.net.Uri;
import com.google.android.gms.internal.measurement.h5;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends p3.c implements d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedBlockingQueue f16126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f16127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte[] f16128t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16129u;

    public h0() {
        super(true);
        this.f16127s = 8000L;
        this.f16126r = new LinkedBlockingQueue();
        this.f16128t = new byte[0];
        this.f16129u = -1;
    }

    @Override // e4.d
    public final String c() {
        h5.r(this.f16129u != -1);
        int i = this.f16129u;
        int i10 = this.f16129u + 1;
        String str = m3.z.f28608a;
        Locale locale = Locale.US;
        return a0.u.j(i, i10, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // p3.h
    public final Uri getUri() {
        return null;
    }

    @Override // e4.d
    public final int i() {
        return this.f16129u;
    }

    @Override // p3.h
    public final long open(p3.l lVar) {
        this.f16129u = lVar.f31172a.getPort();
        return -1L;
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int iMin = Math.min(i10, this.f16128t.length);
        System.arraycopy(this.f16128t, 0, bArr, i, iMin);
        byte[] bArr2 = this.f16128t;
        this.f16128t = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i10) {
            return iMin;
        }
        try {
            byte[] bArr3 = (byte[]) this.f16126r.poll(this.f16127s, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int iMin2 = Math.min(i10 - iMin, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i + iMin, iMin2);
            if (iMin2 < bArr3.length) {
                this.f16128t = Arrays.copyOfRange(bArr3, iMin2, bArr3.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // e4.d
    public final boolean s() {
        return false;
    }

    @Override // e4.d
    public final h0 A() {
        return this;
    }

    @Override // p3.h
    public final void close() {
    }
}
