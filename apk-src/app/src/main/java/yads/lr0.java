package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class lr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final er0 f40646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za f40647b;

    public /* synthetic */ lr0(Context context, d4 d4Var, nu2 nu2Var, er0 er0Var) {
        this(er0Var, new za(context, nu2Var, d4Var));
    }

    public final void a(long j10) {
        er0 er0Var = this.f40646a;
        if (j10 <= er0Var.f38248c) {
            za.a(this.f40647b, er0Var.f38247b, n83.f41193e);
        }
    }

    public lr0(er0 er0Var, za zaVar) {
        this.f40646a = er0Var;
        this.f40647b = zaVar;
    }
}
