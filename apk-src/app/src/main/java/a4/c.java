package a4;

import android.content.Context;
import android.graphics.Point;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.h5;
import j3.d0;
import j3.o;
import java.io.IOException;
import java.nio.ByteBuffer;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r3.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f424o;

    public c(Context context) {
        super(new r3.e[1], new a[1]);
        this.f423n = context;
        this.f424o = -1;
    }

    @Override // r3.g
    public final r3.e f() {
        return new r3.e(1);
    }

    @Override // r3.g
    public final r3.f g() {
        return new a(this);
    }

    @Override // r3.g
    public final tp1 h(Throwable th2) {
        return new d("Unexpected decode error", th2);
    }

    @Override // r3.g
    public final tp1 i(r3.e eVar, r3.f fVar, boolean z5) {
        a aVar = (a) fVar;
        ByteBuffer byteBuffer = eVar.f32192f;
        byteBuffer.getClass();
        h5.r(byteBuffer.hasArray());
        h5.h(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f424o;
            if (iMax == -1) {
                Context context = this.f423n;
                if (context != null) {
                    Point pointW = z.w(context);
                    int i = pointW.x;
                    int i10 = pointW.y;
                    o oVar = eVar.f32190d;
                    if (oVar != null) {
                        int i11 = oVar.M;
                        if (i11 != -1) {
                            i *= i11;
                        }
                        int i12 = oVar.N;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                    }
                    iMax = (Math.max(i, i10) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            aVar.f420f = d4.c(byteBuffer.array(), byteBuffer.remaining(), iMax);
            aVar.f32196d = eVar.f32194h;
            return null;
        } catch (d0 e3) {
            return new d("Could not decode image data with BitmapFactory.", e3);
        } catch (IOException e7) {
            return new d(e7);
        }
    }
}
