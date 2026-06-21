package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.android.core.util.AndroidLazyEvaluator;
import io.sentry.transport.ICurrentDateProvider;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ICurrentDateProvider, AndroidLazyEvaluator.AndroidEvaluator, Sentry.OptionsConfiguration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25886b;

    public /* synthetic */ a(int i) {
        this.f25886b = i;
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        SentryAndroid.lambda$init$0((SentryAndroidOptions) sentryOptions);
    }

    @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
    public Object evaluate(Context context) {
        switch (this.f25886b) {
            case 1:
                return ContextUtils.lambda$static$0(context);
            case 2:
                return ContextUtils.lambda$static$1(context);
            case 3:
                return ContextUtils.lambda$static$2(context);
            case 4:
                return ContextUtils.lambda$static$3(context);
            default:
                return ContextUtils.lambda$static$4(context);
        }
    }

    @Override // io.sentry.transport.ICurrentDateProvider
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
