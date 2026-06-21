package p4;

import j3.o;
import java.nio.ByteBuffer;
import m3.p;
import m3.z;
import r3.b;
import r3.e;
import s3.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends s3.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f31212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p f31213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u f31214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f31215w;

    public a() {
        super(6);
        this.f31212t = new e(1);
        this.f31213u = new p();
    }

    @Override // s3.a
    public final int B(o oVar) {
        return "application/x-camera-motion".equals(oVar.f26335n) ? s3.a.b(4, 0, 0, 0) : s3.a.b(0, 0, 0, 0);
    }

    @Override // s3.a, s3.w0
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.f31214v = (u) obj;
        }
    }

    @Override // s3.a
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override // s3.a
    public final boolean k() {
        return j();
    }

    @Override // s3.a
    public final boolean m() {
        return true;
    }

    @Override // s3.a
    public final void n() {
        u uVar = this.f31214v;
        if (uVar != null) {
            uVar.c();
        }
    }

    @Override // s3.a
    public final void p(long j10, boolean z5, boolean z10) {
        this.f31215w = Long.MIN_VALUE;
        u uVar = this.f31214v;
        if (uVar != null) {
            uVar.c();
        }
    }

    @Override // s3.a
    public final void x(long j10, long j11) {
        float[] fArr;
        while (!j() && this.f31215w < 100000 + j10) {
            e eVar = this.f31212t;
            eVar.r();
            b bVar = this.f32432d;
            bVar.r();
            if (w(bVar, eVar, 0) != -4 || eVar.c(4)) {
                return;
            }
            long j12 = eVar.f32194h;
            this.f31215w = j12;
            boolean z5 = j12 < this.f32440m;
            if (this.f31214v != null && !z5) {
                eVar.u();
                ByteBuffer byteBuffer = eVar.f32192f;
                String str = z.f28608a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    p pVar = this.f31213u;
                    pVar.K(iLimit, bArrArray);
                    pVar.M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(pVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f31214v.b();
                }
            }
        }
    }
}
