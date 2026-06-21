package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface Qc extends InterfaceC0385od {
    @NotNull
    List<ModuleServicesDatabase> b();

    @NotNull
    /* synthetic */ Map c();

    @NotNull
    /* synthetic */ Map d();

    @NotNull
    List<Consumer<Location>> e();

    @Nullable
    ModuleLocationSourcesServiceController f();

    @Nullable
    Toggle g();

    @NotNull
    /* synthetic */ List h();
}
