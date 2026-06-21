package z2;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.a1;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends com.google.android.gms.internal.auth.m implements u1.d, a1, d.x, o6.g, k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f45995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f45996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f45997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f45998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f45999g;

    public v(w context) {
        this.f45999g = context;
        Intrinsics.checkNotNullParameter(context, "activity");
        Handler handler = new Handler();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f45995c = context;
        this.f45996d = context;
        this.f45997e = handler;
        this.f45998f = new h0();
    }

    @Override // u1.d
    public final void addOnConfigurationChangedListener(f2.a aVar) {
        this.f45999g.addOnConfigurationChangedListener(aVar);
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.p getLifecycle() {
        return this.f45999g.f46001d;
    }

    @Override // d.x
    public final d.w getOnBackPressedDispatcher() {
        return this.f45999g.getOnBackPressedDispatcher();
    }

    @Override // o6.g
    public final o6.e getSavedStateRegistry() {
        return this.f45999g.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.a1
    public final z0 getViewModelStore() {
        return this.f45999g.getViewModelStore();
    }

    @Override // com.google.android.gms.internal.auth.m
    public final View o(int i) {
        return this.f45999g.findViewById(i);
    }

    @Override // com.google.android.gms.internal.auth.m
    public final boolean p() {
        Window window = this.f45999g.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // u1.d
    public final void removeOnConfigurationChangedListener(f2.a aVar) {
        this.f45999g.removeOnConfigurationChangedListener(aVar);
    }

    @Override // z2.k0
    public final void a() {
    }
}
