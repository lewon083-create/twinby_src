package com.google.firebase.messaging;

import com.google.android.gms.tasks.Task;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.flutter.SentryFlutterPlugin;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements sb.f, ScopeCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14857c;

    public /* synthetic */ n(String str, int i) {
        this.f14856b = i;
        this.f14857c = str;
    }

    @Override // sb.f
    public Task c(Object obj) {
        int i = this.f14856b;
        String str = this.f14857c;
        e0 e0Var = (e0) obj;
        switch (i) {
            case 0:
                v7.f fVar = FirebaseMessaging.f14762l;
                e0Var.getClass();
                sb.m mVarD = e0Var.d(new b0("S", str));
                e0Var.f();
                return mVarD;
            default:
                v7.f fVar2 = FirebaseMessaging.f14762l;
                e0Var.getClass();
                sb.m mVarD2 = e0Var.d(new b0("U", str));
                e0Var.f();
                return mVarD2;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        SentryFlutterPlugin.Companion.removeContext$lambda$2(this.f14857c, iScope);
    }
}
