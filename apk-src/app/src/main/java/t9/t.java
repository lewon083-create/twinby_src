package t9;

import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.jx;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.pn1;
import com.google.android.gms.internal.ads.qa;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends qa {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jx f33650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u9.f f33651o;

    public t(String str, jx jxVar) {
        super(0, str, new m7.a(18, jxVar));
        this.f33650n = jxVar;
        u9.f fVar = new u9.f();
        this.f33651o = fVar;
        if (u9.f.c()) {
            Object obj = null;
            fVar.e("onNetworkRequest", new com.google.firebase.messaging.y(str, "GET", obj, obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final b7 h(oa oaVar) {
        return new b7(oaVar, pn1.d(oaVar));
    }

    @Override // com.google.android.gms.internal.ads.qa
    public final void i(Object obj) {
        oa oaVar = (oa) obj;
        Map map = oaVar.f8646c;
        int i = oaVar.f8644a;
        u9.f fVar = this.f33651o;
        fVar.getClass();
        if (u9.f.c()) {
            fVar.e("onNetworkResponse", new d8.e0(i, map, 15));
            if (i < 200 || i >= 300) {
                fVar.e("onNetworkRequestError", new d8.u(null, 3));
            }
        }
        byte[] bArr = oaVar.f8645b;
        if (u9.f.c() && bArr != null) {
            fVar.e("onNetworkResponseBody", new m4.d(bArr));
        }
        this.f33650n.b(oaVar);
    }
}
