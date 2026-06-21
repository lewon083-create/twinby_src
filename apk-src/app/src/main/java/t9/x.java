package t9;

import android.content.Context;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.z7;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends e1.d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9.l f33654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ni.i f33656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, String str, String str2, ni.i iVar) {
        super(5);
        String strF = p9.k.C.f31297c.F(context, str);
        this.f33654c = new u9.l(context, strF);
        this.f33655d = str2;
        this.f33656e = iVar;
    }

    @Override // e1.d0
    public final void A() {
        String str = this.f33655d;
        ni.i iVar = this.f33656e;
        if (iVar == null) {
            this.f33654c.a(str, null);
            return;
        }
        new z7((u9.h) iVar.f29407c, this.f33654c, hx.f6283e, null, null, 9).a(str);
    }
}
