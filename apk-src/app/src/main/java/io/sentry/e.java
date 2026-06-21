package io.sentry;

import io.sentry.JsonObjectDeserializer;
import io.sentry.Scope;
import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements JsonObjectDeserializer.NextValue, HintUtils.SentryConsumer, Scope.IWithPropagationContext, Scope.IWithTransaction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26020d;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f26018b = i;
        this.f26019c = obj;
        this.f26020d = obj2;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((SentryTracer) this.f26019c).lambda$finish$1((IScope) this.f26020d, iTransaction);
    }

    @Override // io.sentry.JsonObjectDeserializer.NextValue
    public Object nextValue() {
        return ((JsonObjectDeserializer) this.f26019c).lambda$parse$1((JsonObjectReader) this.f26020d);
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(PropagationContext propagationContext) {
        ((IScope) this.f26019c).setPropagationContext((PropagationContext) this.f26020d);
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        switch (this.f26018b) {
            case 1:
                ((EnvelopeSender) this.f26019c).lambda$processFile$2((File) this.f26020d, (Retryable) obj);
                break;
            default:
                ((OutboxSender) this.f26019c).lambda$processFile$0((File) this.f26020d, (Retryable) obj);
                break;
        }
    }
}
