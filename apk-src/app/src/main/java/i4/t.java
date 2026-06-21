package i4;

import android.net.Uri;
import com.google.android.gms.internal.measurement.h5;
import java.util.Map;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements p3.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.h f21008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s0 f21010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f21011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21012f;

    public t(p3.h hVar, int i, s0 s0Var) {
        h5.h(i > 0);
        this.f21008b = hVar;
        this.f21009c = i;
        this.f21010d = s0Var;
        this.f21011e = new byte[1];
        this.f21012f = i;
    }

    @Override // p3.h
    public final void addTransferListener(p3.e0 e0Var) {
        e0Var.getClass();
        this.f21008b.addTransferListener(e0Var);
    }

    @Override // p3.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p3.h
    public final Map getResponseHeaders() {
        return this.f21008b.getResponseHeaders();
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.f21008b.getUri();
    }

    @Override // p3.h
    public final long open(p3.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) {
        int i11 = this.f21012f;
        p3.h hVar = this.f21008b;
        if (i11 == 0) {
            byte[] bArr2 = this.f21011e;
            int i12 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int i15 = hVar.read(bArr3, i12, i14);
                        if (i15 != -1) {
                            i12 += i15;
                            i14 -= i15;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        m3.p pVar = new m3.p(i13, bArr3);
                        s0 s0Var = this.f21010d;
                        long jMax = !s0Var.f21006m ? s0Var.f21003j : Math.max(s0Var.f21007n.n(true), s0Var.f21003j);
                        int iA = pVar.a();
                        q4.a0 a0Var = s0Var.f21005l;
                        a0Var.getClass();
                        a0Var.d(iA, pVar);
                        a0Var.f(jMax, 1, iA, 0, null);
                        s0Var.f21006m = true;
                    }
                }
                this.f21012f = this.f21009c;
            }
            return -1;
        }
        int i16 = hVar.read(bArr, i, Math.min(this.f21012f, i10));
        if (i16 != -1) {
            this.f21012f -= i16;
        }
        return i16;
    }
}
