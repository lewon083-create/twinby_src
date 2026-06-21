package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0633yc extends C0188gi implements Ja {
    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void b(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c() {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final List<String> f() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ea
    public final void b(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void c(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ea
    public final void b(@NonNull String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ea
    public final boolean b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull Go go) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull EnumC0346n enumC0346n) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(@NonNull String str, boolean z5) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5) {
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Ic
    public final void a(boolean z5, boolean z10) {
    }

    @Override // io.appmetrica.analytics.impl.C0188gi, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.C0188gi, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z5) {
    }
}
