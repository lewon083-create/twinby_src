package io.sentry.android.core;

import ad.b1;
import ad.g0;
import ad.j0;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.SentryOptions;
import io.sentry.Session;
import j3.p0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements ScopeCallback, l4.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25946e;

    public /* synthetic */ s(Session.State state, boolean z5, AtomicReference atomicReference, SentryOptions sentryOptions) {
        this.f25944c = state;
        this.f25943b = z5;
        this.f25945d = atomicReference;
        this.f25946e = sentryOptions;
    }

    @Override // l4.m
    public b1 d(int i, p0 p0Var, int[] iArr) {
        l4.p pVar = (l4.p) this.f25944c;
        l4.j jVar = (l4.j) this.f25945d;
        int[] iArr2 = (int[]) this.f25946e;
        pVar.getClass();
        l4.e eVar = new l4.e(pVar, jVar);
        int i10 = iArr2[i];
        g0 g0VarQ = j0.q();
        for (int i11 = 0; i11 < p0Var.f26351a; i11++) {
            g0VarQ.b(new l4.f(i, p0Var, i11, jVar, iArr[i11], this.f25943b, eVar, i10));
        }
        return g0VarQ.g();
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        InternalSentrySdk.lambda$updateSession$2((Session.State) this.f25944c, this.f25943b, (AtomicReference) this.f25945d, (SentryOptions) this.f25946e, iScope);
    }

    public /* synthetic */ s(l4.p pVar, l4.j jVar, boolean z5, int[] iArr) {
        this.f25944c = pVar;
        this.f25945d = jVar;
        this.f25943b = z5;
        this.f25946e = iArr;
    }
}
