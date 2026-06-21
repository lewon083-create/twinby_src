package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0409pc implements InterfaceC0263jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0434qc f24575a;

    public C0409pc(C0434qc c0434qc) {
        this.f24575a = c0434qc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0263jg
    public final void a(C0338mg c0338mg) {
        if (c0338mg == null) {
            return;
        }
        Q5 q5 = new Q5("", "", 0);
        q5.setValueBytes(c0338mg.a());
        EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
        q5.f22863d = 4097;
        this.f24575a.a(q5);
    }
}
