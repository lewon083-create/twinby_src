package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0034aj implements InterfaceC0296l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ue f23442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScreenInfo f23443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Zi f23446e = new Zi();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f23447f = new WeakReference(null);

    public final synchronized void a(@NotNull Activity activity) {
        this.f23447f = new WeakReference(activity);
        if (!this.f23445d) {
            this.f23443b = a((Context) activity).p();
            this.f23444c = a((Context) activity).t();
            this.f23445d = true;
        }
        if (this.f23443b == null) {
            c(activity);
        }
    }

    @Nullable
    public final synchronized ScreenInfo b(@NotNull Context context) {
        try {
            if (!this.f23445d) {
                this.f23443b = a(context).p();
                this.f23444c = a(context).t();
                this.f23445d = true;
            }
            c((Context) this.f23447f.get());
            if (this.f23443b == null) {
                if (!AndroidUtils.isApiAchieved(30)) {
                    c(context);
                } else if (!this.f23444c) {
                    c(context);
                    this.f23444c = true;
                    a(context).v();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f23443b;
    }

    public final void c(Context context) {
        if (context != null) {
            this.f23446e.getClass();
            ScreenInfo screenInfoA = Zi.a(context);
            if (screenInfoA == null || screenInfoA.equals(this.f23443b)) {
                return;
            }
            this.f23443b = screenInfoA;
            a(context).a(this.f23443b);
        }
    }

    public final Ue a(Context context) {
        if (this.f23442a == null) {
            this.f23442a = new Ue(C0071c4.l().c(context).a(context));
        }
        Ue ue = this.f23442a;
        Intrinsics.b(ue);
        return ue;
    }

    public final void a(@NotNull Ue ue) {
        this.f23442a = ue;
    }
}
