package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0427q5 implements IExecutionPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0246j f24616b = C0382oa.k().b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumSet f24617c = EnumSet.of(NetworkType.OFFLINE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24618d = "connection based";

    public C0427q5(@NotNull Context context) {
        this.f24615a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C0246j c0246j = this.f24616b;
        Context context = this.f24615a;
        c0246j.getClass();
        Ce ce = Ge.f22380a;
        return !this.f24617c.contains((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Fe()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    @NotNull
    public final String description() {
        return this.f24618d;
    }
}
