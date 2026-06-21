package yads;

import android.net.Uri;
import java.util.Map;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n21 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f41153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m21 f41155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f41156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41157e;

    public n21(u33 u33Var, int i, m21 m21Var) {
        ni.a(i > 0);
        this.f41153a = u33Var;
        this.f41154b = i;
        this.f41155c = m21Var;
        this.f41156d = new byte[1];
        this.f41157e = i;
    }

    @Override // yads.p30
    public final void a(u83 u83Var) {
        u83Var.getClass();
        this.f41153a.a(u83Var);
    }

    @Override // yads.p30
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f41153a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f41153a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) {
        if (this.f41157e == 0) {
            int i11 = 0;
            if (this.f41153a.read(this.f41156d, 0, 1) != -1) {
                int i12 = (this.f41156d[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i12 != 0) {
                    byte[] bArr2 = new byte[i12];
                    int i13 = i12;
                    while (i13 > 0) {
                        int i14 = this.f41153a.read(bArr2, i11, i13);
                        if (i14 != -1) {
                            i11 += i14;
                            i13 -= i14;
                        }
                    }
                    while (i12 > 0 && bArr2[i12 - 1] == 0) {
                        i12--;
                    }
                    if (i12 > 0) {
                        m21 m21Var = this.f41155c;
                        lb2 lb2Var = new lb2(i12, bArr2);
                        bk2 bk2Var = (bk2) m21Var;
                        long jMax = !bk2Var.f37085l ? bk2Var.i : Math.max(bk2Var.f37086m.a(true), bk2Var.i);
                        int i15 = lb2Var.f40465c - lb2Var.f40464b;
                        os2 os2Var = bk2Var.f37084k;
                        os2Var.getClass();
                        os2Var.a(i15, lb2Var);
                        os2Var.a(jMax, 1, i15, 0, (o73) null);
                        bk2Var.f37085l = true;
                    }
                }
                this.f41157e = this.f41154b;
            }
            return -1;
        }
        int i16 = this.f41153a.read(bArr, i, Math.min(this.f41157e, i10));
        if (i16 != -1) {
            this.f41157e -= i16;
        }
        return i16;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        throw new UnsupportedOperationException();
    }
}
