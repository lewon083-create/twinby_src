package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f13727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m1 f13728h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(m1 m1Var, g0 g0Var, int i, boolean z5) {
        super(m1Var, true);
        this.f13726f = i;
        this.f13727g = g0Var;
        this.f13728h = m1Var;
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        switch (this.f13726f) {
            case 0:
                j0 j0Var = this.f13728h.f13882e;
                pa.c0.i(j0Var);
                j0Var.getGmpAppId(this.f13727g);
                break;
            case 1:
                j0 j0Var2 = this.f13728h.f13882e;
                pa.c0.i(j0Var2);
                j0Var2.getCachedAppInstanceId(this.f13727g);
                break;
            case 2:
                j0 j0Var3 = this.f13728h.f13882e;
                pa.c0.i(j0Var3);
                j0Var3.generateEventId(this.f13727g);
                break;
            case 3:
                j0 j0Var4 = this.f13728h.f13882e;
                pa.c0.i(j0Var4);
                j0Var4.getCurrentScreenName(this.f13727g);
                break;
            case 4:
                j0 j0Var5 = this.f13728h.f13882e;
                pa.c0.i(j0Var5);
                j0Var5.getCurrentScreenClass(this.f13727g);
                break;
            case 5:
                j0 j0Var6 = this.f13728h.f13882e;
                pa.c0.i(j0Var6);
                j0Var6.getAppInstanceId(this.f13727g);
                break;
            default:
                j0 j0Var7 = this.f13728h.f13882e;
                pa.c0.i(j0Var7);
                j0Var7.getSessionId(this.f13727g);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void b() {
        switch (this.f13726f) {
            case 0:
                this.f13727g.W2(null);
                break;
            case 1:
                this.f13727g.W2(null);
                break;
            case 2:
                this.f13727g.W2(null);
                break;
            case 3:
                this.f13727g.W2(null);
                break;
            case 4:
                this.f13727g.W2(null);
                break;
            case 5:
                this.f13727g.W2(null);
                break;
            default:
                this.f13727g.W2(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(m1 m1Var, g0 g0Var, int i) {
        super(m1Var, true);
        this.f13726f = i;
        switch (i) {
            case 6:
                this.f13727g = g0Var;
                Objects.requireNonNull(m1Var);
                this.f13728h = m1Var;
                super(m1Var, true);
                break;
            default:
                this.f13727g = g0Var;
                Objects.requireNonNull(m1Var);
                this.f13728h = m1Var;
                break;
        }
    }
}
