package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.TransactionFinishedCallback;
import io.sentry.android.core.ANRWatchDog;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements TransactionFinishedCallback, Scope.IWithTransaction, ANRWatchDog.ANRListener, Sentry.OptionsConfiguration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25903d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3) {
        this.f25901b = obj;
        this.f25902c = obj2;
        this.f25903d = obj3;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((ActivityLifecycleIntegration) this.f25901b).lambda$applyScope$3((IScope) this.f25902c, (ITransaction) this.f25903d, iTransaction);
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        SentryAndroid.lambda$init$1((ILogger) this.f25901b, (Context) this.f25902c, (Sentry.OptionsConfiguration) this.f25903d, (SentryAndroidOptions) sentryOptions);
    }

    @Override // io.sentry.TransactionFinishedCallback
    public void execute(ITransaction iTransaction) {
        ((ActivityLifecycleIntegration) this.f25901b).lambda$startTracing$0((WeakReference) this.f25902c, (String) this.f25903d, iTransaction);
    }

    @Override // io.sentry.android.core.ANRWatchDog.ANRListener
    public void onAppNotResponding(ApplicationNotResponding applicationNotResponding) {
        ((AnrIntegration) this.f25901b).lambda$startAnrWatchdog$1((IScopes) this.f25902c, (SentryAndroidOptions) this.f25903d, applicationNotResponding);
    }
}
