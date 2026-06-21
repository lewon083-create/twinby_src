package io.sentry.util;

import io.sentry.IScope;
import io.sentry.PropagationContext;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryOptions;
import io.sentry.util.TracingUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ScopeCallback, Scope.IWithPropagationContext {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26112d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f26110b = i;
        this.f26111c = obj;
        this.f26112d = obj2;
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(PropagationContext propagationContext) {
        switch (this.f26110b) {
            case 1:
                ((IScope) this.f26111c).setPropagationContext((PropagationContext) this.f26112d);
                break;
            default:
                TracingUtils.lambda$maybeUpdateBaggage$5((IScope) this.f26111c, (SentryOptions) this.f26112d, propagationContext);
                break;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        TracingUtils.lambda$trace$4((TracingUtils.PropagationContextHolder) this.f26111c, (SentryOptions) this.f26112d, iScope);
    }
}
