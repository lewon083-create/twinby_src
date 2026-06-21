package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Vc implements ModuleEventServiceHandlerReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0306l9 f23130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q5 f23131c;

    public Vc(boolean z5, @NotNull C0306l9 c0306l9, @NotNull Q5 q5) {
        this.f23129a = z5;
        this.f23130b = c0306l9;
        this.f23131c = q5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f23129a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(@NotNull CounterReportApi counterReportApi) {
        Q5 q5D = Q5.d(this.f23131c);
        q5D.f22863d = counterReportApi.getType();
        q5D.f22864e = counterReportApi.getCustomType();
        q5D.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            q5D.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            q5D.setValueBytes(valueBytes);
        }
        q5D.f22866g = counterReportApi.getBytesTruncated();
        C0306l9 c0306l9 = this.f23130b;
        c0306l9.a(q5D, Qk.a(c0306l9.f24280c.b(q5D), q5D.i));
    }
}
