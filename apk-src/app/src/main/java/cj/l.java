package cj;

import ad.b1;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.measurement.j4;
import e4.i0;
import e4.v;
import g8.g;
import i4.a;
import j3.u;
import j3.v0;
import j3.x;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i) {
        super(str);
        this.f2343b = i;
    }

    @Override // cj.x
    public final j3.x a() {
        switch (this.f2343b) {
            case 0:
                e2 e2Var = new e2();
                new v0();
                List list = Collections.EMPTY_LIST;
                b1 b1Var = b1.f768f;
                j3.s sVar = new j3.s();
                j3.v vVar = j3.v.f26403a;
                Uri uri = Uri.parse(this.f2364a);
                return new j3.x("", new j3.r(e2Var), uri != null ? new j3.u(uri, null, null, list, b1Var, -9223372036854775807L) : null, new j3.t(sVar), j3.z.B, vVar);
            default:
                e2 e2Var2 = new e2();
                new v0();
                List list2 = Collections.EMPTY_LIST;
                b1 b1Var2 = b1.f768f;
                j3.s sVar2 = new j3.s();
                j3.v vVar2 = j3.v.f26403a;
                Uri uri2 = Uri.parse(this.f2364a);
                return new j3.x("", new j3.r(e2Var2), uri2 != null ? new j3.u(uri2, null, null, list2, b1Var2, -9223372036854775807L) : null, new j3.t(sVar2), j3.z.B, vVar2);
        }
    }

    @Override // cj.x
    public final i4.b0 b(Context context) {
        switch (this.f2343b) {
            case 0:
                return new i4.q(context);
            default:
                return new i4.b0() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final SocketFactory f1638a = SocketFactory.getDefault();

                    @Override // i4.b0
                    public final a d(x xVar) {
                        xVar.f26407b.getClass();
                        u uVar = xVar.f26407b;
                        uVar.getClass();
                        String scheme = uVar.f26396a.getScheme();
                        return new v(xVar, (scheme == null || !j4.n("rtspt", scheme)) ? new g(14) : new i0(), this.f1638a);
                    }
                };
        }
    }
}
