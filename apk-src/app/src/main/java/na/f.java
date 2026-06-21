package na;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.play_billing.w;
import java.util.Collections;
import java.util.Set;
import oa.a0;
import oa.b0;
import oa.r;
import oa.u;
import oa.z;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ni.i f29192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l6.i f29193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f29194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oa.a f29195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Looper f29196h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f29197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final le.a f29198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oa.e f29199l;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r6, android.app.Activity r7, l6.i r8, na.b r9, na.e r10) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: na.f.<init>(android.content.Context, android.app.Activity, l6.i, na.b, na.e):void");
    }

    public final ka.k a() {
        ka.k kVar = new ka.k(23);
        Set set = Collections.EMPTY_SET;
        if (((h1.f) kVar.f27324c) == null) {
            kVar.f27324c = new h1.f(0);
        }
        ((h1.f) kVar.f27324c).addAll(set);
        Context context = this.f29190b;
        kVar.f27326e = context.getClass().getName();
        kVar.f27325d = context.getPackageName();
        return kVar;
    }

    public final sb.m c(oa.i iVar, int i) {
        c0.j(iVar, "Listener key cannot be null.");
        oa.e eVar = this.f29199l;
        eVar.getClass();
        sb.g gVar = new sb.g();
        eVar.b(gVar, i, this);
        u uVar = new u(new a0(iVar, gVar), eVar.f29844j.get(), this);
        kw0 kw0Var = eVar.f29849o;
        kw0Var.sendMessage(kw0Var.obtainMessage(13, uVar));
        return gVar.f32858a;
    }

    public final void d(int i, ka.i iVar) {
        boolean z5 = true;
        if (!iVar.f2645l && !((Boolean) BasePendingResult.f2637m.get()).booleanValue()) {
            z5 = false;
        }
        iVar.f2645l = z5;
        oa.e eVar = this.f29199l;
        eVar.getClass();
        u uVar = new u(new z(i, iVar), eVar.f29844j.get(), this);
        kw0 kw0Var = eVar.f29849o;
        kw0Var.sendMessage(kw0Var.obtainMessage(4, uVar));
    }

    public final sb.m e(int i, w wVar) {
        sb.g gVar = new sb.g();
        oa.e eVar = this.f29199l;
        eVar.getClass();
        eVar.b(gVar, wVar.f14342b, this);
        u uVar = new u(new b0(i, wVar, gVar, this.f29198k), eVar.f29844j.get(), this);
        kw0 kw0Var = eVar.f29849o;
        kw0Var.sendMessage(kw0Var.obtainMessage(4, uVar));
        return gVar.f32858a;
    }
}
