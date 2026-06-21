package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j41 extends ad.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m41 f6712h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j41(m41 m41Var, int i) {
        super(m41Var);
        this.f6711g = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(m41Var);
                this.f6712h = m41Var;
                super(m41Var);
                break;
            case 2:
                Objects.requireNonNull(m41Var);
                this.f6712h = m41Var;
                super(m41Var);
                break;
            default:
                Objects.requireNonNull(m41Var);
                this.f6712h = m41Var;
                break;
        }
    }

    @Override // ad.t
    public final Object b(int i) {
        switch (this.f6711g) {
            case 0:
                return this.f6712h.b()[i];
            case 1:
                return new l41(this.f6712h, i);
            default:
                return this.f6712h.c()[i];
        }
    }
}
