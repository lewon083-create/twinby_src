package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gi implements mh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5814b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5815c;

    public gi(hi hiVar) {
        Objects.requireNonNull(hiVar);
        this.f5815c = hiVar;
    }

    @Override // com.google.android.gms.internal.ads.mh
    public final void l0(boolean z5) {
        switch (this.f5814b) {
            case 0:
                hi hiVar = (hi) this.f5815c;
                if (!z5) {
                    hiVar.p();
                } else {
                    hiVar.v();
                }
                break;
            case 1:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3294z)).booleanValue()) {
                    ((ft0) this.f5815c).b(z5);
                }
                break;
            default:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3294z)).booleanValue()) {
                    ((lt0) this.f5815c).c(z5);
                }
                break;
        }
    }

    public gi(ft0 ft0Var) {
        Objects.requireNonNull(ft0Var);
        this.f5815c = ft0Var;
    }

    public gi(lt0 lt0Var) {
        Objects.requireNonNull(lt0Var);
        this.f5815c = lt0Var;
    }
}
