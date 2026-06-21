package k4;

import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.measurement.h5;
import java.nio.ByteBuffer;
import n5.f;
import n5.j;
import n5.m;
import r3.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f26887n;

    public b(m mVar) {
        super(new j[2], new n5.d[2]);
        int i = this.f32204g;
        r3.e[] eVarArr = this.f32202e;
        h5.r(i == eVarArr.length);
        for (r3.e eVar : eVarArr) {
            eVar.t(1024);
        }
        this.f26887n = mVar;
    }

    @Override // r3.g
    public final r3.e f() {
        return new j(1);
    }

    @Override // r3.g
    public final r3.f g() {
        return new n5.d(this);
    }

    @Override // r3.g
    public final tp1 h(Throwable th2) {
        return new n5.g("Unexpected decode error", th2);
    }

    @Override // r3.g
    public final tp1 i(r3.e eVar, r3.f fVar, boolean z5) {
        j jVar = (j) eVar;
        n5.d dVar = (n5.d) fVar;
        try {
            ByteBuffer byteBuffer = jVar.f32192f;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            m mVar = this.f26887n;
            if (z5) {
                mVar.reset();
            }
            n5.e eVarI = mVar.i(bArrArray, 0, iLimit);
            long j10 = jVar.f32194h;
            long j11 = jVar.f29123k;
            dVar.f32196d = j10;
            dVar.f29109f = eVarI;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            dVar.f29110g = j10;
            dVar.f32197e = false;
            return null;
        } catch (n5.g e3) {
            return e3;
        }
    }

    @Override // n5.f
    public final void c(long j10) {
    }
}
