package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uz2 implements ps2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wz2 f43812d;

    public uz2(wz2 wz2Var) {
        this.f43812d = wz2Var;
    }

    @Override // yads.ps2
    public final void a() throws IOException {
        wz2 wz2Var = this.f43812d;
        if (wz2Var.f44545l) {
            return;
        }
        wz2Var.f44543j.a(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
    }

    @Override // yads.ps2
    public final boolean isReady() {
        return this.f43812d.f44546m;
    }

    @Override // yads.ps2
    public final int a(ox0 ox0Var, sa0 sa0Var, int i) {
        if (!this.f43811c) {
            wz2 wz2Var = this.f43812d;
            dn1 dn1Var = wz2Var.f44540f;
            dn1Var.a(new jm1(1, jt1.d(wz2Var.f44544k.f41375m), this.f43812d.f44544k, 0, null, dn1Var.a(0L), -9223372036854775807L));
            this.f43811c = true;
        }
        wz2 wz2Var2 = this.f43812d;
        boolean z5 = wz2Var2.f44546m;
        if (z5 && wz2Var2.f44547n == null) {
            this.f43810b = 2;
        }
        int i10 = this.f43810b;
        if (i10 == 2) {
            sa0Var.f43049b |= 4;
            return -4;
        }
        if ((i & 2) != 0 || i10 == 0) {
            ox0Var.f41759b = wz2Var2.f44544k;
            this.f43810b = 1;
            return -5;
        }
        if (!z5) {
            return -3;
        }
        wz2Var2.f44547n.getClass();
        sa0Var.f43049b |= 1;
        sa0Var.f42866f = 0L;
        if ((i & 4) == 0) {
            sa0Var.c(this.f43812d.f44548o);
            ByteBuffer byteBuffer = sa0Var.f42864d;
            wz2 wz2Var3 = this.f43812d;
            byteBuffer.put(wz2Var3.f44547n, 0, wz2Var3.f44548o);
        }
        if ((i & 1) == 0) {
            this.f43810b = 2;
        }
        return -4;
    }

    @Override // yads.ps2
    public final int a(long j10) {
        if (!this.f43811c) {
            wz2 wz2Var = this.f43812d;
            dn1 dn1Var = wz2Var.f44540f;
            dn1Var.a(new jm1(1, jt1.d(wz2Var.f44544k.f41375m), this.f43812d.f44544k, 0, null, dn1Var.a(0L), -9223372036854775807L));
            this.f43811c = true;
        }
        if (j10 <= 0 || this.f43810b == 2) {
            return 0;
        }
        this.f43810b = 2;
        return 1;
    }
}
