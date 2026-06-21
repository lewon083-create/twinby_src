package yads;

import android.content.Context;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ie0 implements u52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f39517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nu2 f39518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v9 f39519d;

    public ie0(Context context, v9 v9Var, nu2 nu2Var, d4 d4Var) {
        this.f39516a = context;
        this.f39517b = d4Var;
        this.f39518c = nu2Var;
        this.f39519d = v9Var;
    }

    @Override // yads.u52
    public final r52 a() {
        Context context = this.f39516a;
        d4 d4Var = this.f39517b;
        nu2 nu2Var = this.f39518c;
        v9 v9Var = this.f39519d;
        pt2 pt2VarA = fw2.a().a(context);
        Context applicationContext = context.getApplicationContext();
        zd0 zd0Var = null;
        od2 od2Var = pt2VarA != null ? pt2VarA.L0 : null;
        if (od2Var != null) {
            Integer num = od2Var.f41516a;
            int iIntValue = num != null ? num.intValue() : 50000;
            Integer num2 = od2Var.f41517b;
            int iIntValue2 = num2 != null ? num2.intValue() : 50000;
            Integer num3 = od2Var.f41518c;
            int iIntValue3 = num3 != null ? num3.intValue() : 2500;
            Integer num4 = od2Var.f41519d;
            int iIntValue4 = num4 != null ? num4.intValue() : 5000;
            zd0.a(iIntValue3, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
            zd0.a(iIntValue4, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
            zd0.a(iIntValue, iIntValue3, "minBufferMs", "bufferForPlaybackMs");
            zd0.a(iIntValue, iIntValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            zd0.a(iIntValue2, iIntValue, "maxBufferMs", "minBufferMs");
            Integer num5 = od2Var.f41520e;
            zd0Var = new zd0(new ib0(0), iIntValue, iIntValue2, iIntValue3, iIntValue4, num5 != null ? num5.intValue() : -1, true);
        }
        sn0 sn0Var = new sn0(applicationContext);
        pe0 pe0Var = new pe0(applicationContext);
        pe0Var.f41908d = true;
        sn0 sn0VarC = sn0Var.c(pe0Var);
        if (zd0Var != null) {
            sn0VarC.a(zd0Var);
        }
        if (sn0VarC.f43004r) {
            throw new IllegalStateException();
        }
        sn0VarC.f43004r = true;
        return new tp0(new ao0(sn0VarC), new nn1(applicationContext, new ln1()), new ti3(applicationContext, d4Var, nu2Var, v9Var), new q52(), new ij3());
    }
}
