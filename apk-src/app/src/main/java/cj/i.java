package cj;

import ad.b1;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.ads.i0;
import com.google.android.gms.internal.ads.p6;
import j3.v0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2337d;

    public i(String str, int i, HashMap map, String str2) {
        super(str);
        this.f2335b = i;
        this.f2336c = map;
        this.f2337d = str2;
    }

    @Override // cj.x
    public final j3.x a() {
        e2 e2Var = new e2();
        new v0();
        List list = Collections.EMPTY_LIST;
        b1 b1Var = b1.f768f;
        j3.s sVar = new j3.s();
        j3.v vVar = j3.v.f26403a;
        Uri uri = Uri.parse(this.f2364a);
        int iM = t.z.m(this.f2335b);
        String str = iM != 1 ? iM != 2 ? iM != 3 ? null : "application/x-mpegURL" : "application/dash+xml" : "application/vnd.ms-sstr+xml";
        return new j3.x("", new j3.r(e2Var), uri != null ? new j3.u(uri, str != null ? str : null, null, list, b1Var, -9223372036854775807L) : null, new j3.t(sVar), j3.z.B, vVar);
    }

    @Override // cj.x
    public final i4.b0 b(Context context) {
        p6 p6Var = new p6(2);
        HashMap map = this.f2336c;
        p6Var.f8937f = this.f2337d;
        p6Var.f8935d = true;
        if (!map.isEmpty()) {
            p3.x xVar = (p3.x) p6Var.f8936e;
            synchronized (xVar) {
                xVar.f31208b = null;
                xVar.f31207a.clear();
                xVar.f31207a.putAll(map);
            }
        }
        l6.i iVar = new l6.i(context, p6Var);
        i4.q qVar = new i4.q(context);
        qVar.f20980b = iVar;
        i0 i0Var = qVar.f20979a;
        if (iVar != ((p3.g) i0Var.f6316f)) {
            i0Var.f6316f = iVar;
            ((HashMap) i0Var.f6314d).clear();
            ((HashMap) i0Var.f6315e).clear();
        }
        return qVar;
    }
}
