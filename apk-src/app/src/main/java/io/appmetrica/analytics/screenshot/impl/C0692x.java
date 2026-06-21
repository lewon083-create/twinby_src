package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0692x implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f25518a;

    public C0692x(@NotNull ClientContext clientContext) {
        this.f25518a = clientContext;
    }

    public final void a(@NotNull String str) {
        this.f25518a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(kotlin.collections.i0.c(new Pair("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
