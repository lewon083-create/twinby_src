package aa;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.z80;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements z80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0 f676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f679e;

    public o0(qd0 qd0Var, n0 n0Var, String str, int i) {
        this.f676b = qd0Var;
        this.f677c = n0Var;
        this.f678d = str;
        this.f679e = i;
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void a(t tVar) {
        String strOptString;
        if (tVar == null || this.f679e == 2) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(tVar.f703c);
        qd0 qd0Var = this.f676b;
        n0 n0Var = this.f677c;
        if (zIsEmpty) {
            n0Var.a(this.f678d, tVar.f702b, qd0Var);
            return;
        }
        try {
            strOptString = new JSONObject(tVar.f703c).optString(CommonUrlParts.REQUEST_ID);
        } catch (JSONException e3) {
            p9.k.C.f31302h.d("RenderSignals.getRequestId", e3);
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        n0Var.a(strOptString, tVar.f703c, qd0Var);
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void D(String str) {
    }
}
