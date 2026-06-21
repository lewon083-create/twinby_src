package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bt extends ro {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sa0 f37135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final lb2 f37136o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f37137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public at f37138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f37139r;

    public bt() {
        super(6);
        this.f37135n = new sa0(1);
        this.f37136o = new lb2();
    }

    @Override // yads.ro
    public final void a(long j10, boolean z5) {
        this.f37139r = Long.MIN_VALUE;
        at atVar = this.f37138q;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }

    @Override // yads.ro
    public final String d() {
        return "CameraMotionRenderer";
    }

    @Override // yads.ro
    public final boolean f() {
        return e();
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        at atVar = this.f37138q;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }

    @Override // yads.ro, yads.cf2
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.f37138q = (at) obj;
        }
    }

    @Override // yads.ro
    public final void a(nx0[] nx0VarArr, long j10, long j11) {
        this.f37137p = j11;
    }

    @Override // yads.ro
    public final void a(long j10, long j11) {
        while (!e() && this.f37139r < 100000 + j10) {
            this.f37135n.b();
            ox0 ox0Var = this.f42645c;
            float[] fArr = null;
            ox0Var.f41758a = null;
            ox0Var.f41759b = null;
            if (a(ox0Var, this.f37135n, 0) != -4 || this.f37135n.b(4)) {
                return;
            }
            sa0 sa0Var = this.f37135n;
            this.f37139r = sa0Var.f42866f;
            if (this.f37138q != null && !sa0Var.b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR)) {
                this.f37135n.c();
                ByteBuffer byteBuffer = this.f37135n.f42864d;
                int i = lb3.f40466a;
                if (byteBuffer.remaining() == 16) {
                    lb2 lb2Var = this.f37136o;
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    lb2Var.f40463a = bArrArray;
                    lb2Var.f40465c = iLimit;
                    lb2Var.f40464b = 0;
                    this.f37136o.e(byteBuffer.arrayOffset() + 4);
                    fArr = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr[i10] = Float.intBitsToFloat(this.f37136o.d());
                    }
                }
                if (fArr != null) {
                    this.f37138q.onCameraMotion(this.f37139r - this.f37137p, fArr);
                }
            }
        }
    }

    @Override // yads.ro
    public final int a(nx0 nx0Var) {
        if ("application/x-camera-motion".equals(nx0Var.f41375m)) {
            return ro.a(4, 0, 0);
        }
        return ro.a(0, 0, 0);
    }
}
