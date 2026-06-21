package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class he0 implements u52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f39138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f39139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f39140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f39141d;

    public he0(Context context, v9 v9Var, nu2 nu2Var, d4 d4Var) {
        this.f39138a = d4Var;
        this.f39139b = nu2Var;
        this.f39140c = v9Var;
        this.f39141d = context.getApplicationContext();
    }

    @Override // yads.u52
    public final r52 a() {
        Context context = this.f39141d;
        d4 d4Var = this.f39138a;
        nu2 nu2Var = this.f39139b;
        v9 v9Var = this.f39140c;
        Context applicationContext = context.getApplicationContext();
        s3.j jVar = new s3.j(applicationContext);
        s3.g gVar = new s3.g(applicationContext);
        gVar.f32549c = true;
        com.google.android.gms.internal.measurement.h5.r(true ^ jVar.f32579v);
        jVar.f32561c = new i4.p(1, gVar);
        return new sp0(jVar.a(), new mn1(applicationContext, new ln1()), new ti3(applicationContext, d4Var, nu2Var, v9Var), new q52(), new hj3());
    }
}
